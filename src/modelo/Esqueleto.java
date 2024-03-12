package modelo;

public class Esqueleto extends Personaje {
	
	//Constructor 
	public Esqueleto() {
		super();
		super.setNombre("Esqueleto");
		super.setVitalidad(15);
		super.setVidaMaxima(15);
		super.setFuerza(25);
		super.setFuerzaMaxima(25);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	
	public Esqueleto(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	
	@Override
	public String toString() {
		return "Esqueleto ["+super.toString()+  "]";
	}
	
	

}
