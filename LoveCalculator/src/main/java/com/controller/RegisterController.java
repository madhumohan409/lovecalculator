package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DTO.Phone;
import com.DTO.RegistrationDTO;
import com.DTO.communicationDTO;

import Validators.userNameVallidator;
import customEditors.NamePropertyEditor;
@Controller
public class RegisterController {
	@RequestMapping("/registration")
	public String userhomepage(@ModelAttribute("registerinfo") RegistrationDTO dto) {
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("9666808037");
		
		communicationDTO communicationDto = new communicationDTO();
		communicationDto.setPhone(phone);
		dto.setCommunicationDto(communicationDto);
		
		
		return "welcome_Rgistration";
	}

	@RequestMapping("/showdetails")
public String showRegistrationdetails(@Valid @ModelAttribute("registerinfo") RegistrationDTO dto ,BindingResult result) {
		
		if(result.hasErrors()) {
			List<ObjectError> Errors=result.getAllErrors();
			for(Object temp:Errors) {
				System.out.println("errors occured "+ temp);
			}
			return "welcome_Rgistration";
		}
		System.out.println("user registration successfully done");
	return "show-userDetails";
}
	
		
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("init binder called");
		//binder.setDisallowedFields("name");
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
	binder.registerCustomEditor(String.class, "name", editor);
	NamePropertyEditor nameEditor = new NamePropertyEditor();
	binder.registerCustomEditor(String.class, "name",nameEditor);
	userNameVallidator userNameValidator = new userNameVallidator();
	binder.addValidators(userNameValidator);
	
	}
}