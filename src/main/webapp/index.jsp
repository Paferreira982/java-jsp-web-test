<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Boteco Nordestino's | Login</title>
<!-- IMPORTED CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="./resources/css/index.css">
</head>
<body>
		
    <div class="vertical-center">
        <div class="container p-5 pt-4">
            <div class="row mb-3">
                <label for="username" class="form-label">Nome de usuário</label>
                <input type="email" class="form-control" id="username">
            </div>
            <div class="row mb-3">
                <label for="password" class="form-label">Senha</label>
                <input type="password" class="form-control" id="password">
            </div>
            <div class="row mt-4">
                <button type="button" class="btn btn-outline-primary btn-login-entry">Logar</button>
            </div>
        </div>
    </div>

    <!-- IMPORTED JAVASCRIPT -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="./resources/js/index.js"></script>
</body>
</html>