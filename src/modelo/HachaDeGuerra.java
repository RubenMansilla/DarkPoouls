package modelo;

import java.util.Random;

public class HachaDeGuerra extends Arma {

		public HachaDeGuerra() {
			super();
			super.setDaño(5);
		}

		public HachaDeGuerra(String descripcion, int daño) {
			super(descripcion, daño);
		}

	}
