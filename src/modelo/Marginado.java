package modelo;

public class Marginado extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Marginado(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(8);
		super.setFuerza(8);
		super.setFuerzaMaxima(8);
		super.setResistencia(8);
		super.setResistenciaMaxima(8);
		super.setFe(8);
	}
	public Marginado(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Marginado [nombre=" + nombre + " " + super.toString() + "]";
	}
	
}
