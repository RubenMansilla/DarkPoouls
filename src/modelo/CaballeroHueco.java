package modelo;

public class CaballeroHueco extends Personaje {
	
	//Constructor 
	public CaballeroHueco() {
		super();
		super.setNombre("Caballero Hueco");
		super.setVitalidad(46);
		super.setVidaMaxima(46);
		super.setFuerza(26);
		super.setFuerzaMaxima(26);
		super.setResistencia(15);
		super.setResistenciaMaxima(15);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	public CaballeroHueco(int vitalidad, int fuerza, int resistencia, int fe) {
		super(vitalidad, fuerza, resistencia, fe);
		
	}
	
	@Override
	public String toString() {
		return "Caballero Hueco [toString()=" + super.toString() + "]";
	}
	
	
}
