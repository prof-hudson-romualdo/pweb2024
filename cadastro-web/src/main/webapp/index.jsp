<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en" data-bs-theme="auto">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cadastro Web</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<!-- Custom styles for this template -->
<link href="index-in.css" rel="stylesheet">
</head>
<body class="d-flex align-items-center py-4 bg-body-tertiary">
	<main class="form-signin w-100 m-auto">
		<form class="row g-3" action="cadastroResponsavel" method="post">
			<div class="col-12 text-center">
				<h3>Cadastro de Responsáveis</h3>
			</div>
			<div class="col-12">
				<label for="inputResponsavel" class="form-label">Responsável</label> 
				<input type="text" class="form-control" id="inputResponsavel" name="responsavel"
				value="${param.responsavel}">
			</div>
			<div class="col-12">
				<label for="inputAluno" class="form-label">Nome do(a) aluno(a)</label> <input
					type="text" class="form-control" id="inputAluno" name="aluno" value="${param.aluno}">
			</div>
			<div class="col-12">
				<label for="inputTelefone" class="form-label">Telefone</label> <input
					type="text" class="form-control" id="inputTelefone" name="telefone"
					value="${param.telefone}">
			</div>			
			<div class="col-12">
				<button type="submit" class="btn btn-primary">Salvar</button>
			</div>
			<c:if test="${mostrarAlertaDeObrigatoriedade}">
				<div class="col-12">
					<div class="alert alert-danger" role="alert">
						Todos os dados do formulário são de preenchimento obrigatório
					</div>		
				</div>
			</c:if>
		</form>
	</main>
</body>
</html>
