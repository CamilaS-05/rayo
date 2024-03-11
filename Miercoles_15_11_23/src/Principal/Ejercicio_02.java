package Principal;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		/*Para una variable `mes`, imprime "Inicio de año" si es "enero", "Mitad de año" 
		 si es "junio" o "julio", y "Fin de año" si es "diciembre". En cualquier otro 
		 caso, imprime "Mes del año".*/
		
		String mes = "marzo";
		switch(mes) {
			case "enero":
				System.out.println("Incio de año");
				break;
				
			case "junio" , "julio":
				System.out.println("Mitad de año");
				break;
				
			case "diciembre":
				System.out.println("Fin de año");
				break;
				
			default:
				System.out.println("Mes del año");
		}

	}

}
