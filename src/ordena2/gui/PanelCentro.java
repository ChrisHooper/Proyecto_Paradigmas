package ordena2.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import ordena2.modelo.Dibujable;


@SuppressWarnings("serial")
public class PanelCentro extends JPanel {

	// Declaración de atributos
	private Ordena2ToolBar ordena2ToolBar;
	private PanelDibujo panelDibujo;
	private Dibujable dibujoTemporal;
	
	public PanelCentro() {

		// Opciones del panel
		this.setBackground(new Color(161, 188, 49));
		this.setLayout(new BorderLayout());

		// Inicialización de atributos
		ordena2ToolBar = new Ordena2ToolBar();
		panelDibujo = new PanelDibujo();

		// Añadiendo Componentes al panel
		this.add(panelDibujo, BorderLayout.CENTER);
		this.add(ordena2ToolBar, BorderLayout.LINE_START);
	}
	
	//Getters and Setters
	public Ordena2ToolBar getOrdena2ToolBar() {
		return ordena2ToolBar;
	}

	public void setOrdena2ToolBar(Ordena2ToolBar ordena2ToolBar) {
		this.ordena2ToolBar = ordena2ToolBar;
	}

	public PanelDibujo getPanelDibujo() {
		return panelDibujo;
	}
	
	
	
	
	public Dibujable getDibujoTemporal() {
		return dibujoTemporal;
	}

	public void setDibujoTemporal(Dibujable dibujoTemporal) {
		this.dibujoTemporal = dibujoTemporal;
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (dibujoTemporal!=null){
		this.dibujoTemporal.dibujar(g);
		}
	}
}
