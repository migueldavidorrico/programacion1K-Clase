package multimedia;

public class Multimedia {
	// Esta clase contiene título, autor ,formato y duración como atributos.

	String titulo;
	String autor;
	Formato formato;
	Duracion duracion;

	public Multimedia(String titulo, String autor, Formato formato, Duracion duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public static void main(String[] args) {

	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public Duracion getDuracion() {
		return duracion;
	}

}
