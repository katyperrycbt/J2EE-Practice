<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Course</title>
</head>
<body>

	<h2>Register courses</h2>
	<hr />
	<h4>Available courses</h4>
	
	<%
		String OOP = (request.getParameter("course0") != null && !request.getParameter("course0").isEmpty()) ? request.getParameter("course0") : null;
		String OOAD = (request.getParameter("course1") != null && !request.getParameter("course1").isEmpty()) ? request.getParameter("course1") : null;
		String Web = (request.getParameter("course2") != null && !request.getParameter("course2").isEmpty()) ? request.getParameter("course2") : null;
		
		Cookie[] cookiess = request.getCookies();
		//boolean isMyCookieExist = false;
		String username = "";
		if (cookiess != null) {
			for (int i = 0; i < cookiess.length; i++) {
				Cookie temp = cookiess[i];
				if (temp.getName().equals("logininfo")) {
					username = temp.getValue();
					
				}
			}
		}
		
		if (OOP != null) {
			if (OOP.indexOf("s") == OOP.length() - 1) {
				String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
				Connection connection = null; //step 3
				Statement statementa = null; //step 4
				OOP = OOP.substring(0, OOP.length() - 1) + OOP.substring(OOP.length());

				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection(connectionURL, "root", "admin");
					statementa = connection.createStatement();
					statementa.executeUpdate("DELETE FROM studentcourse WHERE StudentID = "+username+" AND CourseID = " + OOP); //step 5
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
				}
			} else {
				String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
				Connection connection = null; //step 3
				Statement statementb = null; //step 4
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection(connectionURL, "root", "admin");
					statementb = connection.createStatement();
					statementb.executeUpdate("INSERT INTO studentcourse VALUES ("+username+", "+ OOP +")"); //step 5
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
				}
			}
		}
		
		if (OOAD != null) {
			if (OOAD.indexOf("s") == OOAD.length() - 1) {
				String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
				Connection connection = null; //step 3
				Statement statement = null; //step 4
				OOAD = OOAD.substring(0, OOAD.length() - 1) + OOAD.substring(OOAD.length());

				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection(connectionURL, "root", "admin");
					statement = connection.createStatement();
					statement.executeUpdate("DELETE FROM studentcourse WHERE StudentID = "+username+" AND CourseID = " + OOAD); //step 5
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
					
				}
			} else {
				String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
				Connection connection = null; //step 3
				Statement statement = null; //step 4
				ResultSet rs = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection(connectionURL, "root", "admin");
					statement = connection.createStatement();
					statement.executeUpdate("INSERT INTO studentcourse VALUES ("+username+", "+ OOAD +")"); //step 5
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
				}
			}
		}
		
		if (Web != null) {
			if (OOP.indexOf("s") == OOP.length() - 1) {
				String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
				Connection connection = null; //step 3
				Statement statement = null; //step 4
				ResultSet rs = null;
				Web = Web.substring(0, Web.length() - 1) + Web.substring(Web.length());

				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection(connectionURL, "root", "admin");
					statement = connection.createStatement();
					statement.executeUpdate("DELETE FROM studentcourse WHERE StudentID = "+username+" AND CourseID = " + Web); //step 5
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
				}
			} else {
				String connectionURL = "jdbc:mysql://localhost:3307/nodejs"; //step 2
				Connection connection = null; //step 3
				Statement statement = null; //step 4
				ResultSet rs = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection(connectionURL, "root", "admin");
					statement = connection.createStatement();
					statement.executeUpdate("INSERT INTO studentcourse VALUES ("+username+", "+ Web +")"); //step 5
				} catch (SQLException e) {
					out.println("SQLException caught: " + e.getMessage());
				} finally {
				}
			}
		}
	%>
		
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
		Statement statement2 = null; //step 4
		ResultSet rs = null;
		ResultSet rs1 = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "admin");
			statement = connection.createStatement();
			statement2 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rs = statement.executeQuery("SELECT * FROM course"); //step 5
			rs1 = statement2.executeQuery("SELECT * FROM studentcourse, course WHERE studentcourse.StudentID = "
					+ temp.getValue() + " AND studentcourse.CourseID = course.CourseID"); //step 5
			int iterID = 0;

			out.println("<form method=\"POST\" action=\"Register.jsp\">" + "	<table>");
			while (rs.next()) {
				boolean checked = false;
				rs1.beforeFirst();
				while (rs1.next()) {
					if (rs1.getString("CourseID").equals(rs.getString("CourseID"))) {
						checked = true;
						break;
					}

				}
				out.println("		<tr>" + "			<th><label for=\"courseID" + (iterID) + "\">Course ID: "
						+ rs.getString("CourseID") + " Course Name: " + rs.getString("CourseName") + "</label></th>"
						+ "			<td><input " + (checked ? "checked" : "")
						+ " type=\"checkbox\" name=\"course"+iterID+"\" value=\""+rs.getString("CourseID")+ (checked ? "s" : "")+"\" id=\"courseID" + (iterID++) + "\" /></td>"
						+ "		</tr>");
			} //step 6

			out.println("		<tr>" + "			<th><label for=\"submit\">Save</label></th>"
					+ "			<td><input type=\"submit\" value=\"Save\" id=\"submit\" /></td>" + "		</tr>"
					+ "	</table>" + "</form>");
			rs.close(); //step 7
			rs1.close();
		} catch (SQLException e) {
			out.println("SQLException caught: " + e.getMessage());
		} finally {
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