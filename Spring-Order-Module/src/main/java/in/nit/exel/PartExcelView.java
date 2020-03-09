package in.nit.exel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import in.nit.model.Part;

public class PartExcelView extends AbstractXlsView{


	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Sheet sheet=workbook.createSheet();
		setHeader(sheet);
		response.addHeader("Content-Disposition", "attachmenr;filename=part.xlsx");
		@SuppressWarnings("unchecked")
		List<Part>list=(List<Part>) model.get("list");
		setBody(sheet,list);
		
	}

	private void setBody(Sheet sheet, List<Part> list) {
		int count=1;
		for(Part p:list) {
			Row r=sheet.createRow(count++);
			r.createCell(0).setCellValue(p.getPid());
			r.createCell(1).setCellValue(p.getCode());
			r.createCell(2).setCellValue(p.getWidth());
			r.createCell(3).setCellValue(p.getLength());
			r.createCell(4).setCellValue(p.getHeight());
			r.createCell(5).setCellValue(p.getBaseCost());
			r.createCell(6).setCellValue(p.getBaseCurrency());
			r.createCell(7).setCellValue(p.getUom().getUomModel());
			r.createCell(8).setCellValue(p.getOdr().getOdrMode());
			r.createCell(9).setCellValue(p.getDescp());
		}
		
	}

	private void setHeader(Sheet sheet) {
		Row r=sheet.createRow(0);
		r.createCell(0).setCellValue("Id");
		r.createCell(1).setCellValue("code");
		r.createCell(2).setCellValue("width");
		r.createCell(3).setCellValue("length");
		r.createCell(4).setCellValue("height");
		r.createCell(5).setCellValue("baseCost");
		r.createCell(6).setCellValue("baseCurrency");
		r.createCell(7).setCellValue("uom");
		r.createCell(8).setCellValue("Odr");
		r.createCell(9).setCellValue("descp");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


