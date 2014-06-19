package ordena2.gui;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class VentanaAcerca extends FVentanaPequeña{
	
	// Declaración de atributos
	private JLabel fondo;
	private JButton botonAceptar;
	
	public VentanaAcerca(){
		super("Acerca de nosotros");
		
		//Obteniendo container de la ventana
		Container contentpane = getContentPane();
		
		// Inicialización de atributos
		fondo = new JLabel(new ImageIcon(this.getClass().getResource("/img/fondoAcerca.png")));	
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
