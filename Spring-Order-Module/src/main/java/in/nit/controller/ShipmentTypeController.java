package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.exel.ShipmentTypeExcelView;
import in.nit.model.ShipmentType;
import in.nit.pdf.ShipmentTypePdf;
import in.nit.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {

	@Autowired
	IShipmentTypeService service;
	/**
	 * this method is used 
	 * launch the register
	 * page 
	 */
	@RequestMapping("/register")
	public String  showPage(Model m) {
		m.addAttribute("shipmentType", new ShipmentType());
		m.addAttribute("shipmentRegister",true);
		return "home";
	}
	
	/**
	 * This method is used get the 
	 * form data and call service 
	 * layer to insert the record
	 */
	@RequestMapping("/save")
	public String saveShipment(@ModelAttribute ShipmentType ship,Model m) {
		Integer id=service.saveShipment(ship);
		StringBuilder msg=new StringBuilder().append("Record '").append(id).append("' is saved");
		m.addAttribute("msg", msg);
		m.addAttribute("save",true);
		return "home";
	}
	
	/**
	 * This method is used to delete
	 * the record based on
	 * object having id
	 */
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid")Integer id,Model m) {
		ShipmentType s=new ShipmentType(id);
		service.deleteShipmentType(s);
		m.addAttribute("delete",true);
		return "home";
	}
	
	/**
	 * This method is used to
	 * view all shipment records
	 */
	@RequestMapping("all")
	public String viewShipment(Model m) {
		List<ShipmentType> ship=service.getAllShipmentType();
		m.addAttribute("list", ship);
		m.addAttribute("msg", "All Shipment Page");
		m.addAttribute("all",true);
		return "home";
	}
	/**
	 * This method is used to
	 * fetch one ShipmentType 
	 */
	@RequestMapping("/view")
	public String getOneShipment(@RequestParam("sid")Integer id,Model m) {
		
		ShipmentType shipment=service.getOneShipmentType(id);
		m.addAttribute("result", shipment);
		m.addAttribute("view",true);
		return "home";
	}
	@RequestMapping("/edit")
	public String editShipment(@RequestParam("sid")Integer id,Model m) {
		
		ShipmentType shipment=service.getOneShipmentType(id);
		m.addAttribute("shipmentType", shipment);
		m.addAttribute("edit",true);
		return "home";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateShipment(@ModelAttribute ShipmentType ship,Model m) {
		
		service.updateShipmentType(ship);
		m.addAttribute("msg", "record Updated");
		m.addAttribute("update",true);
		return "home";
	}
	
	/**
	 * This method is used
	 * export records in exel files
	 * 
	 */
	@RequestMapping("/excel")
	public ModelAndView viewExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		List<ShipmentType> ship=service.getAllShipmentType();
		m.addObject("list", ship);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView viewPdf(@RequestParam (value="id",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypePdf());
		if(id!=null) {//fetch one record
			m.addObject("list",Arrays.asList(service.getOneShipmentType(id)));
		}else {
		
		m.addObject("list",service.getAllShipmentType());
		}
		return m;
	}
	
}
