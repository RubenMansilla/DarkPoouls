package modelo;

public class Guerrero extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Guerrero(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(11);
		super.setFuerza(13);
		super.setResistencia(11);
		super.setFe(9);
	}
	public Guerrero(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Guerrero [nombre=" + nombre + " " + super.toString() + "]";
	}
	
	

}
