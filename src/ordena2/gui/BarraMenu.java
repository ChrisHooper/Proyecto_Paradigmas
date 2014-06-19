package ordena2.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar {

	// Declaraci�n de atributos
	private JMenu menuArchivo;
	private JMenuItem menuNuevo;
	private JMenu menuOrdenar;
	private JMenuItem menuMayor;
	private JMenuItem menuMenor;

	public BarraMenu() {

		// Opciones de JMenuBar

		// Inicializaci�n de atributos
		menuArchivo = new JMenu("Archivo");
		menuNuevo = new JMenuItem("Nuevo");
		menuOrdenar = new JMenu("Orden");
		menuMayor = new JMenuItem("Ordenar Mayor a Menor");
		menuMenor = new JMenuItem("Ordenar Menor a Mayor");

		// A�adiendo Componentes
		menuArchivo.add(menuNuevo);

		menuOrdenar.add(menuMayor);
		menuOrdenar.add(menuMenor);

		this.add(menuArchivo);
		this.add(menuOrdenar);
	}
}
