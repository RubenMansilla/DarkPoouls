package modelo;

public class CaballeroHueco extends Personaje {
	//Constructor 
	public CaballeroHueco() {
		super();
		super.setVitalidad(30);
		super.setFuerza(10);
		super.setResistencia(12);
		super.setFe(20);
	}
	public CaballeroHueco(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		
	}
	@Override
	public String toString() {
		return "DemonioRefugio ["+super.toString()+  "]";
	}
	
	

}
