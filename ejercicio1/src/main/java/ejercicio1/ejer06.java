package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*Escribe un programa que permita al usuario ingresar una cantidad en dólares estadounidenses utilizando `BufferedReader`.
		 * Luego, convierte esta cantidad a otra moneda (por ejemplo, euros o pesos) utilizando un factor de conversión que definas en el programa. 
		 * Muestra el resultado de la conversión en la consola.*/ 
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int dolar;
		System.out.println("Introduce una cantidad de dolares ");
		dolar= Integer.valueOf(br.readLine());
		System.out.println("La cantidad de dolares ingresado en euros = "  +dolar * 0.94);
	}

}
