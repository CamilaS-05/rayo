package principal;

import java.util.Scanner;

public class programa {
	static Scanner sc = new Scanner(System.in);

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void rellenar(int matriz[]) {
		for (int i = 0; i < matriz.length; i++)
			matriz[i] = alea(0, 255);
	}

	public static String d_a_b(int numero) {
		String cadena = "";
		while (numero > 0) {
			cadena = String.valueOf(numero % 2) + cadena;
			numero = (int) (numero / 2);
		}
		return cadena;
	}

	public static String d_a_o(int numero) {
		int vector[] = { 0, 1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17 };

		String cadena = "";
		while (numero > 0) {
			cadena = String.valueOf(vector[numero % 8]) + cadena;
			numero = (int) (numero / 8);
		}
		return cadena;
	}

	public static String d_a_h(int numero) {
		String cadenita = "0123456789ABCDEF";
		String cadena = "";
		while (numero > 0) {
			cadena = cadenita.charAt(numero % 16) + cadena;
			numero = (int) (numero / 16);
		}
		return cadena;
	}

	public static void main(String[] args) {
		int tb[] = new int[50];
		rellenar(tb);
		for (int elemento : tb)
			System.out.printf("valor=%5d Binario= %8s\n Hexadecimal =%8s\n",

					elemento, d_a_b(elemento), d_a_h(elemento));

	}
}
