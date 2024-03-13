package modelo;

public class ConjuntoAnticuado extends Armadura{
	
	public ConjuntoAnticuado() {
		super();
		super.setDefensa(4);
		super.setDescripcion("Compuesto por piezas rudimentarias y básicas que reflejan un diseño y fabricación primitivos");
		super.setNombre("Conjunto Anticuado");
	}

	public ConjuntoAnticuado(String descripcion, String nombre, int daño) {
		super(descripcion, nombre, daño);
	}

	@Override
	public String toString() {
		return "Conjunto Anticuado " + super.toString() + "";
	}
	
	
}
