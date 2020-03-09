package in.nit.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.exel.UomExcel;
import in.nit.model.UomType;
import in.nit.pdf.UomTypePdf;
import in.nit.service.IUomService;
import in.nit.utils.UomChartUtils;

@Controller
@RequestMapping("uom")
public class UomTypeController {

	@Autowired
	private IUomService service;
	
	@Autowired
	private ServletContext context;
	
	@Autowired(required = true)
	private UomChartUtils util;
	
	
	@RequestMapping("/register")
	public String registerPage(Model m) {
		m.addAttribute("uomType", new UomType());
		return "form";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveUom(@ModelAttribute UomType uom,Model m) {
		Integer id=service.saveUom(uom);
		m.addAttribute("msg", id+" UomType Saved");
		return "form";
	}
	@RequestMapping("all")
	public String viewUom(Model m) {
		List<UomType>list=service.getAllUom();
		m.addAttribute("list", list);
		return "uomData";
	}
	
	@RequestMapping("edit")
	public String editUom(@RequestParam("uid")Integer id,Model m) {
		UomType uom=service.getOneUom(id);
		m.addAttribute("uomType", uom);
		return "uomEdit";
	}
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String updateUom(@ModelAttribute UomType uom,Model m) {
		service.updateUom(uom);
		m.addAttribute("msg", uom.getUomId()+" Uom Updated");
		return "uomEdit";
	}
	
	@RequestMapping("delete")
	public String deleteUpdate(@RequestParam("uid") Integer id,Model m) {
		service.deleteUom(id);
		m.addAttribute("msg", id+" UomType Deleted");
		return "redirect:all";
	}
	@RequestMapping("view")
	public String viewOneUom(@RequestParam("uid")Integer id,Model m) {
		UomType uom=service.getOneUom(id);
		m.addAttribute("uom", uom);
		return "oneUomData";
	}
	@RequestMapping("pdf")
	public ModelAndView pdfView() {
		ModelAndView m=new ModelAndView();
		m.setView(new UomTypePdf());
		m.addObject("list", service.getAllUom());
		return m;
	}
	@RequestMapping("excel")
	public ModelAndView excelView() {
		ModelAndView m=new ModelAndView();
		m.setView(new UomExcel());
		m.addObject("list", service.getAllUom());
		return m;
	}
	@RequestMapping("chart")
	public String showCharts() {
		String path=context.getRealPath("/");
		List<Object[]>list=service.getUomCout();
		util.generateBarChart(path, list);
		util.generatePieChart(path, list);
		return "uomcharts";
	}
	
	
}
