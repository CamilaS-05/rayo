package LUNES13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJERCICIO1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Introduce un numero");
		int edad = Integer.parseInt(br.readLine());
		if (edad >= 18) {
		System.out.println("Mayor de edad");
		}

	}

}
