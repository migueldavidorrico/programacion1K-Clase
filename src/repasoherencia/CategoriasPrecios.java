package repasoherencia;

public enum CategoriasPrecios {
	A(2000), B(1500), C(1000);

	private int precioCategoria;

	CategoriasPrecios(int precio) {
		this.precioCategoria = precio;
	}

	public int getPrecio() {
		return this.precioCategoria;
	}

}
