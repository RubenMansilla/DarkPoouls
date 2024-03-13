package modelo;

public class Excalibur extends EspadaOxidada {
	
	public Excalibur() {
		super.setDano(2);
		super.setNombre("Excalibur");
	}

	public Excalibur(String descripcion, String nombre,  int daño) {
		super(descripcion,nombre, daño);
	}
	
	@Override
	public String toString() {
		return "Excalibur " + super.toString() + "]";
	}
	

}
