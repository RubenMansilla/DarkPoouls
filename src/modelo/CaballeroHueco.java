package modelo;

public class CaballeroHueco extends Personaje {
	
	private String nombre;
	
	//Constructor 
	public CaballeroHueco(String nombre) {
		super();
		this.nombre = nombre;
		super.setVitalidad(30);
		super.setFuerza(10);
		super.setResistencia(12);
		super.setFe(20);
	}
	public CaballeroHueco(String nombre, int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		this.nombre = nombre;
		
	}
	
	@Override
	public String toString() {
		return "Caballero Hueco [nombre=" + nombre + " " + super.toString() + "]";
	}

}
