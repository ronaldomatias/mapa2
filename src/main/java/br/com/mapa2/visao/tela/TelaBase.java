package br.com.mapa2.visao.tela;

import javax.swing.*;

public abstract class TelaBase extends JPanel {

	public TelaBase() {
		this.configurarTela();
		this.montarTela();
	}

	protected abstract void configurarTela();

	protected abstract void montarTela();
}
