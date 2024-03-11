package principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejer01 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1: Captura un Número Entero Escribe un programa en Java que pida al
		 * usuario ingresar un número entero. Utiliza un bloque try-catch para manejar
		 * la posibilidad de que el usuario ingrese un dato no entero.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingresa un numero entero ");
		try {
			int numero = Integer.parseInt(br.readLine());
			System.out.println("El numero introducido es entero " +numero);

		}

		catch (Exception e) {
			System.out.println("El numero introducido no es entero ");
		}

	}

}
