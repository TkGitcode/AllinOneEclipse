<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Login</title>
    <link rel="stylesheet" href="UserRegisterStyle.css" />
  </head>
  <body>
    <div class="container">
      <div class="header">
        <h2>Login</h2>
      </div>
      <form class="form" id="form" action="loginPage" method="post" onsubmit="return validate()">
        <div class="form-control">
          <label>Email</label>
          <input
            type="email"
            placeholder="Enter a Mail id"
            id="email"
            name="mail"
          />
          <i class="fa-solid fa-circle-check"></i>
          <i class="fa-solid fa-exclamation-circle"></i>
          <small>Error Message</small>
        </div>
        <div class="form-control">
          <label>Password</label>
          <input
            placeholder="Enter a Password"
            id="Password"
            type="password"
            name="pass"
          />
          <i class="fa-solid fa-circle-check"></i>
          <i class="fa-solid fa-exclamation-circle"></i>
          <small>Error Message</small>
        </div>
        <button id="submit">Login</button>
      </form>
      <!-- don't have account -->
      <div class="dont-acc">
        <span class="dont-span"> Don't have an account</span>
        <a href="UserRegister.jsp" class="signup-image-link"> Sign-up</a>
      </div>
    </div>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
		let email=document.getElementById('email');
		let pass = document.getElementById('Password');
		function validate() {
			if (pass.value == '' || email.value == '') {
				swal("Enter all Field");
				return false;
			}
			else
				return true;
		}
	</script>
  </body>
</html>
