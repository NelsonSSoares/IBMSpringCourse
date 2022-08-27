<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hellooo</title>
</head>
<body>
	<%
		Integer id = (Integer)request.getAttribute("id");
		String name = (String)request.getAttribute("name");
		Integer salary = (Integer)request.getAttribute("salary");
		out.println("id: "+id);
		out.println("name: "+name);
		out.println("salary: "+salary);
	%>
	
	<br>
	Id: <b>${id}</b>
	Name: <b>${name}</b>
	salary: <b>${salary}</b>
</body>
</html>