package arraylists;

import java.util.ArrayList;

public class Libreria {

	public static void main(String[] args) {
		Libro l = new Libro("1", "3090", "Pepe");
		Libro laz = new Libro("2", "Lazarillo", "Anónimo");
		ArrayList<String> evangelistas = new ArrayList<>();
		evangelistas.add("Mateo");
		evangelistas.add("Marcos");
		evangelistas.add("Juan");
		// evangelistas.add("Lucas");

		Libro biblia = new Libro("10", "Nuevo Testamento", evangelistas);

		System.out.println(l);
		System.out.println(laz);
		System.out.println(biblia);

	}

}
