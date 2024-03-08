package modelo;


public class EspadaArtorias extends EspadaOxidada {

	public EspadaArtorias() {
		super.setDano(10);
	}

	public EspadaArtorias(String descripcion, int daño) {
		super(descripcion, daño);
	}
	
	@Override
	public String toString() {
		return "Espada de Artorias " + super.toString() + "]";
	}
	

}
