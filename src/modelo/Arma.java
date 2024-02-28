package modelo;

public abstract class Arma {
	
	private String nombre;
	private String descripcion;
	private int daño;
	
	public Arma() {
		
	}

	public Arma(String nombre, String descripcion, int daño) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.daño = daño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Arma [nombre = " + nombre + ", daño = " + daño + "]";
	}
	

}
