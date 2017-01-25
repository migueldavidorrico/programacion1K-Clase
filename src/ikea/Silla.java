package ikea;

public final class Silla extends Mueble {
	private TipoSilla tipo;

	public Silla(String nombre, int precio, TipoSilla tipo) {
		super(nombre, precio);
		this.tipo = tipo;

	}

	@Override
	public String toString() {
		return "Silla [nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]";
	}

	public static void main(String[] args) {
		Silla s = new Silla("Silla Jardín", 30, TipoSilla.NO_APILABLE);
		System.out.println(s);
	}

}
