package modelo;

public abstract class Arma {
	
	private String descripcion;
	private int dano;
	private String nombre;
	
	public Arma() {
	}

	public Arma(String descripcion, String nombre, int daño) {
		this.descripcion = descripcion;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " [descripcion=" + descripcion + ", dano=" + dano + ", nombre=" + nombre + "]";
	}

}
