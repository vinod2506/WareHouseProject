package in.nit.exel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.ShipmentType;

public class ShipmentTypeExcelView extends AbstractXlsxView{

	@Override
	public void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Sheet s=workbook.createSheet();
		setHeader(s);
		@SuppressWarnings("unchecked")
		List<ShipmentType>list=(List<ShipmentType>) model.get("list");
		setBody(s,list);
		response.addHeader("Content-Disposition","attachment;filename=shipment-type.xlsx");
	}

	private void setBody(Sheet s, List<ShipmentType> list) {
         int count=1;
         for(ShipmentType ship:list) {
        	 Row r=s.createRow(count++);
        	 r.createCell(0).setCellValue(ship.getSid());
        	 r.createCell(1).setCellValue(ship.getShipMode());
        	 r.createCell(2).setCellValue(ship.getShipCode());
        	 r.createCell(3).setCellValue(ship.getEnableShipment());
        	 r.createCell(4).setCellValue(ship.getShipGrade());
        	 r.createCell(5).setCellValue(ship.getDescription());
         }
		
	}

	private void setHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("SID");
		r.createCell(1).setCellValue("shipMode");
		r.createCell(2).setCellValue("shipCode");
		r.createCell(3).setCellValue("enableShipment");
		r.createCell(4).setCellValue("shipGrade");
		r.createCell(5).setCellValue("description");
		
	}

	
	
}
