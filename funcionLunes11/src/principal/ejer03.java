package principal;

public class ejer03 {
	public static int añoBisiesto(int numero) {
		if ((numero % 4 == 0 && numero % 100 != 0) || (numero % 400 == 0))

		{
			System.out.println(numero + " es bisiesto.");
		} else {
			System.out.println(numero + " no es bisiesto.");
		}
		return numero;
	}

	public static void main(String[] args) {
		// 5. Escribe una función en Java para comprobar si un año es bisiesto.
		System.out.println(añoBisiesto(2023));
	}

}
