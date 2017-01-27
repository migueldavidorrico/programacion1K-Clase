package enums;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayVSArrayList {

	// Leer enteros de teclado hasta que se pulse cero.
	// Después mostrar los pares y luegos los impares

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		// numeros.add(Planetas.JUPITER);
		Scanner sc = new Scanner(System.in);
		int numero;
		while ((numero = sc.nextInt()) != 0) {
			numeros.add(new Integer(numero));
		}

		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		for (Integer i : numeros) {
			if (i.intValue() % 2 == 0) {
				pares.add(i);
			} else {
				impares.add(i);
			}
		}
		System.out.println("PARES");
		for (Integer i : pares) {
			System.out.println(i);
		}
		System.out.println("IMPARES");
		for (Integer i : impares) {
			System.out.println(i);
		}

		// int[] numeros = new int[500];
		// int posicionInsertar = 0;
		// Scanner sc = new Scanner(System.in);
		// int numero;
		// while ((numero = sc.nextInt()) != 0) {
		// numeros[posicionInsertar++] = numero;
		// }
		// System.out.println("PARES");
		// for (int i = 0; i < posicionInsertar; i++) {
		// if (numeros[i] % 2 == 0) {
		// System.out.println(numeros[i]);
		// }
		// }
		// System.out.println("IMPARES");
		// for (int i = 0; i < posicionInsertar; i++) {
		// if (numeros[i] % 2 != 0) {
		// System.out.println(numeros[i]);
		// }
		// }
		//
	}

}
