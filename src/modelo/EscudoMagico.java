package modelo;

public class EscudoMagico extends Habilidad {
	
	public EscudoMagico() {
		super.setNombre("Berserker");
		super.setDescripcion("");
		super.setCosteFe(10);
	}

	public EscudoMagico(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}
	
	public void usarHabilidad(Personaje personaje) {
		 personaje.setFuerza(personaje.getFuerza() + 4);
	}
}
