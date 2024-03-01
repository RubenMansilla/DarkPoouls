package modelo;

public abstract class Armadura {

	private String nombre;
	private String descripcion;
	private int defensa;

	public Armadura() {

	}

	public Armadura(String nombre, String descripcion, int daño) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.defensa = daño;
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

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	public String toString() {
		return "Armadura [nombre=" + nombre + ", descripcion=" + descripcion + ", defensa=" + defensa + "]";
	}
	

}
