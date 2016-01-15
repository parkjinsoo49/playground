package com.rpn.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{ WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.do"};
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { MyBatisConfig.class };
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		
		return new Filter[] { characterEncodingFilter };
	}

	@Override
	protected String getServletName() {
		return "dispatcherServlet";
	}

	@Override
	protected boolean isAsyncSupported() {
		return true;
	}
}