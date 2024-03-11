package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1.Programa de Evaluación de Número: Escribe un programa que solicite un
		// número al usuario a través de la consola. Si el número es menor o igual a 20,
		// imprime "El número es 20 o menor". Si es mayor que 20, imprime "El número es
		// mayor que 20".

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		System.out.println("Introduce un número ");
		 num=Integer.parseInt(br.readLine());
		if(num<=20) {
			System.out.println("El número es menor que 20 ");
		}else {
			System.out.println("El número es mayor que 20 ");
		}

	}

}
