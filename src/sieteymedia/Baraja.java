package sieteymedia;

public class Baraja {
	public static final int NUMERO_CARTAS = 40;

	Carta[] cartas = new Carta[NUMERO_CARTAS];

	int numeroRepartidas = 0;

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

	//
	// -- To shuffle an array a of n elements (indices 0..n-1):
	// for i from n−1 downto 1 do
	// j ← random integer such that 0 ≤ j ≤ i
	// exchange a[j] and a[i]

	public void barajar() {
		for (int i = cartas.length - 1; i >= 1; i--) {
			int j = (int) (Math.random() * (i + 1));
			// System.out.println(j);
			Carta temp = cartas[j];
			cartas[j] = cartas[i];
			cartas[i] = temp;
		}

	}

	public Carta reparteCarta() {
		return cartas[numeroRepartidas++];
	}

	public static void main(String[] args) {
		Baraja b = new Baraja();
		// System.out.println(b);
		b.barajar();
		System.out.println(b.reparteCarta());
		System.out.println(b.reparteCarta());
		System.out.println(b.reparteCarta());
		System.out.println(b.reparteCarta());
		System.out.println(b.reparteCarta());
	}

}
