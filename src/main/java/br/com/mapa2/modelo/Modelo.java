package br.com.mapa2.modelo;

import br.com.mapa2.controlador.Controlador;
import br.com.mapa2.modelo.dto.Usuario;

import java.sql.SQLException;

public class Modelo {
	private UsuarioModelo usuarioModelo;

	public Modelo() {
		this.usuarioModelo = new UsuarioModelo();
	}

	public void cadastrarUsuario(Usuario usuario) throws SQLException {
		usuarioModelo.cadastrarUsuario(usuario);
	}

	public boolean login(Controlador.LoginDTO dto) throws SQLException {
		return usuarioModelo.login(dto);
	}

}