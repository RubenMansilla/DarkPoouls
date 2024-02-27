package modelo;

public class CuerpoDeCristo extends Objeto {
	
	public CuerpoDeCristo() {
		super();
		super.setNombre("Cuerpo De Cristo");
		super.setDescripcion("Esencia que permite a tu héroe recuperar la conexión espiritual perdida");
	}

	public CuerpoDeCristo(String nombre, String descripcion, int cantidad) {
		super(nombre, descripcion, cantidad);
	}
	
	 public void usarObjeto(Personaje personaje) {
		 personaje.setFe(personaje.getFeMaxima());
	 }

}