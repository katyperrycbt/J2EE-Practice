<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example 2</title>
</head>
<body>
	<h2>Testing JSP and Java Bean</h2>
	<hr>
	<jsp:useBean id="counter" scope="session" class="hcmiu.scse.wad.Counter" />
	<jsp:setProperty name="counter" property="count" param="count" />
	<% out.println("Value of counter: "+counter.getCount()+"<BR>"); %>
</body>
</html>