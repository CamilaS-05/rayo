package Principal;

import clases.libro;

public class ejer1 {
	public static void main(String[] args) {
		libro l1 = new libro("111", "rey perez", 2000);
		System.out.println(l1.getNumero());

		libro l2 = new libro("222", "rey perez", 2022);
		System.out.println(l1.getNumero());
		System.out.println(l2.getNumero());

		libro l3 = new libro("333", "rey perez", 2022);
		System.out.println(l1.getNumero());
		System.out.println(l2.getNumero());
		System.out.println(l3.getNumero());
	}
}
