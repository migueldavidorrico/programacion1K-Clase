package herencia;

public class PezPayaso extends Pez implements Audible {

	String nombrePropio;

	PezPayaso(String nombrePropio, int peso, int longitud) {
		super("PezPayaso", peso, longitud, false);
		this.nombrePropio = nombrePropio;
	}

	@Override
	public String toString() {
		return this.nombrePropio + " es un Pez Payaso";
	}

	public static void main(String[] args) {
		PezPayaso nemo = new PezPayaso("Nemo", 3, 6);
		System.out.println(nemo);
		nemo.getIMC();

	}

	@Override
	public void hazSonido() {
		System.out.println("Glub Glub");

	}

}
