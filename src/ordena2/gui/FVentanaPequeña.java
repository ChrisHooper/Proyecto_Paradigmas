package ordena2.gui;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class FVentanaPequeña extends JFrame {
	public FVentanaPequeña(String titulo){
		
		//Seteando valores por defecto
		setTitle("titulo");
		setBounds(0, 0, 450, 460);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
