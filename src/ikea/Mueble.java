package ikea;

public abstract class Mueble {
	protected String nombre;
	protected int precio;

	Mueble(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

}
