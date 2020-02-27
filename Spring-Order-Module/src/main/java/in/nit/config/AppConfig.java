package in.nit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@ComponentScan("in.nit")
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean
	public DataSource ds() {
		System.out.println("AppConfig.ds()");
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driver_class"));
		ds.setUrl(env.getProperty("db_url"));
		ds.setUsername(env.getProperty("db_username"));
		ds.setPassword(env.getProperty("db_password"));
		return ds;

	}

	@Bean
	public Properties props() {
		System.out.println("AppConfig.props()");
		Properties ps = new Properties();
		ps.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		ps.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		ps.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		ps.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));

		return ps;
	}

	@Bean
	public LocalSessionFactoryBean sf() {
		System.out.println("AppConfig.sf()"); 
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean(); 
		lsf.setDataSource(ds());
		lsf.setPackagesToScan("in.nit"); 
		lsf.setHibernateProperties(props()); 
		return lsf;

	}

	/*
	 * @Bean public SessionFactory sf(DataSource ds) { LocalSessionFactoryBuilder
	 * builder=new LocalSessionFactoryBuilder(ds);
	 * builder.scanPackages("in.nit.model"); builder.addProperties(props()); return
	 * builder.buildSessionFactory(); }
	 */
	@Bean
	public HibernateTransactionManager htm() {
		System.out.println("AppConfig.htm()");
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sf().getObject());
		return htm;
	}

	@Bean
	public HibernateTemplate ht() {
		System.out.println("AppConfig.ht()");
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(sf().getObject());
		return ht;
	}

	@Bean
	public ViewResolver view() {
		System.out.println("AppConfig.view()");
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix(env.getProperty("mvc_view_prefix"));
		ivr.setSuffix(env.getProperty("mvc_view_suffix"));
		return ivr;
	}
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		System.out.println("AppConfig.multipartResolver()");
		return new CommonsMultipartResolver();
	}

	public AppConfig() {
		System.out.println("Appconfig loaded"); // TODO Auto-generated constructor stub
	}
	
	
}
