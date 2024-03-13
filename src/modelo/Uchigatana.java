package modelo;

public class Uchigatana extends Muramasa {
	
	public Uchigatana() {
		super();
		super.setDano(2);
		super.setNombre("Uchigatana");
	}
	
	public Uchigatana(String descripcion, String nombre, int daño) {
		super(descripcion, nombre, daño);
	}

	@Override
	public String toString() {
		return "Uchigatana " + super.toString() + "]";
	}
	
	


}
