package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 3. Promedio de Notas: Escribe un programa que pida al usuario 4 notas
		 * (valores decimales) y calcule el promedio de estas.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe cuatro notas ");
		double num[] = new double[4];
		num[0] = Double.parseDouble(br.readLine());
		num[1] = Double.parseDouble(br.readLine());
		num[2] = Double.parseDouble(br.readLine());
		num[3] = Double.parseDouble(br.readLine());
		double promedio = (num[0] + num[1] + num[2] + num[3]) / 4;
		System.out.println(promedio);

	}

}
