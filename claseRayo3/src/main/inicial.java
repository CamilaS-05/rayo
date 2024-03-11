package main;

import polimorfismoInterface.entrenador;
import polimorfismoInterface.futbolista;

public class inicial {

	public static void main(String[] args) {
		futbolista rayo = new futbolista(1, "jose manuel", "rayo", 40, 4, "medio");
		entrenador pepe = new entrenador(2, "juan pedro","ruiz", 55, 1);
		rayo.concentrarse();
		rayo.entrenar();
		rayo.jugarPartido();
		rayo.viajar();
	}

}
