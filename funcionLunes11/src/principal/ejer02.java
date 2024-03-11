package principal;

public class ejer02 {
	public static int menores(int numero1, int numero2) {
		if (numero1 < numero2) {
			System.out.println(numero1 + " Es menor que " + numero2);

		} else {
			System.out.println(numero2 + " Es menor que " + numero1);
		}
		return numero1;
	}

	public static void main(String[] args) {
		// 4. Implementa una función en Java que encuentre el menor de dos números

		System.out.println(menores(9, 4));
	}

}
