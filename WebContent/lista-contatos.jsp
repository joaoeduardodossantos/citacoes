<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.*,
					br.com.estudo.agenda.dao.*, 
					br.com.estudo.agenda.modelo.*" %>

<html>
<head>
<meta charset="UTF-8">
<title>Lista contatos</title>
</head>
<body>
	<table>
		<%
			ContatoDao dao = new ContatoDao();
		    List<Contato> contatos = dao.getLista();
		    
		    for (Contato contato : contatos) {
		    	
		   		
		%>	
		<lul>
			<li><%=contato.getNome() %></li>
				<li><%=contato.getEmail() %></li>
				<li><%=contato.getEndereco() %></li>
				<li><%=contato.getDataNascimento().getTime() %><li>
			
		</ul>
			<%
			}
			%>
	
	
	</table>
</body>
</html>