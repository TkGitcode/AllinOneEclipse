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
		<form class="form" id="form" action="registerPage" method="post"
			onsubmit="return validate()" name="registerForm">
			<div class="form-control">
				<label>Name</label> <input type="text" placeholder="Enter a Name"
					id="username" name="name"> <i
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
			<div class="form-control">
				<label>Phone Number</label> <input type="text"
					placeholder="Enter a Contact Number" id="phonenumber"> <i
					class="fa-solid fa-circle-check"></i> <i
					class="fa-solid fa-exclamation-circle"></i> <small>Error
					Message</small>
			</div>
			<button id="submit">SignIn</button>
		</form>
	</div>
	<div class="dont-acc">
		<span class="dont-span"> Already have an account?</span> <a
			href="UserLogin.jsp" class="signup-image-link"> Log-in</a>
	</div>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
		let name = document.getElementById('username');
		let email=document.getElementById('email');
		let pass = document.getElementById('Password');
		let cnfpass = document.getElementById('cnfPassword');
		function validate() {
			if (pass.value !== cnfpass.value) {
				swal("PassWord is MisMatch");
				return false;
			}
			if (name.value == '' || email.value == '') {
				swal("Enter all Field");
				return false;
			}
			else
				return true;
		}
	</script>
</body>
</html>