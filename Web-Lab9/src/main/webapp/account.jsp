<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert card</title>
</head>
<body>
	<h1 style="text-align: center;">Please provide your account
		information</h1>
	<hr />
	
	<form method="POST" action="products.jsp">
		<table>
			<tr>
				<th style="text-align: left;"><label for="name">Name:</label></th>
				<td><input type="text" name="name" id="name" required/></td>
			</tr>
			<tr>
				<th style="text-align: left;"><label for="card">VISA
						Card Number:</label></th>
				<td><input type="number" name="card" id="card" required/></td>
			</tr>
			<tr>
				<th style="text-align: left;"><label for="addr">Address:</label></th>
				<td><input type="text" name="addr" id="addr" required/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>