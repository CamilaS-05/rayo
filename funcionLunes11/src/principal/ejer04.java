package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer04 {
	public static int digitos(String numero) throws IOException {
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		numero = br.readLine();
		return numero.length();
 
		}
		

	public static void main(String[] args) throws IOException {
		// 6. Crea una función en Java para contar el número de dígitos en un entero.
		System.out.println(digitos("a"));
	}

}
