package ordena2.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;


@SuppressWarnings("serial")
public class Ordena2ToolBar extends JToolBar {

	// Declaración de atributos
	private JLabel titulo;
	private JButton botonNodo;
	private JToggleButton botonFlujo;
	private JButton botonEntrada;
	private JButton botonSalida;

	public Ordena2ToolBar() {

		// Opciones del JToolBar
		this.setBorder(BorderFactory.createLineBorder(new Color(161, 188, 49)));
		this.setBackground(new Color(161, 188, 49));
		this.setFloatable(false);
		this.setOrientation(VERTICAL);
		this.setRollover(true);

		// Inicialización de atributos
		titulo = new JLabel("ToolBar");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		titulo.setForeground(new Color(255,255,255));
		
		botonNodo = new JButton(new ImageIcon(this.getClass().getResource(
				"/img/nodo1.png")));
		botonNodo.setRolloverIcon(new ImageIcon(this.getClass().getResource(
				"/img/nodo2.png")));
		botonNodo.setSelectedIcon(new ImageIcon(this.getClass().getResource(
				"/img/nodo3.png")));
		
		botonFlujo = new JToggleButton(new ImageIcon(this.getClass().getResource(
				"/img/flujo.png")));
		
		botonEntrada = new JButton(new ImageIcon(this.getClass().getResource(
				"/img/entrada1.png")));
		botonEntrada.setRolloverIcon(new ImageIcon(this.getClass().getResource(
				"/img/entrada2.png")));
		botonEntrada.setSelectedIcon(new ImageIcon(this.getClass().getResource(
				"/img/entrada3.png")));
		
		botonSalida = new JButton(new ImageIcon(this.getClass().getResource(
				"/img/salida1.png")));
		botonSalida.setRolloverIcon(new ImageIcon(this.getClass().getResource(
				"/img/salida2.png")));
		botonSalida.setSelectedIcon(new ImageIcon(this.getClass().getResource(
				"/img/salida3.png")));

		// Añadiendo Componentes al JToolBar
		this.add(titulo);
		this.add(botonFlujo);
		this.add(botonNodo);
		this.add(botonEntrada);
		this.add(botonSalida);
	}
	
	//Getters and Setters
	
	public JButton getBotonNodo() {
		return botonNodo;
	}

	public void setBotonNodo(JButton botonNodo) {
		this.botonNodo = botonNodo;
	}

	public JToggleButton getBotonFlujo() {
		return botonFlujo;
	}

	public void setBotonFlujo(JToggleButton botonFlujo) {
		this.botonFlujo = botonFlujo;
	}

	public JButton getBotonEntrada() {
		return botonEntrada;
	}

	public void setBotonEntrada(JButton botonEntrada) {
		this.botonEntrada = botonEntrada;
	}

	public JButton getBotonSalida() {
		return botonSalida;
	}

	public void setBotonSalida(JButton botonSalida) {
		this.botonSalida = botonSalida;
	}

}
