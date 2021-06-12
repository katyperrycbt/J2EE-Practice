<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Engine</title>
<style>
    	.margin {margin: 5px 5px 5px 0px}
</style>
</head>
<body>
	<h1>Welcome to the search engine</h1>
    <hr>
    <div style="width: 300px; margin: 0 auto; padding: 10px;">
    	<form method="POST" action="search">
            <label class="margin" for="q">Search string</label>
            <input class="margin" id="q" type="text" name="q">
            <label class="margin" for="google">Google</label>
            <input class="margin" id="google" type="radio" value="google" name="engine">
            <label class="margin" for="yahoo">Yahoo</label>
            <input class="margin" id="yahoo" type="radio" value="yahoo" name="engine">
            <label class="margin" for="bing">Bing</label>
            <input class="margin" id="bing" type="radio" value="bing" name="engine">
            <button class="margin" type="submit">Submit</button>
      	</form>
    </div>
</body>
</html>