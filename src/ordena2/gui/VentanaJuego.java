package ordena2.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class VentanaJuego extends JFrame {
	
	//Declaración de atributos
	private PanelBanner panelNorte;
	private PanelCentro panelCentro;
	private PanelControl panelControl;
	private Container contentpane;
	
	public VentanaJuego() {
		
		//Opciones de Jframe
		this.setJMenuBar(new BarraMenu());
		this.setTitle("Ordena2 - Juego Educativo");
		this.setBounds(0, 0, 805, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Inicialización de atributos
		contentpane = getContentPane();
		contentpane.setLayout(new BorderLayout());
		panelNorte = new PanelBanner();
		panelCentro = new PanelCentro();
		panelControl = new PanelControl();
		
		//Añadiendo Componentes al contentpane (panel)
		contentpane.add(panelNorte, BorderLayout.NORTH);
		contentpane.add(panelCentro, BorderLayout.CENTER);
		contentpane.add(panelControl, BorderLayout.PAGE_END);
	}

	public PanelCentro getPanelCentro() {
		return panelCentro;
	}

	public void setPanelCentro(PanelCentro panelCentro) {
		this.panelCentro = panelCentro;
	}

	public PanelControl getPanelControl() {
		return panelControl;
	}

	public void setPanelControl(PanelControl panelControl) {
		this.panelControl = panelControl;
	}
}