<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Courses</title>
</head>
<body>
	<h2>Your registered course</h2>
	<%
	Cookie[] cookies = request.getCookies();
	//boolean isMyCookieExist = false;

	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie temp = cookies[i];
			if (temp.getName().equals("logininfo")) {
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
					rs = statement.executeQuery("SELECT * FROM studentcourse, course WHERE studentcourse.StudentID = " + temp.getValue() + " AND studentcourse.CourseID = course.CourseID"); //step 5
					while (rs.next()) {
						out.println(rs.getString("CourseID"));
						out.println(rs.getString("CourseName") + "<br>");
					} //step 6
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
					rs.close(); //step 7
					out.println("<hr/><a href=\"Register.jsp\">Go to register course</a>");
				}
				break;
			}
			if (i == cookies.length - 1) {
				response.sendRedirect("Login.jsp");
			}
		}
	}
	%>
</body>
</html>