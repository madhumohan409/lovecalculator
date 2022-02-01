package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DSConfig implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
		AnnotationConfigWebApplicationContext webappcontext = new AnnotationConfigWebApplicationContext();
		webappcontext.register(CreateConfig.class);
		DispatcherServlet dispatcherservlet = new DispatcherServlet(webappcontext);
	ServletRegistration.Dynamic registerservlet=servletContext.addServlet("mydispatcherServlet",dispatcherservlet);
	registerservlet.setLoadOnStartup(1);
	registerservlet.addMapping("/");
	}

}
