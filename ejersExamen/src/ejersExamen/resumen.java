package ejersExamen;

import java.util.ArrayList;

public class resumen {
	public static void main(String[] args) {
		ArrayList<vehiculo> flota = new ArrayList<vehiculo>();

		flota.add(new coche(1500));
		flota.add(new coche(1300));
		flota.add(new bicicleta(12));
	}
}
