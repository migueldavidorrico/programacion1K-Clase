package enums;

import java.util.Scanner;

public class CalculaPesoEnPlanetas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu peso en Kg");
		double pesoTierra = sc.nextDouble();
		System.out.println("Elige un planeta para calcular el peso:");
		Planetas[] lista = Planetas.values();
		for (Planetas p : lista) {
			System.out.println((p.ordinal() + 1) + " - " + p);
		}
		int opcion = sc.nextInt();
		if (opcion > 0 && opcion <= lista.length) {
			System.out.println(calculaPeso(pesoTierra, lista[opcion - 1]));
		}
	}

	public static double calculaPeso(double peso, Planetas p) {
		return peso * p.getFactor();
	}

}
