package modelo;

public class AuraPurificadora extends Habilidad {

	public AuraPurificadora() {
		super.setNombre("Aura Purificadora");
		super.setDescripcion("Campo de energía que cura al personaje");
		super.setCosteFe(6);
	}

	public AuraPurificadora(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}

	public void usarHabilidad(Personaje personaje) {
		
		if (personaje.getFe() > getCosteFe()) {		
			personaje.setVitalidad(personaje.getVitalidad() + 12);
			personaje.setFe(personaje.getFe() - getCosteFe());
		}

	}

	@Override
	public String toString() {
		return "Aura Purificadora " + super.toString() + "]";
	}
	
}
