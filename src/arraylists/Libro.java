package arraylists;

import java.util.ArrayList;

public class Libro {
	String isbn;
	public String titulo;
	ArrayList<String> autores = new ArrayList<>();

	public Libro(String isbn, String titulo, ArrayList<String> autores) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
	}

	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		if (!autor.equalsIgnoreCase("Anónimo")) {
			this.autores.add(autor);
		} else {
			this.autores = null;
		}
	}

	@Override
	public String toString() {
		String salida = "";
		salida += String.format("%20s - %10s ISBN:%5s", this.titulo, this.autoresFormateados(), this.isbn);
		return salida;
	}

	private String autoresFormateados() {
		if (this.autores == null) {
			return "Anónimo";
		}
		if (this.autores.size() == 1) {
			return this.autores.get(0);
		}
		String salida = "";
		salida = this.autores.get(0) + " y " + this.autores.get(1);
		this.autores.remove(0);
		this.autores.remove(0);
		for (String nombre : this.autores) {
			salida = nombre + ", " + salida;
		}

		// for (int i = 0; i < this.autores.size(); i++) {
		// if (i == this.autores.size() - 1) {
		// salida += " y " + autores.get(i);
		// } else {
		// if (i == 0) {
		// salida = salida + autores.get(i);
		// } else {
		// salida = salida + ", " + autores.get(i);
		// }
		// }
		// }

		return salida;
	}

}
