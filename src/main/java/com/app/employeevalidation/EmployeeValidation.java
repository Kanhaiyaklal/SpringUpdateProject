package com.app.employeevalidation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Employee;
@Component
public class EmployeeValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object targate, Errors errors) {
		
		Employee e=(Employee)targate;
		if(e.getEmpname()==null||e.getEmpname().isEmpty())
		{
			errors.rejectValue("Empname",null,"Please Enter The  Name..");
		}
		if(e.getEmpAddress()==null||e.getEmpAddress().isEmpty())
		{
			errors.rejectValue("empAddress",null,"Plaese Enter The Address..");
		}
		if(e.getEmpGeneder()==null||e.getEmpGeneder().isEmpty())
		{
			errors.rejectValue("empGeneder", null, "Please Choose The Gender..");
		}
		if(e.getEmpcntry()==null||e.getEmpcntry().isEmpty())
		{
			errors.rejectValue("empcntry", null, "Please Enter The Country..");
		}
		if(e.getEmpLangs()==null||e.getEmpLangs().isEmpty())
		{
			errors.rejectValue("empLangs", null, "Please Choose The Language..");
		}
		
	}

}
