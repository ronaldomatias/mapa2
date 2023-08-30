package br.com.mapa2.dominio.dto;

public class UsuarioDTO {
	private Integer id;
	private String email;
	private String login;
	private String senha;
	private String nome;

	public UsuarioDTO(String nome, String login, String senha, String email) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
