package modelo;

public class Gwyn extends Personaje {
	
	//Constructor 
	
	public Gwyn() {
		super();
		super.setNombre("Gwyn");
		super.setVitalidad(12);
		super.setVidaMaxima(13);
		super.setFuerza(14);
		super.setFuerzaMaxima(14);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
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
