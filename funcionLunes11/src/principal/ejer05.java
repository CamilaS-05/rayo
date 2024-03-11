package principal;

import java.util.Scanner;

public class ejer05 {

	public static String vocal(String letra) {
		Scanner sc = new Scanner(System.in);
		letra = sc.nextLine();
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("La letra introducida es una vocal ");
		} else {
			System.out.println("La letra introducida es una consonante ");
		}
		return letra;

	}

	public static void main(String[] args) {
		//8. Implementa una función en Java para verificar si un carácter es una vocal.

		System.out.println(vocal(""));

	}

}
