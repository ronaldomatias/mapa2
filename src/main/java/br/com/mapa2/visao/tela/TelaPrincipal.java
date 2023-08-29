package br.com.mapa2.visao.tela;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends TelaBase {
	private static final long serialVersionUID = 1L;

	public TelaPrincipal() {
		super();
	}

	@Override
	protected void configurarTela() {
		super.setBorder(BorderFactory.createLineBorder(Color.green, 1));
		super.setBackground(Color.black);
		super.setLayout(null);
		super.setVisible(true);
	}

	@Override
	protected void montarTela() {
		JLabel txtBemVindo = new JLabel("SEJA BEM-VINDO");
		txtBemVindo.setFont(new Font("Verdana", Font.BOLD, 50));
		txtBemVindo.setBackground(Color.WHITE);
		txtBemVindo.setForeground(Color.GREEN);
		txtBemVindo.setBounds(700, 210, 500, 250);
		txtBemVindo.setVisible(true);

		super.add(txtBemVindo);
	}

}