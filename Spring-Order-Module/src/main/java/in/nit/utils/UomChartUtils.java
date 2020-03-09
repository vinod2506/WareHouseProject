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
public class UomChartUtils {



	public void generatePieChart(String path,List<Object[]> list) {
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[]arr:list) {
			dataset.setValue(arr[0].toString(), (Number)arr[1]);
		}
		JFreeChart chart=ChartFactory.createPieChart3D("Uom Type Charts", dataset, true, true,false);
	try {
		ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/uomchart.jpg"), chart, 400, 400);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	
	public void generateBarChart(String path,List<Object[]> list) {
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[]arr:list) {
			dataset.setValue((Number)arr[1], arr[0].toString(), "");
		}
		JFreeChart chart=ChartFactory.createBarChart("Uom Type Bar Chart", "count", "Uom Types", dataset);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/uombarchart.jpg"), chart, 400, 400);
		} catch (Exception e) {
			
		}
		
	}

}
