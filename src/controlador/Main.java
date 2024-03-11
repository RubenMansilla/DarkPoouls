package controlador;

import java.util.Scanner;

import modelo.*;
import view.*;

import static view.FuncionesDialogo.centrarLinea;

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
		Arma armaElegida = null;
		Arma armaEvolucionada = null;
		Arma armaEvolucionada2 = null;

		// Variables
		int opcion = 0;
		String armaElegidaNombre = "";
		String armaEvolucionadaNombre = "";
		String armaEvolucionadaNombre2 = "";
		String armaduraElegidaNombre = "Conjunto Anticuado";
		String armaduraEvolucionadaNombre = "Conjunto de Hierro";
		String armaduraEvolucionadaNombre2 = "Conjunto de Titanita";

		// Inicio

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

		// Selección de personaje
		Personaje personajeElegido = seleccionarPersonaje(sc, nombre);

		System.out.println();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Seleccion de arma
		System.out.println(Dialogos.cajaEscogerArma());
		System.out.println("Ingrese el numero correspondiente al arma: ");

		while (!sc.hasNextInt()) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			sc.next(); // Consumir la entrada incorrecta para evitar un bucle infinito
		}

		opcion = sc.nextInt();

		while (opcion < 1 || opcion > 3) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			armaElegida = new Katana();
			armaElegidaNombre = "Katana";
			armaEvolucionada = new Muramasa();
			armaEvolucionadaNombre = "Muramasa";
			armaEvolucionada2 = new Uchigatana();
			armaEvolucionadaNombre2 = "Uchigatana";
		} else if (opcion == 2) {
			armaElegida = new EspadaOxidada();
			armaElegidaNombre = "Espada";
			armaEvolucionada = new Excalibur();
			armaEvolucionadaNombre = "Excalibur";
			armaEvolucionada2 = new EspadaArtorias();
			armaEvolucionadaNombre2 = "Espada de Artorias";
		} else if (opcion == 3) {
			armaElegida = new HachaDeMano();
			armaElegidaNombre = "Hacha de Mano";
			armaEvolucionada = new HachaDeGuerra();
			armaEvolucionadaNombre = "Hacha de Guerra";
			armaEvolucionada2 = new HachaDragon();
			armaEvolucionadaNombre2 = "Hacha del Dragon";
		}

		// Equipar armadura y habilidad
		personajeElegido.equiparArma(armaElegida);
		personajeElegido.equiparArmadura(conjuntoAnticuado);

		System.out.println();
		sc.nextLine();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Seleccion de Habilidad y añadir habilidad
		seleccionarHabilidad(personajeElegido, sc);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		System.out.println();
		System.out.println(Dialogos.cajaIntroduccion());
		System.out.println(Dialogos.cajaProta(personajeElegido));

		// Batalla Demonio del refugio
		System.out.println();
		System.out.println(Dialogos.cajaBoss(demonio));
		personajeElegido.batalla(demonio);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(demonio));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(estus, 5));
		personajeElegido.agregarObjeto(estus);
		personajeElegido.agregarObjeto(estus);
		personajeElegido.agregarObjeto(estus);
		personajeElegido.agregarObjeto(estus);
		personajeElegido.agregarObjeto(estus);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla Golems de cristal(2 batallas)
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(Dialogos.cajaGCEncuentro(personajeElegido, golemCristal));
		personajeElegido.batalla(golemCristal);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaGCDerrota(personajeElegido, golemCristal));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(amuletoDelResguardo, 2));
		personajeElegido.agregarObjeto(amuletoDelResguardo);
		personajeElegido.agregarObjeto(amuletoDelResguardo);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(Dialogos.cajaGCEncuentro(personajeElegido, golemCristal));
		personajeElegido.batalla(golemCristal);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaGCDerrota(personajeElegido, golemCristal));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(amuletoDelResguardo, 1));
		personajeElegido.agregarObjeto(amuletoDelResguardo);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla Golem de hierro
		System.out.println(centrarLinea("Estadística"));
		System.out.println();
		System.out.println(Dialogos.cajaBoss(golemHierro));
		personajeElegido.batalla(golemHierro);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(golemHierro));

		// Evolucion arma y armadura
		System.out.println(Dialogos.cajaEvolucion(armaElegidaNombre, armaEvolucionadaNombre, armaduraElegidaNombre,
				armaduraEvolucionadaNombre));
		personajeElegido.equiparArma(armaEvolucionada);
		personajeElegido.equiparArmadura(conjuntoHierro);

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla esqueletos
		System.out.println();
		System.out.println(Dialogos.cajaEqEncuentro(personajeElegido, esqueleto));
		personajeElegido.batalla(esqueleto);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println(Dialogos.cajaEqDerrotado(personajeElegido, esqueleto));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(cretina, 2));
		personajeElegido.agregarObjeto(cretina);
		personajeElegido.agregarObjeto(cretina);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println();
		System.out.println(Dialogos.cajaEqEncuentro(personajeElegido, esqueleto));
		personajeElegido.batalla(esqueleto);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println(Dialogos.cajaEqDerrotado(personajeElegido, esqueleto));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(cretina, 2));
		personajeElegido.agregarObjeto(cretina);
		personajeElegido.agregarObjeto(cretina);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Escoger otra habilidad
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		seleccionarHabilidad(personajeElegido, sc);

		// Batalla Nito
		System.out.println();
		System.out.println(Dialogos.cajaBoss(nito));
		personajeElegido.batalla(nito);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(nito));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(cuerpoDeCristo, 3));
		personajeElegido.agregarObjeto(cuerpoDeCristo);
		personajeElegido.agregarObjeto(cuerpoDeCristo);
		personajeElegido.agregarObjeto(cuerpoDeCristo);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla Caballeor hueco
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		System.out.println(Dialogos.cajaCHEncuentro(personajeElegido, caballeroHueco));
		personajeElegido.batalla(caballeroHueco);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaCHDerrotado(personajeElegido, caballeroHueco));
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		System.out.println(Dialogos.cajaCHEncuentro(personajeElegido, caballeroHueco));
		personajeElegido.batalla(caballeroHueco);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaCHDerrotado(personajeElegido, caballeroHueco));

		// Evolucion arma y armadura
		System.out.println(Dialogos.cajaEvolucion(armaEvolucionadaNombre, armaEvolucionadaNombre2,
				armaduraEvolucionadaNombre, armaduraEvolucionadaNombre2));
		personajeElegido.equiparArma(armaEvolucionada2);
		personajeElegido.equiparArmadura(conjuntoTitanita);

		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla final Gwyn
		System.out.println();
		System.out.println(Dialogos.cajaBoss(gwyn));
		personajeElegido.batalla(gwyn);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(gwyn));
		System.out.println(Dialogos.reiniciarEstadisticas(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		return "finDeLaPartida";
	}

	private static int habilidadElegidaAnterior = 0;

	private static void seleccionarHabilidad(Personaje personaje, Scanner sc) {
		System.out.println(Dialogos.cajaEscogerHabilidad());
		System.out.println("Ingrese el numero correspondiente a la habilidad: ");
		int opcion = obtenerOpcionValida(sc, 1, 3);

		// Verifica si la opción seleccionada es diferente a la habilidad anterior
		while (opcion == habilidadElegidaAnterior) {
			System.out.println(Dialogos.cajaErrorOpcionHabilidad2());
			opcion = obtenerOpcionValida(sc, 1, 3);
		}

		if (opcion == 1) {
			habilidadElegidaAnterior = 1;
			Berserker berserker = new Berserker();
			personaje.agregarHabilidad(berserker);
		} else if (opcion == 2) {
			habilidadElegidaAnterior = 2;
			AuraPurificadora auraPurificadora = new AuraPurificadora();
			personaje.agregarHabilidad(auraPurificadora);
		} else if (opcion == 3) {
			habilidadElegidaAnterior = 3;
			EscudoMagico escudoMagico = new EscudoMagico();
			personaje.agregarHabilidad(escudoMagico);
		}

	}

	public static Personaje seleccionarPersonaje(Scanner sc, String nombre) {
		System.out.println(Dialogos.cajaEscogerPersonaje());
		System.out.println("Ingrese el numero correspondiente al personaje: ");

		int opcion = obtenerOpcionValida(sc, 1, 9);

		Personaje personajeElegido = null;

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

		return personajeElegido;
	}

	private static int obtenerOpcionValida(Scanner sc, int min, int max) {
		while (!sc.hasNextInt()) {
			System.out.println(Dialogos.cajaErrorOpcionPersonje());
			sc.next(); // Consumir la entrada incorrecta para evitar un bucle infinito
		}

		int opcion = sc.nextInt();

		while (opcion < min || opcion > max) {
			System.out.println(Dialogos.cajaErrorOpcionPersonje());
			opcion = sc.nextInt();
		}

		return opcion;
	}

}
