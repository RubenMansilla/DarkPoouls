package modelo;

import java.util.Random;

public class HachaDragon extends Arma {

		public HachaDragon() {
			super();
			super.setDescripcion("");
			super.setDaño(5);
		}

		public HachaDragon(String descripcion, int daño) {
			super(descripcion, daño);
		}

		
		public void habilidadArma(Personaje enemigo) {
			
			Random random = new Random();

			int probHabilidad = random.nextInt(4) + 1;
			
			if (probHabilidad == 1) {
				enemigo.setResistencia(enemigo.getResistencia() - 3);
				
			}

		}
	}

