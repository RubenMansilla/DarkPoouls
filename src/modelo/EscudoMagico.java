package modelo;

public class EscudoMagico extends Habilidad {
	
	public EscudoMagico() {
		super.setNombre("Escudo Magico");
		super.setDescripcion("Envuelve a tu personaje en una barrera que refleja parte de los ataques");
		super.setCosteFe(10);
	}

	public EscudoMagico(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}
	
	public void usarHabilidad(Personaje personaje) {
		if (personaje.getFe() > getCosteFe()) {
			System.out.println(personaje.getNombre() + " utiliza Berserker");
			personaje.setResistencia(personaje.getResistencia() + 10);
			personaje.setFe(personaje.getFe() - getCosteFe());
		}else {
			System.out.println("No dispones de la Fe suficiente");
		}
	}

	@Override
	public String toString() {
		return "Escudo Magico " + super.toString() + "]";
	}
	
	
}
