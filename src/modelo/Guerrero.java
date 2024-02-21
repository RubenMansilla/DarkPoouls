package modelo;

public class Guerrero extends Personaje {
	//Constructor 
	public Guerrero() {
		super();
		super.setVitalidad(11);
		super.setFuerza(13);
		super.setResistencia(11);
		super.setFe(9);
	}
	public Guerrero(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Guerrero [" + super.toString() + "]";
	}
	

}
