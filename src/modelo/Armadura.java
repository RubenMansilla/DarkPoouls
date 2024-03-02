package modelo;

public abstract class Armadura {

	private String descripcion;
	private int defensa;

	public Armadura() {

	}

	public Armadura(String descripcion, int daño) {
		this.descripcion = descripcion;
		this.defensa = daño;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	public String toString() {
		return "[descripcion=" + descripcion + ", defensa=" + defensa + "]";
	}
	

}
