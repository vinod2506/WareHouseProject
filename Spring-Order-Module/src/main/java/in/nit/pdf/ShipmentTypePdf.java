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

import in.nit.model.ShipmentType;

public class ShipmentTypePdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachment;filename=shipment.pdf");
		Paragraph para=new Paragraph("Welcome To Shipment Type");
		document.add(para);
		//read data from model
		@SuppressWarnings("unchecked")
		List<ShipmentType>list=(List<ShipmentType>) model.get("list");
		//craete table
		PdfPTable t=new PdfPTable(6);
		t.addCell("ShipId");
		t.addCell("shipMode");
		t.addCell("shipCode");
		t.addCell("enableShipment");
		t.addCell("shipGrade");
		t.addCell("description");
		//addinfg data to table
		for(ShipmentType st:list) {
			t.addCell(st.getSid().toString());
			t.addCell(st.getShipMode());
			t.addCell(st.getShipCode());
			t.addCell(st.getEnableShipment());
			t.addCell(st.getShipGrade());
			t.addCell(st.getDescription());
		}
		document.add(t);
		document.add(new Paragraph(new Date().toString()));
	
	}

	

}
