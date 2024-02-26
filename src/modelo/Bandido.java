package modelo;

public class Bandido extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Bandido(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(12);
		super.setFuerza(14);
		super.setFuerzaMaxima(14); // Establece el valor por defecto de fuerzaMaxima
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(10);
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
