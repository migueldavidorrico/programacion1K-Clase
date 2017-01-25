package ikea;

public class Mesa extends Mueble {
	protected int ancho;
	protected int largo;

	public Mesa(String nombre, int precio, int ancho, int largo) {
		super(nombre, precio);
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Mesa [nombre=" + nombre + ", precio=" + precio + ", ancho=" + ancho + ", largo=" + largo + "]";
	}

}
