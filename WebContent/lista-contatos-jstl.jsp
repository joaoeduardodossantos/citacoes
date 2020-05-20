<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="if" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista com JTSL</title>
</head>
<body>

<c:import url="cabecalho.jsp" />

<!--  Cria o dao -->
<jsp:useBean id="dao" class="br.com.estudo.agenda.dao.ContatoDao" />
	<table>
			<tr>
				<td>Nome</td>
				<td>Email</td>
				<td>Endereco</td>
				<td>Data Nascimento</td>
			</tr>
	
		<%-- percorre os dados, montando as linhas da tabela --%>
		<c:forEach var="contato" items="${dao.lista}" >
			
		
			<tr>
				<td>${contato.nome}</td>
				
				<td>
					<c:if test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if>
					<c:if test="${empty contato.email}">
						Email não informado!
					</c:if>
				</td>
				
				<td>${contato.endereco}</td>
				
				<td>
				  <fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />
				</td>
			</tr>
		</c:forEach>
	</table>

<c:import url="rodape.jsp" />

</body>
</html>