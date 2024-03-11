package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Saludar, despedir o animar");
		String opcion= br.readLine();
		switch(opcion){
		    case "saludar":
		        System.out.println("Hola !");
		        break;

		    case "despedir":
		        System.out.println("Adios !");
		        break;

		    case "animar":
		        System.out.println("Ánimos !");
		        break;

		    default:
		        System.out.println("mensaje por defecto");
		}
	}

}
