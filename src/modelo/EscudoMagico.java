package modelo;

public class EscudoMagico extends Habilidad {
	
	public EscudoMagico() {
		super.setNombre("Berserker");
		super.setDescripcion("Envuelve a tu personaje en una barrera que refleja parte de los ataques");
		super.setCosteFe(10);
	}

	public EscudoMagico(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}
	
	public void usarHabilidad(Personaje personaje) {
		 personaje.setResistencia(personaje.getResistencia() + 10);
	}

	@Override
	public String toString() {
		return "Escudo Magico " + super.toString() + "]";
	}
	
	
}
