package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer055 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 1. Llenar un Array de Números Enteros: Crea un programa que pida al usuario 5
		 * números enteros y los almacene en un array. Luego, muestra los números
		 * almacenados.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce 5 números ");
		int[] num = new int[5];
		num[0] = Integer.parseInt(br.readLine());
		num[1] = Integer.parseInt(br.readLine());
		num[2] = Integer.parseInt(br.readLine());
		num[3] = Integer.parseInt(br.readLine());
		num[4] = Integer.parseInt(br.readLine());
		for (int n = 0; n <5; n++) {
			System.out.println(num [n]);
		}

	}

}
