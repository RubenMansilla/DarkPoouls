package controlador;

import modelo.*;

public class Main {

	public static void main(String[] args) {

		Marginado caballero = new Marginado();
		System.out.println(caballero);
		caballero.subirNivel();
		caballero.subirNivel();
		System.out.println(caballero);
		DemonioRefugio demonio = new DemonioRefugio();
		System.out.println(demonio);
		
	}

}
