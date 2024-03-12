package modelo;

public class Uchigatana extends Muramasa {
	
	public Uchigatana() {
		super();
		super.setDano(2);
	}
	
	public Uchigatana(String descripcion, int daño) {
		super(descripcion, daño);
	}

	@Override
	public String toString() {
		return "Uchigatana " + super.toString() + "]";
	}
	
	


}
