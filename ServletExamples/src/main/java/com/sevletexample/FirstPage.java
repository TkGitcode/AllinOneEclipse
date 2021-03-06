package com.sevletexample;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstPage extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter pw = response.getWriter();

		int n = Integer.parseInt(request.getParameter("value1"));
		int n1 = Integer.parseInt(request.getParameter("value2"));

		pw.println("I am Adding Two Value " + n + n1);
		// Servlet Context

		// ServletContext is Interface
		// Getting a value using a Context Param Value in XML value
		ServletContext cntx = getServletContext();
		// getInitParameter is used to get a Value
		String Myname = cntx.getInitParameter("Myname");

		pw.println(Myname);

		// Servlet Config
		//It can be used in Specfic servlet
		ServletConfig conf = getServletConfig();

		String serConf = conf.getInitParameter("Myname");
		pw.print("Hi " + serConf + " You are from ServletConfig.. Welcome");
		
		String att="I a from Servlet SetAttributes";
		
		
		//Set Attributes And GetAttribute
		 // Note //To Execute the value Please Command the JSP file
		RequestDispatcher reqdes=request.getRequestDispatcher("index.jsp");
		request.setAttribute("Info",att);
		reqdes.forward(request, response);
		

	}

}
