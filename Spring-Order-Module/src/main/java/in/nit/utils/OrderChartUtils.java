package in.nit.utils;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class OrderChartUtils {

	public void generatePie(String path,List<Object[]> list) {
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[]arr:list) {
			dataset.setValue(arr[0].toString(), (Number)arr[1]);
		}
		JFreeChart chart=ChartFactory.createPieChart3D("Order Method Based Chart", dataset, true, true,false);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/OrderPie.jpg"), chart, 400, 400);
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}
	
	public void generateBarChart(String path,List<Object[]> list) {
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[]arr:list) {
			dataset.setValue(Double.valueOf(arr[1].toString()), arr[0].toString(), "");
		}
		
		JFreeChart chart=ChartFactory.createBarChart("Order Method Based Chart", "Method", "Count", dataset);
		
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/OrderBar.jpg"), chart, 400, 400);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
