<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="AntiqueWhite">
<b style="color:#FF0000">Either username or password was incorrect, please try again</b>
<hr>
	
	<form action="Login">
		<b>Enter your username or email</b><br>
		<input type="text" name="username" placeholder="Enter your username" required><br>
	
		<b>Enter your password</b><br>
		<input type="password" name="password" placeholder="Enter your password" required><br>	
		
		<input type="submit" value="Login">												
	</form><br>
	
	<i>not a member?</i> <a href="register.jsp">Register</a>
	
	
</body>
</html>




