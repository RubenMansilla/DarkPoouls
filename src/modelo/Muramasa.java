package modelo;

public class Muramasa extends Katana {
	

	public Muramasa(String nombre) {
		super(nombre);
		super.setDaño(5);
	}
	
	public Muramasa(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}

}
