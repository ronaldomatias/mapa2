package br.com.mapa2.modelo;

import br.com.mapa2.modelo.banco.dao.UsuarioDAO;
import br.com.mapa2.modelo.dto.Usuario;

import java.sql.SQLException;

public class UsuarioModelo {
	private UsuarioDAO usuarioDAO;

	public UsuarioModelo() {
		this.usuarioDAO = new UsuarioDAO();
	}

	public boolean salvar(Usuario dto) throws SQLException {
		if (usuarioDAO.loginExiste(dto.getLogin())) {
			return false;
		}

		return usuarioDAO.salvar(dto);
	}

}
