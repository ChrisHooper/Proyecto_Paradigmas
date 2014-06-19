/*--------------------------------------------------------------------*/
/* Nombre .		Ordena2.java -----------------------------------------*/
/* Objetivo .	Crear un juego educativo para un niño de 12 años,-----*/
/* 				realcionado con redes de ordenamiento-----------------*/
/* Versión . 	1° Semestre, Año 2014 --------------------------------*/
/* Integrantes. Basthian Matthews - Emilio Yañez - Wladimir Rodriguez-*/
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