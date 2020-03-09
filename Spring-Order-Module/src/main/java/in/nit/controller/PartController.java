package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.exel.PartExcelView;
import in.nit.model.Part;
import in.nit.pdf.PartPdfView;
import in.nit.service.IOrderService;
import in.nit.service.IPartService;
import in.nit.service.IUomService;
import in.nit.utils.CommonUtils;
@Controller
@RequestMapping({"/","part"})
public class PartController {

	@Autowired
	private IPartService service;
	
	@Autowired
	private IUomService uomServcie;
	@Autowired
	private IOrderService odrService;
	
	private void commomUi(Model m) {
		List<Object[]>uomList=uomServcie.getUomIdAndModel();
		Map<Integer,String>uomMap=CommonUtils.convert(uomList);
		List<Object[]>odrSaleList=odrService.getOrderIdOrderMode("sale");
		List<Object[]>odrPurList=odrService.getOrderIdOrderMode("purchase");
		
		Map<Integer,String>odrsaleMap=CommonUtils.convertOdr(odrSaleList);
		Map<Integer,String>odrPurMap=CommonUtils.convertOdr(odrPurList);
		
		m.addAttribute("uomMap",uomMap );
		m.addAttribute("odrsaleMap",odrsaleMap );
		m.addAttribute("odrPurMap",odrPurMap );
	}
	
	@RequestMapping({"/","register"})
	public String showPage(Model m) {
		m.addAttribute("part", new Part());
		commomUi(m);
		m.addAttribute("register", true);
		return "partregister";
	}
	@RequestMapping("/save")
	public String savePart(@ModelAttribute Part part,Model m) {
		System.out.println("run");
		Integer id=service.savePart(part);
		m.addAttribute("msg", "Part "+id+" is Saved");
		m.addAttribute("save", true);
		m.addAttribute("part", new Part());
		commomUi(m);
		return "partregister";
		
	}
	@RequestMapping("view")
	public String showOnePart(@RequestParam("pid")Integer id,Model m) {
		Part part=service.getOnePart(id);
		m.addAttribute("part", part);
		return "onepart";
	}
	@RequestMapping("all")
	public String showAllPart(Model m) {
		List<Part>list=service.getAllPart();
		m.addAttribute("list", list);
		return "allpart";
	}
	@RequestMapping("delete")
	public String deletePart(@RequestParam("pid")Integer id,Model m) {
		service.deletePart(id);
		m.addAttribute("msg", "Part "+id+" is deleted");
		List<Part>list=service.getAllPart();
		m.addAttribute("delete", true);
		m.addAttribute("list", list);
	    return "allpart";
		
	}
	@RequestMapping("Edit")
	public String editPart(@RequestParam("pid")Integer id,Model m) {
		Part part=service.getOnePart(id);
		m.addAttribute("part", part);
		m.addAttribute("edit", true);
		commomUi(m);
		return "partregister";
	}
	
	@RequestMapping("update")
	public String updatePart(@ModelAttribute Part part,Model m) {
		service.updatePart(part);
		m.addAttribute("msg", "Part" +part.getPid()+" is Updated");
		m.addAttribute("update", true);
		return "partregister";
		
	}
	@RequestMapping("/excel")
	public ModelAndView showExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new PartExcelView());
		m.addObject("list", service.getAllPart());
		return m;
	
	}
	
	@RequestMapping("/pdf")
	public ModelAndView showPdf() {
		ModelAndView m=new ModelAndView();
		m.setView(new PartPdfView());
		
		m.addObject("list", service.getAllPart());
		return m;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
