package herencia2;

public class Utilidades {
	public static String formateaTelefono(String s) {
		String salida;
		salida = s.substring(0, 3) + " ";
		salida += s.substring(3, 6) + " ";
		salida += s.substring(6, 9);
		return salida;
	}

}
