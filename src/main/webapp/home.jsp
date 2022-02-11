<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
if (request.getSession().getAttribute("accessToken") == null) {
	request.getSession().invalidate();
	response.sendRedirect("index.jsp");
}
%>

<html>
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
	<h1></h1>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script>
	$(document).ready(() => {
		let loggedUser = JSON.parse(sessionStorage.getItem("loggedUser"));
		console.log(loggedUser.username);
		$("h1").html("Bem vindo(a) usuário " + loggedUser.username);
	})
	</script>
</body>
</html>