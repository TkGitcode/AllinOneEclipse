package com.addition;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JsonObject;

@WebServlet("/addition")
public class addition extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		PrintWriter out = response.getWriter();
		out.print(a + b); 
		JsonObject object=new JsonObject();
		object.put("AddedValue",a+b);
		FileWriter file=new FileWriter("C://Users//Sathish Kumar//eclipse-workspace_Server//DemoApp//jsonFile/AdditionValue.json",false);
		file.write(object.toJson());
		file.close();
		
		}

}
