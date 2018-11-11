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
import org.springframework.web.servlet.ModelAndView;

import com.app.employeevalidation.EmployeeValidation;
import com.app.iservice.IEmployeeService;
import com.app.model.Employee;
import com.app.view.EmployeeExcelView;
import com.app.view.EmployeePdfView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
    @Autowired
    private EmployeeValidation validator;
	@RequestMapping("/register")
	public String showRegPage(ModelMap map) {
		//Employee e=new Employee();
		map.addAttribute("employee",new Employee());
		return "EmployeeRegister";
	}
	// Click On Submit Button

	@RequestMapping(value = "/insert", method = RequestMethod.POST)

	public String saveData(@ModelAttribute Employee employee,Errors errors ,ModelMap map) {
		
		validator.validate(employee, errors);
		if(!errors.hasErrors())//if errors exist
		{
		Integer empId = service.saveEmployee(employee);
		String msg = "Employee'" + empId + "'saved";
		map.addAttribute("message", msg);
		// clear form data
		map.addAttribute("employee", new Employee());
		}
		return "EmployeeRegister";
	}

	@RequestMapping("/all")
	public String showData(ModelMap map) {
		List<Employee> emps = service.employeeAlls();
		map.addAttribute("list", emps);
		return "EmployeeData";
	}

	//

	@RequestMapping("/delete")
	public String deleteEmp(@RequestParam("id") Integer empId, ModelMap map) {
		service.deleteEmployee(empId);
		String msg = "Employee '" + empId + "' delete";
		List<Employee> emps = service.employeeAlls();
		map.addAttribute("message", msg);
		map.addAttribute("list", emps);
		return "EmployeeData";
	}

	@RequestMapping("/edit")
	public String editEmp(@RequestParam("id") Integer empId, ModelMap map) {
		Employee emp = service.getOneEmployee(empId);
		map.addAttribute("employee", emp);

		return "EmployeeEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String doUpdateData(@ModelAttribute Employee employee, ModelMap map) {
		service.updateEpmloyee(employee);
		String msg = "Employee'" + employee.getEmpId() + "'updated";

		List<Employee> emps = service.employeeAlls();
		map.addAttribute("message", msg);
		map.addAttribute("list", emps);
		return "EmployeeData";
	}

	//Excel Export

	@RequestMapping("excel")
	public ModelAndView showExcel()
	{
		List<Employee> emps=service.employeeAlls();
		ModelAndView m=new ModelAndView();
		m.setView(new EmployeeExcelView());
		m.addObject("emps",emps);
		return m;
	}
	
	
	//PDF Export
	
	@RequestMapping("pdf")
	public ModelAndView showPdf()
	{
		List<Employee> emps=service.employeeAlls();
		ModelAndView m=new ModelAndView();
		m.setView(new EmployeePdfView());
		m.addObject("emps",emps);
		return m;
	}
	
	
	
}
