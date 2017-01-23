package enums;

public class PruebaDias {

	public static void main(String[] args) {
		DiasSemana hoy = DiasSemana.LUNES;
		switch (hoy) {
		case LUNES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("Hay programación");
			break;
		case MARTES:
			System.out.println("Se viene pero sin programación");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("A descansar");
		}

	}

}
