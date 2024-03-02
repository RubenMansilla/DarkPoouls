package modelo;

public class ConjuntoAnticuado extends Armadura{
	
	public ConjuntoAnticuado() {
		super();
		super.setDefensa(2);
	}

	public ConjuntoAnticuado(String descripcion, int daño) {
		super(descripcion, daño);
	}
}
