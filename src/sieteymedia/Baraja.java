package sieteymedia;

public class Baraja {
	public static final int NUMERO_CARTAS = 40;

	Carta[] cartas = new Carta[NUMERO_CARTAS];

	Baraja() {
		int indice = 0;
		for (Palo p : Palo.values()) {
			for (Numero n : Numero.values()) {
				cartas[indice++] = new Carta(n, p);
			}
		}
	}

	@Override
	public String toString() {
		String salida = "";
		for (Carta c : cartas) {
			salida += c + "\n";
		}
		return salida;
	}

	public static void main(String[] args) {
		Baraja b = new Baraja();
		System.out.println(b);
	}

}
