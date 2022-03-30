package com.examportal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {


	public static final long serialVersionUID  =1L;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name=getInitParameter("Username");
		PrintWriter pw=response.getWriter();
		
		pw.print(name);
	}
}
