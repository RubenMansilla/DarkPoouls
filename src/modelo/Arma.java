package modelo;

public abstract class Arma {
	
	private String descripcion;
	private int daño;
	
	public Arma() {
	}

	public Arma(String descripcion, int daño) {
		this.descripcion = descripcion;
		this.daño = daño;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return "[descripcion = " + descripcion + ", daño = " + daño + "]";
	}

}
