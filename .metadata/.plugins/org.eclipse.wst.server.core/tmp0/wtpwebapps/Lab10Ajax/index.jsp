<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="/Lab10Ajax/javascript.js"></script>
 <link rel="stylesheet" type="text/css" href="stylesheets.css">

</head>
<body>
	<form name="autofillform" action="autocomplete">
		<table border="0" cellpadding="5">
			<tbody>
				<tr>
					<td><strong>Composer Name:</strong></td>
					<td><input type="text" size="40" id="complete-field"
						onkeyup="doCompletion()"></td>
				</tr>
				<tr>
					<td id="auto-row" colspan="2">
						<table id="complete-table" class="popupBox" />
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>