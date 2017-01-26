package enums;

import java.util.Scanner;

public class CalculaPesoEnPlanetas {

	private static final double FACTOR_GRAVITACIONAL_JUPITER = 2.55;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu peso en Kg");
		double pesoTierra = sc.nextDouble();
		Planetas[] lista = Planetas.values();
		for (Planetas p : lista) {
			System.out.printf("El peso en " + p + " es: %.2f\n", calculaPeso(pesoTierra, p));
		}
	}

	public static double calculaPeso(double peso, Planetas p) {
		return peso * p.getFactor();
	}

}
