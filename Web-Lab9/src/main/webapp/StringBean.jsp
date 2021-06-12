<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example 1</title>
<style>
table, th, td {
	border: 1px solid black;
}

th {
	text-align: center;
}
</style>
</head>
<body>
	<TABLE>
		<TR>
			<TH CLASS="TITLE">Using JavaBeans with JSP
	</TABLE>
	<jsp:useBean id="stringBean" class="hcmiu.scse.wad.StringBean" />
	<OL>
		<LI>Initial value (from jsp:getProperty): <I><jsp:getProperty
					name="stringBean" property="message" /></I>
		<LI>Initial value (from JSP expression): <I><%=stringBean.getMessage()%></I>
		<LI><jsp:setProperty name="stringBean" property="message"
				value="Best string bean: Fortex" /> Value after setting property
			with jsp:setProperty: <I><jsp:getProperty name="stringBean"
					property="message" /></I>
		<LI>
			<%
			stringBean.setMessage("My favorite: Kentucky Wonder");
			%> Value after setting property with scriptlet: <I><%=stringBean.getMessage()%></I>
	</OL>
</body>
</html>