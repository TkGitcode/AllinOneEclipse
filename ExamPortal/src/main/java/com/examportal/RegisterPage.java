package com.examportal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterPage
 */
@WebServlet(description = "User Login Page", urlPatterns = { "/registerPage" })
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   
		PrintWriter pw=response.getWriter();
		RequestDispatcher requestDispatcher=null;
		Connection connection=null;
		String usrName=request.getParameter("name");
		String usrMail=request.getParameter("mail");
		String usrPasswrd=request.getParameter("pass");		
		
		
		try {
			connection= DbConnection.getConnection();
			PreparedStatement signUpPreparedStatement=connection.prepareStatement("insert into userdetail(name,email,password) values(?,?,?)");
			
			signUpPreparedStatement.setString(1, usrName);
			signUpPreparedStatement.setString(2, usrMail);
			signUpPreparedStatement.setString(3, usrPasswrd);
			
			int i= signUpPreparedStatement.executeUpdate();
			
			if(i>0)
			{
				requestDispatcher = request.getRequestDispatcher("UserLogin.jsp");
				pw.print("Account Created ");
			}
			else {
				requestDispatcher=request.getRequestDispatcher("UserRegister.jsp");
				pw.print("Error in Creation");
			}
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			pw.print("Error during Creation");
		}
	}

}
