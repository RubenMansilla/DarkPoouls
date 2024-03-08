package modelo;

public class Uchigatana extends Katana {
	
	public Uchigatana() {
		super();
		super.setDano(8);
	}
	
	public Uchigatana(String descripcion, int daño) {
		super(descripcion, daño);
	}

	@Override
	public String toString() {
		return "Uchigatana " + super.toString() + "]";
	}
	
	


}
