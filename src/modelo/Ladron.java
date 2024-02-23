package modelo;

public class Ladron extends Personaje {
	
	//Constructor 
	public Ladron() {
		super();
		super.setVitalidad(9);
		super.setFuerza(9);
		super.setResistencia(10);
		super.setFe(11);
	}
	
	public Ladron(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	
	@Override
	public String toString() {
		return "Ladron [toString()=" + super.toString() + "]";
	}
	

}
