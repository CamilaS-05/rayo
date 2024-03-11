package Principal;

public class Ejercicio_01 {

	public static void main(String[] args) {

		/*Dada una variable `dia` que contiene un día de la semana 
		 * (por ejemplo, "lunes"), utiliza un `switch` para imprimir 
		 * el número del día (1 para lunes, 2 para martes, etc.).*/
		
		String dia = "sabado";
		switch(dia) {
			case "lunes":
				System.out.println("1");
				break;
				
			case "martes":
				System.out.println("2");
				break;
				
			case "miercoles":
				System.out.println("3");
				break;
				
			case "jueves":
				System.out.println("4");
				break;
				
			case "viernes":
				System.out.println("5");
				break;
				
			case "sabado":
				System.out.println("6");
				break;
				
			case "domingo":
				System.out.println("7");
				break;
				
			default:
				System.out.println("Error, dia no valido");
		}
	}

}
