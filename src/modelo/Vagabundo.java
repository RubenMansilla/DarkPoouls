package modelo;

public class Vagabundo extends Personaje {
	//Constructor 
	public Vagabundo() {
		super();
		super.setVitalidad(10);
		super.setFuerza(10);
		super.setResistencia(12);
		super.setFe(8);
	}
	public Vagabundo(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Vagabundo [toString()=" + super.toString() + "]";
	}
	

}
