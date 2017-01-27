package enums;

public enum Planetas {
	JUPITER("Júpiter", 2.55), VENUS("Venus", 0.87), URANO("Urano", 0.99), MARTE("Marte", 0.38), MERCURIO("Mercurio",
			0.39), SATURNO("Saturno", 0.93), NEPTUNO("Neptuno", 1.38), TIERRA("La Tierra", 1), LUNA("La Luna", 0.17);

	private final String nombreBonito;
	private final double factor;

	public double getFactor() {
		return this.factor;
	}

	public String toString() {
		return this.nombreBonito;
	}

	Planetas(String nombreBonito, double factor) {
		this.nombreBonito = nombreBonito;
		this.factor = factor;
	}
}
