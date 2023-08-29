package br.com.mapa2.visao;

import br.com.mapa2.visao.tela.TelaCadastro;
import br.com.mapa2.visao.tela.TelaLogin;
import br.com.mapa2.visao.tela.TelaPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;


public class Visao extends JFrame{
	private static final long serialVersionUID = 1L;
	private TelaLogin telaLogin;
	private TelaCadastro telaCadastro;
	private TelaPrincipal telaPrincipal;

	public Visao() {
		this.telaLogin = new TelaLogin();
		this.telaCadastro = new TelaCadastro();
		this.telaPrincipal = new TelaPrincipal();

		this.configurarTela();
		this.mostrarTela(telaLogin);
	}

	private void configurarTela() {
		getContentPane().setBackground(Color.magenta);
		getContentPane().setLayout(new BorderLayout());
		setSize(1420, 800);
		setVisible(true);
	}
	
	private void atualizarTela() {
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}

	public void mostrarTela(JPanel tela) {
		this.getContentPane().removeAll();
		this.getContentPane().add(tela);
		this.atualizarTela();
	}

	public TelaLogin getTelaLogin() {
		return telaLogin;
	}

	public TelaCadastro getTelaCadastro() {
		return telaCadastro;
	}


	public TelaPrincipal getTelaPrincipal() {
		return telaPrincipal;
	}
}