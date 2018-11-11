package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.iservice.IOrderService;
import com.app.model.Order;
import com.app.validator.OrderValidator;



@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
	private IOrderService service;
    @Autowired
    private OrderValidator validator;
	@RequestMapping("data")
	public String show(ModelMap map)
	{
		map.addAttribute("order", new Order());
		return "OrderRegister";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String showData(@ModelAttribute("order") Order r,Errors errors,ModelMap map)
	{
		validator.validate(r,errors);
		if(!errors.hasErrors()) {	
		Integer n=service.saveOrder(r);		
		String smg="order '"+n+"' Saved";
		map.addAttribute("message",smg);
		}
		return "OrderRegister";
	}
	@RequestMapping("all")
	public String allData(ModelMap map)
	{
		List<Order>list=service.getAllOrder();
		map.addAttribute("list", list);
		return "OrderData";
	}
	
	
	@RequestMapping("delete")
	public String deleteData(@RequestParam("id")Integer o,ModelMap map)
	{
		service.deleteOrder(o);
		String smg="delete '"+o+"' Order";
		List<Order>list=service.getAllOrder();
		map.addAttribute("list",list);
		map.addAttribute("message",smg);
		return "OrderData";
	}
	
	@RequestMapping("edit")
	public String editData(@RequestParam("id")Integer o,ModelMap map)
	{	
		Order o1=service.getOneOrder(o);
		map.addAttribute("order",o1);
		return "OrderEdit";
		
	}
	

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String doUpdateData(@ModelAttribute Order o, ModelMap map) {
		service.updateOrder(o);
		String msg = "Order'" + o.getId() + "'updated";

		List<Order> emps = service.getAllOrder();
		map.addAttribute("an", msg);
		map.addAttribute("list", emps);
		return "OrderData";

}
	
}
