package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJER03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Ejercicio 3: Conversión de Tipo Escribe un programa que pida al usuario
		 * ingresar un número decimal (tipo double) y luego intente convertirlo a
		 * entero. Maneja cualquier error de formato con try-catch.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Introduzca un numero decimal ");
			double decimal = Double.parseDouble(br.readLine());
			int numero = (int) decimal;
			System.out.println("El numero entero es " + numero);
		} catch (Exception e) {
			System.out.println("El numero introducido no es correcto ");
		}
	}

}
