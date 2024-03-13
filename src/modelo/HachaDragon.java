package modelo;

public class HachaDragon extends HachaDeGuerra {

		public HachaDragon() {
			super();
			super.setDescripcion("");
			super.setDano(2);
		}

		public HachaDragon(String descripcion, int daño) {
			super(descripcion, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha Dragón " + super.toString() + "]";
		}
		

	}

