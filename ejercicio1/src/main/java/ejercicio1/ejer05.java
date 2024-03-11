package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*Crea un programa que solicite al usuario que ingrese dos números enteros usando `BufferedReader`.
		 *Luego, suma estos dos números y muestra el resultado en la consola.*/ 
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int numero1; 
		int numero2;
		int suma;
		System.out.println("Introduce un numero ");
		numero1 = Integer.valueOf(br.readLine());
		System.out.println("Introduce otro numero ");
		numero2 = Integer.valueOf(br.readLine());
		suma = numero1 + numero2;
		   
	    System.out.println("El resultado = "  +numero1 + "+" +numero2+ "=" +suma);
	}

}
