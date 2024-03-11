package clases;

import java.util.Objects;

public class persona {

	private String Nombre;
	private int Edad;

	public persona(String nombre, int edad) {
		super();
		Nombre = nombre;
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	@Override
	public String toString() {
		return "persona [Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}

}
