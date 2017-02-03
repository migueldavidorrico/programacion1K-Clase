package multimedia;

public class Duracion {

	public static final String SEPARADOR_HORARIO = ":";

	int horas;
	int minutos;
	int segundos;

	public Duracion(int horas, int minutos, int segundos) {
		int segundosReales = segundos % 60;
		int minutosReales = (minutos + segundos / 60) % 60;
		int horasReales = horas + (minutos + segundos / 60) / 60;

		this.horas = horasReales;
		this.minutos = minutosReales;
		this.segundos = segundosReales;

	}

	public Duracion(int minutos, int segundos) {
		this(0, minutos, segundos);
	}

	public Duracion(int segundos) {
		this(0, 0, segundos);
	}

	// public Duracion(String duracion) {
	// String[] separados = duracion.split(SEPARADOR_HORARIO);
	// switch (separados.length) {
	// case 1:
	// this(0, 0, Integer.valueOf(separados[0]));
	// }
	//
	// }

	@Override
	public String toString() {
		return horas + SEPARADOR_HORARIO + minutos + SEPARADOR_HORARIO + segundos;
	}

	public static void main(String[] args) {
		Duracion corta = new Duracion(2, 760);
		System.out.println(corta);

	}

}
