package modelo;

import java.util.Random;

public class Excalibur extends EspadaOxidada {
	
	public Excalibur(String nombre) {
		super.setDaño(10);
	}

	public Excalibur(String descripcion, int daño) {
		super(descripcion, daño);
	}

}
