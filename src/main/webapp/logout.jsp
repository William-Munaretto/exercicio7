<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home - logado</title>
</head>
<link rel="stylesheet" type="text/css" href="logout.css"/>
<body>
	<div class="logout">
		<h2>Login efetuado com sucesso!!!</h2>
		<p>Para sair, clique no botão abaixo.</p>
		<form action="${pageContext.request.contextPath}/logout">
			<% String usuario = (String) session.getAttribute("usuario"); %>
			<input id="button" type="submit" value="Logout" />
		</form>
	</div>
</body>
</html>