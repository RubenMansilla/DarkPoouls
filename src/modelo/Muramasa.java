package modelo;

public class Muramasa extends Katana {

	public Muramasa() {
		super.setDano(2);
		super.setNombre("Muramasa");
	}

	public Muramasa(String descripcion, String nombre, int daño) {
		super(descripcion, nombre, daño);
	}

	@Override
	public String toString() {
		return "Muramasa " + super.toString() + "]";
	}

}
