package modelo;

public class AmuletoDelResguardo extends Objeto {

	public AmuletoDelResguardo() {
		super();
		super.setNombre("Amuleto Del Resguardo");
		super.setDescripcion("");
	}

	public AmuletoDelResguardo(String nombre, String descripcion, int cantidad) {
		super(nombre, descripcion, cantidad);
	}

	public void usarObjeto(Personaje personaje) {
		personaje.setResistencia(personaje.getResistencia() + 2);
	}

}
