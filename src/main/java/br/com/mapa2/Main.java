package br.com.mapa2;

import br.com.mapa2.controlador.Controlador;
import br.com.mapa2.modelo.Modelo;
import br.com.mapa2.visao.Visao;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Modelo modelo = new Modelo();
		Visao visao = new Visao();
		Controlador controlador = new Controlador(visao, modelo);
	}

}