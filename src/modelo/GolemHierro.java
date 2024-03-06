package modelo;

public class GolemHierro extends Personaje {
	
	//Constructor 
	
	public GolemHierro() {
		super();
		super.setNombre("Golem de Hierro");
		super.setVitalidad(12);
		super.setVidaMaxima(12);
		super.setFuerza(14);
		super.setFuerzaMaxima(14);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	
	public GolemHierro(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
	}
	
	@Override
	public String toString() {
		return "Golem de Hierro ["+super.toString() +  "]";
	}
	
	

}
