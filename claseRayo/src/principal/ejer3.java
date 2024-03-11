package principal;

import clases.persona;

public class ejer3 {

	public static void main(String[] args) {
		int a1 = 10, a2 = 10;
		String s1 = "hola", s2 = "hola";
		persona p1 = new persona("aña", 22);
		persona p2 = new persona("aña", 22);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		if (s1.equals(s2)) {
			System.out.println("Somos iguales");

		} else {
			System.out.println("Somos distintos");
		}
	}
}
