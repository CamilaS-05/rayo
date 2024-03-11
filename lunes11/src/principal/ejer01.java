package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 1. Define una matriz de tamaño 4x4. 2. Crea una nueva matriz para almacenar
		 * la transpuesta. 3. Intercambia los elementos de las filas por los de las
		 * columnas.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matriz = new int[4][4];
		System.out.println("Introduce numeros para la matriz ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Escribir valor" + i + "," + j + "=");
				matriz[i][j] = Integer.parseInt(br.readLine());
			}
		}

		System.out.println("Matriz1 de 4x4:");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}

		int[][] traspuesta = new int[4][4];

		for (int i = 0; i < traspuesta.length; i++) {
			for (int j = 0; j < traspuesta.length; j++) {
				matriz[i][j] = matriz[j][i];
			}
		}
		System.out.println("Traspuesta: ");
		System.out.println(traspuesta);

	}

}
