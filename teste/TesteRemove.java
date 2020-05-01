package br.com.estudo.jdbc.teste;

import br.com.estudo.jdbc.dao.ContatoDao;
import br.com.estudo.jdbc.modelo.Contato;

public class TesteRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato con = new Contato();
	//con.SetId("2");
		
		ContatoDao dao = new ContatoDao();
		dao.remove(con);
	}

}
