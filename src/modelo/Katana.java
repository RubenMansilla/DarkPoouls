package modelo;

import java.util.Random;

public class Katana extends Arma {

	public Katana() {
		super.setDano(2);
		super.setDescripcion("Sangrado: otorga al portador la capacidad de infligir hemorragias en sus oponentes");
	}

	public Katana(String descripcion, int daño) {
		super(descripcion, daño);
	}

	// Habilidad de la katana
	public int habilidadArma() {

		int dañoSangrado = 0;
		
		Random random = new Random();

		int probSangrado = random.nextInt(4) + 1;
		
		if (probSangrado == 1) {
			dañoSangrado += random.nextInt(10) + 1;
			
			System.out.println("Se aplica sangrado");
		}

		return dañoSangrado;

	}

	@Override
	public String toString() {
		return "Katana [Descripcion=  " + getDescripcion() + ", Daño()= " + getDano() + "]";
	}
	
	
	
}
