<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="AntiqueWhite">
	

	<h3>You'll need to fill in these fields to register</h3>
	
	<form action="Register" method="get">
	
		<label for="email">Enter your username or email</label><br>
	    <input type="text" placeholder="Username/Email" name="username" id="username" required><br>
	
	    <label for="password">Enter your password</label><br>
	    <input type="password" placeholder="Password" name="password" id="password" required><br>
	
	    <label for="password-repeat">Repeat Password</label><br>
	    <input type="password" placeholder="Repeat Password" name="password-repeat" id="password-repeat" required><br>
																																		
		<label for="name">Enter your name</label><br>
	    <input type="text" placeholder="Name" name="name" id="name" required><br>
	    
	    <label for="surname">Enter your surname</label><br>
	    <input type="text" placeholder="Surname" name="surname" id="surname" required><br>
	    
	    <label for="proffesion">Enter Your Profession</label><br>
	    <input type="text" placeholder="Profession" name="profession" id="profession"><br><br>
	    
	    <input type="submit" value="Register">

	</form>


</body>
</html>








