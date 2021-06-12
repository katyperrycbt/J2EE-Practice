<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check out</title>
<style>
table#run, table#run th, table#run td {
	border: 1px solid black;
}

.wrapper {
	text-align: center;
}

.button {
	position: relative;
	margin-left: 10px;
}
.button2 {
	position: relative;
	margin-left: 10px;
}
</style>
<script>
function getCookie(name) {
	var nameEQ = name + "=";
	var ca = document.cookie.split(';');
	
	for (var i = 0; i < ca.length; i++) {
		var c = ca[i];
		while (c.charAt(0) == ' ')
			c = c.substring(1, c.length);
		if (c.indexOf(nameEQ) == 0) {

			return c.substring(nameEQ.length, c.length);
		}
		
	}
	return null;
}

</script>
</head>
<body>
	<div id="info"></div>
	<h2>Product List</h2>
	<hr />

	<table style="margin-left: auto; margin-right: auto;" id='run'>
		<tr style="background-color: yellow;">
			<th>PRODUCT</th>
			<th>MANUFACTURER</th>
			<th>MADE IN</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>SUBTOTAL</th>
		</tr>
	</table>
	<div class="wrapper">
		<button class="button" onclick='logout();'>Log out</button>
	</div>
	<div class="wrapper">
		<button class="button2" onclick='window.location.href="products.jsp"'>Add
			more products</button>
	</div>
	<script>	
	function eraseCookie(name) {
		document.cookie = name
				+ '=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
	}
	function logout() {
		eraseCookie("auth");
		window.location.href ='products.jsp';
	}
function auto() {
	var cart = JSON.parse(getCookie("cart"));
	
	var innerHTML = "";
	if (cart.length > 0) {
		for (var j = 0; j < cart.length; j++ ) {
			var parsed = cart[j]["prod"].split(", ");
			innerHTML += ""+
			"<tr>"+
				"<td>" + parsed[0] +"</td>"+
				"<td>" + parsed[1] + "</td>"+
				"<td>"+parsed[2]+"</td>"+
				"<td>"+parsed[3]+"</td>"+
				"<td>"+cart[j]["quantity"]+"</td>"+
				"<td>"+(parseInt(cart[j]["quantity"])*parseInt(parsed[3]))+"</td>"+
			"</tr>";
		}
	}			
	document.getElementById("run").innerHTML = `
	<tr style="background-color: yellow;">
		<th>PRODUCT</th>
		<th>MANUFACTURER</th>
		<th>MADE IN</th>
		<th>PRICE</th>
		<th>QUANTITY</th>
		<th>SUBTOTAL</th>
	</tr>
	` + innerHTML
	
}

function getInfo() {
	var info = decodeURIComponent(getCookie("auth"));
	info = info.replaceAll("+", " ");
	info = info.split(", ");
	if (info) {
		document.getElementById("info").innerHTML += "<h2>Customer Name: " + info[0] + "</2>";
		document.getElementById("info").innerHTML += "<h2>VISA: " + info[1] + "</2>";
		document.getElementById("info").innerHTML += "<h2>Address: " + info[2] + "</2>";
	}
}

getInfo();
auto();


</script>
</body>
</html>