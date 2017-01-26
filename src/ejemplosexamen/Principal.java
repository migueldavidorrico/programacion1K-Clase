package ejemplosexamen;

public class Principal {

	public static void main(String[] args) {
		ListaPuntos lista = new ListaPuntos(4);
		lista.add(new Punto(2, 0));
		lista.add(new Punto(1, 600));
		lista.add(new Punto(2, 400));
		lista.add(new Punto(3, 500));
		System.out.println(lista);

		// Más alejado al origen
		double maximo = lista.listaPuntos[0].distanciaOrigen();
		Punto puntoMaximo = lista.listaPuntos[0];

		for (int i = 0; i < lista.numeroPuntoActual; i++) {
			Punto mirando = lista.listaPuntos[i];
			if (mirando.distanciaOrigen() > maximo) {
				maximo = mirando.distanciaOrigen();
				puntoMaximo = mirando;
			}
		}
		System.out.println("El punto máximo es " + puntoMaximo + " y está a " + puntoMaximo.distanciaOrigen());

		for (int i = 1; i < lista.numeroPuntoActual; i++) {
			for (int j = 0; j < lista.numeroPuntoActual - 1; j++) {
				if (lista.listaPuntos[j].distanciaOrigen() > lista.listaPuntos[j + 1].distanciaOrigen()) {
					Punto temp = lista.listaPuntos[j];
					lista.listaPuntos[j] = lista.listaPuntos[j + 1];
					lista.listaPuntos[j + 1] = temp;
				}
			}
		}
		System.out.println(lista);

	}

}
