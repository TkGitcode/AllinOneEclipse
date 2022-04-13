package com.servletapplicationform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.mapper.Mapper;
import org.json.simple.JSONObject;

import com.applicationform.ApplicationDao;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class ApplicationFormServlet
 */
public class ApplicationFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jname = request.getParameter("name");
		String jmail = request.getParameter("mail");
		String jmblno = request.getParameter("mblno");
		String jgender = request.getParameter("gender");
		String jrole = request.getParameter("role");
		String jclgname = request.getParameter("clgname");
		String jdegdep = request.getParameter("degdep");
		String jyearpass = request.getParameter("yearpass");

		String jtotyrExp = request.getParameter("totyrExp");
		String jcrtemp = request.getParameter("crtemp");
		String jcrtdesg = request.getParameter("crtdesg");
		String jsklst = request.getParameter("sklst");
		String jcrtctc = request.getParameter("crtctc");
		String jexpctc = request.getParameter("expctc");
		String jntcprd = request.getParameter("ntcprd");

		String jntvdis = request.getParameter("ntvdis");
		String javlbty = request.getParameter("avlbty");

		try {
			PrintWriter pw = response.getWriter();
			pw.print(jname);
			System.out.println("=========================" + jname);

			ApplicationDao apd = new ApplicationDao(jname, jmail, jmblno, jgender, jrole, jclgname, jdegdep, jyearpass,
					jtotyrExp, jcrtemp, jcrtdesg, jsklst, jcrtctc, jexpctc, jntcprd, jntvdis, javlbty);

			// create a Object for Object Mapper

			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(
					new File("C:/Users/Sathish Kumar/eclipse-workspace_Server/ApplicationForm/json/HiringDetail.json"),
					apd);
			InputStream inputStream = new FileInputStream(
					new File("C:/Users/Sathish Kumar/eclipse-workspace_Server/ApplicationForm/json/HiringDetail.json"));
			TypeReference<List<ApplicationDao>> details = new TypeReference<List<ApplicationDao>>() {
			};
			List<ApplicationDao> Listdetails = objectMapper.readValue(inputStream, details);

			String jasonString = objectMapper.writeValueAsString(apd);

			try (FileWriter file = new FileWriter("AppledDetails.json")) {
				file.write(jasonString);
			} catch (Exception e) {
				System.out.println(e);
			}

			ServletFileUpload flup = new ServletFileUpload(new DiskFileItemFactory());// Creating a Object
																						// ServerFileUpload

			List<FileItem> file = flup.parseRequest(request);

			for (FileItem item : file) {
				item.write(new File(
						"C:/Users/Sathish Kumar/eclipse-workspace_Server/ApplicationForm/Resume/" + item.getName()));
			}
			System.out.println("SuccessFully Uploaded");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
