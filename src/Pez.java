
public class Pez extends Animal {
	boolean aguaDulce;

	public Pez(String nombreComun, int peso, int longitud, boolean aguaDulce) {
		super(nombreComun, peso, longitud);
		this.aguaDulce = aguaDulce;
	}

	@Override
	public String toString() {
		return "El " + this.nombreComun + " es de agua " + (aguaDulce ? "dulce" : "salada");
	}

	public static void main(String[] args) {
		Pez trucha = new Pez("Trucha", 3, 2, true);
		System.out.println(trucha);

	}

}
