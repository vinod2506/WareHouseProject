package in.nit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
       
		
		return new Class[]{AppConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {

		
		return null;
	}
	
	@Override
	protected String[] getServletMappings() {

		return new String[] {"/"};
	}
	public AppInit() {
	System.out.println("appinit loaded");	// TODO Auto-generated constructor stub
	}
}
