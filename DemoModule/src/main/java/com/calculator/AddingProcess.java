package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddingProcess extends HttpServlet {//Here we Extends HttServlet Now my class is Servlet 
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     //Here doPsot or doGet Method both depends on the Service Method
	
	//doPost Method
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int val1=Integer.valueOf(request.getParameter("val1"));
		int val2=Integer.valueOf(request.getParameter("val2"));
		
		int addition = val1+val2;
		
		PrintWriter writer=response.getWriter(); //Print Writer is Class 
		//Using printWriter to Write a Response in Web
		writer.print("Your Addition value is : "+addition);
		
		//Creating a Object for the Session 
		//Session Will Store a Value of Current Session
		HttpSession session=request.getSession(); 	
	    session.setAttribute("sessionValue", val1 * val2);
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
		RequestDispatcher rDispatcher=request.getRequestDispatcher("Sub"); //Here I am Redirected to One Servlet to Another Servlet
	
		rDispatcher.forward(request, response);
		
		//Here I am Setting a Attributes to One Server(javafile) to Another Server(javafile)
		request.setAttribute("AdditionValue", addition);
		
		//Here Cookie is class so im Creating a Object and Passing a Parameter to the that 
				//1st Parameter is Name for Cookie and 2nd is Value passing to cookie(Only String)
				Cookie cookie=new Cookie("cookieValue" , addition+"");
				//adding a cookie with Response
				response.addCookie(cookie); //Here Response is Server send a response to client and Client Send a Request to the Server
		
		
		
		
	}
}
