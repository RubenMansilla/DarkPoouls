package modelo;

import java.util.Random;

public class HachaDeMano extends Arma {

		public HachaDeMano() {
			super();
			super.setDano(6);
			super.setDescripcion("Sin descripcion");
		}

		public HachaDeMano(String descripcion, int daño) {
			super(descripcion, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha de Mano " + super.toString() + "]";
		}
		

		
		
}

