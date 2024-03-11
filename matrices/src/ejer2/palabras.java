package ejer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class palabras {
	final static String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static String palabra() {
		String p = "";
		int n = alea(3, 10);
		for (int i = 1; i <= n; i++)
			p += cadena.charAt(alea(0, cadena.length() - 1));
		return p;
	}

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();

		for (int i = 1; i <= 25; i++)
			palabras.add(palabra());

		//
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(palabras, comparador);

		for (String l : palabras)
			System.out.println(1);
	}

}
