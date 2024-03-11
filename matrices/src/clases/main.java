package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
	public static void main(String[] args) {
		ArrayList<persona> lista = new ArrayList<persona>();

		lista.add(new persona("Pepe", 28));
		lista.add(new persona("Juan", 32));
		lista.add(new persona("Paco", 40));
		lista.add(new persona("Lola", 20));
		lista.add(new persona("Jose", 28));
		lista.add(new persona("Dani", 24));
		lista.add(new persona("Sara", 36));
		lista.add(new persona("Susi", 24));

		Collections.sort(lista, new ordenar(1));

		for (persona p : lista)
			System.out.println(p);
	}
}

class ordenar implements Comparator<persona> {
	private int caso = 1;

	public ordenar(int caso) {
		this.caso = caso;
	}

	@Override
	public int compare(persona p1, persona p2) {
		int n;
		switch (this.caso) {
		case 1:
			n = (int) Math.signum(p1.getEdad() - p2.getEdad());
			if (n == 0) {
				return p1.getNombre().compareTo(p2.getNombre());
			} else {
				return n;
			}
		case 2:
			return (int) Math.signum(p2.getEdad() - p1.getEdad());
		case 3:
			return p2.getNombre().compareTo(p1.getNombre());
		}
		return p1.getNombre().compareTo(p2.getNombre());
	}

}