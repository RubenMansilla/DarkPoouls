package modelo;

import java.util.Random;

public class HachaDragon extends Arma {

		public HachaDragon() {
			super();
			super.setDescripcion("");
			super.setDano(5);
		}

		public HachaDragon(String descripcion, int daño) {
			super(descripcion, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha Dragón " + super.toString() + "]";
		}
		

	}

