<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<jsp:useBean id="product" class="com.products.Product" scope="session"></jsp:useBean>
        Product Id:    <jsp:getProperty name="product" property="productId" />  <br>
        Product Name:    <jsp:getProperty name="product" property="productName" />  <br>
        Product Price:    <jsp:getProperty name="product" property="price" />  <br>

</body>
</html>
