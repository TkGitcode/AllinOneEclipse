<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<script type="text/javascript">
	function addMe() {
		//alert("Hii");
		var a = document.form1.value1.value;
		var b = document.form1.value2.value;
		var url = "addition?a=" + a + "&b=" + b;

		const request = new XMLHttpRequest();
		try {
			request.open("POST", url, false);
			request.send();
			var val = JSON.parse(request.responseText);
			document.getElementById('result').innerHTML = val;
		} catch (e) {
			alert("Unable to Process" + e)
		}
		 try
		{
			 console.log("Hii");
			request.open("GET","https://learnwebcode.github.io/json-example/animals-1.json",true);
			console.log("Hello");
			request.onload = function()
			{
				const obj = JSON.parse(this.responseText);
				//var jsonValue=JSON.parse(request.responseText);
				console.log(obj);
			};
			request.send();
		}
		catch(e)
		{
			alert("GET is not loaded")
		} 
	}
</script>
<body>

	<form name="form1">

		Enter Value 1 : <input type="text" name="value1"> <br> <br>
		Enter Value 2 : <input type="text" name="value2"> <br> <br>
		<input type="button" value="ClickHereTo Add Two Number"
			onclick="addMe();">
	</form>
	<br>
	<br> Adding of Two Value is :
	<span id="result"> </span>
</body>
</html>