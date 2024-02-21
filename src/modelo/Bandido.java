package modelo;

public class Bandido extends Personaje {
	//Constructor 
	public Bandido() {
		super();
		super.setVitalidad(12);
		super.setFuerza(14);
		super.setResistencia(11);
		super.setFe(10);
	}
	public Bandido(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Bandido [" + super.toString() + "]";
	}
	
	

}
