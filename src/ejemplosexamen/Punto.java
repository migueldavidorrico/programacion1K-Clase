package ejemplosexamen;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%.2f,%.2f)", x, y);
	}

	public double distanciaOrigen() {
		return this.distancia(new Punto(0, 0));
	}

	public double distancia(Punto p) {
		double distancia = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
		return distancia;
	}

	public static void main(String[] args) {
		System.out.println((new Punto(1, 1)).distanciaOrigen());

	}

}
