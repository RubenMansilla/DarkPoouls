package modelo;

public class DemonioRefugio extends Personaje {
	
	//Constructor 
	public DemonioRefugio() {
		super();
		super.setNombre("Demonio del Refugio");
		super.setVitalidad(21);
		super.setVidaMaxima(super.getVitalidad());
		super.setFuerza(14);
		super.setFuerzaMaxima(super.getFuerza());
		super.setResistencia(4);
		super.setResistenciaMaxima(super.getResistencia());
		super.setFe(0);
		super.setFeMaxima(super.getFe());
	}
	
	public DemonioRefugio(int vitalidad, int fuerza, int resistencia, int fe, int rabia) {
		super(vitalidad, fuerza, resistencia, fe);
	}

	@Override
	public String toString() {
		return "Demonio del Refugio ["+super.toString() +  "]";
	}



}
