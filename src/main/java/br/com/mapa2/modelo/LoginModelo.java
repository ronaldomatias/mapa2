package br.com.mapa2.modelo;

import br.com.mapa2.controlador.Controlador;
import br.com.mapa2.modelo.banco.dao.UsuarioDAO;

import java.sql.SQLException;

public class LoginModelo {

	public boolean login(Controlador.LoginDTO dto) throws SQLException {
		String senha = new UsuarioDAO().obterSenhaPorLogin(dto.getLogin());

		if (senha == null) {
			return false;
		}

		return dto.getSenha().equals(senha);
	}

}
