<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
<%@ page
	import="javax.crypto.*, javax.crypto.spec.*, java.nio.charset.StandardCharsets, java.security.spec.KeySpec, java.util.Base64"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LAB 5</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

/* Set a style for all buttons */
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 500px; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 25px;
	top: 0;
	color: #000;
	font-size: 35px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: red;
	cursor: pointer;
}

/* Add Zoom Animation */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
</style>
</head>
<body>
	<h2>Exercise 1</h2>
	<%
	Cookie[] cookies = request.getCookies();
	//boolean isMyCookieExist = false;

	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie temp = cookies[i];
			if (temp.getName().equals("myCookie")) {
		out.println("<h1>Welcome Back!</h1>");
		temp.setValue(String.valueOf((Integer.parseInt(temp.getValue()) + 1)));
		out.println("<h1>You visited this page for " + temp.getValue() + " times</h1>");
		temp.setPath("/Web-Lab5");
		response.addCookie(temp);
		break;
			}
			if (i == cookies.length - 1) {
		out.println("<h1>Welcome Aboard!</h1>");
			}
		}
	} else {
		out.println("<h1>Welcome Aboard!</h1>");
		out.println("<h1>You visited this page for 1 times</h1>");
		Cookie newCookie = new Cookie("myCookie", "1");
		newCookie.setMaxAge(60 * 60 * 24);
		newCookie.setPath("/Web-Lab5");
		response.addCookie(newCookie);
	}
	%>
	<hr />
	<h2>Exercise 2</h2>
	<%
	HttpSession mySession = request.getSession();
	Integer accessCount = (Integer) session.getAttribute("mySession");

	if (accessCount == null) {
		accessCount = new Integer(0);
	} else {
		accessCount = new Integer(accessCount.intValue() + 1);
	}

	out.print("<CENTER>\n" + "<H2>Information on Your Session:</H2>\n" + "<TABLE BORDER=1>\n" + "<TR BGCOLOR=\"#FFAD00\">\n"
			+ "  <TH>Info Type<TH>Value\n" + "<TR>\n" + "  <TD>ID\n" + "  <TD>" + session.getId() + "\n" + "<TR>\n"
			+ "  <TD>Creation Time\n" + "  <TD>" + new Date(session.getCreationTime()) + "\n" + "<TR>\n"
			+ "  <TD>Time of Last Access\n" + "  <TD>" + new Date(session.getLastAccessedTime()) + "\n" + "<TR>\n"
			+ "  <TD>Number of Previous Accesses\n" + "  <TD>" + accessCount + "\n" + "</TABLE>\n" + "</CENTER>");

	mySession.setAttribute("mySession", accessCount);
	%>
	<hr />
	<h2>Exercise 3, 4 and 5 all together</h2>
	<%
	cookies = request.getCookies();

	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie temp = cookies[i];
			if (temp.getName().equals("loginCookie")) {
		out.println("<div id=\"id01\" class=\"modal\">" +

				"<form class=\"modal-content animate\" action=\"RepeatVisitor.jsp\"" + "method=\"post\">"
				+ "<h4 class=\"container\">You have logged in before! No action required!</h4>" 
						+ "<div class=\"imgcontainer\">"
						+ "<span onclick=\"document.getElementById('id01').style.display='none'\""
						+ "class=\"close\" title=\"Close Modal\">&times;</span> <img"
						+ "src=\"https://res.cloudinary.com/katyperrycbt/image/upload/v1618995331/qd1kcma84gi0ptsehgdq.png\""
						+ "alt=\"Avatar\" class=\"avatar\">" + "</div>" 
				+ "</form>" + "</div>");
		break;
			}
			if (i == cookies.length - 1) {
		out.println("<div id=\"id01\" class=\"modal\">" +

				"<form class=\"modal-content animate\" action=\"RepeatVisitor.jsp\"" + "method=\"post\">"
				+ "<div class=\"imgcontainer\">"
				+ "<span onclick=\"document.getElementById('id01').style.display='none'\""
				+ "class=\"close\" title=\"Close Modal\">&times;</span> <img"
				+ "src=\"https://res.cloudinary.com/katyperrycbt/image/upload/v1618995331/qd1kcma84gi0ptsehgdq.png\""
				+ "alt=\"Avatar\" class=\"avatar\">" + "</div>" +

				"<div class=\"container\">" + "<label for=\"uname\"><b>Username</b></label> <input type=\"text\""
				+ "placeholder=\"Enter Username\" name=\"uname\" required> <label"
				+ "for=\"psw\"><b>Password</b></label> <input type=\"password\""
				+ "placeholder=\"Enter Password\" name=\"psw\" required>" +

				"<button type=\"submit\">Login</button>" + "<label> <input type=\"checkbox\" checked=\"checked\""
				+ "name=\"remember\"> Remember me" + "</label>" + "</div>" +

				"<div class=\"container\" style=\"background-color: #f1f1f1\">" + "<button type=\"button\""
				+ "onclick=\"document.getElementById('id01').style.display='none'\""
				+ "class=\"cancelbtn\">Cancel</button>"
				+ "<span class=\"psw\">Forgot <a href=\"#\">password?</a></span>" + "</div>" + "</form>"
				+ "</div>");
			}
		}
	} else {
		out.println("<h1>Welcome Aboard!</h1>");
		out.println("<h1>Please Login</h1>");
		out.println("<div id=\"id01\" class=\"modal\">" +

		"<form class=\"modal-content animate\" action=\"RepeatVisitor.jsp\"" + "method=\"post\">"
		+ "<div class=\"imgcontainer\">" + "<span onclick=\"document.getElementById('id01').style.display='none'\""
		+ "class=\"close\" title=\"Close Modal\">&times;</span> <img"
		+ "src=\"https://res.cloudinary.com/katyperrycbt/image/upload/v1618995331/qd1kcma84gi0ptsehgdq.png\""
		+ "alt=\"Avatar\" class=\"avatar\">" + "</div>" +

		"<div class=\"container\">" + "<label for=\"uname\"><b>Username</b></label> <input type=\"text\""
		+ "placeholder=\"Enter Username\" name=\"uname\" required> <label"
		+ "for=\"psw\"><b>Password</b></label> <input type=\"password\""
		+ "placeholder=\"Enter Password\" name=\"psw\" required>" +

		"<button type=\"submit\">Login</button>" + "<label> <input type=\"checkbox\" checked=\"checked\""
		+ "name=\"remember\"> Remember me" + "</label>" + "</div>" +

		"<div class=\"container\" style=\"background-color: #f1f1f1\">" + "<button type=\"button\""
		+ "onclick=\"document.getElementById('id01').style.display='none'\"" + "class=\"cancelbtn\">Cancel</button>"
		+ "<span class=\"psw\">Forgot <a href=\"#\">password?</a></span>" + "</div>" + "</form>" + "</div>");
	}
	%>
	<button onclick="document.getElementById('id01').style.display='block'"
		style="width: auto;">Click to open login form</button>
	<script>
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>

	<%
	String username = request.getParameter("uname");
	String password = request.getParameter("psw");
	boolean remember = request.getParameter("remember") != null;

	if (remember) {
		String SECRET_KEY = "my_super_secret_key";
		String SALT = "ssshhhhhhhhhhh!!!!";
		try {
			byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			IvParameterSpec ivspec = new IvParameterSpec(iv);

			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
			String encodedString = Base64.getEncoder().encodeToString(cipher.doFinal((username + password + new Date()).getBytes(StandardCharsets.UTF_8)));
			Cookie newCookie = new Cookie("loginCookie", encodedString);
			newCookie.setMaxAge(60 * 60 * 24);
			newCookie.setPath("/Web-Lab5");
			response.addCookie(newCookie);
		} catch (Exception e) {
			System.out.println("Error while encrypting: " + e.toString());
		}
	}
	%>

</body>
</html>