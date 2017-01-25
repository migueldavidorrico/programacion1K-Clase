package ikea;

public class Armario extends Mueble {
	boolean empotrado;

	public Armario(String nombre, int precio, boolean empotrado) {
		super(nombre, precio);
		this.empotrado = empotrado;

	}

	@Override
	public String toString() {
		return "Armario [nombre=" + nombre + ", precio=" + precio + ", empotrado=" + empotrado + "]";
	}

}
