package herencia;

public class Mamifero extends Animal {

	int numeroMamas;

	Mamifero(String nombreComun, int peso, int longitud, int numeroMamas) {
		super(nombreComun, peso, longitud);
		this.numeroMamas = numeroMamas;

	}

	@Override
	public String toString() {
		String salida = super.toString();
		salida = salida.toUpperCase();
		salida += " y es un mamífero con " + this.numeroMamas + " mamas";
		return salida;
	}

	public static void main(String[] args) {
		Mamifero jabali = new Mamifero("Jabalí", 40, 2, 8);
		System.out.println(jabali);

	}

}
