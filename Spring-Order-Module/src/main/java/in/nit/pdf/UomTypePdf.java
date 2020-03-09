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

import in.nit.model.UomType;

public class UomTypePdf extends AbstractPdfView{


@Override
protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	
	response.addHeader("Content-Disposition", "attachment;filename=uompdf.pdf");
	@SuppressWarnings("unchecked")
	List<UomType>list=(List<UomType>) model.get("list");
	Paragraph p=new Paragraph("Uom Type Data Records");
	document.add(p);
	PdfPTable pt=new PdfPTable(4);
	pt.addCell("UOMID");
	pt.addCell("uomType");
	pt.addCell("uomModel");
	pt.addCell("uomDesc");
	for(UomType uom:list) {
		pt.addCell(uom.getUomId().toString());
		pt.addCell(uom.getUomType());
		pt.addCell(uom.getUomModel());
		pt.addCell(uom.getUomDesc());
		
	}
	document.add(pt);
	document.add(new Paragraph(new Date().toString()));
	
}

}
