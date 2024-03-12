package modelo;

public class ConjuntoAnticuado extends Armadura{
	
	public ConjuntoAnticuado() {
		super();
		super.setDefensa(4);
		super.setDescripcion("Compuesto por piezas rudimentarias y básicas que reflejan un diseño y fabricación primitivos");
	}

	public ConjuntoAnticuado(String descripcion, int daño) {
		super(descripcion, daño);
	}
}
