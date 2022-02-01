package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.DTO.EmailDTO;
import com.DTO.UserInfoDTO;

import service.LcAppEmailServiceImpl;

@Controller
public class EmailController {

	@Autowired
	private LcAppEmailServiceImpl lcAppEmailService;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		/*
		 * public String sendEmail(@CookieValue("mycookie") String userName, Model model
		 * ) {
		 */
		// using session instead of cookies..

		model.addAttribute("emailDto", new EmailDTO());

		return "Email-Home-Page";
	}

	@RequestMapping("/proces-email")
	public String processEmail(@SessionAttribute("userinfo") UserInfoDTO UserinfoDto,
			@ModelAttribute("emailDto") EmailDTO emailDto) {
		/*
		 * String userName=(String) session.getAttribute("userName"); String
		 * newuserName=" Mr " +userName; model.addAttribute("userName",newuserName);
		 */
		// calling sendEmail method from lcappEmailservice
		lcAppEmailService.sendEmail(UserinfoDto.getUserName(),emailDto.getUserEmail(),"FRIEND");
		return "Process-Email-Page";
	}

}
