package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matriz = new int[3][3];

		System.out.println("Introduce los numeros ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.println("Escribir valor" + i + "," + j + "=");
				matriz[i][j] = Integer.parseInt(br.readLine());

			}
		}

		System.out.println("Matriz de 3x3 :");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matriz[i][j] + "");

			}
			System.out.println("");
		}

	}
}
