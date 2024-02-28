package modelo;

import java.util.Random;

public class Katana extends Arma {

	public Katana(String nombre) {
		super();
		super.setNombre(nombre);
		super.setDaño(2);
		super.setDescripcion("Sangrado: otorga al portador la capacidad de infligir hemorragias en sus oponentes\r\n"
				+ "");
	}

	public Katana(String nombre, String descripcion, int daño) {
		super(nombre, descripcion, daño);
	}

	
	public int habilidadArma() {

		int dañoSangrado = 0;
		
		Random random = new Random();

		int probSangrado = random.nextInt(4) + 1;
		
		if (probSangrado == 1) {
			dañoSangrado = random.nextInt(10) + 1;
			
		}

		return dañoSangrado;

	}

	
}
