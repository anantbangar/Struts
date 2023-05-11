<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>QRCode Generator </title>
</head>
<body>

	<h2>This is QRCode Generator Page</h2>
	<form action="createQR.do" method="post" target="_blank">
		<input type="text" name="qrtext" placeholder="Enter Text to create QR Code"/>
		<input type="submit" value="Generate QR Code" />
	</form>
</body>
</html>