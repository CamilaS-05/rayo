package polimorfismoInterface;

public class entrenador extends seleccionFutbol {
	private int idFederacion;

	public entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		String cadena = "entrenador [idFederacion=" + idFederacion + "]";
		cadena += "\n" + super.toString();
		return cadena;
	}

	@Override
	public void concentrarse() {
		System.out.println("Concentrarse (Clase entrenador).");

	}

	@Override
	public void viajar() {
		System.out.println("Viajar (Clase entrenador).");

	}

	@Override
	public void entrenar() {
		System.out.println("Entrenarse (Clase entrenador).");

	}

	@Override
	public void jugarPartido() {
		System.out.println("Asistir al partido (Clase entrenador).");

	}
}
