/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.64
 * Generated at: 2021-05-20 11:26:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.URLEncoder");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Products</title>\r\n");
      out.write("<style>\r\n");
      out.write("table#run, table#run th, table#run td {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function getCookie(name) {\r\n");
      out.write("\tvar nameEQ = name + \"=\";\r\n");
      out.write("\tvar ca = document.cookie.split(';');\r\n");
      out.write("\tfor (var i = 0; i < ca.length; i++) {\r\n");
      out.write("\t\tvar c = ca[i];\r\n");
      out.write("\t\twhile (c.charAt(0) == ' ')\r\n");
      out.write("\t\t\tc = c.substring(1, c.length);\r\n");
      out.write("\t\tif (c.indexOf(nameEQ) == 0)\r\n");
      out.write("\t\t\treturn c.substring(nameEQ.length, c.length);\r\n");
      out.write("\t}\r\n");
      out.write("\treturn null;\r\n");
      out.write("}\r\n");
      out.write("\tfunction auth() {\r\n");
      out.write("\t\tif (!getCookie(\"auth\")) {\r\n");
      out.write("\t\t\twindow.location.href = \"account.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tauth();\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

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
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      hcmiu.scse.wad.Account user = null;
      synchronized (session) {
        user = (hcmiu.scse.wad.Account) _jspx_page_context.getAttribute("user", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (user == null){
          user = new hcmiu.scse.wad.Account();
          _jspx_page_context.setAttribute("user", user, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("user"), "name",
request.getParameter("name"));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      hcmiu.scse.wad.Product product1 = null;
      synchronized (session) {
        product1 = (hcmiu.scse.wad.Product) _jspx_page_context.getAttribute("product1", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (product1 == null){
          product1 = new hcmiu.scse.wad.Product();
          _jspx_page_context.setAttribute("product1", product1, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product1"), "product", "Product 1", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product1"), "manufacturer", "Manufacturer 1", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product1"), "country", "Country 1", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product1"), "price", "1.0", null, null, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      hcmiu.scse.wad.Product product2 = null;
      synchronized (session) {
        product2 = (hcmiu.scse.wad.Product) _jspx_page_context.getAttribute("product2", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (product2 == null){
          product2 = new hcmiu.scse.wad.Product();
          _jspx_page_context.setAttribute("product2", product2, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product2"), "product", "Product 2", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product2"), "manufacturer", "Manufacturer 2", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product2"), "country", "Country 3", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product2"), "price", "2.5", null, null, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      hcmiu.scse.wad.Product product3 = null;
      synchronized (session) {
        product3 = (hcmiu.scse.wad.Product) _jspx_page_context.getAttribute("product3", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (product3 == null){
          product3 = new hcmiu.scse.wad.Product();
          _jspx_page_context.setAttribute("product3", product3, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product3"), "product", "Product 3", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product3"), "manufacturer", "Manufacturer 3", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product3"), "country", "Country 3", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product3"), "price", "5.7", null, null, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      hcmiu.scse.wad.Product product4 = null;
      synchronized (session) {
        product4 = (hcmiu.scse.wad.Product) _jspx_page_context.getAttribute("product4", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (product4 == null){
          product4 = new hcmiu.scse.wad.Product();
          _jspx_page_context.setAttribute("product4", product4, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product4"), "product", "Product 4", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product4"), "manufacturer", "Manufacturer 4", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product4"), "country", "Country 4", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("product4"), "price", "7.9", null, null, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h2 style=\"text-align: center;\">\r\n");
      out.write("\t\tHi\r\n");
      out.write("\t\t");
      out.print(request.getParameter("name"));
      out.write("</h2>\r\n");
      out.write("\t<h4 style=\"text-align: center;\">Please select our product and its\r\n");
      out.write("\t\tquantity</h4>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction setCookie(name, value, days) {\r\n");
      out.write("\t\t\tvar expires = \"\";\r\n");
      out.write("\t\t\tif (days) {\r\n");
      out.write("\t\t\t\tvar date = new Date();\r\n");
      out.write("\t\t\t\tdate.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));\r\n");
      out.write("\t\t\t\texpires = \"; expires=\" + date.toUTCString();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.cookie = name + \"=\" + (value || \"\") + expires + \"; path=/\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction getCookie(name) {\r\n");
      out.write("\t\t\tvar nameEQ = name + \"=\";\r\n");
      out.write("\t\t\tvar ca = document.cookie.split(';');\r\n");
      out.write("\t\t\tfor (var i = 0; i < ca.length; i++) {\r\n");
      out.write("\t\t\t\tvar c = ca[i];\r\n");
      out.write("\t\t\t\twhile (c.charAt(0) == ' ')\r\n");
      out.write("\t\t\t\t\tc = c.substring(1, c.length);\r\n");
      out.write("\t\t\t\tif (c.indexOf(nameEQ) == 0)\r\n");
      out.write("\t\t\t\t\treturn c.substring(nameEQ.length, c.length);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction eraseCookie(name) {\r\n");
      out.write("\t\t\tdocument.cookie = name\r\n");
      out.write("\t\t\t\t\t+ '=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction addToCart() {\r\n");
      out.write("\t\t\tvar prod = document.getElementById(\"prod\").value;\r\n");
      out.write("\t\t\tvar quantity = document.getElementById(\"quantity\").value;\r\n");
      out.write("\t\t\tvar name = prod.split(\", \");\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar cart = JSON.parse(getCookie(\"cart\")) || [];\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tif (cart.length > 0) {\r\n");
      out.write("\t\t\t\tvar foundIndex = cart.findIndex(item => {\r\n");
      out.write("\t\t\t\t\tvar sliced = item.prod.split(\", \");\r\n");
      out.write("\t\t\t\t\tif (sliced[0] === name[0]) {\r\n");
      out.write("\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn false;});\r\n");
      out.write("\t\t\t\tif (foundIndex > -1) {\r\n");
      out.write("\t\t\t\t\tcart[foundIndex] = {\r\n");
      out.write("\t\t\t\t\t\t...cart[foundIndex],\r\n");
      out.write("\t\t\t\t\t\t\"quantity\": (parseInt(cart[foundIndex][\"quantity\"]) + parseInt(quantity))\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tcart.push({\r\n");
      out.write("\t\t\t\t\t\t\"prod\" : prod,\r\n");
      out.write("\t\t\t\t\t\t\"quantity\" : quantity\t\r\n");
      out.write("\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tcart = [ {\r\n");
      out.write("\t\t\t\t\t\"prod\" : prod,\r\n");
      out.write("\t\t\t\t\t\"quantity\" : quantity\r\n");
      out.write("\t\t\t\t} ];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\teraseCookie(\"cart\");\r\n");
      out.write("\t\t\tsetCookie(\"cart\", JSON.stringify(cart), 1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar innerHTML = \"\";\r\n");
      out.write("\t\t\tif (cart.length > 0) {\r\n");
      out.write("\t\t\t\tfor (var j = 0; j < cart.length; j++ ) {\r\n");
      out.write("\t\t\t\t\tvar parsed = cart[j][\"prod\"].split(\", \");\r\n");
      out.write("\t\t\t\t\tinnerHTML += \"\"+\r\n");
      out.write("\t\t\t\t\t\"<tr>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td>\" + parsed[0] +\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td>\" + parsed[1] + \"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td>\"+parsed[2]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td>\"+parsed[3]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td>\"+cart[j][\"quantity\"]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td>\"+(parseInt(cart[j][\"quantity\"])*parseInt(parsed[3]))+\"</td>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<td><button type='button' onclick='deleteThis(\\\"\"+parsed[0]+\"\\\");'>Delete</button></td>\"+\r\n");
      out.write("\t\t\t\t\t\"</tr>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"run\").innerHTML = `\r\n");
      out.write("\t\t\t<tr style=\"background-color: yellow;\">\r\n");
      out.write("\t\t\t\t<th>PRODUCT</th>\r\n");
      out.write("\t\t\t\t<th>MANUFACTURER</th>\r\n");
      out.write("\t\t\t\t<th>MADE IN</th>\r\n");
      out.write("\t\t\t\t<th>PRICE</th>\r\n");
      out.write("\t\t\t\t<th>QUANTITY</th>\r\n");
      out.write("\t\t\t\t<th>SUBTOTAL</th>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t` + innerHTML\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<table style=\"margin-left: auto; margin-right: auto;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th><label for=\"prod\">Product</label></th>\r\n");
      out.write("\t\t\t<td><select name=\"prod\" id=\"prod\">\r\n");
      out.write("\t\t\t\t\t<option\r\n");
      out.write("\t\t\t\t\t\tvalue='");
      out.print(product1.getProduct() + ", " + product1.getManufacturer() + ", " + product1.getCountry() + ", "
		+ product1.getPrice());
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(product1.getProduct() + " | " + product1.getManufacturer() + " | " + product1.getCountry() + " | "
		+ product1.getPrice());
      out.write("\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t<option\r\n");
      out.write("\t\t\t\t\t\tvalue='");
      out.print(product2.getProduct() + ", " + product2.getManufacturer() + ", " + product2.getCountry() + ", "
		+ product2.getPrice());
      out.write('\'');
      out.write('>');
      out.print(product2.getProduct() + " | " + product2.getManufacturer() + " | " + product2.getCountry() + " | "
		+ product2.getPrice());
      out.write("\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t<option\r\n");
      out.write("\t\t\t\t\t\tvalue='");
      out.print(product3.getProduct() + ", " + product3.getManufacturer() + ", " + product3.getCountry() + ", "
		+ product3.getPrice());
      out.write('\'');
      out.write('>');
      out.print(product3.getProduct() + " | " + product3.getManufacturer() + " | " + product3.getCountry() + " | "
		+ product3.getPrice());
      out.write("\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t<option\r\n");
      out.write("\t\t\t\t\t\tvalue='");
      out.print(product4.getProduct() + ", " + product4.getManufacturer() + ", " + product4.getCountry() + ", "
		+ product4.getPrice());
      out.write('\'');
      out.write('>');
      out.print(product4.getProduct() + " | " + product4.getManufacturer() + " | " + product4.getCountry() + " | "
		+ product4.getPrice());
      out.write("\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t</select></td>\r\n");
      out.write("\t\t\t<th><label for=\"quantity\">Quantity</label></th>\r\n");
      out.write("\t\t\t<td><input type=\"number\" name=\"quantity\" id=\"quantity\" /></td>\r\n");
      out.write("\t\t\t<td><button type=\"button\" onclick=\"addToCart();\">Add to\r\n");
      out.write("\t\t\t\t\tcart</button></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<table style=\"margin-left: auto; margin-right: auto;\" id='run'>\r\n");
      out.write("\t\t<tr style=\"background-color: yellow;\">\r\n");
      out.write("\t\t\t<th>PRODUCT</th>\r\n");
      out.write("\t\t\t<th>MANUFACTURER</th>\r\n");
      out.write("\t\t\t<th>MADE IN</th>\r\n");
      out.write("\t\t\t<th>PRICE</th>\r\n");
      out.write("\t\t\t<th>QUANTITY</th>\r\n");
      out.write("\t\t\t<th>SUBTOTAL</th>\r\n");
      out.write("\t\t\t<th></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<button class=\"button\" onclick='checkout();'>Check out</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\t\r\n");
      out.write("function auto() {\r\n");
      out.write("\tvar cart = JSON.parse(getCookie(\"cart\")) || [];\r\n");
      out.write("\t\r\n");
      out.write("\tvar innerHTML = \"\";\r\n");
      out.write("\tif (cart.length > 0) {\r\n");
      out.write("\t\tfor (var j = 0; j < cart.length; j++ ) {\r\n");
      out.write("\t\t\tvar parsed = cart[j][\"prod\"].split(\", \");\r\n");
      out.write("\t\t\tinnerHTML += \"\"+\r\n");
      out.write("\t\t\t\"<tr>\"+\r\n");
      out.write("\t\t\t\t\"<td>\" + parsed[0] +\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\" + parsed[1] + \"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+parsed[2]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+parsed[3]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+cart[j][\"quantity\"]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+(parseInt(cart[j][\"quantity\"])*parseInt(parsed[3]))+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td><button type='button' onclick='deleteThis(\\\"\"+parsed[0]+\"\\\");'>Delete</button></td>\"+\r\n");
      out.write("\r\n");
      out.write("\t\t\t\"</tr>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\t\t\r\n");
      out.write("\tdocument.getElementById(\"run\").innerHTML = `\r\n");
      out.write("\t<tr style=\"background-color: yellow;\">\r\n");
      out.write("\t\t<th>PRODUCT</th>\r\n");
      out.write("\t\t<th>MANUFACTURER</th>\r\n");
      out.write("\t\t<th>MADE IN</th>\r\n");
      out.write("\t\t<th>PRICE</th>\r\n");
      out.write("\t\t<th>QUANTITY</th>\r\n");
      out.write("\t\t<th>SUBTOTAL</th>\r\n");
      out.write("\t\t<th></th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t` + innerHTML\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("auto();\r\n");
      out.write("\r\n");
      out.write("function deleteThis(what) {\r\n");
      out.write("\r\n");
      out.write("\tvar cart = JSON.parse(getCookie(\"cart\")) || [];\r\n");
      out.write("\t\r\n");
      out.write("\tif (cart.length > 0) {\r\n");
      out.write("\t\tvar foundIndex = cart.findIndex(item => {\r\n");
      out.write("\t\t\tvar sliced = item.prod.split(\", \");\r\n");
      out.write("\t\t\tif (sliced[0] === what) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn false;});\r\n");
      out.write("\t\tif (foundIndex > -1) {\r\n");
      out.write("\t\t\tcart.splice(foundIndex, 1);\r\n");
      out.write("\t\t} \r\n");
      out.write("\t} else {\r\n");
      out.write("\t}\r\n");
      out.write("\teraseCookie(\"cart\");\r\n");
      out.write("\tsetCookie(\"cart\", JSON.stringify(cart), 1);\r\n");
      out.write("\t\r\n");
      out.write("\tvar innerHTML = \"\";\r\n");
      out.write("\tif (cart.length > 0) {\r\n");
      out.write("\t\tfor (var j = 0; j < cart.length; j++ ) {\r\n");
      out.write("\t\t\tvar parsed = cart[j][\"prod\"].split(\", \");\r\n");
      out.write("\t\t\tinnerHTML += \"\"+\r\n");
      out.write("\t\t\t\"<tr>\"+\r\n");
      out.write("\t\t\t\t\"<td>\" + parsed[0] +\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\" + parsed[1] + \"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+parsed[2]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+parsed[3]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+cart[j][\"quantity\"]+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td>\"+(parseInt(cart[j][\"quantity\"])*parseInt(parsed[3]))+\"</td>\"+\r\n");
      out.write("\t\t\t\t\"<td><button type='button' onclick='deleteThis(\\\"\"+parsed[0]+\"\\\");'>Delete</button></td>\"+\r\n");
      out.write("\t\t\t\"</tr>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\t\t\r\n");
      out.write("\tdocument.getElementById(\"run\").innerHTML = `\r\n");
      out.write("\t<tr style=\"background-color: yellow;\">\r\n");
      out.write("\t\t<th>PRODUCT</th>\r\n");
      out.write("\t\t<th>MANUFACTURER</th>\r\n");
      out.write("\t\t<th>MADE IN</th>\r\n");
      out.write("\t\t<th>PRICE</th>\r\n");
      out.write("\t\t<th>QUANTITY</th>\r\n");
      out.write("\t\t<th>SUBTOTAL</th>\r\n");
      out.write("\t\t<th></th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t` + innerHTML\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkout() {\r\n");
      out.write("\twindow.location.href = \"checkout.jsp\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
