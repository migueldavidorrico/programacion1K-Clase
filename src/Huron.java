
public class Huron extends Mamifero {
	public static final String HURON = "Hurón";
	String nombre;
	boolean vacunado;

	Huron(int peso, int longitud, String nombre) {
		super(HURON, peso, longitud, 4);
		this.nombre = nombre;
		this.vacunado = false;
	}

	@Override
	public String toString() {
		return this.nombre + " es un " + Huron.HURON;
	}

	public static void main(String[] args) {
		Huron timmy = new Huron(1, 2, "Timmy");
		System.out.println(timmy);

	}

}
