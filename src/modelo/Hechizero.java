package modelo;

public class Hechizero extends Personaje {
	//Constructor 
	public Hechizero() {
		super();
		super.setVitalidad(8);
		super.setFuerza(9);
		super.setResistencia(8);
		super.setFe(8);
	}
	public Hechizero(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Hechizero [toString()=" + super.toString() + "]";
	}
	

}
