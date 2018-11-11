package com.app.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.idao.IEmployeeDao;
import com.app.model.Employee;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao{
	@Autowired
	HibernateTemplate ht;
	
	@Transactional
	public Integer saveEmployee(Employee e)
	{
		 
		return (Integer)ht.save(e);
		
	}

	
	@Transactional
	public void updateEpmloyee(Employee e) {
		
	      ht.update(e);
		
	}

	@Transactional
	public void deleteEmployee(Integer eId) {
		/*
		Employee e=new Employee();
		e.setEmpId(eId);
		ht.delete(e);*/
		//Employee e=new Employee(eId);
		
		ht.delete(new Employee(eId));
	}

	@Override
	public Employee getOneEmployee(Integer e) {
		   
		return  ht.get(Employee.class,e);
		
	}

	@Transactional
	public List<Employee> employeeAlls() {
	
		return ht.loadAll(Employee.class);
		
	}

}
