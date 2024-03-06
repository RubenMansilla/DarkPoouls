package modelo;

public class CaballeroHueco extends Personaje {
	
	//Constructor 
	public CaballeroHueco() {
		super();
		super.setNombre("Caballero Hueco");
		super.setVitalidad(30);
		super.setVidaMaxima(30);
		super.setFuerza(10);
		super.setFuerzaMaxima(10);
		super.setResistencia(12);
		super.setResistenciaMaxima(12);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	public CaballeroHueco(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		
	}
	
	@Override
	public String toString() {
		return "CaballeroHueco [toString()=" + super.toString() + "]";
	}
	
	
}
