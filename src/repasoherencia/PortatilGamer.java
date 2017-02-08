package repasoherencia;

public class PortatilGamer extends Portatil {

	@Override
	public int KWpH() {
		return 100;
	}

	public CategoriasPrecios precio;

	public PortatilGamer(String fabricante, String modelo, CategoriasPrecios precio, int tamanyoPantalla) {
		super(fabricante, modelo, precio.getPrecio(), tamanyoPantalla);
		this.precio = precio;
	}

	@Override
	public String toString() {
		String salida = super.toString();
		return salida + " con neones en el ratón. Cuesta " + super.precio;
	}

	@Override
	public boolean esTransportable() {
		return true;
	}
}
