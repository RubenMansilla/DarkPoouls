package modelo;

public abstract class Objeto {
	
	private String nombre;
	private String descripcion;
    private int cantidad = 1;

    public Objeto() {
    }

    public Objeto(String nombre, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	 public abstract void usarObjeto(Personaje personaje);

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad + "]";
	}
	
}
