package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.iservice.IDeveloperService;
import com.app.iservice.IProjectService;
import com.app.model.Developer;
import com.app.model.Project;

@Controller
@RequestMapping("developer")
public class DeveloperController {
	@Autowired
	private IDeveloperService service;
	  @Autowired
	   private IProjectService DeveloperService;
	  
	@RequestMapping("save")
	public String saveData(ModelMap map) {
		List<Project> dev=DeveloperService.getAllData();
		
		map.addAttribute("developer", new Developer());
		map.addAttribute("list",dev);
		return "Developer";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String saveData(@ModelAttribute("developer") Developer dev, ModelMap map) {
		Integer n = service.saveDeveloper(dev);
		
		String smg = "Developer '" + n + "' saved";
		List<Project> dev1=DeveloperService.getAllData();
		map.addAttribute("message", smg);
		map.addAttribute("list",dev1);
		map.addAttribute("developer", new Developer());
		return "Developer";
	}
	
	
	@RequestMapping("all")
	public String showData(ModelMap map)
	{
		List<Developer> dev=service.getAllData();
		map.addAttribute("list",dev);
		return "DeveloperData";
		
	}
	
	
	
	
	@RequestMapping("delete")
	public String deleteData(@RequestParam ("id") Integer id,ModelMap map)
	{
		service.deleteData(id);
		String smg="Developer '"+id+"'  Deleted";
		List<Developer> dev=service.getAllData();
		map.addAttribute("list",dev);
		map.addAttribute("message",smg);
		return "DeveloperData";
	}
	
	
	@RequestMapping("edit")
	public String EditData(@RequestParam("id")Integer n,ModelMap map)
	{
		Developer p=service.getOneProjectById(n);
		map.addAttribute("developer",p);
		return "DeveloperEdit";
	}
	
	@RequestMapping(value="/update" ,method=RequestMethod.POST)
	public String UpdateData(@ModelAttribute("developer") Developer p,ModelMap map)
	{
		service.UpdateData(p);
		String smg="Developer '"+p.getId()+"'updated";			
		List<Developer> dev=service.getAllData();		
		map.addAttribute("list",dev);
		map.addAttribute("message",smg);
		return "DeveloperData";
		
		
	}
	
	

}
