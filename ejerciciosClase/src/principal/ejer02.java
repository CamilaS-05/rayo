package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * If-Else: Si la velocidad de un vehículo es mayor que 60 km/h, imprimir
		 * "Exceso de velocidad", de lo contrario, "Velocidad normal".
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero ");
		int numero;
		numero = Integer.parseInt(br.readLine());

		if (numero > 60) {
			System.out.println("Exceso de velocidad ");

		} else {
			System.out.println("Velocidad normal ");
		}
		br.close();
	}

}
