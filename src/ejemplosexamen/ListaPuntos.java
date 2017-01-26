package ejemplosexamen;

public class ListaPuntos {
	Punto[] listaPuntos;
	int numeroPuntoActual;

	public ListaPuntos(int tamanyo) {
		this.listaPuntos = new Punto[tamanyo];
		this.numeroPuntoActual = 0;
	}

	public void add(Punto p) {
		this.listaPuntos[this.numeroPuntoActual++] = p;
	}

	@Override
	public String toString() {
		String cadena = "";
		for (int i = 0; i < this.numeroPuntoActual; i++) {
			cadena += this.listaPuntos[i] + "\n";
		}
		return cadena;
	}

}
