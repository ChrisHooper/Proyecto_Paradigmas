package ordena2.gui;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class VentanaBienvenida extends FVentanaPequeña {

	//Declaración de atributos
	private JLabel fondo;
	private JButton botonTutorial;
	private JButton botonJugar;
	private JButton botonInfo;
	private JButton botonAcerca;
	
	
	public VentanaBienvenida() {
		super("Bienvenidos a Ordena2!");
		this.setVisible(true);

		// Obteniendo Container del JFrame
		Container contentpane = getContentPane();
		fondo = new JLabel(new ImageIcon(this.getClass().getResource(
				"/img/fondoSeleccion.png")));

		// Inicialización de Botones	
		
		botonTutorial = new JButton("Tutorial");
		botonTutorial.setBounds(75, 334, 106, 36);
		botonJugar = new JButton("Jugar");
		botonJugar.setBounds(270, 334, 106, 36);
		botonInfo = new JButton("Info");
		botonInfo.setBounds(244, 402, 90, 30);
		botonAcerca = new JButton("Acerca");
		botonAcerca.setBounds(346, 402, 90, 30);
		
		// Añadiendo los botones al Frame
		contentpane.add(botonTutorial);
		contentpane.add(botonJugar);
		contentpane.add(botonInfo);
		contentpane.add(botonAcerca);
		contentpane.add(fondo);
		
	}
	
	// Métodos set y get de los atributos
	
	public JButton getBotonTutorial() {
		return botonTutorial;
	}

	public void setBotonTutorial(JButton botonTutorial) {
		this.botonTutorial = botonTutorial;
	}

	public JButton getBotonJugar() {
		return botonJugar;
	}

	public void setBotonJugar(JButton botonJugar) {
		this.botonJugar = botonJugar;
	}

	public JButton getBotonInfo() {
		return botonInfo;
	}

	public void setBotonInfo(JButton botonInfo) {
		this.botonInfo = botonInfo;
	}

	public JButton getBotonAcerca() {
		return botonAcerca;
	}

	public void setBotonAcerca(JButton botonAcerca) {
		this.botonAcerca = botonAcerca;
	}

	
}