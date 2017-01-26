package ikea;

public class comparaPorPrecio implements MuebleComparable {

	@Override
	public boolean deboIntercambiar(Mueble m1, Mueble m2) {
		return m1.precio < m2.precio;
	}

}
