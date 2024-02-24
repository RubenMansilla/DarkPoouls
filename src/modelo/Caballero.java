package modelo;

public class Caballero extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Caballero(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(14);
		super.setFuerza(11);
		super.setResistencia(10);
		super.setFe(11);
	}
	public Caballero(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Caballero [nombre=" + nombre + " " + super.toString() + "]";
	}

}
