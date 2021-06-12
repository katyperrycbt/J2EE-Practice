<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploader</title>
</head>
<body>
	<h1>File Uploader</h1>
	<hr/>
	<form action="FileUploader" method="POST" enctype="multipart/form-data" >
		<label for="upfile">Select a File</label><br/>
		<input type="file" id="upfile" name="upfile">
		<br/><br/>
		<label for="override">Allow override ?</label>
		<input type="checkbox" name="override" id="override" value="checked">
		<br/><br/>
		<input type="submit">
	</form>
</body>
</html>