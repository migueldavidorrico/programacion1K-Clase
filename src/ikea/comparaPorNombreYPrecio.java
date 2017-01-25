package ikea;

public class comparaPorNombreYPrecio implements MuebleComparable {

	@Override
	public boolean deboIntercambiar(Mueble m1, Mueble m2) {
		if (m1.getClass() == m2.getClass()) {
			return m1.precio < m2.precio;
		}
		return m1.nombre.compareTo(m2.nombre) > 0;
	}

}
