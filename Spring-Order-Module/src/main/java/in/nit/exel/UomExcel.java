package in.nit.exel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import in.nit.model.UomType;

public class UomExcel extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Sheet s=workbook.createSheet();
		setHeader(s);
		response.addHeader("Content-Disposition", "attachment);filename=uomdata.xls");
		@SuppressWarnings("unchecked")
		List<UomType> list=(List<UomType>) model.get("list");
		setBody(s,list);
	
}

	

	private void setBody(Sheet s, List<UomType> list) {
		int count=1;
		Row r=s.createRow(count++);
		for(UomType uom:list) {
			r.createCell(0).setCellValue(uom.getUomId());
			r.createCell(1).setCellValue(uom.getUomType());
			r.createCell(2).setCellValue(uom.getUomModel());
			r.createCell(3).setCellValue(uom.getUomDesc());
		}
		
	}



	private void setHeader(Sheet s) {
		Row r=s.createRow(1);
		r.createCell(0).setCellValue("UomId");
		r.createCell(1).setCellValue("UomType");
		r.createCell(2).setCellValue("UomModel");
		r.createCell(3).setCellValue("UomDesp");
	}
}
