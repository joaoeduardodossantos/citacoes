package br.com.estudo.jdbc.teste;

import java.util.List;

import br.com.estudo.jdbc.dao.ContatoDao;
import br.com.estudo.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endreço: " + contato.getEndereco());
			System.out.println("Data de nascimento: " + 
					contato.getDataNascimento().getTime() + "\n");
		}
	}
}
