package modelo;

import java.util.Random;

public class Katana extends Arma {

	public Katana() {
		super.setDano(4);
		super.setDescripcion("Sangrado: otorga al portador la capacidad de infligir hemorragias en sus oponentes");
		super.setNombre("Katana");
	}

	public Katana(String descripcion, String nombre,  int daño) {
		super(descripcion,nombre, daño);
	}

	// Habilidad de la katana
	public int habilidadArma() {

		int dañoSangrado = 0;
		
		Random random = new Random();

		int probSangrado = random.nextInt(4) + 1;
		
		if (probSangrado == 1) {
			dañoSangrado += random.nextInt(10) + 1;
			
			System.out.println("Se aplica sangrado: + " + dañoSangrado + " de daño por sangrado");
		}

		return dañoSangrado;

	}

	@Override
	public String toString() {
		return "Katana [Descripcion=  " + getDescripcion() + ", Daño()= " + getDano() + "]";
	}
	
	
}
