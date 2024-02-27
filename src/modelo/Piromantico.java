package modelo;

public class Piromantico extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Piromantico(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(10);
		super.setVidaMaxima(10);
		super.setFuerza(12);
		super.setFuerzaMaxima(12);
		super.setResistencia(12);
		super.setResistenciaMaxima(12);
		super.setFe(8);
		super.setFeMaxima(8);
	}
	
	public Piromantico(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Piromantico [nombre=" + nombre + " " + super.toString() + "]";
	}
	

}
