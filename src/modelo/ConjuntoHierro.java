package modelo;

public class ConjuntoHierro extends ConjuntoAnticuado{
	
	public ConjuntoHierro() {
		super();
		super.setDefensa(2);
		super.setNombre("Conjunto de Hierro");
	}

	public ConjuntoHierro(String descripcion, String nombre, int daño) {
		super(descripcion, nombre, daño);
	}
	

	@Override
	public String toString() {
		return "Conjunto de Hierro " + super.toString() + "";
	}
}
