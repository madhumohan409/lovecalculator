package com.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import formatter.phoneNumberFormatter;

@EnableWebMvc
@Configuration()
@ComponentScan(basePackages = "com.controller")
public class CreateConfig implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailsender= new JavaMailSenderImpl();
		javaMailsender.setHost("smtp.gmail.com");
		javaMailsender.setUsername("devuduboya@gmail.com");
		javaMailsender.setPassword("0987667890");
		javaMailsender.setPort(587);

		Properties mailproperties = new Properties();
		mailproperties.put("mail.smtp.starttls.enable", true);
		mailproperties.put("mail.smtp.ssl.trust","smtp.gmail.com");
		javaMailsender.setJavaMailProperties(mailproperties);
		return javaMailsender;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new phoneNumberFormatter());
	}

}
