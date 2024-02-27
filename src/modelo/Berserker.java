package modelo;

public class Berserker extends Habilidad {

	public Berserker() {
		super.setNombre("Berserker");
		super.setDescripcion("Desata tu ferocidad interna, convirtiéndote en un tornado de destrucción en el campo de batalla");
		super.setCosteFe(10);
	}

	public Berserker(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}

	public void usarHabilidad(Personaje personaje) {
		personaje.setFuerza(personaje.getFuerza() + 8);
		personaje.setVitalidad(personaje.getVitalidad() - (personaje.getVitalidad() / 4));

	}

	@Override
	public String toString() {
		return "Berserker " + super.toString() + "]";
	}

}
