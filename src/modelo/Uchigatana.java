package modelo;

public class Uchigatana extends Katana {
	
	public Uchigatana(String nombre) {
		super(nombre);
		super.setDaño(8);
	}
	
	public Uchigatana(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}

}
