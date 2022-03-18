<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body bgcolor="AntiqueWhite">

	<%
		if(session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<h3>You are on a videos page!</h3><br><hr>
	<a href="https://www.youtube.com/watch?v=ScDb9EHYh88">A song about New Year</a><br>
	<a href="https://www.youtube.com/watch?v=wiiMAq13-ZI">Passionate song</a><br>
	<a href="https://www.youtube.com/watch?v=y983TDjoglQ">Depressing song</a><br>
	<a href="https://www.youtube.com/watch?v=v3lYFRiDTkA">Another depressing song</a><br>
	<a href="https://www.youtube.com/watch?v=0CGVgAYJyjk">A happy song <3</a><br><br>

	<a href="userpage.jsp"> <input type="button" value="Go Back"> </a>


</body>
</html>