package ordena2.modelo;

import java.awt.Graphics;
import java.awt.Point;

public class Nodo implements Dibujable{

	private Point centro;
	private final static int DIAMETRO=30;
	
	
	public Nodo(Point centro){
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
		g.drawOval(centro.x, centro.y, DIAMETRO, DIAMETRO);
	}
}