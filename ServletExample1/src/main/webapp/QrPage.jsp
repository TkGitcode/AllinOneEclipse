<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>QR Code</title>
</head>
<body>
<!-- ${pageContext.request.contextPath}/ -->
 <form action="DemoServlet" method="post">
 <input type="text" name="name" value="${name}">
 <input type="submit" value="Qr">
 <br>
 <!-- ${pageContext.request.contextPath}/ -->
 <img  src="QrCodeGenerator?name=${name}">
 </form>
 
</body>
</html>