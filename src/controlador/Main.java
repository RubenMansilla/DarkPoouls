package controlador;

import static view.FuncionesDialogo.centrarLinea;

import java.util.Scanner;

import modelo.*;

import view.*;

public class Main {

	public static void main(String[] args) {

		String nombreFinal = null;

		String finalDeLaPartida = aventura(nombreFinal);

		if (finalDeLaPartida.equals("derrota")) {
			System.out.println(Recursos.gameOver);
		} else if (finalDeLaPartida.equals("fin de la partida")) {
			System.out.println(Recursos.finDelJuego);
		}

	}

	public static String aventura(String nombreFinal) {

		Scanner sc = new Scanner(System.in);

		// Enemigos
		DemonioRefugio demonio = new DemonioRefugio();
		CaballeroHueco caballeroHueco = new CaballeroHueco();
		Esqueleto esqueleto = new Esqueleto();
		GolemCristal golemCristal = new GolemCristal();
		GolemHierro golemHierro = new GolemHierro();
		Gwyn gwyn = new Gwyn();
		Nito nito = new Nito();

		// Objetos
		Estus estus = new Estus();
		Creatina cretina = new Creatina();
		CuerpoDeCristo cuerpoDeCristo = new CuerpoDeCristo();
		AmuletoDelResguardo amuletoDelResguardo = new AmuletoDelResguardo();

		// Armadura
		ConjuntoAnticuado conjuntoAnticuado = new ConjuntoAnticuado();
		ConjuntoHierro conjuntoHierro = new ConjuntoHierro();
		ConjuntoTitanita conjuntoTitanita = new ConjuntoTitanita();

		// Objetos del personaje
		Personaje personajeElegido = null;
		Arma armaElegida = null;
		Arma armaEvolucionada = null;
		Arma armaEvolucionada2 = null;
		Habilidad habilidadElegida = null;

		// Variables
		int opcion = 0;
		
		System.out.println(Recursos.vs);

		System.out.println(Dialogos.cajaIntroduccion());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Como te llamas?"));
		String nombre = sc.nextLine();
		// Si el usuario no ingreso nada, o el primer carácter del nombre no es una
		// letra, vuelve a pedirlo hasta que el dato sea correcto
		while (nombre.isEmpty() || !Character.isLetter(nombre.charAt(0))) {
			System.out.println(Dialogos.cajaErrorInicio());
			System.out.println(centrarLinea("Como te llamas?"));
			nombre = sc.nextLine();
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.cajaEscogerPersonaje());
		System.out.println("Ingrese el numero correspondiente al personaje: ");

		while (!sc.hasNextInt()) {
			System.out.println(Dialogos.cajaErrorOpcionPersonje());
			sc.next(); // Consumir la entrada incorrecta para evitar un bucle infinito
		}

		opcion = sc.nextInt();

		while (opcion < 1 || opcion > 9) {
			System.out.println(Dialogos.cajaErrorOpcionPersonje());
			opcion = sc.nextInt();
		}
		// Dependiendo de la opción elegida, se crea un personaje
		if (opcion == 1) {
			personajeElegido = new Bandido(nombre);
		} else if (opcion == 2) {
			personajeElegido = new Caballero(nombre);
		} else if (opcion == 3) {
			personajeElegido = new Cazador(nombre);
		} else if (opcion == 4) {
			personajeElegido = new Clerigo(nombre);
		} else if (opcion == 5) {
			personajeElegido = new Guerrero(nombre);
		} else if (opcion == 6) {
			personajeElegido = new Ladron(nombre);
		} else if (opcion == 7) {
			personajeElegido = new Marginado(nombre);
		} else if (opcion == 8) {
			personajeElegido = new Piromantico(nombre);
		} else if (opcion == 9) {
			personajeElegido = new Vagabundo(nombre);
		}

		sc.nextLine();

		System.out.println();

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.cajaEscogerArma());
		System.out.println("Ingrese el numero correspondiente al arma: ");

		while (!sc.hasNextInt()) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			sc.next();
		}

		opcion = sc.nextInt();
		// Dependiendo de la opción elegida, se crea un arma
		while (opcion < 1 || opcion > 3) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			armaElegida = new Katana();
			armaEvolucionada = new Muramasa();
			armaEvolucionada2 = new Uchigatana();
		} else if (opcion == 2) {
			armaElegida = new EspadaOxidada();
			armaEvolucionada = new Excalibur();
			armaEvolucionada2 = new EspadaArtorias();
		} else if (opcion == 3) {
			armaElegida = new HachaDeMano();
			armaEvolucionada = new HachaDeGuerra();
			armaEvolucionada2 = new HachaDragon();
		}

		System.out.println();

		sc.nextLine();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.cajaEscogerHabilidad());
		System.out.println("Ingrese el numero correspondiente a la habilidad: ");

		while (!sc.hasNextInt()) {
			System.out.println(Dialogos.cajaErrorOpcionHabilidad());
			sc.next();
		}

		opcion = sc.nextInt();
		// Dependiendo de la opción elegida, se crea una habilidad
		while (opcion < 1 || opcion > 3) {
			System.out.println(Dialogos.cajaErrorOpcionHabilidad());
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			habilidadElegida = new Berserker();
		} else if (opcion == 2) {
			habilidadElegida = new AuraPurificadora();
		} else if (opcion == 3) {
			habilidadElegida = new EscudoMagico();
		}

		personajeElegido.equiparArma(armaElegida);
		personajeElegido.equiparArmadura(conjuntoAnticuado);
		personajeElegido.agregarHabilidad(habilidadElegida);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
				
		System.out.println();
		System.out.println(Dialogos.cajaIntroduccion());
		System.out.println(Dialogos.cajaProta(personajeElegido));
		
		
		
		System.out.println();
		//System.out.println("Mientras recorres tu camino te encuentras");
		System.out.println(Dialogos.cajaBoss(demonio));
		personajeElegido.batalla(demonio);
		if (personajeElegido.getVitalidad() < 0) {
			System.out.println(Recursos.gameOver);
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(demonio));
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		
		System.out.println();
		System.out.println("Mientras recorres tu camino te encuentras");
		
		System.out.println(Dialogos.cajaEqEncuentro(personajeElegido, esqueleto));
		personajeElegido.batalla(esqueleto);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		
		System.out.println(Dialogos.cajaEqDerrotado(personajeElegido, esqueleto));
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));	
		System.out.println(Dialogos.cajaGCEncuentro(personajeElegido, golemCristal));
		personajeElegido.batalla(golemCristal);
		if (personajeElegido.getVitalidad() < 0) {
			System.out.println(Recursos.gameOver);
			return "derrota";
		}
		
		System.out.println();
		System.out.println(Dialogos.cajaGCDerrota(personajeElegido, golemCristal));
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		
		System.out.println(Dialogos.cajaCHEncuentro(personajeElegido, caballeroHueco));
		personajeElegido.batalla(caballeroHueco);
		if (personajeElegido.getVitalidad() < 0) {
			System.out.println(Recursos.gameOver);
			return "derrota";
		}
		
		System.out.println();
		System.out.println(Dialogos.cajaCHDerrotado(personajeElegido, caballeroHueco));
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		
		System.out.println("Tu arma evoluciona");
		personajeElegido.equiparArma(armaEvolucionada);
		
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		
		System.out.println("Tu armadura evoluciona");
		personajeElegido.equiparArmadura(conjuntoHierro);
		
		System.out.println();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		
		
		
		return "finDeLaPartida";
	}

}
