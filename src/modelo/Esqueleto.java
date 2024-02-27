package modelo;

public class Esqueleto extends Personaje {
	
	//Constructor 
	public Esqueleto() {
		super();
		super.setVitalidad(9);
		super.setVidaMaxima(9);
		super.setFuerza(14);
		super.setFuerzaMaxima(14);
		super.setResistencia(8);
		super.setResistenciaMaxima(8);
		super.setFe(18);
		super.setFeMaxima(18);
	}
	
	public Esqueleto(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	
	@Override
	public String toString() {
		return "DemonioRefugio ["+super.toString()+  "]";
	}
	
	

}
