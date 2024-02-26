package modelo;

public class Berserker extends Habilidad {

	public Berserker() {
		super.setNombre("Berserker");
		super.setDescripcion("");
		super.setCosteFe(10);
	}

	public Berserker(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}

	public void usarHabilidad(Personaje personaje) {
		personaje.setFuerza(personaje.getFuerza() + 4);
		personaje.setVitalidad(personaje.getVitalidad() - (personaje.getVitalidad() / 4));

	}

}
