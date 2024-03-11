package ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicioBisiestoNobisiesto {

	public static void multi(double a) {

		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %5.2f", a * i);

		}
	}

	/****************************************************************/
	public static void parimpar (int a) {
		if (a%2==0) {
			System.out.println(a+ " es par");
		}else{
			System.out.println(a+ " es impar");
		}
	
	/****************************************************************/

	if((vanno%4==0&&vanno%100!=0)||(vanno%400==0))

	{
		System.out.println(vanno + " es bisiesto.");
	}else{
		System.out.println(vanno + " no es bisiesto.");
	}
}

	/***************************************************************/
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dime el año ");
		int anno = Integer.valueOf(sc.readLine());
		
		bisiesto(anno);
		bisiesto(1995);
		bisiesto(2000);
		
		parimpar(1995);
		parimpar(anno);
		parimpar(7777);
		
		System.out.println(" Dime un numero");
		double num=Double.valueOf(sc.readLine());
		multi(num);
		
	
			
		}

}}
