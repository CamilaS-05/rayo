package ejer_poov;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Uso_Empleado {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Dime tu nombre");
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu sueldo"));
		String año = JOptionPane.showInputDialog("Introduce un año");
		int a = Integer.parseInt(año);
		String mes = JOptionPane.showInputDialog("Introduce un mes");
		int m = Integer.parseInt(mes);
		String día = JOptionPane.showInputDialog("Introduce un día");
		int d = Integer.parseInt(día);
		Empleado empleado = new Empleado(nombre, sueldo, a, m, d);
		JOptionPane.showMessageDialog(null, "Nombre: " + empleado.getNombre() + "\n" + "Sueldo: " + empleado.getSueldo()
				+ "\n" + "Fecha de alta: " + empleado.getAlta_contrato());
	}

}

class Empleado {
	public Empleado(String nom, double sue, int agno, int mes, int día) {
		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, día);

		alta_contrato = calendario.getTime();

	}

	public Empleado(String nombre2, String sueldo2, String año, int a, int m, int d) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getAlta_contrato() {
		return alta_contrato;
	}

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date alta_contrato;

}
