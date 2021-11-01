<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home - Login </title>
</head>
<link rel="stylesheet" type="text/css" href="login.css"/>
<body>
	 
	<div class="login">
		<form action="${pageContext.request.contextPath}/login" >
			<label><strong>Login</strong></label>
			<input class="log" type="text" name="campo_login"  />
			<br />
			<br />
			<label><Strong>Senha:</Strong></label>
			<input class="log" type="password" name="campo_password"  />
			<br />
			<br />
			<input id="button" type="submit" value="Enviar" />
		</form>
	</div>
</body>
</html>