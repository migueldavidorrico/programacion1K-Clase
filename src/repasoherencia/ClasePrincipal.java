package repasoherencia;

class ClaseA {
	public ClaseA(int x) {
		System.out.print("ClaseA-" + x);
	}
}

class ClaseB extends ClaseA {
	public ClaseB() {
		super(6);
		System.out.print(" ClaseB-");
	}
}

public class ClasePrincipal {
	public static void main(String[] args) {
		ClaseB objB1 = new ClaseB();
		ClaseB objB2;
		System.out.println(" FIN");
	}
}