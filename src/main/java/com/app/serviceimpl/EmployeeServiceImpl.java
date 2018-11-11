package com.app.serviceimpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.idao.IEmployeeDao;
import com.app.iservice.IEmployeeService;
import com.app.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeDao dao;

	public Integer saveEmployee(Employee e) {

		return dao.saveEmployee(e);
	}

	@Override
	public void updateEpmloyee(Employee e) {
		dao.updateEpmloyee(e);

	}

	@Override
	public void deleteEmployee(Integer eId) {
		dao.deleteEmployee(eId);

	}

	@Override
	public Employee getOneEmployee(Integer e) {
		return dao.getOneEmployee(e);

	}

	@Override
	public List<Employee> employeeAlls() {

		List<Employee> emps = dao.employeeAlls();
		Collections.sort(emps, (a1, a2) -> a2.getEmpId() - a1.getEmpId());
		return emps;

		// return dao.employeeAlls();
	}

	/*
	 * @Override public void updateEpmloyee(Employee e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */
	// emp*

}
