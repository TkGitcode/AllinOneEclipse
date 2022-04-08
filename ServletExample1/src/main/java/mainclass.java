import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mainpage")
public class mainclass extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<UserDetail> userDetail = new ArrayList<>();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter pw = response.getWriter();

		pw.print("Hello");
		String a = request.getParameter("val1");
		String b = request.getParameter("val2");

		UserDetail ud = new UserDetail(Integer.parseInt(a), b); // Sending a value for Class
 
		userDetail.add(ud);
     
		request.setAttribute("List", userDetail); // Setting a Object to the SetAttributes
		
		RequestDispatcher filterpage=request.getRequestDispatcher("FilterExample.jsp");
		filterpage.forward(request, response);
		
//		RequestDispatcher rs = request.getRequestDispatcher("Index.jsp");
//		rs.forward(request, response);
	}
}
