package modelo;

public class HachaDeMano extends Arma {

		public HachaDeMano() {
			super();
			super.setDano(6);
			super.setDescripcion("Sin descripcion");
			super.setNombre("Hacha de Mano");
		}

		public HachaDeMano(String descripcion, String nombre,  int daño) {
			super(descripcion,nombre, daño);
		}
		
		@Override
		public String toString() {
			return "Hacha de Mano " + super.toString() + "]";
		}
		

		
		
}

