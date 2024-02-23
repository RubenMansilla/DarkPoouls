package modelo;

public class Estus extends Objeto {

	public Estus() {
		super();
		super.setCantidad(getCantidad() + 1);
		super.setNombre("Estus");
	}

	public Estus(String nombre, int cantidad) {
		super(nombre, cantidad);
	}
	
}
