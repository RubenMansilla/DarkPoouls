package modelo;

public class Muramasa extends Katana {
	

	public Muramasa() {
		super.setDano(5);
	}
	
	public Muramasa(String descripcion, int daño) {
		super(descripcion, daño);
	}

	@Override
	public String toString() {
		return "Muramasa " + super.toString() + "]";
	}
	
	
}
