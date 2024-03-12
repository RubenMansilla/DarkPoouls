package modelo;

public class Marginado extends Personaje {
	
	//Constructor 
	public Marginado(String nombre) {
		super();
		super.setNombre(nombre);
		super.setVitalidad(8);
		super.setVidaMaxima(8);
		super.setFuerza(8);
		super.setFuerzaMaxima(8);
		super.setResistencia(8);
		super.setResistenciaMaxima(8);
		super.setFe(8);
		super.setFeMaxima(8);
	}
	public Marginado(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Marginado \nnombre=" + nombre + " " + super.toString();
	}
	
}
