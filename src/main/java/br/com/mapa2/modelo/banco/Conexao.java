package br.com.mapa2.modelo.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection CONNECTION;
	   
	   public Connection obterConexao() {
		   if (CONNECTION == null) {
			   try {
				   this.CONNECTION = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mapa", "root", "3242");
			   } catch (SQLException e) {
				   throw new RuntimeException(e);
			   }
		   }

		   return CONNECTION;
	   }

}