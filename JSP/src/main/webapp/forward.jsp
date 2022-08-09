<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forward</title>
</head>
<body>
	<jsp:forward page="forwarded.jsp"></jsp:forward>
</body>
</html>

below code in main index page

<a href="forward.jsp">Use Forward action to go to Google</a>
	<br>

	<hr>

	<jsp:text>
		<![CDATA[This is my content.<br/>This will show within a text action tag exactly as it has been entered]]>
	</jsp:text>
