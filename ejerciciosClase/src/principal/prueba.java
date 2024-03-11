package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* If: Si un número es primo, imprimir "Es primo". */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero del 1 al 10 ");
		int numero = Integer.parseInt(br.readLine());
		if (numero == 2 && numero == 3 && numero == 5 && numero == 7) {
			System.out.println("El numero es primo ");
		}else {
			System.out.println("No es primo ");
		}
		br.close();
	}

}