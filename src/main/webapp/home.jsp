<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%@ include file="/WEB-INF/classes/static/head.jsp"%>
	<title>Home</title>
</head>

<body>
	<header>
		<%@ include file="/WEB-INF/classes/templates/nav-bar.jsp"%>
	</header>
	<main>
		<h1>Bem vindo(a) <%= user.getUsername() %>.</h1>
	</main>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>