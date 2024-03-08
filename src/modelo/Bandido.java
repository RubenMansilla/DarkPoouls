package modelo;

public class Bandido extends Personaje {
	
	//Constructor 
	public Bandido(String nombre) {
		super();
		super.setNombre(nombre);
		super.setVitalidad(999);
		super.setVidaMaxima(999);
		super.setFuerza(999);
		super.setFuerzaMaxima(super.getFuerza()); // Establece el valor por defecto de fuerzaMaxima
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(10);
		super.setFeMaxima(10);
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
