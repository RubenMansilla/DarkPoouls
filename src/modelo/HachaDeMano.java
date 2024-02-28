package modelo;

import java.util.Random;

public class HachaDeMano extends Arma {

		public HachaDeMano(String nombre) {
			super();
			super.setNombre(nombre);
			super.setDaño(5);
		}

		public HachaDeMano(String nombre, String descripcion, int daño) {
			super(nombre, descripcion, daño);
		}

		
		
}

