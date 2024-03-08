package modelo;

public abstract class Arma {
	
	private String descripcion;
	private int dano;
	
	public Arma() {
	}

	public Arma(String descripcion, int daño) {
		this.descripcion = descripcion;
		this.dano = daño;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int daño) {
		this.dano = daño;
	}

	@Override
	public String toString() {
		return "[descripcion = " + descripcion + ", daño = " + dano + "]";
	}

}
