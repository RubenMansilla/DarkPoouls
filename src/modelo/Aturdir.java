package modelo;

public class Aturdir extends Habilidad {
	
	public Aturdir() {
		super.setNombre("Aturdir");
		super.setDescripcion("");
		super.setCosteFe(10);
	}

	public Aturdir(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}
	
	public void usarHabilidad(Personaje personaje) {
		 personaje.setFuerza(personaje.getFuerza() + 4);
	}
	
	
	

}
