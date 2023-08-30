package br.com.mapa2.dominio.banco.dao;

import br.com.mapa2.dominio.dto.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO extends BaseDAO {

	public boolean salvar(UsuarioDTO usuario) throws SQLException {
		Connection conexao = super.obterConexao();

		PreparedStatement ps = conexao.prepareStatement(
				"INSERT INTO usuario (nome, login, senha, email) VALUES ('" + usuario.getNome() + "', '" + usuario.getLogin() + "', '" + usuario.getSenha() + "', '" + usuario.getEmail() + "');");

		ps.execute();
		ps.close();
		conexao.close();

		return true;
	}

	public String obterSenhaPorLogin(String login) throws SQLException {
		Connection conexao = super.obterConexao();

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

	public boolean loginExiste(String login) throws SQLException {
		Connection conexao = super.obterConexao();

		PreparedStatement ps = conexao.prepareStatement("SELECT COUNT(*) from usuario WHERE login = ?;");
		ps.setString(1, login);

		ResultSet resultSet = ps.executeQuery();

		ps.execute();
		ps.close();
		conexao.close();

		Integer count = 0;
		if (resultSet.next()) {
			count = resultSet.getInt(1);
		}

		return count > 0;
	}

}
