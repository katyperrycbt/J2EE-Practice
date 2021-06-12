<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink;">
<h1>School of Computer Science & Engineering</h1>
    <hr />
    <h3>Register Form</h3>
    <form method="GET" action="RegisterCourse">
        <table>
            <tr>
                <td><label for='fullname'>Full Name</label></td>
                <td><input id='fullname' type="text" name="fullname" size="33"></td>
            </tr>
            <tr>
                <td> <label for='id'>ID</label></td>
                <td> <input id='id' type="text" name="id" size="33"></td>
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
                <td><label>Field of study</label></td>
                <td>
                    <select name="field">
                        <option>CS</option>
                        <option>CN</option>
                        <option>DS</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td> <label>List of subjects</label> </td>
                <td>
                    <input type="checkbox" name="subject1" value="Computer Graphic">Computer Graphic <br>
                    <input type="checkbox" name="subject2" value="Computer Network ">Computer Network <br>
                    <input type="checkbox" name="subject3" value="Introduction to Computer">Introduction to Computer<br>
                    <input type="checkbox" name="subject4" value="Web Programming">Web Programming<br>
                </td>
            </tr>
            <tr>
                <td> <label for="comments">Comments</label> </td>
                <td>
                    <textarea rows="4" id="comments" style='width: 100%;' name="comments"></textarea>
                </td>
            </tr>
            <tr>
                <td> <input type="submit" value="Submit" name="s1"></td>
                <td> <input type="reset" value="Cancel" name="s2"></td>
            </tr>
        </table>
    </form>
</body>
</html>