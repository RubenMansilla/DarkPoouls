package modelo;

public class Creatina extends Objeto {

	public Creatina() {
		super();
		super.setNombre("Creatina");
		super.setDescripcion("Boleto express al Olimpo de la fuerza. Este objeto mágico potencia tus músculos");
	}

	public Creatina(String nombre, String descripcion, int cantidad) {
		super(nombre, descripcion, cantidad);
	}

	public void usarObjeto(Personaje personaje) {
		personaje.setFuerza(personaje.getFuerza() + 4);
	}

}
