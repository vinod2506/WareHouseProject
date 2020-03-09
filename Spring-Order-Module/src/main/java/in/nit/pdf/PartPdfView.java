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

import in.nit.model.Part;

public class PartPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		Paragraph p=new Paragraph("Part Details");
		document.add(p);
		
		PdfPTable t=new PdfPTable(10);
		t.addCell("ID");
		t.addCell("code");
		t.addCell("width");
		t.addCell("length");
		t.addCell("height");
		t.addCell("baseCost");
		t.addCell("baseCurrency");
		t.addCell("uom");
		t.addCell("Odr");
		t.addCell("descp");
		
		@SuppressWarnings("unchecked")
		List<Part>list=(List<Part>) model.get("list");
		
		for(Part part:list) {
			t.addCell(part.getPid().toString());
			t.addCell(part.getCode());
			t.addCell(part.getWidth());
			t.addCell(part.getLength());
			t.addCell(part.getHeight());
			t.addCell(part.getBaseCost());
			t.addCell(part.getBaseCurrency());
			t.addCell(part.getUom().getUomModel());
			t.addCell(part.getOdr().getOdrMode());
			t.addCell(part.getDescp());
		}
		document.add(t);
		
		document.add(new Paragraph(new Date().toString()));
	}
	

	

}
