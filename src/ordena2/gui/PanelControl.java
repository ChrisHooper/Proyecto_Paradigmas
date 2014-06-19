package ordena2.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelControl extends JPanel {

	// Declaración de atributos
	private JButton botonAtras;
	private JButton botonSiguiente;
	private JButton botonVolver;

	public PanelControl() {

		// Opciones del panel
		this.setBackground(new Color(161, 188, 49));
		this.setLayout(new GridLayout(1,3));

		// Inicialización de atributos
		botonAtras = new JButton("Atrás");
		botonSiguiente = new JButton("Siguiente");
		botonVolver = new JButton("VOLVER");
		
		// Añadiendo Componentes al panel
		this.add(botonAtras);
		this.add(botonSiguiente);
		this.add(botonVolver);
	}
	
	// Getters and Setters
	public JButton getBotonAtras() {
		return botonAtras;
	}

	public void setBotonAtras(JButton botonAtras) {
		this.botonAtras = botonAtras;
	}

	public JButton getBotonSiguiente() {
		return botonSiguiente;
	}

	public void setBotonSiguiente(JButton botonSiguiente) {
		this.botonSiguiente = botonSiguiente;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}
	
}
