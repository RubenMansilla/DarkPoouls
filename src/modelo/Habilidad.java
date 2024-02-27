package modelo;

public abstract class Habilidad {

	private String nombre;
	private String descripcion;
	private int costeFe;

	public Habilidad() {

	}

	public Habilidad(String nombre, String descripcion, int costeMana) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costeFe = costeMana;
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

	public int getCosteFe() {
		return costeFe;
	}

	public void setCosteFe(int costeMana) {
		this.costeFe = costeMana;
	}

	public abstract void usarHabilidad(Personaje personaje);

	@Override
	public String toString() {
		return "Habilidad [nombre=" + nombre + ", descripcion=" + descripcion + ", costeMana=" + costeFe + "]";
	}

}