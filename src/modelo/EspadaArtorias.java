package modelo;


public class EspadaArtorias extends Excalibur {

	public EspadaArtorias() {
		super.setDano(2);
		super.setNombre("Espada de Artorias");
	}

	public EspadaArtorias(String descripcion, String nombre,  int daño) {
		super(descripcion,nombre, daño);
	}
	
	@Override
	public String toString() {
		return "Espada de Artorias " + super.toString() + "]";
	}
	

}
