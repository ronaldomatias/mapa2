package br.com.mapa2.visao.tela;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends TelaBase {
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField txtEmail;
	private JButton btnSalvar;

	public TelaCadastro() {
		super();
	}

	@Override
	protected void configurarTela(){
		setBorder(BorderFactory.createLineBorder(Color.green, 1));
		setBackground(Color.black);
		setLayout(null);
		setVisible(true);
	}

	@Override
	protected void montarTela() {
		JLabel lblNome = new JLabel("NOME: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNome.setForeground(Color.white);
		lblNome.setBounds(450, 190, 300, 50);
		lblNome.setVisible(true);

		JLabel lblLogin = new JLabel("LOGIN: ");
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 30));
		lblLogin.setForeground(Color.white);
		lblLogin.setBounds(440, 290, 300, 50);
		lblLogin.setVisible(true);

		JLabel lblSenha = new JLabel("SENHA: ");
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 30));
		lblSenha.setForeground(Color.white);
		lblSenha.setBounds(440, 390, 300, 50);
		lblSenha.setVisible(true);

		JLabel lblEmail = new JLabel("EMAIL: ");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 30));
		lblEmail.setForeground(Color.white);
		lblEmail.setBounds(440, 490, 300, 50);
		lblEmail.setVisible(true);

		txtNome = new JTextField(7);
		txtNome.setBounds(570, 200, 300, 30);
		txtNome.setVisible(true);

		txtLogin = new JTextField(7);
		txtLogin.setBounds(570, 300, 300, 30);
		txtLogin.setVisible(true);

		txtSenha = new JTextField(7);
		txtSenha.setBounds(570, 400, 300, 30);
		txtSenha.setVisible(true);

		txtEmail = new JTextField(7);
		txtEmail.setBounds(570, 500, 300, 30);
		txtEmail.setVisible(true);

		btnSalvar = new JButton("SALVAR");
		btnSalvar.setForeground(Color.black);
		btnSalvar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnSalvar.setBackground(Color.green);
		btnSalvar.setBounds(620, 600, 170, 40);
		btnSalvar.setVisible(true);

		super.add(lblNome);
		super.add(lblLogin);
		super.add(lblSenha);
		super.add(lblEmail);

		super.add(txtNome);
		super.add(txtLogin);
		super.add(txtSenha);
		super.add(txtEmail);
		super.add(btnSalvar);
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public JTextField getTxtLogin() {
		return txtLogin;
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

}