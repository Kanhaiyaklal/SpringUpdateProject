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
import com.app.iservice.IWhUserTypeService;
import com.app.model.WhUserType;
import com.app.whusertypevalidator.WhUserTypevalidator;
@Controller
@RequestMapping("/whuser")
public class WhUserTypeController {
	@Autowired
	private WhUserTypevalidator whUserValidate;
	@Autowired
	private IWhUserTypeService service;
	@RequestMapping("/data")
	public String show(ModelMap map)
	{
		map.addAttribute("whtype",new WhUserType());
		
		return "WhUserTypeHome";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String showData(@ModelAttribute("whtype") WhUserType um,Errors errors,ModelMap map)
	{
		
		whUserValidate.validate(um, errors);
		if(!errors.hasErrors())
		{
		Integer n=service.saveUom(um);
		String smg="user '"+n+"' saved";
		
		map.addAttribute("message",smg);
		map.addAttribute("whtype",new WhUserType());
		}
		return  "WhUserTypeHome";
	}
    
	@RequestMapping("/all")
	public String showAll(ModelMap map)
	{
		List<WhUserType>um=service.getAllUOM();
		map.addAttribute("list",um);
		return "WhUserType";
	}
	
	@RequestMapping("/delete")
	public String deleteEmp(@RequestParam("id") Integer uId, ModelMap map) {
		service.deleteUom(uId);
		String msg = "WhUserType '" + uId + "' delete";
		List<WhUserType> emps = service.getAllUOM();
		map.addAttribute("an", msg);
		map.addAttribute("list", emps);
		return "WhUserType";
	}

	
	@RequestMapping("/edit")
	public String editEmp(@RequestParam("id") Integer uom, ModelMap map) {
		WhUserType emp = service.getOneUom(uom);
		map.addAttribute("whtype", emp);

		return "WhuserTypeEdit";
	}
	
	
		
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String doUpdateData(@ModelAttribute WhUserType uom, ModelMap map) {
			service.updateUom(uom);
			String msg = "Uom'" + uom.getId() + "'updated";

			List<WhUserType> emps = service.getAllUOM();
			map.addAttribute("an", msg);
			map.addAttribute("list", emps);
			return "WhUserType";
	
	}
	
	
	
	
	

}
