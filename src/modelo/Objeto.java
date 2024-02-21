package modelo;

public class Objeto {
	
	private String nombre;
	private int usos = 1;
	
	public Objeto() {
		
	}

	public Objeto(String nombre, int usos) {
		this.nombre = nombre;
		this.usos = usos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUsos() {
		return usos;
	}

	public void setUsos(int usos) {
		this.usos = usos;
	}

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", usos=" + usos + "]";
	}
	

}
