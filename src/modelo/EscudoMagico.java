package modelo;

public class EscudoMagico extends Habilidad {
	
	public EscudoMagico() {
		super.setNombre("EscudoMagico");
		super.setDescripcion("");
		super.setCosteFe(10);
	}

	public EscudoMagico(String nombre, String descripcion, int costeMana) {
		super(nombre, descripcion, costeMana);
	}

}
