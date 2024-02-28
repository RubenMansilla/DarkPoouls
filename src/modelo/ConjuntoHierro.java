package modelo;

public class ConjuntoHierro extends Armadura{
	public ConjuntoHierro(String nombre) {
		super();
		super.setNombre(nombre);
		super.setDefensa(4);
	}

	public ConjuntoHierro(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}
}
