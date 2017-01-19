package herencia;

public class Raton extends Mamifero implements Audible {
	String nombrePropio;

	Raton(int peso, int longitud, String nombre) {
		super("Ratón", peso, longitud, 6);
		this.nombrePropio = nombre;

	}

	@Override
	public String toString() {
		return this.nombrePropio + " es un RATÓN ";
	}

	public static void main(String[] args) {
		Raton mickey = new Raton(1, 1, "Mickey Mouse");
		System.out.println(mickey);

	}

	@Override
	public void hazSonido() {
		System.out.println("Hic Hic");

	}

}
