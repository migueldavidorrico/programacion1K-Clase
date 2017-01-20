package herencia2;

public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected String telefono;
	protected String direccion;

	public abstract String devuelveDatos();

	public Persona(String nombre, int edad, String telefono, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public static void main(String[] args) {

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

}
