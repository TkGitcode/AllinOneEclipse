<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="ErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet Example</title>
</head>
<body>
	<form action="first" method="get">
		Input 1 : <input type="text" name="value1"> Input 2 : <input
			type="text" name="value2"> <br> <br> <input
			type="submit" value="Button">
	</form>
	<%-- <%
	int value = 8 / 0;
	%> --%>
    
	<%
	
	String getAtt = request.getAttribute("Info").toString(); //getAttribute give a Object Value so We Convert into String
	out.print(getAtt);
	
	                            /* (or) */
	                            

	%>
	<!-- Exprestional Language -->
	<%-- ${Info} --%>
</body>
</html>