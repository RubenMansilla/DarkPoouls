package modelo;

public class ConjuntoTitanita extends Armadura{
	public ConjuntoTitanita(String nombre) {
		super();
		super.setNombre(nombre);
		super.setDefensa(8);
	}

	public ConjuntoTitanita(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}
}
