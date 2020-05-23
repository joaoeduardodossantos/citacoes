package br.com.estudo.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudo.agenda.dao.ContatoDao;
import br.com.estudo.agenda.modelo.Contato;

public class RemoveContatoLogic implements Logica {
	
	public String executa(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		long id = Long.parseLong(req.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.exclui(contato);
		
		System.out.println("Excluindo contatos ...");
		
		return "mvc?logica=ListaContatosLogic";		
	}
}
