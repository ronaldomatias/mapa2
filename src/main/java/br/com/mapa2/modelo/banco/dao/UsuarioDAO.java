package br.com.mapa2.modelo.banco.dao;

import br.com.mapa2.modelo.banco.Conexao;
import br.com.mapa2.modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

	public void salvar(Usuario usuario) throws SQLException {
		Conexao driver = new Conexao();
		Connection conexao = driver.obterConexao();

		PreparedStatement ps = conexao.prepareStatement(
				"INSERT INTO usuario (nome, login, senha, email) VALUES ('"+usuario.getNome()+"', '"+usuario.getLogin()+"', '" + usuario.getSenha() + "', '" + usuario.getEmail() + "');");

		ps.execute();
		ps.close();
		conexao.close();
	}

	public String obterSenhaPorLogin(String login) throws SQLException {
		Conexao driver = new Conexao();
		Connection conexao = driver.obterConexao();

		PreparedStatement ps = conexao.prepareStatement("SELECT (senha) from usuario WHERE login = ?;");
		ps.setString(1, login);

		ResultSet resultSet = ps.executeQuery();

		ps.execute();
		ps.close();
		conexao.close();

		if (resultSet.next()) {
			return resultSet.getString(1);
		}

		return null;
	}

}