package modelo;

import java.util.Random;

public class Excalibur extends EspadaOxidada {
	public Excalibur(String nombre) {
		super(nombre);
		super.setDaño(10);
	}

	public Excalibur(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}

	
	/*public void habilidadArma(Personaje enemigo) {
		
		Random random = new Random();

		int probHabilidad = random.nextInt(4) + 1;
		
		if (probHabilidad == 1) {
			enemigo.setResistencia(enemigo.getResistencia() - 3);
			
}
		}*/

}
