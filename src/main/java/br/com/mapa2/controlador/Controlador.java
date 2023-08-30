package br.com.mapa2.controlador;

import br.com.mapa2.dominio.dto.UsuarioDTO;
import br.com.mapa2.modelo.Modelo;
import br.com.mapa2.visao.Visao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	private Visao visao;
	private Modelo modelo;

	public Controlador(Visao visao, Modelo modelo) {
		this.visao = visao;
		this.modelo = modelo;
		this.visao.getTelaLogin().getBtnLogin().addActionListener(new AcaoTelaLoginBtnLogin());
		this.visao.getTelaLogin().getBtnCadastro().addActionListener(new AcaoTelaLoginBtnCadastro());
		this.visao.getTelaCadastro().getBtnSalvar().addActionListener(new AcaoTelaCadastroBtnSalvar());
		this.visao.getTelaCadastro().getBtnVoltar().addActionListener(new AcaoTelaCadastroBtnVoltar());
		this.visao.getTelaPrincipal().getBtnVoltar().addActionListener(new AcaoTelaPrincipalBtnVoltar());
	}

	class AcaoTelaLoginBtnLogin implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				LoginDTO dto = new LoginDTO(visao.getTelaLogin().getTxtLogin().getText(), visao.getTelaLogin().getTxtSenha().getText());

				boolean loginSucesso = modelo.login(dto);

				if (loginSucesso) {
					visao.mostrarTela(visao.getTelaPrincipal());
					JOptionPane.showMessageDialog(visao, "Acesso autorizado!", null, JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(visao, "Login ou senha incorretos!", null, JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	class AcaoTelaLoginBtnCadastro implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				visao.mostrarTela(visao.getTelaCadastro());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	class AcaoTelaCadastroBtnSalvar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String nome = visao.getTelaCadastro().getTxtNome().getText();
				String login = visao.getTelaCadastro().getTxtLogin().getText();
				String senha = visao.getTelaCadastro().getTxtSenha().getText();
				String email = visao.getTelaCadastro().getTxtEmail().getText();

				boolean cadastroSucesso = modelo.cadastrarUsuario(new UsuarioDTO(nome, login, senha, email));

				if (cadastroSucesso) {
					visao.mostrarTela(visao.getTelaLogin());
					JOptionPane.showMessageDialog(visao, "Cadastro efetuado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(visao, "Login já existe. Escolha outro!", null, JOptionPane.WARNING_MESSAGE);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	class AcaoTelaPrincipalBtnVoltar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				visao.mostrarTela(visao.getTelaLogin());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	class AcaoTelaCadastroBtnVoltar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				visao.mostrarTela(visao.getTelaLogin());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public static class LoginDTO {
		private String login;
		private String senha;

		public LoginDTO(String login, String senha) {
			this.login = login;
			this.senha = senha;
		}

		public String getLogin() {
			return login;
		}

		public String getSenha() {
			return senha;
		}
	}

}