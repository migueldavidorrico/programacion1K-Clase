
public abstract class Vehiculo {
	boolean arrancado;
	String matricula;
	String modelo;

	public abstract void pasarITV();

	public void arrancar() {
		if (this.arrancado) {
			System.out.println("Ya estaba en marcha");
		}
		this.arrancado = true;
	}

	public void parar() {
		if (!this.arrancado) {
			System.out.println("Ya estaba parada");
		}
		this.arrancado = false;
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
