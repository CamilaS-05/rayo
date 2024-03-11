package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 2. Sumar Números de un Array: Pide al usuario 3 números, almacénalos en un
		 * array y calcula la suma de estos números, mostrándola en consola.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce 3 números ");
		int[] numeros = new int[3];

		numeros[0] = Integer.parseInt(br.readLine());
		numeros[1] = Integer.parseInt(br.readLine());
		numeros[2] = Integer.parseInt(br.readLine());
		int suma = numeros[0] + numeros[1] + numeros[2];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(suma);
			break;
		}

	}

}
