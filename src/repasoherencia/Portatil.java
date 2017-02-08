package repasoherencia;

public class Portatil extends Ordenador {
	private int tamanyoPantalla;

	public Portatil(String fabricante, String modelo, int precio, int tamanyoPantalla) {
		super(fabricante, modelo, precio);
		this.tamanyoPantalla = tamanyoPantalla;

	}

	public void setTamnyoPantalla(int tamanyo) {
		this.tamanyoPantalla = tamanyo;
	}

	public int getTamanyoPantalla() {
		return this.tamanyoPantalla;
	}

	@Override
	public void setFabricante(String fabricante) {
		super.setFabricante(fabricante + " Pequeñito");
	}

	@Override
	public String toString() {
		String salida = super.toString();
		return salida + " " + this.tamanyoPantalla + " Pulgadas";
	}

	@Override
	public boolean esTransportable() {

		return this.tamanyoPantalla < 21;
	}

}
