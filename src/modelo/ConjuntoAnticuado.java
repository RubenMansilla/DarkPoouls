package modelo;

public class ConjuntoAnticuado extends Armadura{
	public ConjuntoAnticuado(String nombre) {
		super();
		super.setNombre(nombre);
		super.setDefensa(2);
	}

	public ConjuntoAnticuado(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}
}
