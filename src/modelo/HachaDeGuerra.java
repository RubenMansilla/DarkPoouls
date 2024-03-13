package modelo;

public class HachaDeGuerra extends HachaDeMano {

	public HachaDeGuerra() {
		super();
		super.setDano(2);
		super.setNombre("Hacha de Guerra");
	}

	public HachaDeGuerra(String descripcion, String nombre, int daño) {
		super(descripcion, nombre, daño);
	}

	@Override
	public String toString() {
		return "Hacha de Guerra " + super.toString() + "]";
	}

}
