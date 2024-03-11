package viernes24;

public class ejerPrueba {
	public static void main(String[] args) {
		int[] numeros = { 34, 78, 12, 89, 65, 90, 45 };
		int maximo = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = i;
			}
		}

		System.out.println("El número más grande en el arreglo es: " + maximo);
	}
}