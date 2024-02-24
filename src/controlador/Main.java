package controlador;

import modelo.*;

public class Main {

	public static void main(String[] args) {

		
		Marginado caballero = new Marginado("ruben");
		System.out.println(caballero);
		caballero.subirNivel();
		caballero.subirNivel();
		System.out.println();
		System.out.println(caballero);
		
		System.out.println();
		
		DemonioRefugio demonio = new DemonioRefugio();
		Inventario i1 = new Inventario();
		
		demonio.crearInventario(i1);
		Estus e1 = new Estus();
		i1.agregarObjeto(e1);
		i1.agregarObjeto(e1);
		i1.agregarObjeto(e1);
		System.out.println(demonio);
		
		
		i1.eliminarObjeto(e1);
		System.out.println();
		System.out.println(demonio);
		i1.eliminarObjeto(e1);
		System.out.println();
		System.out.println(demonio);
		
		
	}

}
