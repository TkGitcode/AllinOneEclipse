package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Substraction extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet (HttpServletRequest request,HttpServletResponse response) throws IOException
   {
	   PrintWriter writer=response.getWriter();
	   
	   //here i a Receive a Attributes using getAttributes 
	   //Value from AnotherJavafile(AddtionProcess) to this file
	   int gettingvalue=(int)request.getAttribute("AdditionValue");
	   writer.println("I am From AddtionProcess "+ gettingvalue);
	   
	   HttpSession session=request.getSession();
	   
	   //Getting a Session Value using GetAttributes
	  int k=(int)session.getAttribute("sessionValue");
	  
	  
	  
	   writer.println("I m Called By Session "+k);
	 //We can also Remove a Session Value using .removeAttributes
	 //  session.removeAttribute("sessionValue");
	   int n=0;
	   //Here we Use getCookies Because Client Side has Multiple Cookie
	  Cookie cookies[]=request.getCookies();
	  //Here I am Using a Array of Cookies Because Client Side has Multiple Cookies
	  for(Cookie c:cookies)
	  {
		  if(c.getName().equals("cookieValue")){//c.getName is use to Get a Name of All Cookies  
			  n=Integer.parseInt(c.getValue()) ; //getValue gives String I am Converting into Integer
		  }
	  
	  }
	  writer.println("I am Called By Cookies "+n);  
   }
	   
   }
