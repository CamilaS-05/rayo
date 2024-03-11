package tiempo;

public class Tiempo {
	private int segundos;

	public Tiempo(int h, int m, int s) {
		this.segundos = (h * 3600) + (m * 60) + s;
	}

	public Tiempo(int s) {
		this.segundos = s;
	}

	public int getsegundos() {
		return segundos;

	}

	public void setsegundos(int Segundos) {
		segundos = Segundos;
	}

	public Tiempo suma(Tiempo t) {
		return new Tiempo(this.segundos + t.getsegundos());
	}

	public Tiempo resta(Tiempo t) {
		return new Tiempo(this.segundos - t.getsegundos());
	}

	@Override
	public String toString() {
		int h = (int) (this.segundos / 3600);
		int s = this.segundos % 3600;
		int m = (int) (s / 60);
		s = s % 60;
		return String.format("Horas = %d Minutos=%d Segundos = %d", h, m, s);
	}

}
