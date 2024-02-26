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
		Creatina creatina = new Creatina();
		Estus e1 = new Estus();
		i1.agregarObjeto(e1);
		i1.agregarObjeto(e1);
		i1.agregarObjeto(creatina);
		System.out.println(demonio);
		
		
		i1.eliminarObjeto(e1);
		demonio.setVitalidad(4);
		System.out.println();
		System.out.println(demonio);
		System.out.println();
		System.out.println(demonio.getVidaMaxima());
		demonio.usarObjeto(e1);
		System.out.println();
		System.out.println(demonio);
		
		System.out.println();
		System.out.println(demonio.getFuerzaMaxima());
		System.out.println(demonio.getResistenciaMaxima());
		
		demonio.subirNivel();
		System.out.println();
		System.out.println(demonio);
		
		System.out.println();
		System.out.println(demonio.getFuerzaMaxima());
		System.out.println(demonio.getResistenciaMaxima());
		System.out.println();
		
		demonio.usarObjeto(creatina);
		System.out.println(demonio);
		System.out.println();
		System.out.println(demonio.getFuerzaMaxima());

		demonio.reiniciarEstadisticas();
		System.out.println();
		System.out.println(demonio);
		
		Berserker bersek = new Berserker();
		demonio.usarHabilidad(bersek);
		System.out.println();
		System.out.println(demonio);
		
		demonio.reiniciarEstadisticas();
		System.out.println();
		System.out.println(demonio);

	}

}
