<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%@ include file="/WEB-INF/classes/static/full_head.jsp"%>
	
	<!-- PAGE HEAD -->
    <title>Boteco Nordestino's | Login</title>
	<link rel="stylesheet" href="./resources/css/index.css">
	<!-- PAGE HEAD -->
	
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