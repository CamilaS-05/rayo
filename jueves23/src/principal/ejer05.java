package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Ejercicio 5: Múltiples Capturas Crea un programa que pida al usuario ingresar
		 * dos números enteros y luego calcule y muestre su suma. Implementa múltiples
		 * bloques catch para manejar diferentes tipos de excepciones que pueden
		 * ocurrir.
		 */
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero ");
		int numero1 = Integer.parseInt(br.readLine());
		System.out.println("Introduce el segundo numero ");
		int numero2 = Integer.parseInt(br.readLine());

		
			int suma = numero1 + numero2;
			System.out.println("El resultado de la suma es " + suma);

		} catch (NumberFormatException e) {
			System.out.println("Error, el numero introducido es incorrecto ");

		} catch (Exception e) {
			System.out.println("Error, el numero introducido es incorrecto ");
		}
	}

}