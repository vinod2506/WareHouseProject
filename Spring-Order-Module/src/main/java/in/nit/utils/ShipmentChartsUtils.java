package in.nit.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;
@Component
public class ShipmentChartsUtils {


	public void generatePie(String path,List<Object[]> data) {
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] arr:data) {
			dataset.setValue(arr[0].toString(), (Number) arr[1]);
		}
		JFreeChart chart=ChartFactory.createPieChart3D("ShipmentType Modes Pie Chart", dataset, true, true, false);
		//save as image
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/ShipmentChart.jpg"), chart, 300,300);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	public void generateBarChart(String path,List<Object[]> data) {
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[]arr:data) {
			dataset.setValue(Double.valueOf(arr[1].toString()), arr[0].toString(),"");
		}
		JFreeChart chart=ChartFactory.createBarChart("ShipmentType Modes Bar Chart", "Modes", "Counts", dataset);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/shipmentBar.jpg"), chart, 400,400);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}


}
