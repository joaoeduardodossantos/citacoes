package br.com.estudo.agenda.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudo.agenda.dao.ContatoDao;
import br.com.estudo.agenda.modelo.Contato;

public class ListaContatosLogic implements Logica {
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		List<Contato> contatos = new ContatoDao().getLista();
		
		req.setAttribute("contatos", contatos);
		
		return "lista-contatos-jstl.jsp";
	}
}
