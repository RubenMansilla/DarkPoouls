package modelo;

import java.util.Random;

public class EspadaOxidada extends Arma {

	public EspadaOxidada() {
		super();
		super.setDano(4);
		super.setDescripcion("Quebranta huesos: reduce la resistencia del enemigo");
		super.setNombre("Espada Oxidada");
	}

	public EspadaOxidada(String descripcion, String nombre,  int daño) {
		super(descripcion,nombre, daño);
	}
	
	public void habilidadArma(Personaje enemigo) {
		
		Random random = new Random();

		int probHabilidad = random.nextInt(4) + 1;
		
		if (probHabilidad == 1) {
			enemigo.setResistencia(enemigo.getResistencia() - 3);
			
		}

	}
	
	@Override
	public String toString() {
		return "Espada Oxidada " + super.toString() + "]";
	}
	
}
