package modelo;

public abstract class Armadura {

	private String descripcion;
	private int defensa;
	private String nombre;

	public Armadura() {

	}

	public Armadura(String descripcion, String nombre, int daño) {
		this.descripcion = descripcion;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " [descripcion=" + descripcion + ", defensa=" + defensa + ", nombre=" + nombre + "]";
	}
	
	
	

}
