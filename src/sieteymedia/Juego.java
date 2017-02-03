package sieteymedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

	static Baraja baraja = new Baraja();

	static ArrayList<Carta> mano = new ArrayList<>();

	public static double valorMano() {
		double suma = 0;
		for (Carta c : mano) {
			suma += c.valor();
		}

		return suma;
	}

	public static void main(String[] args) {
		baraja.barajar();
		System.out.println("EMPIEZA EL JUEGO");
		Scanner sc = new Scanner(System.in);
		while (valorMano() < 7.5) {
			mano.add(baraja.reparteCarta());
			System.out.println("Llevas: " + valorMano() + " con las cartas: " + mano);
			if (valorMano() == 7.5) {
				System.out.println("ENHORABUENA, TIENES LA BANCA. ERES EL MEJOR");
				break;
			} else if (valorMano() > 7.5) {
				System.out.println("Pierdes. Gana la banca");
				break;
			}
			System.out.println("¿OTRA?");
			if (sc.nextLine().equalsIgnoreCase("NO")) {
				System.out.println("BIEN JUGADO");
				break;
			}
		}
	}

}
