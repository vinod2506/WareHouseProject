package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.exel.OrderTypeExcelView;
import in.nit.model.OrderType;
import in.nit.model.ShipmentType;
import in.nit.pdf.OrederTypePdfView;
import in.nit.pdf.ShipmentTypePdf;
import in.nit.service.IOrderService;

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	private IOrderService service;

	/**
	 * this method show home page
	 * (Url: /register method: show page
	 * @param model 
	 * @return orderpage.jsp
	 */
	@RequestMapping("register")
	public String showPage(Model model) {
		System.out.println("OrderController.showPage()");
		model.addAttribute("orderType", new OrderType());
		return "orderpage";
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveOrder(@ModelAttribute OrderType ord ,Model m) {
		System.out.println("OrderController.saveOrder()");
		Integer id=service.saveOrder(ord);
		String msg=new StringBuilder().append("Your Order No. ").append(id)
				.append(" is Saved").toString();
		m.addAttribute("clickSave", true);
		m.addAttribute("msg", msg);
		return "orderpage";
	}
	@RequestMapping("/all")
	public String showAll(Model m) {
		List<OrderType>list=service.fetchAllOrder();
		m.addAttribute("clickAll", true);
		m.addAttribute("listorder", list);
		return "result";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer oid,Model model) {

		service.deleteOrder(oid);
		model.addAttribute("msg", "Order Deleted");
		model.addAttribute("clickDlete", true);
		return "redirect:all";
	}

	/***
	 *  When user click this link 
	 *  it wil show only one order 
	 *  details
	 * @param m
	 * @return
	 */
	@RequestMapping("/view")
	public String getOneOrder(@RequestParam("eid")Integer id,Model m) {
		OrderType order=service.fetchOneOrder(id);
		m.addAttribute("result", order);
		m.addAttribute("view",true);
		return "home";
	}
	
	@RequestMapping("/edit")
	public String editOrder(@RequestParam("oid")Integer id,Model m) {
		OrderType order=service.fetchOneOrder(id);
		m.addAttribute("orderType", order);

		return "editpage";
	}

	@RequestMapping("/update")
	public String editOrder(@ModelAttribute OrderType or,Model m) {
		service.updateOrder(or);
		m.addAttribute("msg", "Record Updated");

		return "editpage";
	}

	@RequestMapping("/excel")
	public ModelAndView showExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new OrderTypeExcelView());
		List<OrderType>list=service.fetchAllOrder();
		m.addObject("list", list);
		return m;
	}
	
	@RequestMapping("/pdf")
	public ModelAndView viewPdf(@RequestParam(value = "id",required =false )Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new OrederTypePdfView());
		if(id!=null) {//expost one rows
		m.addObject("list", service.fetchOneOrder(id));
		}else {//fetch all rows
		
		m.addObject("list", service.fetchAllOrder());
		}
		return m ;
	}
}
