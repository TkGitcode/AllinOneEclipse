package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddingProcess extends HttpServlet {//Here we Extends HttServlet Now my class is Servlet 
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     //Here doPsot or doGet Method both depends on the Service Method
	
	//doPost Method
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int val1=Integer.valueOf(request.getParameter("val1"));
		int val2=Integer.valueOf(request.getParameter("val2"));
		
		int addition = val1+val2;
		
		PrintWriter writer=response.getWriter(); //Print Writer is Class 
		//Using printWriter to Write a Response in Web
		writer.print("Your Addition value is : "+addition);
		
		
		
	}
	//doGet Method
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		int val1=Integer.valueOf(request.getParameter("val1"));
		int val2=Integer.valueOf(request.getParameter("val2"));
		
		int addition = val1+val2;
		
		PrintWriter writer=response.getWriter(); //Print Writer is Class 
		//Using printWriter to Write a Response in Web
		writer.print("Your Addition value is : "+addition);
		
		//RequestDespatcher is used to Redirect(Dispatch) to the Server
		RequestDispatcher rDispatcher=request.getRequestDispatcher("Sub");
		rDispatcher.forward(request, response);
	}
}
