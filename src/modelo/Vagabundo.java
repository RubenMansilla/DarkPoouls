package modelo;

public class Vagabundo extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Vagabundo(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(10);
		super.setResistenciaMaxima(10);
		super.setFuerza(10);
		super.setFuerzaMaxima(10);
		super.setResistencia(12);
		super.setResistenciaMaxima(12);
		super.setFe(8);
		super.setFeMaxima(8);
	}
	
	public Vagabundo(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Vagabundo [nombre=" + nombre + ", toString()=" + super.toString() + "]";
	}
	

}
