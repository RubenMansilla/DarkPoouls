package modelo;

public class Nito extends Personaje {
	
	//Constructor 
	public Nito() {
		super();
		super.setNombre("Nito");
		super.setVitalidad(52);
		super.setVidaMaxima(52);
		super.setFuerza(25);
		super.setFuerzaMaxima(25);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	
	public Nito(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	
	@Override
	public String toString() {
		return "Nito ["+super.toString() +  "]";
	}
	
	

}
