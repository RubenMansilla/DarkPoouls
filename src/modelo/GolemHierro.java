package modelo;

public class GolemHierro extends Personaje {
	
	//Constructor 
	
	public GolemHierro() {
		super();
		super.setNombre("Golem de Hierro");
		super.setVitalidad(40);
		super.setVidaMaxima(40);
		super.setFuerza(18);
		super.setFuerzaMaxima(18);
		super.setResistencia(6);
		super.setResistenciaMaxima(6);
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
