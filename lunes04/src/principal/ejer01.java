package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Ejercicio 1: Suma de Matrices Objetivo: Escribir un programa que sume dos
		 * matrices de tamaño 3x3.
		 * 
		 * Descripción: 1. Define dos matrices de tamaño 3x3. 2. Crea una tercera matriz
		 * para almacenar el resultado de la suma. 3. Recorre las matrices y suma cada
		 * elemento correspondiente.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matriz1 = new int[3][3];
		System.out.println("Introduce numeros para la primera matriz ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {

				System.out.println("Escribir valor" + i + "," + j + "=");
				matriz1[i][j] = Integer.parseInt(br.readLine());

			}
		}
		System.out.println("Matriz1 de 3x3 :");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matriz1[i][j] + " ");

			}
			System.out.println(" ");
		}

		int[][] matriz2 = new int[3][3];
		System.out.println("Introduce numeros para la segunda matriz ");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {

				System.out.println("Escribir valor" + i + "," + j + "=");
				matriz2[i][j] = Integer.parseInt(br.readLine());

			}
		}
		System.out.println("Matriz2 de 3x3 :");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matriz2[i][j] + " ");

			}
			System.out.println(" ");
		}

		int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				int suma = matriz1[i][j] + matriz2[i][j];
				matrizSuma[i][j] = suma;
			}
		}
System.out.println("La suma de las matrices es ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matrizSuma[i].length; j++) {
				System.out.printf("%5d", matrizSuma[i][j]  );
			}
			System.out.println();
		}
	}

}
