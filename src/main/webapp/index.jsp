<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Boteco Nordestino's | Login</title>

    <!-- IMPORTED CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
    <link rel="stylesheet" href="./resources/css/index.css">
</head>
<body>
		
    <div class="vertical-center">
        <div class="container p-5">
            <div class="alert alert-warning fade show" role="alert" style="display: none;">
                <i class="bi bi-exclamation-triangle"></i> <span id="waring-message" class="ms-2"></span> 
            </div>

            <form id="login-form">
                <div class="row form-floating mb-3">
                    <input type="text" class="form-control" id="username" placeholder="Nome de usuário" required>
                    <label for="username">Nome de usuário</label>
                </div>
                <div class="row form-floating mb-3">
                    <input type="password" class="form-control" id="password" placeholder="Senha" required>
                    <label for="password" class="form-label">Senha</label>
                </div>
                <div class="row mt-4">
                    <button type="submit" class="btn btn-outline-primary btn-login-entry">
                        Logar
                    </button>
                </div>
            </form>
        </div>
    </div>

    <!-- IMPORTED JAVASCRIPT -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="./resources/js/index.js"></script>
</body>
</html>