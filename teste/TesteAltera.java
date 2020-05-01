package br.com.estudo.jdbc.teste;

import java.util.Calendar;

import br.com.estudo.jdbc.dao.ContatoDao;
import br.com.estudo.jdbc.modelo.Contato;

public class TesteAltera {
	public static void main(String[] args) {
		Contato contato = new Contato();
		    contato.SetId(3);
			contato.setNome("Joao Eduardo");
			contato.setEmail("eduardo@joao.com.br");
			contato.setEndereco("Rua XXI Julho");
			contato.setDataNascimento(Calendar.getInstance());
			
			ContatoDao dao = new ContatoDao();
			dao.altera(contato);
			
	}
}
