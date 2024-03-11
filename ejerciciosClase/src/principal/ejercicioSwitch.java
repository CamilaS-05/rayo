package principal;

import java.util.Scanner;

public class ejercicioSwitch {

	public static void main(String[] args) {
		/*
		 * Vamos a crear un menú por consola para visualizar los resultados de diversos
		 * partidos de futbol. El menú que se mostrara al usuario al arrancar el
		 * programa será este: Opcion 1. Real Madrid – Barcelona Opcion 2. Betis –
		 * Sevilla Opcion 3. Atletico de Madrid – Celta Opcion 4. Salir El
		 * funcionamiento del programa será el siguiente: Tras mostrar el menú, hay que
		 * pedir al usuario que introduzca una opción (en número), capturamos esa opción
		 * mediante la clase Scanner y comparamos, dependiendo de la opción del usuario
		 * mostraremos un resultado u otro. El programa debe seguir funcionando hasta
		 * que el usuario introduzca un 4, que es la opción salir.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Opción 1. Real Madrid – Barcelona");
		System.out.println("Opcion 2. Betis – Sevilla");
		System.out.println("Opcion 3. Atletico de Madrid – Celta");
		System.out.println("Opcion 4. Salir");
		System.out.println("Introduce una opción ");
		int n = sc.nextInt();

		switch (n) {
		case (1):
			System.out.println("Opción 1. Real Madrid – Barcelona");
			n = sc.nextInt();
			
		case (2):
			System.out.println("Opcion 2. Betis – Sevilla");
			n = sc.nextInt();
		case (3):
			System.out.println("Opcion 3. Atletico de Madrid – Celta");
			n = sc.nextInt();
		case (4):
			System.out.println("Opcion 4. Salir");

		}
		sc.close();
	}
}
