
public class MisMascotas {

	public static void main(String[] args) {
		Animal[] misMascotas = new Animal[5];
		misMascotas[0] = new Animal("Cocodrilo", 400, 3);
		misMascotas[1] = new Mamifero("Ornitorrinco", 3, 2, 2);
		misMascotas[2] = new Huron(3, 4, "timmy");
		misMascotas[3] = new Raton(4, 5, "Mickey Mouse");
		misMascotas[4] = new PezPayaso("Nemo", 7, 3);

		for (Animal a : misMascotas) {
			System.out.println(a);
			System.out.println(a.getIMC());
			if (a instanceof PezPayaso) {
				System.out.println("  Este era un pez Payaso");
			}
		}

	}

}
