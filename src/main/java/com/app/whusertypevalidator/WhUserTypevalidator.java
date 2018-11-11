package com.app.whusertypevalidator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.WhUserType;
@Component
public class WhUserTypevalidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return WhUserType.class.equals(clazz);
	}

	@Override
	public void validate(Object targate, Errors errors) {
		
		WhUserType user=(WhUserType)targate;
		if(user.getUtype()==null||user.getUtype().isEmpty())
		{
			errors.rejectValue("utype", null, "Please Enter The User Type..");
		}
		if(user.getUcode()==null||user.getUcode().isEmpty())
		{
			errors.rejectValue("ucode", null, "Please Enter The User Code..");
		}
		if(user.getUfor()==null||user.getUfor().isEmpty())
		{
			errors.rejectValue("ufor", null, "Please Enter The User For..");
		}
		if(user.getuEmail()==null||user.getuEmail().isEmpty())
		{
			errors.rejectValue("uEmail", null, "Please Enter The User Email..");
		}
		if(user.getuContact()==null||user.getuContact().isEmpty())
		{
			errors.rejectValue("uContact", null, "Please Enter The User Contact..");
		}
		if(user.getuIdtype()==null||user.getuIdtype().isEmpty())
		{
			errors.rejectValue("uIdtype", null, "Please Enter The User IdType..");
		}
		if(!user.getOther().isEmpty())
		{
		
		}
		/*else
		{
			errors.rejectValue("other", null, "* (Optional)");	
		}*/
		if(user.getIdNumber()==null)
		{
			errors.rejectValue("idNumber", null, "Please Enter The User Id Number..");
		}
		
		
	}

	
}
