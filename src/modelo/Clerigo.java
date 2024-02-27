package modelo;

public class Clerigo extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Clerigo(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(11);
		super.setVidaMaxima(11);
		super.setFuerza(12);
		super.setFuerzaMaxima(12);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(14);
		super.setFeMaxima(14);
	}
	public Clerigo(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Clerigo [nombre=" + nombre + " " + super.toString() + "]";
	}
	
	
}
