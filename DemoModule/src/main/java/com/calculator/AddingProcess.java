package com.calculator;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddingProcess extends HttpServlet {//Here we Extends HttServlet Now my class is Servlet 
    
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		int val1=Integer.valueOf(request.getParameter("val1"));
		int val2=Integer.valueOf(request.getParameter("val2"));
		
		int addition = val1+val2;
		
		//PrintWriter writer=
	}
}
