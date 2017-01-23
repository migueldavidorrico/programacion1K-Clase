package herencia2;

public class ListadoPersonas {
	public static final int MAXIMO_PERSONAS = 20;

	Persona[] lista;
	int numeroPersonas;

	ListadoPersonas() {
		this.lista = new Persona[MAXIMO_PERSONAS];
		this.numeroPersonas = 0;
	}

	public void anyadePersona(Persona p) {
		this.lista[this.numeroPersonas++] = p;
	}

	public String listadoTelefonico() {
		String cadena = "LISTADO DE TELÉFONOS DE LAS PERSONAS\n";
		for (int i = 0; i < this.numeroPersonas; i++) {
			cadena += this.lista[i].devuelveDatos();
			cadena += "\n";
		}
		return cadena;
	}

	public void diaDeCobro() {
		for (int i = 0; i < this.numeroPersonas; i++) {
			Persona p = this.lista[i];
			if (p instanceof Pagable) {
				((Pagable) p).pagar();
			}
		}
	}

	public String buscarPorNombre(String nombre) {
		String salida = "";
		for (int i = 0; i < this.numeroPersonas; i++) {
			Persona personaActual = this.lista[i];
			if (personaActual.getNombre().equals(nombre)) {
				salida += personaActual.devuelveDatos();
				salida += "\n" + personaActual.toString();
				return salida;
			}
		}
		return "No encontrado";
	}

	public String listadoGeneral() {
		String salida = "";
		for (int i = 0; i < this.numeroPersonas; i++) {
			salida += (i + 1) + " - " + this.lista[i] + "\n";
		}
		return salida;
	}

	public void rellenaInicial() {
		this.anyadePersona(new Profesor("Ana", 32, "666111000", "C/ Mayor", "Lengua"));
		this.anyadePersona(new Profesor("Bea", 32, "666111000", "C/ Mayor", "Lengua"));
		this.anyadePersona(new Profesor("Clara", 32, "666111000", "C/ Mayor", "Mates"));
		this.anyadePersona(new Profesor("Delia", 32, "666111000", "C/ Mayor", "Lengua"));
		this.anyadePersona(new Profesor("Elena", 32, "666111000", "C/ Mayor", "Lengua"));
	}

	public static void main(String[] args) {
		ListadoPersonas l = new ListadoPersonas();
		if (args.length > 0) {
			l.rellenaInicial();
		}
		System.out.println(l.listadoGeneral());

	}

}
