package com.app.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Order;
@Component
public class OrderValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Order.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Order order=(Order)target;
		if(order.getSaleMode()==null||order.getSaleMode().isEmpty())
		{
			errors.rejectValue("saleMode", null, "Please Fill Out Sale Mode..");
		}
		if(order.getoCode()==null||order.getoCode()=="")
		{
			errors.rejectValue("oCode", null, "please Enter the Order Code..");
		}
		
	
	 if(order.getoMethod()==null||order.getoMethod().isEmpty())
	 {
		 errors.rejectValue("oMethod", null, "Please enter Order Method..");
	 }
	 if(order.getoAccest()==null||order.getoAccest().isEmpty()) {
			errors.rejectValue("oAccest",null,"Please Enter The Order Accest..");
		
	 }
	 if(order.getOdesc()==null||order.getOdesc().isEmpty())
	 {
		 errors.rejectValue("odesc", null, "Please Enter The Desciption..");
	 }
	}
}
