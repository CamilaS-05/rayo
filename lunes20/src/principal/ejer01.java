package principal;

public class ejer01 {

	public static void main(String[] args) {
		/*
		 * Ejercicio con break: Escribe un programa en Java que comience a contar desde
		 * 1 hacia arriba indefinidamente. Sin embargo, si encuentra un número que sea
		 * múltiplo de 7, debe detenerse utilizando break. El programa debe imprimir
		 * cada número a medida que cuenta.
		 */
		int contador = 1;
		while (true) {

			if (contador % 7 == 0) {
				break;
			}
			System.out.println(contador);
			contador++;
		}
	}
}
