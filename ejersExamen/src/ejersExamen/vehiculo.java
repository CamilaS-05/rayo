package ejersExamen;

public abstract class vehiculo {
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	private int kilometrosRecorridos;

	public vehiculo(int kilometrosRecorridos) {
		super();
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public vehiculo() {
		super();
	
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	
}
