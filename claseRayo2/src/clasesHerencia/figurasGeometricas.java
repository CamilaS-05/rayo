package clasesHerencia;

public abstract class figurasGeometricas {
	protected double lado1;

	public figurasGeometricas(double lado1) {
		super();
		this.lado1 = lado1;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public abstract double area();
	public abstract double perimetro();

	@Override
	public String toString() {
		return "figurasGeometricas [lado1=" + lado1 + "]";
	}

}
