package Principal;

import java.util.ArrayList;

import clasesHerencia.circulo;
import clasesHerencia.cuadrado;
import clasesHerencia.figurasGeometricas;
import clasesHerencia.rectangulo;

public class ejer2 {
	public static void main(String[] args) {
		ArrayList<figurasGeometricas> lista = new ArrayList<figurasGeometricas>();
		lista.add(new cuadrado(10));
		lista.add(new cuadrado(11));
		lista.add(new cuadrado(102));
		lista.add(new cuadrado(103));
		lista.add(new cuadrado(104));

		lista.add(new rectangulo(10, 20));
		lista.add(new rectangulo(10, 21));
		lista.add(new rectangulo(10, 22));
		lista.add(new rectangulo(10, 23));
		
		lista.add(new circulo(5));
		lista.add(new circulo(5));
		lista.add(new circulo(5));

		for (figurasGeometricas f : lista)
			System.out.printf(" area = %.2f perimetro = %.2f %s\n", f.area(), f.perimetro(), f);

	}
}
