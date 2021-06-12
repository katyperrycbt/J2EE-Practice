<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink;">
	<h1 style=" margin: auto; width: 50%;  text-align: center;"> Personal Information </h1>
	<hr/>
	<h3>Register Form</h3>
    <form method="GET" action="GetInfor">
        <table>
            <tr>
                <td><label for='id'>ID</label></td>
                <td><input id='id' type="text" name="id" size="33"></td>
            </tr>
            <tr>
                <td> <label for='name'>Name</label></td>
                <td> <input id='name' type="text" name="name" size="33"></td>
            </tr>
            <tr>
                <td> <label for='email'>Email</label></td>
                <td> <input id='email' type="email" name="email" size="33"></td>
            </tr>
            <tr>
                <td> <label>Gender</label></td>
                <td>
                    <input id='male' type="radio" value="male" checked name="gender">
                    <label for='male'>Male</label>
                    <input id='female' type="radio" value="female" checked name="gender">
                    <label for='female'>Female</label>

                </td>
            </tr>
            <tr>
                <td><label>Major</label></td>
                <td>
                    <select name="major">
                        <option>CS</option>
                        <option>CN</option>
                        <option>DS</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td> <label for="field">Interesting Field</label> </td>
                <td>
                    <textarea rows="4" id="comments" style='width: 100%;'></textarea>
                </td>
            </tr>
            <tr>
                <td> <input type="submit" value="Submit" name="s1"></td>
                <td> <button type="button" onclick="clear()">Cancel</button></td>
            </tr>
        </table>
    </form>
    <script>
		function clear() {
			console.log('clear!');
			document.getElementById("id").value = 'CLICK!';
		}
	</script>
</body>
</html>