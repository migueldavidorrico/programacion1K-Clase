package herencia;

public final class Coche extends Vehiculo implements Audible {

	int numeroPuertas;

	boolean limpiaParabrisasFuncionando = false;

	public void conmutaLimpiaParabrisas() {
		limpiaParabrisasFuncionando = !limpiaParabrisasFuncionando;
	}

	@Override
	public String toString() {
		return this.matricula + " es un " + this.modelo + " y está " + (this.arrancado ? "En marcha" : "Parado");
	}

	public static void main(String[] args) {
		Coche mondeo = new Coche();
		mondeo.setMatricula("MU-3051-Y");
		mondeo.setModelo("Ford Mondeo");
		mondeo.setNumeroPuertas(5);
		mondeo.setArrancado(false);
		System.out.println(mondeo);
		mondeo.parar();
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public void pasarITV() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hazSonido() {
		System.out.println("PIIII PIIIII");

	}

}
