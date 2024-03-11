package principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejer04 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4: Captura de Cadena Desarrolla un programa que solicite al usuario
		 * ingresar una cadena de texto. Usa un bloque try-catch para manejar cualquier
		 * error de entrada.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingresa una cadena de texto ");
			String texto = br.readLine();
			System.out.println("El texto es " + texto);

		} catch (Exception e) {
			System.out.println("Error ");

		}

	}

}
