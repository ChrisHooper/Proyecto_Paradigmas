package ordena2.modelo;

import java.awt.Graphics;
import java.awt.Point;

public class Flujo implements Dibujable {
	
	private Point inicio;
	private Point fin;
	
	public Flujo(Point inicio, Point fin){
		this.inicio=inicio;
		this.fin=fin;
	}

	public Point getInicio() {
		return inicio;
	}

	public void setInicio(Point inicio) {
		this.inicio = inicio;
	}

	public Point getFin() {
		return fin;
	}

	public void setFin(Point fin) {
		this.fin = fin;
	}

	@Override
	public void dibujar(Graphics g) {
		g.drawLine(inicio.x, inicio.y, fin.x, fin.y);
	}
}
