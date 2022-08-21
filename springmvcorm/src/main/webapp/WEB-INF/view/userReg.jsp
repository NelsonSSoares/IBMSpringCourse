<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerUser" method="post">
		<label>Id: <input type="text" name="id"/> </label><br>
		<label>Name: <input type="text" name="name"/> </label><br>
		<label>Email: <input type="text" name="email"/> </label><br>
		<input type="submit" name="register"/>
	</form>
	
	<br>${result}
</body>
</html>