package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 4. If-Else: Si un alumno tiene un promedio mayor a 85 y menos de 3 faltas,
		 * imprimir "Excelente rendimiento", de lo contrario, "Rendimiento regular".
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introducir tu promedio  ");
		int promedio = Integer.parseInt(br.readLine());

		System.out.println("Introduce el numero de faltas ");
		int faltas = Integer.parseInt(br.readLine());

		if ((promedio > 85) && (faltas < 3)) {
			System.out.println("Excelente rendimeinto ");

		} else {
			System.out.println("Rendimiento regular ");
		}

	}

}
