package com.example.demo.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;
@Component
public class SimpleFilter implements Filter{
	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	
		
	}

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Remote host"+request.getRemoteHost());
		System.out.println("Remote address"+request.getRemoteAddr());
		System.out.println("in filter");
		chain.doFilter(request,response);
		
		}
	
	@Override
	public void destroy() {
	
		
	}


}
