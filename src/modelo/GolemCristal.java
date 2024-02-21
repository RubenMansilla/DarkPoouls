package modelo;

public class GolemCristal extends Personaje {
	//Constructor 
	public GolemCristal() {
		super();
		super.setVitalidad(30);
		super.setFuerza(6);
		super.setResistencia(20);
		super.setFe(0);
	}
	public GolemCristal(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	@Override
	public String toString() {
		return "DemonioRefugio ["+super.toString()+  "]";
	}
	
	

}
