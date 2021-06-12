<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab 8</title>
</head>
<body>
	<h1>Hello World</h1>
	<%
	String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
	Connection connection = null; //step 3
	Statement statement = null; //step 4
	ResultSet rs = null;
	%>

	<%
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(connectionURL, "root", "admin");
		statement = connection.createStatement();
		rs = statement.executeQuery("SELECT * FROM course"); //step 5
		while (rs.next()) {
			out.println(rs.getString("CourseName"));
			out.println(rs.getString("CourseID") + "<br>");
		} //step 6
		rs.close(); //step 7
	} catch (SQLException e) {
		out.println("SQLException caught: " + e.getMessage());
	}
	%>
</body>
</html>