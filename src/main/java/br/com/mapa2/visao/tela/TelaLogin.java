package br.com.mapa2.visao.tela;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TelaLogin extends TelaBase {
	private static final long serialVersionUID = 1L;
	JTextField txtLogin;
	JTextField txtSenha;
	private JButton btnLogin;
	private JButton btnCadastro;

	public TelaLogin() {
		super();
	}

	@Override
	protected void configurarTela(){
		super.setBorder(BorderFactory.createLineBorder(Color.green, 1));
		super.setBackground(Color.black);
		super.setLayout(null);
		super.setVisible(true);
	}

	@Override
	public void montarTela() {
		JLabel lblLogin = new JLabel("LOGIN: ");
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 30));
		lblLogin.setForeground(Color.white);
		lblLogin.setBounds(640, 290, 300, 50);
		lblLogin.setVisible(true);

		JLabel lblSenha = new JLabel("SENHA: ");
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 30));
		lblSenha.setForeground(Color.white);
		lblSenha.setBounds(640, 390, 300, 50);
		lblSenha.setVisible(true);

		txtLogin = new JTextField(7);
		txtLogin.setBounds(770, 300, 300, 30);
		txtLogin.setVisible(true);

		txtSenha = new JPasswordField(7);
		txtSenha.setBounds(770, 400, 300, 30);
		txtSenha.setVisible(true);

		btnLogin = new JButton("ENTRAR");
		btnLogin.setForeground(Color.black);
		btnLogin.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnLogin.setBackground(Color.green);
		btnLogin.setBounds(840, 485, 170, 40);
		btnLogin.setVisible(true);

		btnCadastro = new JButton("CADASTRAR NOVO USUÁRIO");
		btnCadastro.setForeground(Color.black);
		btnCadastro.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnCadastro.setBackground(Color.LIGHT_GRAY);
		btnCadastro.setBounds(770, 550, 300, 40);
		btnCadastro.setVisible(true);

		super.add(lblLogin);
		super.add(lblSenha);

		super.add(txtLogin);
		super.add(txtSenha);
		super.add(btnLogin);
		super.add(btnCadastro);
	}

	@Override
	public void reset() {
		this.txtLogin.setText("");
		this.txtSenha.setText("");
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public JButton getBtnCadastro() {
		return btnCadastro;
	}

	public JTextField getTxtLogin() {
		return txtLogin;
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

}