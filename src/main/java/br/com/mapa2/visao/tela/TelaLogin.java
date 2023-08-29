package br.com.mapa2.visao.tela;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin extends TelaBase {
	private static final long serialVersionUID = 1L;
	JTextField txtLogin;
	JTextField txtSenha;
	private JButton btnEntrar;
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
	protected void montarTela() {
		JLabel lblSenha = new JLabel("LOGIN: ");
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 30));
		lblSenha.setForeground(Color.white);
		lblSenha.setBounds(450, 200, 300, 50);
		lblSenha.setVisible(true);

		JLabel lblLogin = new JLabel("SENHA: ");
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 30));
		lblLogin.setForeground(Color.white);
		lblLogin.setBounds(440, 300, 300, 50);
		lblLogin.setVisible(true);

		txtLogin = new JTextField(7);
		txtLogin.setBounds(570, 210, 300, 30);
		txtLogin.setVisible(true);

		txtSenha = new JTextField(7);
		txtSenha.setBounds(570, 310, 300, 30);
		txtSenha.setVisible(true);

		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(Color.black);
		btnEntrar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnEntrar.setBackground(Color.green);
		btnEntrar.setBounds(420, 400, 170, 40);
		btnEntrar.setVisible(true);

		btnCadastro = new JButton("CADASTRAR NOVO USUÁRIO");
		btnCadastro.setForeground(Color.black);
		btnCadastro.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnCadastro.setBackground(Color.green);
		btnCadastro.setBounds(620, 400, 300, 40);
		btnCadastro.setVisible(true);

		super.add(lblLogin);
		super.add(lblSenha);
		super.add(txtLogin);
		super.add(txtSenha);
		super.add(btnEntrar);
		super.add(btnCadastro);
	}


	public JButton getBtnEntrar() {
		return btnEntrar;
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