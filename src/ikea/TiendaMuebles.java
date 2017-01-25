package ikea;

public class TiendaMuebles {

	Mueble[] listaMuebles;
	String nombre;

	public TiendaMuebles(String nombre, int tamanyoMaximo) {
		this.nombre = nombre;
		this.listaMuebles = new Mueble[tamanyoMaximo];
	}

	public String devuelveCatalogo() {
		String cadena = "";
		for (Mueble m : this.listaMuebles) {
			cadena += m + " \n";
		}
		return cadena;
	}

	public static void main(String[] args) {
		TiendaMuebles t = new TiendaMuebles("IKEA", 9);

		t.listaMuebles[0] = new Silla("Silla Jardín", 23, TipoSilla.APILABLE);
		t.listaMuebles[1] = new Silla("Silla Comedor", 100, TipoSilla.APILABLE);
		t.listaMuebles[2] = new Silla("Silla Infantil", 5, TipoSilla.NO_APILABLE);
		t.listaMuebles[3] = new Mesa("Mesa Jardín", 60, 2, 2);
		t.listaMuebles[4] = new Mesa("Mesa Comedor", 300, 5, 2);
		t.listaMuebles[5] = new Mesa("Mesa Infantil", 10, 1, 1);
		t.listaMuebles[6] = new Armario("Armario Ropero", 12, true);
		t.listaMuebles[7] = new Armario("Armario Dormitorio", 120, false);
		t.listaMuebles[8] = new Armario("Armario Cocina", 78, true);

		System.out.println(t.devuelveCatalogo());
		t.ordenarCriterio(new MuebleComparable() {
			@Override
			public boolean deboIntercambiar(Mueble m1, Mueble m2) {
				return !(m1.precio > m2.precio);
			}
		});
		System.out.println(t.devuelveCatalogo());

	}

	public void ordenarCriterio(MuebleComparable comparador) {
		for (int i = 1; i < this.listaMuebles.length; i++) {
			for (int j = 0; j < this.listaMuebles.length - 1; j++) {
				if (comparador.deboIntercambiar(this.listaMuebles[j], this.listaMuebles[j + 1])) {
					Mueble temp;
					temp = this.listaMuebles[j];
					this.listaMuebles[j] = this.listaMuebles[j + 1];
					this.listaMuebles[j + 1] = temp;
				}
			}
		}

	}

	public void ordenar() {
		System.out.println("ORDENADO POR PRECIO\n-------------------");
		for (int i = 1; i < this.listaMuebles.length; i++) {
			for (int j = 0; j < this.listaMuebles.length - 1; j++) {
				if (this.listaMuebles[j].precio < this.listaMuebles[j + 1].precio) {
					Mueble temp;
					temp = this.listaMuebles[j];
					this.listaMuebles[j] = this.listaMuebles[j + 1];
					this.listaMuebles[j + 1] = temp;
				}
			}
		}

	}

	public void ordenarNombre() {
		System.out.println("ORDENADO POR NOMBRE\n-------------------");
		for (int i = 1; i < this.listaMuebles.length; i++) {
			for (int j = 0; j < this.listaMuebles.length - 1; j++) {
				if (this.listaMuebles[j].nombre.compareTo(this.listaMuebles[j + 1].nombre) > 0) {
					Mueble temp;
					temp = this.listaMuebles[j];
					this.listaMuebles[j] = this.listaMuebles[j + 1];
					this.listaMuebles[j + 1] = temp;
				}
			}
		}

	}

}
