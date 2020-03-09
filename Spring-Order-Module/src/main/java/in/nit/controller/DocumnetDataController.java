package in.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import in.nit.model.DocumentData;
import in.nit.service.IDocumentService;

@Controller
public class DocumnetDataController {

	@Autowired
	private IDocumentService service;

	@RequestMapping("/show")
	public String showUploadPage(Model model) {
		List<Object[]>list=service.getDocumentAndFileName();
		model.addAttribute("list", list);
		return "upload";
	}
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	public String saveData(@RequestParam Integer fileId,
			@RequestParam CommonsMultipartFile fileOb,Model m) {
		if(fileId!=null) {
			DocumentData d=new DocumentData();
			d.setFileId(fileId);
			d.setFilename(fileOb.getOriginalFilename());
			d.setFileData(fileOb.getBytes());
			service.saveDocumnet(d);
			m.addAttribute("msg", fileId+" Docs is Uploaded");

		}
		return "redirect:show";
	}
	@RequestMapping("/download")
	public void doDownload(@RequestParam Integer fid,HttpServletResponse res) {
		
		DocumentData doc=service.getOneDocument(fid);
		res.addHeader("Content-Disposition", "attachment;filename="+doc.getFilename());
		
		
		try {
			FileCopyUtils.copy(doc.getFileData(), res.getOutputStream());
		} catch (Exception e) {
           e.printStackTrace();
		}
		

		
	}

}
