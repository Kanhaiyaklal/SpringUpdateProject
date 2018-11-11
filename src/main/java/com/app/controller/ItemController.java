package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.iservice.IItemService;
import com.app.iservice.IOrderService;
import com.app.iservice.IUomService;
import com.app.iservice.IWhUserTypeService;
import com.app.model.Item;
import com.app.model.Order;
import com.app.model.UOM;
import com.app.model.WhUserType;

@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	private IItemService service;
	@Autowired
	private IUomService uomService;
	@Autowired
	private IOrderService orderService;
    @Autowired
    private IWhUserTypeService userTypeService;
	@RequestMapping("data")
	public String getData(ModelMap map) {
		List<UOM> uoms = uomService.getAllUOM();
		List<Order> sales = orderService.getOrderByMode("sale");
		List<Order> purchases = orderService.getOrderByMode("purchase");
		List<WhUserType> custuserType=userTypeService.getWhUserTypeById("customer");
		List<WhUserType> userType=userTypeService.getWhUserTypeById("vendor");
		map.addAttribute("item", new Item());
		map.addAttribute("list", uoms);
		map.addAttribute("sales", sales);
		map.addAttribute("purchases", purchases);
		map.addAttribute("custuserType", custuserType);
		map.addAttribute("userType", userType);

		return "Item";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String saveData(@ModelAttribute("item") Item item, ModelMap map) {

		Integer n = service.SaveData(item);
		String smg = "Item '" + n + "' Saved";
		map.addAttribute("item", new Item());
		map.addAttribute("message", smg);
		return "Item";
	}

	@RequestMapping("all")
	public String showData(ModelMap map) {
		List<Item> dev = service.getAllData();
		List<Order> sales = orderService.getOrderByMode("sale");
		List<Order> purchases = orderService.getOrderByMode("purchase");
		List<Order> customer = orderService.getOrderByMode("customer");
		map.addAttribute("sales", sales);
		map.addAttribute("purchases", purchases);
		map.addAttribute("customer", customer);
		map.addAttribute("list", dev);
		return "ItemData";

	}

	@RequestMapping("delete")
	public String deleteData(@RequestParam("id") Integer id, ModelMap map) {
		service.deleteData(id);
		String smg = "Item '" + id + "'  Deleted";
		List<Item> dev = service.getAllData();
		map.addAttribute("list", dev);
		map.addAttribute("message", smg);
		return "ItemData";
	}

	@RequestMapping("edit")
	public String EditData(@RequestParam("id") Integer n, ModelMap map) {
		List<Order> sales = orderService.getOrderByMode("sale");
		List<Order> purchases = orderService.getOrderByMode("purchase");
		Item p = service.getOneProjectById(n);
		map.addAttribute("item", p);
		map.addAttribute("sales", sales);
		map.addAttribute("purchases", purchases);
		return "ItemEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String UpdateData(@ModelAttribute("item") Item p, ModelMap map) {
		service.UpdateData(p);
		String smg = "Item '" + p.getItemId() + "'updated";
		List<Item> dev = service.getAllData();
		map.addAttribute("list", dev);
		map.addAttribute("message", smg);
		return "ItemData";

	}

}
