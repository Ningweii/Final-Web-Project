<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI calculator</title>																				
</head>
<body bgcolor="AntiqueWhite">

	<h3>Submit your weight and height to calculate your bmi! (<i>submit in kg and cm</i>)</h3><hr>
			
	<table border="1" style="border-collapse:collapse">	
		<tr>
			<th><b>BMI</b></th>
			<th><b>Weight Status</b></th>
		</tr>
		<tr>
			<td>Below 18</td>
			<td>Underweight</td>
		</tr>
		<tr>
			<td>18.5 - 24.5</td>
			<td>Healthy</td>
		</tr>
		<tr>
			<td>25.0 - 29.9</td>
			<td>Overweight</td>
		</tr>
		<tr>
			<td>30 and above</td>
			<td>Obese</td>
		</tr>
	</table>
	<br>

	<form action="BmiServlet">
		
		<b>Weight</b><br>	
		<input type="text" name=mass placeholder="Enter your weight" required><br>
		
		<b>Height</b><br>		
		<input type="text" name="height" placeholder="Enter your height" required><br>
		
		<input type="submit" value="Submit">
	</form><br>

	<a href="userpage.jsp"> <input type="button" value="Go Back"> </a>
</body>
</html>













