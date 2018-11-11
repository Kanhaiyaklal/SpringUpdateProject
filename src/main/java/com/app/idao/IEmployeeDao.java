package com.app.idao;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeDao {

	public Integer saveEmployee(Employee e);
	public void updateEpmloyee(Employee e);
	public void deleteEmployee(Integer eId);
	public Employee getOneEmployee(Integer e);
	public  List<Employee>employeeAlls();
	
	
}
