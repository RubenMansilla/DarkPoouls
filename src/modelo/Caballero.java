package modelo;

public class Caballero extends Personaje {
	//Constructor 
	public Caballero() {
		super();
		super.setVitalidad(14);
		super.setFuerza(11);
		super.setResistencia(10);
		super.setFe(11);
	}
	public Caballero(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);	
	}
	@Override
	public String toString() {
		return "Caballero [" + super.toString() + "]";
	}
	

}
