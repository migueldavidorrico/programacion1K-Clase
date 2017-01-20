package herencia2;

public final class AlumnoBecado extends Alumno {

	int importeBeca;

	AlumnoBecado(Alumno a, int importeBeca) {
		super(a.nombre, a.edad, a.direccion, a.telefono, a.curso, a.nia, a.telefonoTutor, a.relacionTutor);
		this.importeBeca = importeBeca;
	}

	public static void main(String[] args) {
		Persona p = new Alumno("Xabi", 13, "777888999", "C/Menor", "1B", "4", "000000000", "Padre");
		System.out.println(p.devuelveDatos());
		AlumnoBecado alumno = new AlumnoBecado((Alumno) p, 400);
		// 800 línea de código
		p.setTelefono("111111111");
		System.out.println(alumno.devuelveDatos());
	}

}
