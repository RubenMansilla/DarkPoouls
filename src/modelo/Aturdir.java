package modelo;

public class Aturdir extends Habilidad {
	
	public Aturdir() {
		super.setNombre("Aturdir");
		super.setDescripcion("Aturde al enemigo, dejándolo temporalmente incapacitado.");
		super.setCosteFe(4);
	}

	public Aturdir(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}
	
	@Override
	public void usarHabilidad(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}
	
	public void usarHabilidad(Personaje personaje, Personaje enemigo) {
		if (personaje.getFe() > getCosteFe()) {
			System.out.println(personaje + "aturde mediante una patada en la joya de la corona");
			personaje.setFe(personaje.getFe() - getCosteFe());
			enemigo.setFuerza(enemigo.getFuerza() - 6);
		}
	}

	@Override
	public String toString() {
		return "Aturdir " + super.toString() + "]";
	}

		
}
