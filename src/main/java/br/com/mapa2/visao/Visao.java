package br.com.mapa2.visao;

import br.com.mapa2.visao.tela.TelaBase;
import br.com.mapa2.visao.tela.TelaCadastro;
import br.com.mapa2.visao.tela.TelaLogin;
import br.com.mapa2.visao.tela.TelaPrincipal;

import java.awt.*;
import javax.swing.*;


public class Visao extends JFrame {
	private static final long serialVersionUID = 1L;
	private TelaLogin telaLogin;
	private TelaCadastro telaCadastro;
	private TelaPrincipal telaPrincipal;

	public Visao() {
		this.telaLogin = new TelaLogin();
		this.telaCadastro = new TelaCadastro();
		this.telaPrincipal = new TelaPrincipal();

		this.configurarVisao();
		this.mostrarTela(telaLogin);
	}

	private void configurarVisao() {
		super.getContentPane().setBackground(Color.magenta);
		super.getContentPane().setLayout(new BorderLayout());
		super.setSize(1420, 800);
		super.setVisible(true);
	}
	
	private void atualizarVisao() {
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}

	public void mostrarTela(TelaBase tela) {
		tela.reset();
		this.getContentPane().removeAll();
		this.getContentPane().add(tela);
		this.atualizarVisao();
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