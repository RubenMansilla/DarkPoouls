package modelo;

public class Gwyn extends Personaje {
	
	//Constructor 
	
	public Gwyn() {
		super();
		super.setNombre("Gwyn");
		super.setVitalidad(65);
		super.setVidaMaxima(65);
		super.setFuerza(31);
		super.setFuerzaMaxima(31);
		super.setResistencia(19);
		super.setResistenciaMaxima(19);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	
	public Gwyn(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	
	@Override
	public String toString() {
		return "Gwyn ["+super.toString() +  "]";
	}
	
	

}
