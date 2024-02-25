package modelo;

public class DemonioRefugio extends Personaje {
	
	//Atributos
	
	private int rabia;
	
	
	//Constructor 
	public DemonioRefugio() {
		super();
		super.setVitalidad(12);
		super.setFuerza(14);
		super.setResistencia(11);
		super.setFe(10);
	}
	
	public DemonioRefugio(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
		this.rabia = rabia;
	}

	@Override
	public String toString() {
		return "Demonio del Refugio" + super.toString() + " rabia=" + rabia;
	}



}