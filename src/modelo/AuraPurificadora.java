package modelo;

public class AuraPurificadora extends Habilidad {

	public AuraPurificadora() {
		super.setNombre("Aura Purificadora");
		super.setDescripcion("Campo de energía que cura al personaje");
		super.setCosteFe(10);
	}

	public AuraPurificadora(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}

	public void usarHabilidad(Personaje personaje) {
		personaje.setVitalidad(personaje.getVitalidad() + 12);

	}

	@Override
	public String toString() {
		return "Aura Purificadora " + super.toString() + "]";
	}
	
}
