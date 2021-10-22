package co.com.adl.builder;

import java.awt.Color;

import javax.swing.JFrame;

import co.com.adl.util.Constantes;

public class CalculadoraBasica extends JFrame {

	private static final long serialVersionUID = 5771617816138723763L;

	private BotonCalculadora botonUno;
	private BotonCalculadora botonDos;
	private BotonCalculadora botonTres;
	private BotonCalculadora botonCuatro;
	private BotonCalculadora botonCinco;
	private BotonCalculadora botonSeis;
	private BotonCalculadora botonSiete;
	private BotonCalculadora botonOcho;
	private BotonCalculadora botonNueve;
	private BotonCalculadora botonCero;
	private BotonCalculadora botonPunto;
	private BotonCalculadora botonIgual;
	private BotonCalculadora botonMas;
	private BotonCalculadora botonMenos;
	private BotonCalculadora botonPor;
	private BotonCalculadora botonDivision;
	private BotonCalculadora botonCambiador;
	private BotonCalculadora botonLimpiar;
	private BotonCalculadora botonParentesis;
	private BotonCalculadora botonModulo;
	private Pantalla pantalla;

	public CalculadoraBasica(){}

	public void establecerPropiedadesVentana() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Calculadora ADL");
		setAlwaysOnTop(true);
		setMinimumSize(new java.awt.Dimension(300, 480));
		setPreferredSize(new java.awt.Dimension(290, 300));
		setSize(new java.awt.Dimension(800, 800));
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(187, 238, 247));
	}

	public void adicionarComponentes(){
		getContentPane().add(pantalla);
		pantalla.setBounds(20, 30, 250, 90);		
		getContentPane().add(botonCambiador);
		botonCambiador.setBounds(30, 360, 50, 50);
		getContentPane().add(botonLimpiar);
		botonLimpiar.setBounds(30, 160, 50, 50);
		getContentPane().add(botonSiete);
		botonSiete.setBounds(30, 210, 50, 50);
		getContentPane().add(botonCuatro);
		botonCuatro.setBounds(30, 260, 50, 50);
		getContentPane().add(botonUno);
		botonUno.setBounds(30, 310, 50, 50);
		getContentPane().add(botonCero);
		botonCero.setBounds(90, 360, 50, 50);
		getContentPane().add(botonParentesis);
		botonParentesis.setBounds(90, 160, 50, 50);
		getContentPane().add(botonOcho);
		botonOcho.setBounds(90, 210, 50, 50);
		getContentPane().add(botonCinco);
		botonCinco.setBounds(90, 260, 50, 50);
		getContentPane().add(botonDos);
		botonDos.setBounds(90, 310, 50, 50);
		getContentPane().add(botonPunto);
		botonPunto.setBounds(150, 360, 50, 50);
		getContentPane().add(botonModulo);
		botonModulo.setBounds(150, 160, 50, 50);
		getContentPane().add(botonNueve);
		botonNueve.setBounds(150, 210, 50, 50);
		getContentPane().add(botonSeis);
		botonSeis.setBounds(150, 260, 50, 50);
		getContentPane().add(botonTres);
		botonTres.setBounds(150, 310, 50, 50);
		getContentPane().add(botonIgual);
		botonIgual.setBounds(210, 360, 50, 50);
		getContentPane().add(botonDivision);
		botonDivision.setBounds(210, 160, 50, 50);
		getContentPane().add(botonPor);
		botonPor.setBounds(210, 210, 50, 50);
		getContentPane().add(botonMenos);
		botonMenos.setBounds(210, 260, 50, 50);
		getContentPane().add(botonMas);
		botonMas.setBounds(210, 310, 50, 50);
	}

	public void establecerTextos() {
		botonCambiador.setText(Constantes.CAMBIADOR);
		botonLimpiar.setText(Constantes.LIMPIAR);
		botonSiete.setText(Constantes.SIETE);
		botonCuatro.setText(Constantes.CUATRO);
		botonUno.setText(Constantes.UNO);
		botonCero.setText(Constantes.CERO);
		botonParentesis.setText(Constantes.PARENTESIS);
		botonOcho.setText(Constantes.OCHO);
		botonCinco.setText(Constantes.CINCO);
		botonDos.setText(Constantes.DOS);
		botonPunto.setText(Constantes.PUNTO);
		botonModulo.setText(Constantes.PORCENTAJE);
		botonNueve.setText(Constantes.NUEVE);
		botonSeis.setText(Constantes.SEIS);
		botonTres.setText(Constantes.TRES);
		botonIgual.setText(Constantes.IGUAL);
		botonDivision.setText(Constantes.DIVISION);
		botonPor.setText(Constantes.MULTIPLICACION);
		botonMenos.setText(Constantes.RESTA);
		botonMas.setText(Constantes.SUMA);
	}
	
	public void inicializarComponentes() {
		botonCero = new BotonCalculadora();
		botonUno = new BotonCalculadora();
		botonDos = new BotonCalculadora();
		botonTres = new BotonCalculadora();
		botonCuatro = new BotonCalculadora();
		botonCinco = new BotonCalculadora();
		botonSeis = new BotonCalculadora();
		botonSiete = new BotonCalculadora();
		botonOcho = new BotonCalculadora();
		botonNueve = new BotonCalculadora();
		botonIgual = new BotonCalculadora();
		botonPunto = new BotonCalculadora();
		botonMas = new BotonCalculadora();
		botonMenos = new BotonCalculadora();
		botonPor = new BotonCalculadora();
		botonDivision = new BotonCalculadora();
		botonCambiador = new BotonCalculadora();
		botonLimpiar = new BotonCalculadora();
		botonParentesis = new BotonCalculadora();
		botonModulo = new BotonCalculadora();
		pantalla = Pantalla.getDisplay();
	}

	public void ejecutarVentana() {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				setVisible(true);
			}
		});
	}

	public void establecerAspecto(){
		try {
			javax.swing.UIManager.setLookAndFeel("system");
		} catch (ClassNotFoundException ex) {

		} catch (InstantiationException ex) {

		} catch (IllegalAccessException ex) {

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {

		}
		pack();	
	}
}
