package modelo;

public class ConjuntoTitanita extends ConjuntoHierro{
	
	public ConjuntoTitanita() {
		super();
		super.setDefensa(2);
		super.setNombre("Conjunto de Titanita");
	}

	public ConjuntoTitanita(String descripcion, String nombre, int daño) {
		super(descripcion, nombre, daño);
	}
	
	public String toString() {
		return "Conjunto de Titanita " + super.toString() + "";
	}
}
