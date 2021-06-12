<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.net.URLEncoder"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<style>
table#run, table#run th, table#run td {
	border: 1px solid black;
}

.wrapper {
	text-align: center;
}

.button {
	position: absolute;
	margin-top: 10px;
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
		if (c.indexOf(nameEQ) == 0)
			return c.substring(nameEQ.length, c.length);
	}
	return null;
}
	function auth() {
		if (!getCookie("auth")) {
			window.location.href = "account.jsp";
		}
	}
	
	auth();
</script>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String card = request.getParameter("card");
	String addr = request.getParameter("addr");
	
	if (name != null && !name.isEmpty() && card != null && !card.isEmpty() && addr != null && !addr.isEmpty()) {
		String temp = name + ", " + card + ", " + addr;
		Cookie newCookie = new Cookie("auth", URLEncoder.encode(temp, "UTF-8"));
		newCookie.setMaxAge(60 * 60 * 24);
		newCookie.setPath("/");
		response.addCookie(newCookie);
		response.sendRedirect("products.jsp");
	}
	%>

	<jsp:useBean id="user" scope="session" class="hcmiu.scse.wad.Account" />
	<jsp:setProperty name="user" property="name"
		value='<%=request.getParameter("name")%>' />

	<jsp:useBean id="product1" scope="session"
		class="hcmiu.scse.wad.Product" />
	<jsp:setProperty name="product1" property="product" value="Product 1" />
	<jsp:setProperty name="product1" property="manufacturer"
		value="Manufacturer 1" />
	<jsp:setProperty name="product1" property="country" value="Country 1" />
	<jsp:setProperty name="product1" property="price" value="1.0" />

	<jsp:useBean id="product2" scope="session"
		class="hcmiu.scse.wad.Product" />
	<jsp:setProperty name="product2" property="product" value="Product 2" />
	<jsp:setProperty name="product2" property="manufacturer"
		value="Manufacturer 2" />
	<jsp:setProperty name="product2" property="country" value="Country 3" />
	<jsp:setProperty name="product2" property="price" value="2.5" />

	<jsp:useBean id="product3" scope="session"
		class="hcmiu.scse.wad.Product" />
	<jsp:setProperty name="product3" property="product" value="Product 3" />
	<jsp:setProperty name="product3" property="manufacturer"
		value="Manufacturer 3" />
	<jsp:setProperty name="product3" property="country" value="Country 3" />
	<jsp:setProperty name="product3" property="price" value="5.7" />

	<jsp:useBean id="product4" scope="session"
		class="hcmiu.scse.wad.Product" />
	<jsp:setProperty name="product4" property="product" value="Product 4" />
	<jsp:setProperty name="product4" property="manufacturer"
		value="Manufacturer 4" />
	<jsp:setProperty name="product4" property="country" value="Country 4" />
	<jsp:setProperty name="product4" property="price" value="7.9" />

	<h2 style="text-align: center;">
		Hi
		<%=request.getParameter("name")%></h2>
	<h4 style="text-align: center;">Please select our product and its
		quantity</h4>
	<hr>
	<script>
		function setCookie(name, value, days) {
			var expires = "";
			if (days) {
				var date = new Date();
				date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
				expires = "; expires=" + date.toUTCString();
			}
			document.cookie = name + "=" + (value || "") + expires + "; path=/";
		}
		function getCookie(name) {
			var nameEQ = name + "=";
			var ca = document.cookie.split(';');
			for (var i = 0; i < ca.length; i++) {
				var c = ca[i];
				while (c.charAt(0) == ' ')
					c = c.substring(1, c.length);
				if (c.indexOf(nameEQ) == 0)
					return c.substring(nameEQ.length, c.length);
			}
			return null;
		}
		function eraseCookie(name) {
			document.cookie = name
					+ '=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
		}
		
		function addToCart() {
			var prod = document.getElementById("prod").value;
			var quantity = document.getElementById("quantity").value;
			var name = prod.split(", ");

			var cart = JSON.parse(getCookie("cart")) || [];
	
			if (cart.length > 0) {
				var foundIndex = cart.findIndex(item => {
					var sliced = item.prod.split(", ");
					if (sliced[0] === name[0]) {
						return true;
					}
					return false;});
				if (foundIndex > -1) {
					cart[foundIndex] = {
						...cart[foundIndex],
						"quantity": (parseInt(cart[foundIndex]["quantity"]) + parseInt(quantity))
					}
				} else {
					cart.push({
						"prod" : prod,
						"quantity" : quantity	
					});	
				}
			} else {
				cart = [ {
					"prod" : prod,
					"quantity" : quantity
				} ];
			}
			eraseCookie("cart");
			setCookie("cart", JSON.stringify(cart), 1);
			
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
						"<td><button type='button' onclick='deleteThis(\""+parsed[0]+"\");'>Delete</button></td>"+
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
				<th></th>
			</tr>
			` + innerHTML
			
		}
		
	</script>
	<table style="margin-left: auto; margin-right: auto;">
		<tr>
			<th><label for="prod">Product</label></th>
			<td><select name="prod" id="prod">
					<option
						value='<%=product1.getProduct() + ", " + product1.getManufacturer() + ", " + product1.getCountry() + ", "
		+ product1.getPrice()%>'>
						<%=product1.getProduct() + " | " + product1.getManufacturer() + " | " + product1.getCountry() + " | "
		+ product1.getPrice()%>
					</option>
					<option
						value='<%=product2.getProduct() + ", " + product2.getManufacturer() + ", " + product2.getCountry() + ", "
		+ product2.getPrice()%>'><%=product2.getProduct() + " | " + product2.getManufacturer() + " | " + product2.getCountry() + " | "
		+ product2.getPrice()%>
					</option>
					<option
						value='<%=product3.getProduct() + ", " + product3.getManufacturer() + ", " + product3.getCountry() + ", "
		+ product3.getPrice()%>'><%=product3.getProduct() + " | " + product3.getManufacturer() + " | " + product3.getCountry() + " | "
		+ product3.getPrice()%>
					</option>
					<option
						value='<%=product4.getProduct() + ", " + product4.getManufacturer() + ", " + product4.getCountry() + ", "
		+ product4.getPrice()%>'><%=product4.getProduct() + " | " + product4.getManufacturer() + " | " + product4.getCountry() + " | "
		+ product4.getPrice()%>
					</option>
			</select></td>
			<th><label for="quantity">Quantity</label></th>
			<td><input type="number" name="quantity" id="quantity" /></td>
			<td><button type="button" onclick="addToCart();">Add to
					cart</button></td>
		</tr>
	</table>

	<table style="margin-left: auto; margin-right: auto;" id='run'>
		<tr style="background-color: yellow;">
			<th>PRODUCT</th>
			<th>MANUFACTURER</th>
			<th>MADE IN</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>SUBTOTAL</th>
			<th></th>
		</tr>
	</table>
	<div class="wrapper">
		<button class="button" onclick='checkout();'>Check out</button>
	</div>
	<script>	
function auto() {
	var cart = JSON.parse(getCookie("cart")) || [];
	
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
				"<td><button type='button' onclick='deleteThis(\""+parsed[0]+"\");'>Delete</button></td>"+

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
		<th></th>
	</tr>
	` + innerHTML
	
}

auto();

function deleteThis(what) {

	var cart = JSON.parse(getCookie("cart")) || [];
	
	if (cart.length > 0) {
		var foundIndex = cart.findIndex(item => {
			var sliced = item.prod.split(", ");
			if (sliced[0] === what) {
				return true;
			}
			return false;});
		if (foundIndex > -1) {
			cart.splice(foundIndex, 1);
		} 
	} else {
	}
	eraseCookie("cart");
	setCookie("cart", JSON.stringify(cart), 1);
	
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
				"<td><button type='button' onclick='deleteThis(\""+parsed[0]+"\");'>Delete</button></td>"+
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
		<th></th>
	</tr>
	` + innerHTML
	
}

function checkout() {
	window.location.href = "checkout.jsp";
}
</script>
</body>
</html>