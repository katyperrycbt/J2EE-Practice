<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink;">
	<h1>Collect Three Parameters</h1>
	<form method="GET" action="GetThreeParam">
		<table>
			<tr>
                <td><label for='firstPara'>First Parameter</label></td>
                <td><input id='firstPara' type="text" name="firstPara" size="33"></td>
            </tr>
            <tr>
                <td><label for='secondPara'>Second Parameter</label></td>
                <td><input id='secondPara' type="text" name="secondPara" size="33"></td>
            </tr>
            <tr>
                <td><label for='thirdPara'>Third Parameter</label></td>
                <td><input id='thirdPara' type="text" name="thirdPara" size="33"></td>
            </tr>
            <tr>
            	<td></td>
                <td><input type="submit" value="Submit" name="submit"></td>
            </tr>
       </table>
	</form>
</body>
</html>