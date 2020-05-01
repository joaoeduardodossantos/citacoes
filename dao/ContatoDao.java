package br.com.estudo.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.estudo.jdbc.ConnectionFactory;
import br.com.estudo.jdbc.modelo.Contato;

public class ContatoDao {
// a conexao com o banco de dados
	private Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato) {
		String sql = "insert into contatos " +
	                 "(nome, email, endereco, dataNascimento)" +
	                 " values (?,?,?,?)";
		
		try {
			// Prepared statement para insercao
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(
					contato.getDataNascimento().getTimeInMillis()));
			
			// execute
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

// Inicio do metodo Lista
	public List<Contato> getLista()	{
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto cotato
				Contato contato = new Contato();
				
				contato.SetId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				// montando a Data atraves do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				// adicionando o objeto a lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
// Metodo altera 
	public void altera(Contato contato) {
		String sql = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete " +
					"from contatos where id=?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void busca() {
		try {
		    PreparedStatement stmt = connection.prepareStatement("select * from contatos where id=?");
		    ResultSet rs = stmt.executeQuery();
		    Contato contato1 = new Contato();
		    contato1.SetId(rs.getLong("id"));
		    contato1.setNome(rs.getString("nome"));
		    contato1.setEmail(rs.getString("email"));
		    contato1.setEndereco(rs.getString("endereco"));
	//	    contato1.setDataNascimento(rs.getCa("datanascimento"));
		    
			
			// montando a Data atraves do Calendar
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato1.setDataNascimento(data);
			

				rs.close();
				stmt.close();
				return;		
			} catch (Exception e) {
				// TODO: handle exception
			}
	
	}
}