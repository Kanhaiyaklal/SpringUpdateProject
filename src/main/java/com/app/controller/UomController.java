package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.iservice.IUomService;
import com.app.model.UOM;

@Controller
@RequestMapping("/uom")
public class UomController {
	@Autowired
	private IUomService service;
	@RequestMapping("/data")
	public String show(ModelMap map)
	{
		map.addAttribute("uom",new UOM());
		
		return "Home";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String showData(@ModelAttribute("uom") UOM um,ModelMap map)
	{
		
		Integer n=service.saveUom(um);
		String smg="UOM '"+n+"' saved";
		
		map.addAttribute("an",smg);
		map.addAttribute("ba",new UOM());
		return  "Home";
	}
    
	@RequestMapping("/all")
	public String showAll(ModelMap map)
	{
		List<UOM>um=service.getAllUOM();
		map.addAttribute("list",um);
		return "UomData";
	}
	
	@RequestMapping("/delete")
	public String deleteEmp(@RequestParam("id") Integer uId, ModelMap map) {
		service.deleteUom(uId);
		String msg = "Uom '" + uId + "' delete";
		List<UOM> emps = service.getAllUOM();
		map.addAttribute("an", msg);
		map.addAttribute("list", emps);
		return "UomData";
	}

	
	@RequestMapping("/edit")
	public String editEmp(@RequestParam("id") Integer uom, ModelMap map) {
		UOM emp = service.getOneUom(uom);
		map.addAttribute("uom", emp);

		return "UomEdit";
	}
	
	
		
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String doUpdateData(@ModelAttribute UOM uom, ModelMap map) {
			service.updateUom(uom);
			String msg = "Uom'" + uom.getId() + "'updated";

			List<UOM> emps = service.getAllUOM();
			map.addAttribute("an", msg);
			map.addAttribute("list", emps);
			return "UomData";
	
	}
	
	
	
}
