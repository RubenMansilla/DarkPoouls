package modelo;

public class Estus extends Objeto {

	public Estus() {
		super();
		super.setNombre("Estus");
		super.setDescripcion("Objeto sagrado que restaura la vitalidad de tu personaje al instante");
	}

	public Estus(String nombre, String descripcion, int cantidad) {
		super(nombre, descripcion, cantidad);
	}
	
	 public void usarObjeto(Personaje personaje) {
		 personaje.setVitalidad(personaje.getVidaMaxima());
	 }
	
}
