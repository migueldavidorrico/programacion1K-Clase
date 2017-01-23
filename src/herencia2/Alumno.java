package herencia2;

public class Alumno extends Persona {
	String curso;
	String nia;
	String telefonoTutor;
	String relacionTutor;

	public Alumno(String nombre, int edad, String telefono, String direccion, String curso, String nia,
			String telefonoTutor, String relacionTutor) {
		super(nombre, edad, telefono, direccion);
		this.curso = curso;
		this.nia = nia;
		this.telefonoTutor = telefonoTutor;
		this.relacionTutor = relacionTutor;
	}

	public Alumno(String nombre, int edad, String telefono, String direccion, String curso, String nia) {
		this(nombre, edad, telefono, direccion, curso, nia, null, null);
	}

	public static void main(String[] args) {
		Persona p = new Alumno("Xabi", 13, "777888999", "C/Menor", "1B", "4", "000000000", "Padre");
		System.out.println(p.devuelveDatos());

	}

	@Override
	public String devuelveDatos() {
		String salida;
		String telefonoBonito;
		if (this.telefono == null) {
			telefonoBonito = "--- --- ---";
		} else {
			telefonoBonito = Utilidades.formateaTelefono(this.telefono);
		}
		if (this.telefonoTutor != null) {
			telefonoBonito += " * ";
			telefonoBonito += this.relacionTutor + ":";
			telefonoBonito += Utilidades.formateaTelefono(this.telefonoTutor);

		}
		salida = String.format("%10s-->%s", this.nombre, telefonoBonito);

		return salida;

	}

	@Override
	public String toString() {
		return super.toString() + " Es un Alumno";
	}

}
