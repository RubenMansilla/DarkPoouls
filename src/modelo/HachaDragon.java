package modelo;

import java.util.Random;

public class HachaDragon extends Arma {

		public HachaDragon(String nombre) {
			super();
			super.setNombre(nombre);
			super.setDaño(5);
		}

		public HachaDragon(String nombre, String descripcion, int daño) {
			super(nombre, descripcion, daño);
		}

		
		public void habilidadArma(Personaje enemigo) {
			
			Random random = new Random();

			int probHabilidad = random.nextInt(4) + 1;
			
			if (probHabilidad == 1) {
				enemigo.setResistencia(enemigo.getResistencia() - 3);
				
			}

		}
	}
