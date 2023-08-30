package br.com.mapa2.visao.tela;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends TelaBase {
	private static final long serialVersionUID = 1L;
	JButton btnVoltar;

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
	public void montarTela() {
		JLabel txtBemVindo = new JLabel("SEJA BEM-VINDO");
		txtBemVindo.setFont(new Font("Verdana", Font.BOLD, 50));
		txtBemVindo.setBackground(Color.WHITE);
		txtBemVindo.setForeground(Color.GREEN);
		txtBemVindo.setBounds(700, 210, 500, 250);
		txtBemVindo.setVisible(true);

		btnVoltar = new JButton("VOLTAR");
		btnVoltar.setForeground(Color.black);
		btnVoltar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnVoltar.setBackground(Color.LIGHT_GRAY);
		btnVoltar.setBounds(780, 900, 300, 40);
		btnVoltar.setVisible(true);

		super.add(txtBemVindo);
		super.add(btnVoltar);
	}

	@Override
	public void reset() {

	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

}