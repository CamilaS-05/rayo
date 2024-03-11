package clases;

public class utiles {
	public static double redondear(double numero, int ndecimales) {
		// 145.678,2
		// 156.678*100---> 14567.8
		// math.round(14567.8)----14568
		// 145678/100

		double potencia = Math.pow(10, ndecimales);
		return Math.round(numero * potencia) / potencia;

	}

	public static double truncar(double numero, int ndecimales) {
		double potencia = Math.pow(10, ndecimales);
		return ((int) (numero * potencia)) / potencia;
	}

}
