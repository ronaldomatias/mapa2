package br.com.mapa2.modelo;

import br.com.mapa2.dominio.banco.dao.UsuarioDAO;
import br.com.mapa2.dominio.dto.UsuarioDTO;

import java.sql.SQLException;

public class UsuarioModelo {
	private UsuarioDAO usuarioDAO;

	public UsuarioModelo() {
		this.usuarioDAO = new UsuarioDAO();
	}

	public boolean salvar(UsuarioDTO dto) throws SQLException {
		if (usuarioDAO.loginExiste(dto.getLogin())) {
			return false;
		}

		return usuarioDAO.salvar(dto);
	}

}
