<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<form action="registerUser" method="post">
		<label>Id: <input type="text" name="id" id="id"/> </label><span id="errMsg"></span><br>
		<label>Name: <input type="text" name="name" id="name"/> </label><br>
		<label>Email: <input type="text" name="email" id="email"/> </label><br>
		<input type="submit" name="register"/>
	</form>
	
	<br>${result}
</body>
<script type="text/javascript">
	$(document).ready(function (){
		$('#id').change(()=>{
			$.ajax({
				url: 'validateEmail',
				data:{id:$('#id').val()},
				success: (responseText)=>{
					$('#errMsg').text(responseText);
					
					if(responseText != ""){
						$('#id').focus();
					}
				}
			})
			
		})
	})	
</script>
</html>