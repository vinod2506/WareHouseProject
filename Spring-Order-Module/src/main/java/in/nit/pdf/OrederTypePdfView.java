package in.nit.pdf;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.OrderType;

public class OrederTypePdfView extends AbstractPdfView {

	
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		
		Paragraph p=new Paragraph("Welcome To Order Page");
		document.add(p);
		//get All records
	    List<OrderType>list=	(List<OrderType>) model.get("list");
		//create table
	    PdfPTable table=new PdfPTable(6);
	    table.addCell("OrderID");
	    table.addCell("odrMode");
	    table.addCell("odrCode");
	    table.addCell("odrMethod");
	    table.addCell("odrAccept");
	    table.addCell("odrDescp");
	
	    //add data column to table
	    for(OrderType order:list) {
	    	table.addCell(order.getOid().toString());
	    	table.addCell(order.getOdrMode());
	    	table.addCell(order.getOdrCode());
	    	table.addCell(order.getOdrMethod());
	    	table.addCell(order.getOdrAccept().toString());
	    	table.addCell(order.getOdrDescp());
	    }
		document.add(table);
		
	    document.add(new Paragraph(new Date().toString()));
		
	}
}
