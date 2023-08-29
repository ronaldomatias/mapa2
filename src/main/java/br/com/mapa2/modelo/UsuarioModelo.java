package br.com.mapa2.modelo;

import br.com.mapa2.controlador.Controlador;
import br.com.mapa2.modelo.banco.dao.UsuarioDAO;
import br.com.mapa2.modelo.dto.Usuario;

import java.sql.SQLException;

public class UsuarioModelo {
	private UsuarioDAO usuarioDAO;

	public UsuarioModelo() {
		this.usuarioDAO = new UsuarioDAO();
	}

	public void cadastrarUsuario(Usuario dto) throws SQLException {
		usuarioDAO.salvar(dto);
	}

	public boolean login(Controlador.LoginDTO dto) throws SQLException {
		String senha = usuarioDAO.obterSenhaPorLogin(dto.getLogin());

		if (dto.getSenha().equals(senha)) {
			return true;
		}

		return false;
	}

}
