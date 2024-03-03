package modelo;

public class ConjuntoHierro extends Armadura{
	
	public ConjuntoHierro() {
		super();
		super.setDefensa(4);
	}

	public ConjuntoHierro(String descripcion, int daño) {
		super(descripcion, daño);
	}
}
