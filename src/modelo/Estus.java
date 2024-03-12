package modelo;
import view.*;

public class Estus extends Objeto {

	public Estus() {
		super();
		super.setNombre("Estus");
		super.setDescripcion("Objeto sagrado que restaura la vitalidad de tu personaje al instante");
	}

	public Estus(String nombre, String descripcion, int cantidad) {
		super(nombre, descripcion, cantidad);
	}
	
	 public void usarObjeto(Personaje personaje) {
		 if (personaje.getVitalidad() != personaje.getVidaMaxima()) {		 
			 personaje.setVitalidad(personaje.getVitalidad() + (personaje.getVidaMaxima() / 3));
		 }else {
			 System.out.println(FuncionesDialogo.centrarLinea(personaje.getNombre() + " tienes la vida al máximo. Dedicate a otra cosa"));
		 }
	 }
	
}
