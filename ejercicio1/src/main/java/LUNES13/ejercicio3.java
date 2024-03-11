package LUNES13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Introduce un numero ");
		int numero = Integer.parseInt(br.readLine());
		if (numero == 10) {
			System.out.println("El numero es 10 ");
		}
    br.close();
	}
}
