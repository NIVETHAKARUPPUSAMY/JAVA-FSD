<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	
	<br>
	<jsp:useBean id="product" class="com.products.Product"
		scope="session"></jsp:useBean>
	<jsp:setProperty property="productId" name="product" value="1" />
	<jsp:setProperty property="productName" name="product"
		value="Optical Wireless Mouse" />
	<jsp:setProperty property="price" name="product" value="600.00" />
	
	
	<a href="Display.jsp">Access bean properties from another page</a>
	<br>
	
</body>
</html>



