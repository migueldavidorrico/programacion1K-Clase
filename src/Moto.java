
public class Moto extends Vehiculo implements Audible {

	@Override
	public String toString() {
		return this.matricula + " es una " + this.modelo + " y está " + (this.arrancado ? "En marcha" : "Parada");
	}

	public static void main(String[] args) {
		Moto yamaha = new Moto();
		yamaha.setMatricula("AB-4635-C");
		yamaha.setModelo("Yamaha Chuli");
		yamaha.setArrancado(false);
		System.out.println(yamaha);
		yamaha.parar();
	}

	@Override
	public void pasarITV() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hazSonido() {
		System.out.println("RUMRUM");

	}

}
