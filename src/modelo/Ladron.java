package modelo;

public class Ladron extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public Ladron(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(9);
		super.setVidaMaxima(9);
		super.setFuerza(9);
		super.setFuerzaMaxima(9);
		super.setResistencia(10);
		super.setResistenciaMaxima(10);
		super.setFe(11);
		super.setFeMaxima(11);
	}
	
	public Ladron(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ladron [nombre=" + nombre + " " + super.toString() + "]";
	}
	
	

}
