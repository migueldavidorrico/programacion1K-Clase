package repasoherencia;

class ClasePadre {
}

class ClaseHija1 extends ClasePadre {
}

class ClaseHija2 extends ClasePadre {
}

public class Test {
	public static void main(String argv[]) {
		ClasePadre var0 = new ClasePadre();
		ClaseHija1 var1 = new ClaseHija1();
		ClaseHija2 var2 = new ClaseHija2();
		ClasePadre var3 = new ClaseHija1();
		ClasePadre var4 = new ClaseHija2();
		var0 = var1;

		var2 = (ClaseHija2) var4;

	}
}