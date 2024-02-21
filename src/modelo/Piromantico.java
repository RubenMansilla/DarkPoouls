package modelo;

public class Piromantico extends Personaje {
	//Constructor 
	public Piromantico() {
		super();
		super.setVitalidad(10);
		super.setFuerza(12);
		super.setResistencia(12);
		super.setFe(8);
	}
	public Piromantico(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Piromantico [toString()=" + super.toString() + "]";
	}
	

}
