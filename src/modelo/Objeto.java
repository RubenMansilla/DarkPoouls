package modelo;

public abstract class Objeto {
	
	private String nombre;
    private int cantidad = 0;

    public Objeto() {
    }

    public Objeto(String nombre, int cantidad) {
        this.nombre = nombre;
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

	@Override
	public String toString() {
		return nombre + ", cantidad = " + cantidad;
	}
}
