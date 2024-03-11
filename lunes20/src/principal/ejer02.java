package principal;

public class ejer02 {

	public static void main(String[] args) {
		/*
		 * Ejercicio con continue: Crea un programa en Java que utilice un bucle for
		 * para iterar a través de los números del 1 al 10. El programa debe imprimir
		 * todos los números excepto los que son divisibles por 3. Para los números
		 * divisibles por 3, el bucle debe usar continue para saltar la impresión y
		 * pasar al siguiente número.
		 */
		for (int y = 1; y <= 10; y++) {
			if (y % 3 != 0) {
				System.out.println(y);
			}
		}

	}

}
