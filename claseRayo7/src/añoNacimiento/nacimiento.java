package añoNacimiento;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class nacimiento {

	public static LocalDate dia(LocalDate cumple) {
		while (cumple.getDayOfWeek() != DayOfWeek.FRIDAY) {
			cumple = cumple.minusDays(1);
		}
		return cumple;
	}

	public static void main(String[] args) {

	}
}
