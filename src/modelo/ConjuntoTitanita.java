package modelo;

public class ConjuntoTitanita extends ConjuntoHierro{
	
	public ConjuntoTitanita() {
		super();
		super.setDefensa(2);
	}

	public ConjuntoTitanita(String descripcion, int daño) {
		super(descripcion, daño);
	}
}
