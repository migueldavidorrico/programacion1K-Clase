package enums;

import java.util.ArrayList;

interface Sonable {
	String hazSonido();
}

abstract class Animal {
	String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Se llama " + this.nombre;
	}
}

class Perro extends Animal implements Sonable {

	@Override
	public String hazSonido() {
		return "GUAU GUAU";
	}

}

class Hormiga extends Animal {

}

class Coche implements Sonable {
	String matricula;

	Coche(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche: " + this.matricula;
	}

	@Override
	public String hazSonido() {
		return "MEC MEC";
	}
}

public class ListaHeterogenea {

	public static void main(String[] args) {
		Animal toby = new Perro();
		toby.setNombre("Toby");
		Animal atomica = new Hormiga();
		atomica.setNombre("Atómica");

		ArrayList<Sonable> lista = new ArrayList<>();
		lista.add((Sonable) toby);

	}

}
