package ordena2.gui;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class VentanaInformacion extends FVentanaPequeña{

	// Declaración de atributos
	private JLabel fondo;
	private JButton botonAceptar;
	
	public VentanaInformacion(){
		super("Informacion");
		Container contentpane = getContentPane();
		
		fondo = new JLabel(new ImageIcon(this.getClass().getResource("/img/fondoInfo.png")));	
		botonAceptar =new JButton ("Aceptar");
		botonAceptar.setBounds(150,390,140,25);
		
		contentpane.add(botonAceptar);
		contentpane.add(fondo);

	}

	public JButton getBotonAceptar() {
		return botonAceptar;
	}

	public void setBotonAceptar(JButton botonAceptar) {
		this.botonAceptar = botonAceptar;
	}

}
