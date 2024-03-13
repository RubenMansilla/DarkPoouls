package modelo;

public class Excalibur extends EspadaOxidada {
	
	public Excalibur() {
		super.setDano(2);
	}

	public Excalibur(String descripcion, int daño) {
		super(descripcion, daño);
	}
	
	@Override
	public String toString() {
		return "Excalibur " + super.toString() + "]";
	}
	

}
