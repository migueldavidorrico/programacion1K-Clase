package herencia2;

public class Profesor extends Persona implements Pagable {

	public static final int SUELDO_PROFESOR = 3000;

	private String departamento;

	Profesor(String nombre, int edad, String telefono, String direccion, String departamento) {
		super(nombre, edad, telefono, direccion);
		this.departamento = departamento;

	}

	public static void main(String[] args) {

		Persona p = new Profesor("Ana", 32, "666111000", "C/ Mayor", "Lengua");
		System.out.println(p.devuelveDatos());
		Profesor profe = (Profesor) p;
		System.out.println(profe.getDepartamento());

	}

	@Override
	public String devuelveDatos() {
		String salida;
		String telefonoBonito = Utilidades.formateaTelefono(this.telefono);
		salida = String.format("%10s-->%s", this.nombre, telefonoBonito);
		return salida;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public void pagar() {
		System.out.println("El profesor " + this.nombre + " recibe " + Profesor.SUELDO_PROFESOR + "euros de sueldo");

	}

	@Override
	public String toString() {
		return this.nombre + " es un Profesor del departamento: " + this.departamento;
	}

}
