package principal;

import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) {
		/* Ejercicio1 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero ");
		int n = sc.nextInt();

		while (n != 0) {
			System.out.println("No es cero. Introduce otro numero ");
			n = sc.nextInt();
		}
		System.out.println("Terminado! ");
		sc.close();
	}

}
