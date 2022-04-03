<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
<link rel="stylesheet" href="UserRegisterStyle.css">
</head>
<body>
	<div class="container">
		<div class="header">
			<h2>Create Account</h2>
		</div>
		<form class="form" id="form" action="registerPage" method="post">
			<div class="form-control">
				<label>UserName</label> <input type="text"
					placeholder="Enter a Name" id="username" name="name"> <i
					class="fa-solid fa-circle-check"></i> <i
					class="fa-solid fa-exclamation-circle"></i> <small>Error
					Message</small>
			</div>
			<div class="form-control">
				<label>Email</label> <input type="text"
					placeholder="Enter a Mail id" id="email" name="mail"> <i
					class="fa-solid fa-circle-check"></i> <i
					class="fa-solid fa-exclamation-circle"></i> <small>Error
					Message</small>
			</div>
			<div class="form-control">
				<label>Password</label> <input type="password"
					placeholder="Enter a Password" id="Password" name="pass"> <i
					class="fa-solid fa-circle-check"></i> <i
					class="fa-solid fa-exclamation-circle"></i> <small>Error
					Message</small>
			</div>
			<div class="form-control">
				<label>Conform Password</label> <input type="password"
					placeholder="Re Enter a Password" id="cnfPassword"> <i
					class="fa-solid fa-circle-check"></i> <i
					class="fa-solid fa-exclamation-circle"></i> <small>Error
					Message</small>
			</div>
			<button id="submit">Submit</button>
		</form>
	</div>
	<div>
		<a href="UserLogin.jsp" class="signup-image-link">I am already
			member</a>
	</div>
	<script type="text/javascript">
	let pass=document.getElementById('Password');
	let cnfpass=document.getElementById('cnfPassword');
    let btn=document.getElementById('submit');
    btn.addEventListener('click', ev =>
    {
    	if(pass.value !== cnfpass.value)
    	{
    		alert("pass Not Match")
    		location.href="UserRegister.jsp"
    	}
    })
	</script>
</body>
</html>