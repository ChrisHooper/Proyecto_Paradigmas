/*--------------------------------------------------------------------*/
/* Nombre .		Ordena2.java -----------------------------------------*/
/* Objetivo .	Crear un juego educativo para un ni�o de 12 a�os,-----*/
/* 				realcionado con redes de ordenamiento-----------------*/
/* Versi�n . 	1� Semestre, A�o 2014 --------------------------------*/
/* Integrantes. Basthian Matthews - Emilio Ya�ez - Wladimir Rodriguez-*/
/* 				Nicolas Oyarce - Christofher Hooper ------------------*/
/*--------------------------------------------------------------------*/

package ordena2.main;

import ordena2.eventos.ControladorEventos;
import ordena2.gui.Interfaz;

public class Main {

	public static void main(String[] args) {
		Interfaz interfaz = new Interfaz();
		@SuppressWarnings("unused")
		ControladorEventos control = new ControladorEventos(interfaz);
	}
}