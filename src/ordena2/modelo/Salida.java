package ordena2.modelo;

import java.awt.Graphics;
import java.awt.Point;

public class Salida implements Dibujable {
		
	private Point centro;
	private final static int ANCHO=50;
	private final static int ALTO=50;
	
	public Salida(Point centro){
		this.centro=centro;
	}

	public Point getCentro() {
		return centro;
	}

	public void setCentro(Point centro) {
		this.centro = centro;
	}

	@Override
	public void dibujar(Graphics g) {
		g.drawRect(centro.x, centro.y, ANCHO, ALTO);
	}
}
