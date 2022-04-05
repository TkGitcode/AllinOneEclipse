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
	<div class="container container-new">
		<div style="padding: 10px 20px" class="header">
			<h2>Create Account</h2>
		</div>
		<form class="form" id="form" action="registerPage" method="post">
			<div class="first">
				<div class="form-control">
					<label>Name</label> <input type="text"
						placeholder="Enter a Name" id="username" name="name" required />
					<i class="fa-solid fa-circle-check"></i> <i
						class="fa-solid fa-exclamation-circle"></i> <small>Error
						Message</small>
				</div>
				<!-- password -->
				<div class="form-control">
					<label>Email</label> <input type="text"
						placeholder="Enter a Mail id" id="email" name="mail" required />
					<i class="fa-solid fa-circle-check"></i> <i
						class="fa-solid fa-exclamation-circle"></i> <small>Error
						Message</small>
				</div>
				<!-- pass ends -->
			</div>
			<div class="second">


				<div class="form-control">
					<label>Password</label> <input type="password"
						placeholder="Enter a Password" id="Password" name="pass"
						minlength="6" maxlength="14" required/> <i
						class="fa-solid fa-circle-check"></i> <i
						class="fa-solid fa-exclamation-circle"></i> <small>Error
						Message</small>
				</div>
				<!-- confirm pass -->
				<div class="form-control">
					<label>Confirm Password</label> <input type="password" 
						placeholder="Re Enter a Password" id="cnfPassword" minlength="6"
						maxlength="14" required/> <i
						class="fa-solid fa-circle-check"></i> <i
						class="fa-solid fa-exclamation-circle"></i> <small>Error
						Message</small>
				</div>
				<!-- confi pas ends -->
			</div>

			<!-- phone num -->
			<div class="third">
				<div class="form-control">
					<label>Phone No</label> <input type="tel" id="phone" name="phone"
						placeholder="Enter a phone number" required/> <i
						class="fa-solid fa-circle-check"></i> <i
						class="fa-solid fa-exclamation-circle"></i> <small>Error
						Message</small>
				</div>
			</div>

			<!-- ends -->
			<div class="fourth">
				<button id="submit">SignIn</button>
			</div>
		</form>
		<!-- don't have account -->
		<div class="dont-acc">
			<span class="dont-span"> Already have an account?</span> <a
				href="UserLogin.jsp" class="signup-image-link"> Log-in</a>
		</div>
	</div>

	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
		let name = document.getElementById('username');
		let email = document.getElementById('email');
		let pass = document.getElementById('Password');
		let cnfpass = document.getElementById('cnfPassword');
		function validate() {
			if (pass.value !== cnfpass.value) {
				swal("PassWord is MisMatch");
				return false;
			}
			/* if (name.value == '' || email.value == '') {
				swal("Enter all Field");
				return false;
			} */
			else
				return true;
		}
	</script>
</body>
</html>