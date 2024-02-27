package modelo;

public class Hechizero extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Hechizero(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(8);
		super.setVidaMaxima(8);
		super.setFuerza(9);
		super.setFuerzaMaxima(9);
		super.setResistencia(8);
		super.setResistenciaMaxima(8);
		super.setFe(8);
		super.setFeMaxima(8);
	}
	
	public Hechizero(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Hechizero [nombre=" + nombre + " " + super.toString() + "]";
	}
	

}
