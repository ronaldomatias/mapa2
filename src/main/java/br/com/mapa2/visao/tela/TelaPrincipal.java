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
		JTextField txtLogin = new JTextField(7);
		txtLogin.setBounds(570, 210, 300, 30);
		txtLogin.setVisible(true);

		super.add(txtLogin);
	}

}