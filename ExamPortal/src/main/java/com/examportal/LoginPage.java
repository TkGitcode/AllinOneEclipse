package com.examportal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginPage
 */
@WebServlet(description = "User Login Page", urlPatterns = { "/loginPage" })
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection=null;
		PrintWriter pw=response.getWriter();
		
		String uName="";
		RequestDispatcher rsDispatcher=null;
		try {
			String mailId=request.getParameter("mail");
			String passWord=request.getParameter("pass");
			connection=DbConnection.getConnection();
			PreparedStatement loginpreparedStatement=connection.prepareStatement("select * from UserDetail where email=? and password=?");
			
			loginpreparedStatement.setString(1,mailId);
			loginpreparedStatement.setString(2, passWord );
			
			ResultSet rsResultset=loginpreparedStatement.executeQuery();
			
			if(rsResultset.next())
			{
				pw.print("Logined Successfully ");
				
				HttpSession session=request.getSession();
				session.setAttribute("mailId", mailId);
				//response.sendRedirect("DetailPage.jsp");
				rsDispatcher= request.getRequestDispatcher("DetailPage.jsp");
			}
			else {
				pw.print("Please Relogin");
				rsDispatcher = request.getRequestDispatcher("UserLogin.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		rsDispatcher.forward(request, response);
	}

}
