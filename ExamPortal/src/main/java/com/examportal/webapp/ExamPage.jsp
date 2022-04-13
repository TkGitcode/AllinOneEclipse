<%@page import="com.examportal.QuestionDetail"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<% 

  QuestionDetail detail=(QuestionDetail)session.getAttribute("Question");

%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>


<%= detail.getQuestion() %>

</div>

<%-- <div>


<%=  %>

</div>

<div>


<%=  %>

</div>

<div>


<%=  %>

</div>

<div>


<%=  %>

</div> --%>


</body>
</html>