package principal;

public class ejerTRES {

	public static void main(String[] args) {
		/*
		 * 3.Array de Números Decimales (Doubles): Declara un array de tipo double que
		 * contenga cinco valores decimales (por ejemplo, 1.1, 2.2, 3.3, 4.4, 5.5).
		 * Utiliza un bucle para sumar todos los elementos del array y luego muestra el
		 * resultado total.
		 */
		double[] decimales = { 1.6, 2.3, 3.8, 4.23, 5.87 };
		double suma = 0;
		int i = 0;
		while (i < decimales.length) {
			suma += decimales[i];
			i++;
		}
		System.out.println("La suma es " + suma);
	}

}
