package ordena2.gui;

import java.awt.Container;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JInternalFrame;

import ordena2.modelo.Dibujable;

@SuppressWarnings("serial")
public class PanelDibujo extends JInternalFrame {

	// Declaración de atributos
	public final static int MOUSEIN = 1;
	public final static int MOUSEOUT = 0;
	private int mouseEntered;
	private ArrayList<Dibujable> dibujos;

	public PanelDibujo() {

		// Opciones del JInternalFrame
		this.setBackground(new java.awt.Color(255, 255, 255));
		this.setClosable(false);
		this.setIconifiable(false);
		this.setMaximizable(false);
		this.setResizable(false);
		this.setVisible(true);
		dibujos = new ArrayList<>();
		
		Container contentPane = getContentPane();
	}
	public int getMouseEntered() {
		return mouseEntered;
	}
	public void setMouseEntered(int mouseEntered) {
		this.mouseEntered = mouseEntered;
	}
	public void addDibujable(Dibujable dibujo){
		dibujos.add(dibujo);
	}
	public void paint(Graphics g) {
		super.paint(g);
		for (Dibujable dibujo : dibujos) {
			dibujo.dibujar(g);
		}
	}
}
