<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
		String studentID = "";
		String studentName = "";

		String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
		Connection connection = null; //step 3
		Statement statement = null; //step 4
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "admin");
			statement = connection.createStatement();
			rs = statement.executeQuery("SELECT * FROM student WHERE StudentID = " + username + " LIMIT 1"); //step 5
			while (rs.next()) {
				out.println(rs.getString("StudentID"));
				out.println(rs.getString("StudentName") + "<br>");
				studentID = rs.getString("StudentID");
				studentName = rs.getString("StudentName");
			} //step 6
		} catch (SQLException e) {
			out.println("SQLException caught: " + e.getMessage());
		} finally {
			if (studentID != null && !studentID.isEmpty() && studentName != null && !studentName.isEmpty()
			&& username.equals(password)) {
				out.println("<h3>Logged in successfully!</h3>");
				Cookie newCookie = new Cookie("logininfo", username);
				newCookie.setMaxAge(60 * 60 * 24);
				newCookie.setPath("/");
				response.addCookie(newCookie);
				response.sendRedirect("Login.jsp");
			} else {
				out.println("<h4>Incorrect username or password</h4>");
			}
			rs.close(); //step 7

		}
	}
	%>


	<h1>Log in to view or register for courses</h1>
	<hr />

	<%
	Cookie[] cookies = request.getCookies();
	//boolean isMyCookieExist = false;

	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie temp = cookies[i];
			if (temp.getName().equals("logininfo")) {
				out.println("<h3>You have already logged in! Log out by clearing out the cookie.</h3>");
				out.println(""+
						"<hr/>"+
						"<a href=\"Homepage.jsp\">Go to registered courses</a>");
				break;
			}
			if (i == cookies.length - 1) {
				out.println("<form method=\"POST\" action=\"Login.jsp\">"+
						"	<table>"+
						"		<tr>"+
						"			<th><label for=\"username\">Username</label></th>"+
						"		<td><input required type=\"text\" name=\"username\" id=\"username\" /></td>" +
						"		</tr>"+
						"		<tr>"+
						"			<th><label for=\"password\">Password</label></th>"+
						"			<td><input required type=\"password\" name=\"password\" id=\"password\" /></td>"+
						"		</tr>"+
						"		<tr>"+
						"			<th><label for=\"submit\">Log in</label></th>"+
						"			<td><input type=\"submit\" value=\"Log in\" id=\"submit\" /></td>"+
						"		</tr>"+
						"	</table>"+
						"</form>");
			}
		}
	}
	%>

</body>
</html>