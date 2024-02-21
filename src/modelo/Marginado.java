package modelo;

public class Marginado extends Personaje {
	//Constructor 
	public Marginado() {
		super();
		super.setVitalidad(8);
		super.setFuerza(8);
		super.setResistencia(8);
		super.setFe(8);
	}
	public Marginado(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Marginado [toString()=" + super.toString() + "]";
	}
	

}
