<!DOCTYPE html>
<html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,
					br.com.estudo.agenda.dao.*, 
					br.com.estudo.agenda.modelo.*" %>

<!-- importando a taglib com datepicker -->

<%@ taglib tagdir="/WEB-INF/tags" prefix="joao" %>



	<head>
	<link href="css/jquery.css" rel="stylesheet">
	
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	
		<meta charset="UTF-8">
		<title>Form Adiciona Contato</title>
	</head>
<body>

<c:import url="cabecalho.jsp" />

	<h1>Adicina Contatos</h1>
	<hr />
	<form action="adicionaContato">
		Nome: <input type="text" name="nome" /><br />
		E-mail: <input type="text" name="email" /><br />
		Endereco: <input type="text" name="endereco" /><br />

		Data Nascimento: <joao:campoData id="dataNascimento" /><br />
		
		<input type="submit" value="Gravar" />
	</form>
	
<c:import url="rodape.jsp" />	
	
</body>
</html>