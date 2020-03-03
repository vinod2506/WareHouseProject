package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.UomType;
import in.nit.service.IUomService;

@Controller
@RequestMapping("uom")
public class UomTypeController {

	@Autowired
	private IUomService service;
	
	@RequestMapping("/register")
	public String registerPage(Model m) {
		m.addAttribute("uomType", new UomType());
		return "uomRegister";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveUom(@ModelAttribute UomType uom,Model m) {
		Integer id=service.saveUom(uom);
		m.addAttribute("msg", id+" UomType Saved");
		return "uomRegister";
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
	
	
}
