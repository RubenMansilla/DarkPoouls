package modelo;

import java.util.Random;

public class HachaDeMano extends Arma {

		public HachaDeMano() {
			super();
			super.setDaño(6);
			super.setDescripcion("Sin descripcion");
		}

		public HachaDeMano(String descripcion, int daño) {
			super(descripcion, daño);
		}

		
		
}

