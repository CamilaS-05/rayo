package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 3. If-Else: Si un número es divisible por 4 pero no por 100, o es divisible
		 * por 400, imprimir que es un año bisiesto.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero ");
		int numero = Integer.parseInt(br.readLine());
		if ((numero % 4 == 0 && numero % 100 != 0) || (numero % 400 == 0)) {
			System.out.println("Es año bisiesto ");

		} else {
			System.out.println("Año no bisiesto ");
		}

	}

}
