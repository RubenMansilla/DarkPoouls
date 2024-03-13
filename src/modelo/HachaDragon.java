package modelo;

public class HachaDragon extends HachaDeGuerra {

		public HachaDragon() {
			super();
			super.setDescripcion("");
			super.setDano(2);
			super.setNombre("Hacha Dragon");
		}

		public HachaDragon(String descripcion, String nombre,  int daño) {
			super(descripcion,nombre, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha Dragón " + super.toString() + "]";
		}
		

	}

