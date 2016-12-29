package com.oggy.OggyFrontendJava.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	/*public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class);
		context.setServletContext(container);
		
		ServletRegistration.Dynamic servlet=container.addServlet("dispatcher", new DispatcherServlet(context));
		
		servlet.addMapping("/");
		
		
	}*/

	 @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { WebConfig.class };
	    }
	  
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }
	  
	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }

}
