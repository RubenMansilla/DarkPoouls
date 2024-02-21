package modelo;

public class Clerigo extends Personaje {
	//Constructor 
	public Clerigo() {
		super();
		super.setVitalidad(11);
		super.setFuerza(12);
		super.setResistencia(11);
		super.setFe(14);
	}
	public Clerigo(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Clerigo [toString()=" + super.toString() + "]";
	}
	

}
