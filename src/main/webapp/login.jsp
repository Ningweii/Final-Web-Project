<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
</head>
<body bgcolor="AntiqueWhite">
	
	<%
		if(session.getAttribute("username") != null){
			
		response.sendRedirect("userpage.jsp");
		}
	%>
	
	
	<form action="Login">
		<b>Enter your username or email</b><br>
		<input type="text" name="username" id="username" placeholder="Enter your username" required><br>
	
		<b>Enter your password</b><br>
		<input type="password" name="password" id="password" placeholder="Enter your password" required><br><br>
		
		
		<input type="submit" value="Login">												
	</form>	
	
	
	
			
			  


																														
</body>
</html>






