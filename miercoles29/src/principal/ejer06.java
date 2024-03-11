package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 6. Tabla de Multiplicar: Pide al usuario un número entero y muestra la tabla
		 * de multiplicar de ese número (hasta el 10) utilizando un array.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero del 1 al 10 ");
		int[] numero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < numero.length; i++) {
			int multi = numero[i] * num;

			System.out.println(num + "*" + numero[i] + "=" + multi);

		}

	}

}
