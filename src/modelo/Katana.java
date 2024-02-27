package modelo;

public class Katana extends Arma {
	
	public Katana(String nombre) {
		super();
		super.setNombre(nombre);
		super.setDaño(7);
	}
	
	public Katana(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}
	
	

}
