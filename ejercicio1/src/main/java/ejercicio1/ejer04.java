package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer04 {

	public static void main(String[] args) throws IOException {
		/* En este ejercicio, debes escribir un programa que use `BufferedReader` para leer el nombre del usuario desde la entrada estándar 
		 * (teclado) y luego imprima un saludo personalizado en la consola con el nombre proporcionado. */

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Introduce un nombre ");
		String nombre = br.readLine();
		System.out.println("Hola " +nombre);
	
	}

}