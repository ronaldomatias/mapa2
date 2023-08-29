package br.com.mapa2.modelo;

import br.com.mapa2.modelo.banco.dao.UsuarioDAO;
import br.com.mapa2.controlador.Controlador;

import java.sql.SQLException;

public class Modelo {
	private UsuarioDAO usuarioDAO;

	public Modelo() {
		this.usuarioDAO = new UsuarioDAO();
	}

	public void cadastrarUsuario(Usuario usuario) throws SQLException {
		usuarioDAO.salvar(usuario);
	}

	public boolean login(Controlador.LoginDTO dto) throws SQLException {
		String senha = usuarioDAO.obterSenhaPorLogin(dto.getLogin());
		
		if (dto.getSenha().equals(senha)) {
			return true;
		}
		
		return false;
	}

}