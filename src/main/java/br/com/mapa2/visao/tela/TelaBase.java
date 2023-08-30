package br.com.mapa2.visao.tela;

import javax.swing.*;

public abstract class TelaBase extends JPanel {

	public TelaBase() {
		this.configurarTela();
		this.montarTela();
	}

	protected abstract void configurarTela();

	public abstract void montarTela();

	public abstract void reset();
}
