package LUNES13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Introduce una temperatura ");
		int temperatura = Integer.parseInt(br.readLine());
		if (temperatura <0){
			System.out.println("Temperatura bajo cero");
		}

	}

}
