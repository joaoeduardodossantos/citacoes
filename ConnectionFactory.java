package br.com.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/estudo", "root", "admin");
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		
	}
}
