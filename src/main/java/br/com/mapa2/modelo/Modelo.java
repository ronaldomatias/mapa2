package br.com.mapa2.modelo;

import br.com.mapa2.controlador.Controlador;
import br.com.mapa2.dominio.dto.UsuarioDTO;

import java.sql.SQLException;

public class Modelo {
	private UsuarioModelo usuarioModelo;
	private LoginModelo loginModelo;

	public Modelo() {
		this.usuarioModelo = new UsuarioModelo();
		this.loginModelo = new LoginModelo();
	}

	public boolean cadastrarUsuario(UsuarioDTO usuario) throws SQLException {
		return usuarioModelo.salvar(usuario);
	}

	public boolean login(Controlador.LoginDTO dto) throws SQLException {
		return loginModelo.login(dto);
	}

}