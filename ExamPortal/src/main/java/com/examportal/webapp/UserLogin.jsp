<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="UserRegisterStyle.css">
</head>
<body>
<div class="container">
        <div class="header">
            <h2>Login</h2>
        </div>
        <form class="form" id="form" action="loginPage" method="post">
            <div class="form-control">  
                <label>Email</label>
                <input type="email" placeholder="Enter a Mail id" id="email" name="mail">
                <i class="fa-solid fa-circle-check"></i>
                <i class="fa-solid fa-exclamation-circle"></i>
                <small>Error Message</small>
            </div>
            <div class="form-control">  
                <label>Password</label>
                <input placeholder="Enter a Password" id="Password" type="password" name="pass">
                <i class="fa-solid fa-circle-check"></i>
                <i class="fa-solid fa-exclamation-circle"></i>
                <small>Error Message</small>
            </div>
            <button id="submit">login</button>
        </form>
    </div>
    	<div>
		<a href="UserRegister.jsp" class="signup-image-link">I am New Member</a>
	</div>
</body>
</html>