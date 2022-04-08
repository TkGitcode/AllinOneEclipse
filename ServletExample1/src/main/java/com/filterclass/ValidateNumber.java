package com.filterclass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class ValidateNumber
 */
@WebFilter("/filterex")
public class ValidateNumber implements Filter {

    
	public void destroy() {
		
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//doFilter Has only a ServletRequest But We need to HttpServletRequest so we need to Create a Object for that
		
		//We Caste into ServletRequest
		PrintWriter pw=response.getWriter();
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		int id=Integer.parseInt(request.getParameter("id"));
		if(id > 1)
		chain.doFilter(request, response);
		else {
			pw.print("In Valid");
//			RequestDispatcher rs=request.getRequestDispatcher("FilterExample.jsp");
//			rs.forward(httpRequest, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
