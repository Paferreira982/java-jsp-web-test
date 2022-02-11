<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.boteconordestinos.web.model.User"%>
<!DOCTYPE html>

<%
User user = (User) request.getSession().getAttribute("loggedUser");
if (user == null) {
	request.getSession().invalidate();
	response.sendRedirect("index.jsp");
}
%>

<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
	<h1>Bem vindo(a) <%= user.getUsername() %>.</h1>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>