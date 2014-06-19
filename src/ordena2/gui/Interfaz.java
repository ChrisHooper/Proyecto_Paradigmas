package ordena2.gui;


public class Interfaz {
	
	// Declaración de atributos
	private VentanaBienvenida ventanaBienvenida;
	private VentanaAcerca ventanaAcerca;
	private VentanaInformacion ventanaInformacion;
	private VentanaJuego ventanaJuego;
	
	public Interfaz(){
		// Inicialización de atributos
		ventanaBienvenida = new VentanaBienvenida();
		ventanaBienvenida.setVisible(true);
		ventanaAcerca=new VentanaAcerca();
		ventanaAcerca.setVisible(false);
		ventanaInformacion=new VentanaInformacion();
		ventanaInformacion.setVisible(false);
		ventanaJuego=new VentanaJuego();
		ventanaJuego.setVisible(false);
	}

	// Getter and setters
	public VentanaBienvenida getVentanaBienvenida() {
		return ventanaBienvenida;
	}

	public void setVentanaBienvenida(VentanaBienvenida ventanaBienvenida) {
		this.ventanaBienvenida = ventanaBienvenida;
	}

	public VentanaAcerca getVentanaAcerca() {
		return ventanaAcerca;
	}

	public void setVentanaAcerca(VentanaAcerca ventanaAcerca) {
		this.ventanaAcerca = ventanaAcerca;
	}

	public VentanaInformacion getVentanaInformacion() {
		return ventanaInformacion;
	}

	public void setVentanaInformacion(VentanaInformacion ventanaInformacion) {
		this.ventanaInformacion = ventanaInformacion;
	}

	public VentanaJuego getVentanaJuego() {
		return ventanaJuego;
	}

	public void setVentanaJuego(VentanaJuego ventanaJuego) {
		this.ventanaJuego = ventanaJuego;
	}	
}

