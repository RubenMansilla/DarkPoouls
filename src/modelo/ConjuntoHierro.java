package modelo;

public class ConjuntoHierro extends ConjuntoAnticuado{
	
	public ConjuntoHierro() {
		super();
		super.setDefensa(2);
	}

	public ConjuntoHierro(String descripcion, int daño) {
		super(descripcion, daño);
	}
}
