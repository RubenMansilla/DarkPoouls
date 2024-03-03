package modelo;

public class Berserker extends Habilidad {

	public Berserker() {
		super.setNombre("berserker");
		super.setDescripcion("Desata tu ferocidad interna, convirtiéndote en un tornado de destrucción en el campo de batalla");
		super.setCosteFe(6);
	}

	public Berserker(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}

	public void usarHabilidad(Personaje personaje) {
		
		if (personaje.getFe() > getCosteFe()) {
			System.out.println(personaje.getNombre() + " utiliza Berserker");
			personaje.setFuerza(personaje.getFuerza() + 8);
			personaje.setVitalidad(personaje.getVitalidad() - (personaje.getVitalidad() / 4));
			personaje.setFe(personaje.getFe() - getCosteFe());
		}else {
			System.out.println("No dispones de la Fe suficiente");
		}
		

	}

	@Override
	public String toString() {
		return "Berserker " + super.toString() + "]";
	}

}
