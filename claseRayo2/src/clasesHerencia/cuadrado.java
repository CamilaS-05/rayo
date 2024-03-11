package clasesHerencia;

public class cuadrado extends figurasGeometricas {

	public cuadrado(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public double area() {
		return Math.pow(lado1, 2);

	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*lado1;
	}

}
