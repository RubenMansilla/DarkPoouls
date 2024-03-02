package modelo;

public class ConjuntoTitanita extends Armadura{
	
	public ConjuntoTitanita() {
		super();
		super.setDefensa(8);
	}

	public ConjuntoTitanita(String descripcion, int daño) {
		super(descripcion, daño);
	}
}
