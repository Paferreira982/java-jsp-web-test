<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.boteconordestinos.web.model.User"%>
<!DOCTYPE html>

<%
User user = (User) request.getSession().getAttribute("loggedUser");

if (user == null) {
	user = new User();
	request.getSession().invalidate();
	response.sendRedirect("index.jsp");
}

%>

<!-- NAVBAR -->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container">
	    <a class="navbar-brand" href="#">Boteco Nordestino's</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main-navbar" aria-controls="main-navbar" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="navbar-toggler-icon"></span>
	    </button>
	
	    <div class="collapse navbar-collapse" id="main-navbar">
	        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	            <li class="nav-item">
	                <a class="nav-link" aria-current="page" href="#">Home</a>
	            </li>
	            <li class="nav-item">
	                <a class="nav-link" href="#">Pedidos</a>
	            </li>
	            <li class="nav-item dropdown">
	                <a class="nav-link dropdown-toggle <%= user.isAdmin()? "" : "disabled" %> " href="#" id="adminDropdown" data-bs-toggle="dropdown" aria-expanded="false">Admin</a>
	                <ul class="dropdown-menu" aria-labelledby="adminDropdown">
	                    <li><a class="dropdown-item" href="#">Gestão de Usuários</a></li>
	                    <li><a class="dropdown-item" href="#">Gestão do Cardápio</a></li>
	                    <li><a class="dropdown-item" href="#">Relatórios</a></li>
	                </ul>
	            </li>
	        </ul>
	        <div class="row align-items-center profile-side">
	            <div class="col">
	                <span class="nav-right-link me-2"><i class="bi bi-person-square me-2"></i> <%= user.getUsername() %> </i></span>
	            </div>
	            <div class="col">
	                <span class="nav-right-link">Sair<i class="bi bi-box-arrow-right ms-2"></i></span>
	            </div>
	        </div>
	    </div>
	</div>
</nav>

<!-- NAVBAR -->