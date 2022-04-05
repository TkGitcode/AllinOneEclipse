<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
    <!-- If i use isErrorPage = "true" then only we can use (excption)-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>oop's Error</title>
</head>
<body>
   Error
   <%= exception.getMessage() %> <!-- Exception is Object only We can use when isErrorPageis="true" is implemented in header file-->
</body>
</html>