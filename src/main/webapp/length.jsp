<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LengthServlet">
		<table border="1">
			<tr>
				<th>Mile</th>
				<th>Kilometer</th>
			</tr>
			<tr>
				<td><input type="text" name="mile"></td>
				<td><input type="text" name="kilometer"></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form><br>
	
		<a href="userpage.jsp"> <input type="button" value="Go Back"> </a>
	

</body>
</html>