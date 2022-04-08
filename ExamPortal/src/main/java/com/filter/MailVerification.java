package com.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.examportal.DbConnection;

/**
 * Servlet Filter implementation class MailVerification
 */
@WebFilter("/registerPage")
public class MailVerification implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		Connection connection = null;
		int userExits = 0;

		String usrMail = request.getParameter("mail");

		try {
			connection = DbConnection.getConnection();
			PreparedStatement signUpPreparedStatement = connection
					.prepareStatement("select exists(select * from userdetail where email = ?)");
			signUpPreparedStatement.setString(1, usrMail);
			ResultSet rs = signUpPreparedStatement.executeQuery();

			if (rs.next()) {
				userExits = rs.getInt(1);
				if (userExits == 1) {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserRegister.jsp");
					requestDispatcher.forward(request, response);
				} else {
					chain.doFilter(request, response);
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}

}
