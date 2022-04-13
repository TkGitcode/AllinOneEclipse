package com.examportal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DetailServletPage
 */
@WebServlet("/detailservletpage")
public class DetailServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ArrayList<QuestionDetail> questionDetailArr = new ArrayList<>();
		PrintWriter pw = response.getWriter();
		String Exam = request.getParameter("exam");

		Connection connection = null;	

		try {
			connection = DbConnection.getConnection();

			String strQuery = "select * from $tableName";

			String query = strQuery.replace("$tableName", Exam);

			
			PreparedStatement qesStatement = connection.prepareStatement(query+"questionandanswers_tbl");

			ResultSet rs = qesStatement.executeQuery();

			while (rs.next()) {
				QuestionDetail questionDetail=new QuestionDetail(rs.getString(1), rs.getString(2));
				//questionDetailArr.add(questionDetail);
				
				HttpSession session=request.getSession();
				session.setAttribute("Question", questionDetail);
				
				//pw.println(rs.getString(1) + " " + rs.getString(2));
			}
			response.sendRedirect("ExamPage.jsp");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
