package modelo;

public class DemonioRefugio extends Personaje {
	
	//Constructor 
	public DemonioRefugio() {
		super();
		super.setNombre("Demonio del Refugio");
		super.setVitalidad(40);
		super.setFuerza(1);
		super.setFuerzaMaxima(14);
		super.setResistencia(11);
		super.setResistenciaMaxima(11);
		super.setFe(0);
		super.setFeMaxima(0);
	}
	
	public DemonioRefugio(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
	}

	@Override
	public String toString() {
		return "Demonio del Refugio ["+super.toString() +  "]";
	}



}
