package br.com.mapa2.dominio.banco.dao;

import br.com.mapa2.dominio.banco.ConnectionFactory;

import java.sql.Connection;

public abstract class BaseDAO {

	public Connection obterConexao() {
		return ConnectionFactory.obterConexao();
	}

}
