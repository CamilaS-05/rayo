package principal;

public class ejer02 {

	public static void main(String[] args) {
		/*
		 * 2.Array de Cadenas de Texto (Strings): Crea un array de Strings que contenga
		 * los nombres de cinco ciudades. Posteriormente, utiliza un bucle para imprimir
		 * cada ciudad en una línea separada.
		 */
		String[] cadenas = { "Madrid", "Barcelona", "Segovia", "Fuenlabrada", "Alcorcón" };
		int i = 0;
		while (i < cadenas.length) {
			System.out.println(cadenas[i]);
			i++;
		}

	}

}
