package modelo;

import java.util.Random;

public class HachaDeGuerra extends Arma {

		public HachaDeGuerra() {
			super();
			super.setDano(5);
		}

		public HachaDeGuerra(String descripcion, int daño) {
			super(descripcion, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha de Guerra " + super.toString() + "]";
		}
		

	}
