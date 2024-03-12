package modelo;

import java.util.Random;

public class HachaDeGuerra extends HachaDeMano {

		public HachaDeGuerra() {
			super();
			super.setDano(2);
		}

		public HachaDeGuerra(String descripcion, int daño) {
			super(descripcion, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha de Guerra " + super.toString() + "]";
		}
		

	}
