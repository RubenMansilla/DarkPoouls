package modelo;

public class Cazador extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Cazador(String nombre) {
		super();
		super.setNombre(nombre);
		super.setVitalidad(11);
		super.setVidaMaxima(11);
		super.setFuerza(12);
		super.setFuerzaMaxima(12);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(9);
		super.setFeMaxima(9);
	}
	
	public Cazador(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Cazador [nombre=" + nombre + " " + super.toString() + "]";
	}
	
}
