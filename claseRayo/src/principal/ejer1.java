package principal;

import clases.utiles;

public class ejer1 {

	public static void main(String[] args) {
		utiles ul= new utiles();

		System.out.println(utiles.redondear(145.678, 2));
		System.out.println(utiles.redondear(145.4567878, 4));
		System.out.println(utiles.truncar(145.678, 2));
		System.out.println(utiles.truncar(145.4567878, 4));
	}
}
