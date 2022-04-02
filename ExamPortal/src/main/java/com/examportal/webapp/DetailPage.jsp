<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="DetailPageStyle.css" />
</head>
<body>
    <header>
      <div id="brand"><a href="/">Exam Conduction Portal</a></div>
      <nav>
        <ul>
          <li><a href="#home">Home</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#exam">Exam</a></li>
          <li id="login"><a href="#logout">Log-Out</a></li>
          <li id="signup"><a href="">Name</a></li>
        </ul>
      </nav>
      <div id="hamburger-icon" onclick="toggleMobileMenu(this)">
        <div class="bar1"></div>
        <div class="bar2"></div>
        <div class="bar3"></div>
        <ul class="mobile-menu">
          <li><a href="#home">Home</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#exam">Exam</a></li>
          <li id="login"><a href="#logout">Log-Out</a></li>
          <li id="signup"><a href="">Name</a></li>
        </ul>
      </div>
    </header>
    <div id="home">
      <h2>
        Welcome to exam conduction portal, write exam get marks and get placed
      </h2>
    </div>
    <div id="about">
      <h2>
        There will be 3 tests with option, Each tests contains 10 questions
      </h2>
      <ul class="ul">
        <li class="li">Java</li>
        <li class="li">JavaScript</li>
        <li class="li">SQL</li>
      </ul>
    </div>
    <div id="exam">
      <h2>Take Exam here</h2>
      <form action="registerPage">
        <div class="form-check">
          <input type="radio" class="form-check-input" id="male" name="exam" />
          <label class="form-check-label" for="male">Java</label>
        </div>
        <div class="form-check">
          <input
            type="radio"
            class="form-check-input"
            id="female"
            name="exam"
          />
          <label class="form-check-label" for="female">JavaScript</label>
        </div>
        <div class="form-check">
          <input type="radio" class="form-check-input" id="sql" name="exam" />
          <label class="form-check-label" for="sql">SQL</label>
        </div>
        <div class="form-check">
            <button id="take-test" type="submit">Take test</button>
        </div>
      </form>
    </div>
    <div class="footer"></div>
    <script src="home.js"></script>
  </body>
</html>