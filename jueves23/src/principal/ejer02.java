package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Ejercicio 2: División por Cero Crea un programa que pida al usuario dos
		 * números y luego muestre el resultado de su división. Usa try-catch para
		 * manejar cualquier división por cero.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Introduce otro numero ");
		int num2 = Integer.parseInt(br.readLine());

		try {
			double division = num1 / num2;
			System.out.println("El resultado es " + division);

		} catch (Exception e) {
			System.out.println("El segundo numero no puede ser 0 ");
		}

	}

}
