package sieteymedia;

public class Carta {
	Palo palo;
	Numero numero;

	Carta(Numero numero, Palo palo) {
		this.palo = palo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return this.numero + " de " + this.palo;
	}

	public static void main(String[] args) {
		Carta c = new Carta(Numero.TRES, Palo.BASTOS);
		System.out.println(c);
	}

}
