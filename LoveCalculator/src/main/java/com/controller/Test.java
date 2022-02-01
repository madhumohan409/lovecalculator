package com.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.DTO.UserInfoDTO;
@SessionAttributes("userinfo")
@Controller
public class Test {

	@RequestMapping("/")
	public String UserHomepage(Model model) {
		//if we use cookies...........................................
	/*	Cookie[] cookies = request.getCookies();
		for (Cookie temp : cookies) {
			if ("mycookie".equals(temp.getName())) {
				String stringcookie = temp.getValue();
				userinfodto.setUserName(stringcookie); */
			model.addAttribute("userinfo", new UserInfoDTO());
		
		return "welcome-page";
	}

	@RequestMapping("/displayDetails")
	public String UserDetails(@Valid @ModelAttribute("userinfo") UserInfoDTO UserinfoDto, BindingResult result,
			HttpServletRequest request) {
		System.out.println(UserinfoDto.isTermsAndConditions());
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}

			return "welcome-page";
		}

		System.out.println(UserinfoDto.getUserName());
		System.out.println(UserinfoDto.getCrushName());
		
		/*Cookie usercookie = new Cookie("mycookie", UserinfoDto.getUserName());
		usercookie.setMaxAge(60 * 60 * 24);
		response.addCookie(usercookie);*/
		// writing session insted of cookie... in method also we user httpservletResponse response for cookies...
	HttpSession session = request.getSession();
	session.setAttribute("userName",UserinfoDto.getUserName());
		 
		return "Display-details";
	}
}
