package principal;

import java.util.ArrayList;

import clases.persona;

public class ejer4 {
	public static void main(String[] args) {
		ArrayList<persona> lista = new ArrayList<persona>();
		
		persona p1= new persona ("maria", 50);
		lista.add(new persona("ana", 20));
		lista.add(p1);
		lista.add(new persona("ines", 33));
		lista.add(new persona("andres", 33));

		lista.remove(new persona("maria", 50));
		
		for (persona p : lista)System.out.println(p);
	}
}
