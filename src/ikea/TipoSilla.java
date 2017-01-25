package ikea;

public enum TipoSilla {
	NO_APILABLE("No Apilable"), APILABLE("Apilable"), PLEGABLE("Plegable");
	private String nombreBonito;

	TipoSilla(String nombreBonito) {
		this.nombreBonito = nombreBonito;
	}

	@Override
	public String toString() {
		return this.nombreBonito;
	}

}
