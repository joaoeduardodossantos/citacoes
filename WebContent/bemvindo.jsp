<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Primeira JSP</title>
</head>
<body>
	<%-- Comentario em JSP aqui: nossa primeira pagina JSP --%>
	
	<% String mensagem = "Bem vido ao sistema de agenda do FJ-21!"; %>
	<% out.println(mensagem); %>
    <br />
    <% String desenvolvimento = "Desenvolvido por Joao Eduardo"; %>
    <%= desenvolvimento %>
    <br />
    <% System.out.println("Tudo foi executado!"); %>
</body>
</html>