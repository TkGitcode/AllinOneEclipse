<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- To Print a Value -->
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %><!-- To Connect JDBC -->
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
<form action="mainpage" method="post">
  Enter a Value 1 : <input type="text" name="val1">
  Enter a Value 2 : <input type="text" name="val2">
  <input type="submit" value="Button"> 
  </form>
 <!-- Listing Whole value -->
  <c:out value=" Your Addtion Value is : ${List}"></c:out>
  <!-- Listing one by one Value -->
  <c:forEach items="${List}" var="s">
  ${s.name} <br/>
  </c:forEach>
  
  <!-- We can Import Any Other WebSite inside the import -->
 <%--  <c:import url="http://www.google.com" ></c:import>  --%>
 
 
 <!-- Here I am Connecting a DataBase using Tag Library function -->
 <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/onlineexamconduction" user="root" password="1234"/>
 
 <!-- Passing a Query and Getting a result via var="rs" -->
 <sql:query var="rs" dataSource="${db}">select * from UserDetail</sql:query>
 
 <c:forEach items="${rs.rows}" var="value">
 <c:out value="${value.email}"></c:out>
 </c:forEach>
 
 <!-- Finding a length of String(length function) -->
 <c:set var="str" value="what is my length"/>
 <c:out value=" My length is  ${fn:length(str)}"/>
 
 <!-- Split function -->
 <c:forEach items="${fn:split(str,' ')}" var="str">
 <br>
 ${str}
 </c:forEach>
 
  
</body>
</html>