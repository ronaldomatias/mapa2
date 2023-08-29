package br.com.mapa2.modelo.banco.dao;

import br.com.mapa2.modelo.banco.ConnectionFactory;

import java.sql.Connection;

public abstract class BaseDAO {

	public Connection getConnection() {
		return ConnectionFactory.obterConexao();
	}

}
