package modelo;

public class Bandido extends Personaje {
	
	//Constructor 
	public Bandido(String nombre) {
		super();
		super.setNombre(nombre);
		super.setVitalidad(999);
		super.setVidaMaxima(super.getVitalidad());
		super.setFuerza(999);
		super.setFuerzaMaxima(super.getFuerza());
		super.setResistencia(11);
		super.setResistenciaMaxima(super.getResistencia());
		super.setFe(100);
		super.setFeMaxima(super.getFe());
	}
	
	public Bandido(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Bandido [nombre=" + nombre + " " + super.toString() + "]";
	}

}
