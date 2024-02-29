package modelo;

public class GolemCristal extends Personaje {
	
	//Constructor 
	public GolemCristal() {
		super();
		super.setNombre("Golem de Cristal");
		super.setVitalidad(30);
		super.setVidaMaxima(30);
		super.setFuerza(6);
		super.setFuerzaMaxima(6);
		super.setResistencia(20);
		super.setResistenciaMaxima(20);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	
	public GolemCristal(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	
	@Override
	public String toString() {
		return "DemonioRefugio ["+super.toString()+  "]";
	}
	
	

}
