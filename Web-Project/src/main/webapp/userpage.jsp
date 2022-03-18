<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User page</title>
</head>
<body bgcolor="AntiqueWhite">

	<%
		if(session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>


	<h3>Wellcome ${username}!</h3>
	
	Your name is: <b> ${name} </b> <br>
	Your last name is: <b> ${surname} </b> <br>
	Your profession is: <b> ${profession} </b> <br>
	Your password is: <b> ${password} </b> <br> <br>
	
	<details>
    <summary><i></>Details about your life</i></summary>
    You like swimming and khinkali. That's all.
    </details> <br>
    
    Do you want to calculate your BMI? (Body Mass Index) <a href="bmicalc.jsp">BMI calculator</a><br>
    Do you want to watch some videos? <a href="videos.jsp">Videos</a><br><br>
    
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
	
	
<pre>
      |\      _,,,---,,_
ZZZzz /,`.-'`'    -.  ;-;;,_
     |,4-  ) )-,_. ,\ (  `'-'
    '---''(_/--'  `-'\_)
</pre>
	
	
	
   
	
	

</body>
</html>



