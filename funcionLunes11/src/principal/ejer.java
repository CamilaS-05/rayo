package principal;

import java.util.Scanner;

public class ejer  {
	public static void main(String[] args) {
	    long anio;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Ingresa un año: ");
	    anio = sc.nextLong();
	    boolean resultado = esBisiesto(anio);

	    if(resultado){
	     System.out.println("Sí es bisiesto");
	        } else {
	            System.out.println("No es bisiesto");
	        }

	    for (anio = 1900; anio < 3000; anio++) {
	            // La función también se puede usar así:
	            if(esBisiesto(anio)) {
	            }
	        }

	    }
	    public static boolean esBisiesto(long anio){
	        return anio%4 == 0 && (anio % 100 != 0 || anio % 4 == 0);
	    }
	}    
	 


