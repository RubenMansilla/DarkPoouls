package modelo;

public class Guerrero extends Personaje {
	
	private String nombre;
	
	//Constructor 
	
	public Guerrero(String nombre) {
		super();
		super.setNombre(nombre);
		super.setVitalidad(11);
		super.setVidaMaxima(11);
		super.setFuerza(13);
		super.setFuerzaMaxima(13);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(9);
		super.setFeMaxima(9);
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
