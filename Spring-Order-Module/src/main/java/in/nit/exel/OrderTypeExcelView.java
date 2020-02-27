package in.nit.exel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.OrderType;

public class OrderTypeExcelView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.addHeader("Content-Disposition", "attachment;filename=ordertype.xlsx");

		Sheet s=workbook.createSheet();
		setHeader(s);
		List<OrderType>list= (List<OrderType>) model.get("list");
		setBody(s,list);

	}

	private void setBody(Sheet s, List<OrderType> list) {
		int count=1;
		for(OrderType odr:list) {
        Row r=s.createRow(count++);
        r.createCell(0).setCellValue(odr.getOid());
        r.createCell(1).setCellValue(odr.getOdrMode());
        r.createCell(2).setCellValue(odr.getOdrCode());
        r.createCell(3).setCellValue(odr.getOdrMethod());
      //  r.createCell(4).setCellValue(odr.getOdrAccept());
        r.createCell(5).setCellValue(odr.getOdrDescp());
		}
	}

	private void setHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("Oid");
		r.createCell(1).setCellValue("OrderMode");
		r.createCell(2).setCellValue("OrderCode");
		r.createCell(3).setCellValue("OrderMethod");
		r.createCell(4).setCellValue("OrderAccept");
		r.createCell(5).setCellValue("Description");

	}

}
