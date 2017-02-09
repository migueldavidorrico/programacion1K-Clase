package repasoherencia;

import java.util.ArrayList;

public class PcBox {

	public static void main(String[] args) {
		// Ordenador o = new Ordenador("TOSHIBA", "TX-9000", 450);
		// System.out.println(o);
		Ordenador p = new Portatil("HP", "PAVILLION", 1000, 40);
		System.out.println(p);
		// o.setFabricante("AMSTRAD");

		p.setFabricante("SPECTRUM");
		Ordenador g = new PortatilGamer("LENOÇVO", "SIDECAR", CategoriasPrecios.A, 40);
		// System.out.println(o);
		PortatilGamer pg = (PortatilGamer) g;
		System.out.println(p.esTransportable());
		System.out.println(g.esTransportable());
		ArrayList<ConsumoCalculable> electrodomesticos = new ArrayList<>();
		electrodomesticos.add(p);
		electrodomesticos.add(new Frigorifico());

	}

}
