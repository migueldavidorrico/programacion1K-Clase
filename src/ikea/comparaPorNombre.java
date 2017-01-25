package ikea;

public class comparaPorNombre implements MuebleComparable {

	@Override
	public boolean deboIntercambiar(Mueble m1, Mueble m2) {
		return m1.nombre.compareTo(m2.nombre) > 0;
	}

}
