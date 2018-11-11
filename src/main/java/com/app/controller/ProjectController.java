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
@RequestMapping("project")
public class ProjectController {

	    @Autowired
		private IProjectService service;
      
		@RequestMapping("save")
		public String saveData(ModelMap map	) {
		
			
			map.addAttribute("project", new Project());
			
			return "Project";
		}

		@RequestMapping(value = "insert", method = RequestMethod.POST)
		public String saveData(@ModelAttribute("project") Project p, ModelMap map) {
			Integer n = service.saveProject(p);
			String smg = "Project '" + n + "' saved";
			map.addAttribute("message", smg);
			return "Project";
		}
		
	
		@RequestMapping("all")
		public String showData(ModelMap map)
		{
			List<Project> dev=service.getAllData();
			map.addAttribute("list",dev);
			return "ProjectData";
			
		}
		
		
		@RequestMapping("delete")
		public String deleteData(@RequestParam ("id") Integer id,ModelMap map)
		{
			service.deleteData(id);
			String smg="Project '"+id+"'  Deleted";
			List<Project> dev=service.getAllData();
			map.addAttribute("list",dev);
			map.addAttribute("message",smg);
			return "ProjectData";
		}
		
		
		@RequestMapping("edit")
		public String EditData(@RequestParam("id")Integer n,ModelMap map)
		{
			Project p=service.getOneProjectById(n);
			map.addAttribute("project",p);
			return "ProjectEdit";
		}
		
		@RequestMapping(value="/update" ,method=RequestMethod.POST)
		public String UpdateData(@ModelAttribute("project") Project p,ModelMap map)
		{
			service.UpdateData(p);
			String smg="Project '"+p.getId()+"'updated";			
			List<Project> dev=service.getAllData();		
			map.addAttribute("list",dev);
			map.addAttribute("message",smg);
			return "ProjectData";
			
			
		}
		

	}

