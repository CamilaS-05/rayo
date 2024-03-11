package ejercicio1;

public class map {

public static void cargar (int tb[][]) {
		
	for (int i = 0; i < tb.length; i++) {
		for (int j = 0; j < tb[i].length; j++) {
			tb[i][j] = alea(100, 1000);

		}

	}
}

public static void imprimir(int tb[][], String p[]) {
	int SumaFila, SumaColumnas[] = new int[tb[0].length];
	for (int i = 0; i < tb.length; i++) {
		System.out.printf("%-10s", p[i]);
		SumaFila = 0;
		for (int j = 0; j < tb[i].length; j++) {
			System.out.printf("%5d", tb[i][j]);
			SumaFila += tb[i][j];
			SumaColumnas[j] += tb[i][j];
		}
		System.out.printf("%10d\n", SumaFila);

	}
	/***********************/
	SumaFila = 0;
	System.out.printf("%-10s", "totales");
	for (int i = 0; i < SumaColumnas.length; i++) {

		System.out.printf("%5d", SumaColumnas[i]);
		SumaFila += SumaFila;
	}
	System.out.printf("%10d\n", SumaFila);
	/***********************/
}

public static int alea(int li, int ls) {

	return (int) (Math.random() * (ls - li - 1)) + li;

}

public static void main(String[] args) {

	String pais[] = { "francia", "españa", "argentina", "brasil", "mexico" };
	int matriz[][] = new int[5][10];
	cargar(matriz);
	imprimir(matriz, pais);

}
}


