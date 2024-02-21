package modelo;

public class Cazador extends Personaje {
	//Constructor 
	public Cazador() {
		super();
		super.setVitalidad(11);
		super.setFuerza(12);
		super.setResistencia(11);
		super.setFe(9);
	}
	public Cazador(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Cazador [" + super.toString() + "]";
	}
	

}
