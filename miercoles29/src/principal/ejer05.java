package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer05 {

	public static void main(String[] args) throws IOException {
		/*
		 * 5. Lista de Nombres: Crea un array para almacenar 5 nombres que el usuario
		 * introducirá por consola. Luego, muestra todos los nombres en orden inverso.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce 5 nombres ");
		String[] nombres = new String[5];

		for (int i = 0; i < nombres.length; i++)
			nombres[i] = br.readLine();
		for (int i = 4; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
		br.close();
	}

}
