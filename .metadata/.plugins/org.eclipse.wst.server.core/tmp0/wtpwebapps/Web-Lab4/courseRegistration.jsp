<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Registration</title>
<style>
table, th, td {
  border: 1px solid black;
  padding: 5px;	
}

</style>
</head>
<body>
	<%@ page import="java.util.*" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<h1>Personal Information</h1>
	<h3>Full name: Trần Trọng Thức</h3>
	<h3>ID: ITITIU18125</h3>
	<h3>DoB: September 1st, 2000</h3>
	<hr/>
	<h5>All courses:</h5>
	<script>
		function checkThis(thisBox){
			let currentValue = document.getElementById("checkedArray");
			if (thisBox.checked) {
			currentValue.value = currentValue.value + "," + thisBox.value;
			//currentValue.value += 'HG';
			} else {
				currentValue.value = currentValue.value.replace("," + thisBox.value, "");
				//currentValue.value += 'HGG';
			}
			console.log(currentValue.value);
		}
	</script>
	<form method="POST" action="courseController">
	<table style="width: 50%">
	<caption>Courses</caption>
	<tr>
		<th> Select </th>
		<th> Course Name </th>
	</tr>
	<%
	String[] courses = {"Intro to C/C++", 
               "Object-oriented Programming", 
               "Object-oriented Analysis & Designs", 
               "Data Structures & Algorithms",
               "Principles of Database Managment",
               "Software Engineering",
               "Theoritical Model Computing",
               "Web Designs & Its Appications",
               "Information System",
               "Intro to A.I.",
               "Principles of Programming Language"};
	
	for (int i = 0; i < courses.length; i++) {
		out.print("<tr>"
		+ "<td><input type=\"checkbox\" id=\""+courses[i]+"\" value=\""+courses[i]+"\" name=\"selectedCourses\" onclick=\"checkThis(this)\"></td>"
		+ "<td><label for=\""+courses[i]+"\">"+courses[i] + "</label></td></tr>"
		);
	}
	%>	
	<tr><td></td><td><input type="submit" id="sm"></td></tr>

	</table>
	<input type="hidden" id="checkedArray" value="Hi" name="checkedArray">
	</form>
</body>
</html>