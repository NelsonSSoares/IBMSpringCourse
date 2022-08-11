<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Object Details</title>
</head>
<body>
	<%
		Object obj = (Object) request.getAttribute("employee");
		out.println(obj);
	%>

</body>
</html>