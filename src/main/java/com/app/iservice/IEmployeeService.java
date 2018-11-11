package com.app.iservice;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeService {


	public Integer saveEmployee(Employee e);
	public void updateEpmloyee(Employee e);
	public void deleteEmployee(Integer eId);
	public Employee getOneEmployee(Integer e);
	public  List<Employee>employeeAlls();
	
}
