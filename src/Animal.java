
public class Animal {

	String nombreComun;
	int peso;
	int longitud;

	Animal(String nombreComun, int peso, int longitud) {
		this.nombreComun = nombreComun;
		this.peso = peso;
		this.longitud = longitud;
	}

	int getIMC() {
		return peso * peso / longitud;
	}

	@Override
	public String toString() {
		return "El animal: " + this.nombreComun + " Pesa: " + this.peso;
	}

	public static void main(String[] args) {
		Animal ballena = new Animal("Ballena", 500, 20);
		System.out.println(ballena);

	}

}
