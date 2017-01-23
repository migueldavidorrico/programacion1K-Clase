package herencia2;

public final class AlumnoBecado extends Alumno implements Pagable {

	int importeBeca;

	AlumnoBecado(Alumno a, int importeBeca) {
		super(a.nombre, a.edad, a.telefono, a.direccion, a.curso, a.nia, a.telefonoTutor, a.relacionTutor);
		this.importeBeca = importeBeca;
	}

	public static void main(String[] args) {
		Persona p = new Alumno("Xabi", 13, null, "C/Menor", "1B", "4", "000000000", "Padre");
		System.out.println(p.devuelveDatos());
		AlumnoBecado alumno = new AlumnoBecado((Alumno) p, 400);
		// 800 línea de código
		p.setTelefono("111111111");
		System.out.println(alumno.devuelveDatos());
	}

	@Override
	public void pagar() {
		System.out.println("El alumno: " + this.nombre + " recibe " + this.importeBeca + " de su beca");

	}

	@Override
	public String toString() {
		return super.toString() + " y está becado";
	}

}
