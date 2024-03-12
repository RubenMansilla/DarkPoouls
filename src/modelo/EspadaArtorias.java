package modelo;


public class EspadaArtorias extends Excalibur {

	public EspadaArtorias() {
		super.setDano(2);
	}

	public EspadaArtorias(String descripcion, int daño) {
		super(descripcion, daño);
	}
	
	@Override
	public String toString() {
		return "Espada de Artorias " + super.toString() + "]";
	}
	

}
