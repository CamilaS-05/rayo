package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer03 {

	public static void main(String[] args) throws IOException {
		// 3.Acumulador de Números hasta Cero: Escribe un programa que pida números
		// indefinidamente hasta que el usuario introduzca un -1. Cuando esto suceda, el
		// programa deberá mostrar la suma de todos los números introducidos, excluyendo
		// el -1.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numero = 0;
		int suma = 0;
		System.out.println("Introduce un número ");
		while (numero != -1) {
			numero = br.read();
			suma += numero;
		}
		System.out.println("La suma es "+suma);

	}

}
