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
	private JButton btnVoltar;

	public TelaCadastro() {
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
		JLabel lblNome = new JLabel("NOME: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNome.setForeground(Color.white);
		lblNome.setBounds(650, 190, 300, 50);
		lblNome.setVisible(true);

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

		JLabel lblEmail = new JLabel("EMAIL: ");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 30));
		lblEmail.setForeground(Color.white);
		lblEmail.setBounds(640, 490, 300, 50);
		lblEmail.setVisible(true);

		txtNome = new JTextField(7);
		txtNome.setBounds(770, 200, 300, 30);
		txtNome.setVisible(true);

		txtLogin = new JTextField(7);
		txtLogin.setBounds(770, 300, 300, 30);
		txtLogin.setVisible(true);

		txtSenha = new JPasswordField(7);
		txtSenha.setBounds(770, 400, 300, 30);
		txtSenha.setVisible(true);

		txtEmail = new JTextField(7);
		txtEmail.setBounds(770, 500, 300, 30);
		txtEmail.setVisible(true);

		btnSalvar = new JButton("SALVAR");
		btnSalvar.setForeground(Color.black);
		btnSalvar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnSalvar.setBackground(Color.green);
		btnSalvar.setBounds(690, 600, 170, 40);
		btnSalvar.setVisible(true);

		btnVoltar = new JButton("VOLTAR");
		btnVoltar.setForeground(Color.black);
		btnVoltar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnVoltar.setBackground(Color.lightGray);
		btnVoltar.setBounds(900, 600, 170, 40);
		btnVoltar.setVisible(true);

		super.add(lblNome);
		super.add(lblLogin);
		super.add(lblSenha);
		super.add(lblEmail);

		super.add(txtNome);
		super.add(txtLogin);
		super.add(txtSenha);
		super.add(txtEmail);
		super.add(btnSalvar);
		super.add(btnVoltar);
	}

	@Override
	public void reset() {
		this.txtNome.setText("");
		this.txtLogin.setText("");
		this.txtSenha.setText("");
		this.txtEmail.setText("");
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
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