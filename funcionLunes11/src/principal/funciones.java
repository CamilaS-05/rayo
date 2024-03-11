package principal;

public class funciones {
	public static int numeroNegativo(int numero) {

		if (numero < 0) {
			System.out.println("Numero negativo");
		} else {
			System.out.println("Numero positivo");
		}
		return numero;

	}

	// 3. Desarrolla una función en Java para verificar si un número es negativo.
	public static void main(String[] args) {

		System.out.println(numeroNegativo(-1));

	}

}
