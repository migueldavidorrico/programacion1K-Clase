package herencia;

public class Sonidos {

	public static void main(String[] args) {
		Coche mondeo = new Coche();
		mondeo.setMatricula("MU-3051-Y");
		mondeo.setModelo("Ford Mondeo");
		mondeo.setNumeroPuertas(5);
		mondeo.setArrancado(false);
		Raton mickey = new Raton(1, 1, "Mickey Mouse");
		PezPayaso nemo = new PezPayaso("Nemo", 3, 6);

		Audible[] sonidos = new Audible[3];
		sonidos[0] = mondeo;
		sonidos[1] = mickey;
		sonidos[2] = nemo;

		for (Audible a : sonidos) {
			System.out.print(a + " Hace:");
			a.hazSonido();
		}

	}

}
