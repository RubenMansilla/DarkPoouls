package modelo;

public class Gwyn extends Personaje {
	
	//Atributos
	
	private int rabia;
	
	//Constructor 
	
	public Gwyn() {
		super();
		super.setVitalidad(12);
		super.setVidaMaxima(13);
		super.setFuerza(14);
		super.setFuerzaMaxima(14);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(10);
		super.setFeMaxima(10);
	}
	
	public Gwyn(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
		this.rabia = rabia;
	}
	
	@Override
	public String toString() {
		return "DemonioRefugio ["+super.toString()+"rabia=" + rabia +  "]";
	}
	
	

}
