package modelo;

public class VinculoAncestral extends Habilidad {
	
	public VinculoAncestral() {
		super.setNombre("Vínculo Ancestral");
		super.setDescripcion(" Invoca el poder de los antepasados, aumentando temporalmente la Fe del personaje");
		super.setCosteFe(10);
	}

	public VinculoAncestral(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}
	
	public void usarHabilidad(Personaje personaje) {
		 personaje.setFe(personaje.getFe() + 10);
	}

	@Override
	public String toString() {
		return "Vínculo Ancestral " + super.toString();
	}

}
