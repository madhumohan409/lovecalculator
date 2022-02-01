package Validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.DTO.RegistrationDTO;

public class userNameVallidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty", "useranme shoud not be blank");
	String username=((RegistrationDTO)object).getUsername();
		if(!username.contains("_")) {
			errors.rejectValue("username","username.invalidString","String must be '_'");
		}
	}

}
