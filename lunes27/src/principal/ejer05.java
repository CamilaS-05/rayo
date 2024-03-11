package principal;

public class ejer05 {

	/*
	 * 5.Array de Booleanos: Crea un array de booleanos con 5 elementos,
	 * inicializados de forma predeterminada a false. Escribe un bucle que cambie
	 * cada elemento a true y luego imprime el array para verificar los cambios.
	 */

	public static void main(String[] args) {
		boolean[] booleanos = new boolean[5];
		for (int i = 0; i < booleanos.length; i++) {
			booleanos[i] = true;
		}
		for (int i = 0; i < booleanos.length; i++) {
			System.out.println(booleanos[i]);
		}

	}
}
