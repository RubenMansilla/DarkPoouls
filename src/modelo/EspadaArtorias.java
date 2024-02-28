package modelo;

import java.util.Random;

public class EspadaArtorias extends EspadaOxidada {
	public EspadaArtorias(String nombre) {
		super(nombre);
		super.setDaño(10);
	}

	public EspadaArtorias(String nombre, String descripcion, int daño) {
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


