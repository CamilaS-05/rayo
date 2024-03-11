package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 4. Encontrar el Menor Valor: Pide al usuario 6 números enteros, almacénalos
		 * en un array y encuentra el menor valor, mostrándolo luego en consola.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce 6 números ");
		int num[] = new int[6];
		int menor = 10000;

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if (num[i] < menor) {
				menor = num[i];
			}

		}
		System.out.println("El numero menor es " + menor);
	}
}
