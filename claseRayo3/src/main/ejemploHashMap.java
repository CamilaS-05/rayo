package main;

import java.util.Map.Entry;
import java.util.HashMap;

public class ejemploHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> lista = new HashMap<String, Integer>();

		lista.put("peras", 10);
		lista.put("manzanas", 11);
		lista.put("melocotones", 12);
		lista.put("kiwis", 13);

		lista.put("melocotones", 15);

		lista.remove("peras");
		lista.remove("uvas");

		if (lista.containsKey("manzanas")) {
			System.out.println("existen las manzanas");
		} else {
			System.out.println("no existen las manzanas");
			
		}

		for (String key : lista.keySet())
			System.out.println(key + " " + lista.get(key));

		for (Integer valor : lista.values())
			System.out.println(valor);

		for (Entry<String, Integer> elemento : lista.entrySet())
			System.out.println(elemento.getKey() + " " + elemento.getValue());
		
		System.out.println("nº de elementos es"+lista.size());
	}

}
