package repasoherencia;

public abstract class Ordenador implements ConsumoCalculable {
	private String fabricante;
	private String modelo;
	protected int precio;

	@Override
	public int KWpH() {
		return 15;
	}

	public abstract boolean esTransportable();

	public Ordenador(String fabricante, String modelo, int precio) {
		this.fabricante = fabricante.toUpperCase();
		this.modelo = modelo.toUpperCase();
		this.precio = precio;

	}

	protected void setFabricante(String fabricante) {
		this.fabricante = fabricante.toUpperCase();
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo.toUpperCase();
	}

	protected void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return this.fabricante + " " + this.modelo;
	}

}
