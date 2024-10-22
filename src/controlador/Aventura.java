package controlador;

import static view.FuncionesDialogo.centrarLinea;

import java.util.Scanner;

import modelo.*;
import view.*;

public class Aventura {
	
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

		// Inicio

		System.out.println(Dialogos.cajaIntroduccion());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Como te llamas?"));
		String nombre = sc.nextLine();

		// Si el usuario no ingreso nada, el nombre por defecto es Galvain
		if (nombre.isEmpty()) {
			nombre = "Galvain";
		}

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
		Arma[] armasElegidas = seleccionarArma(sc);
		armaElegida = armasElegidas[0];
		armaEvolucionada = armasElegidas[1];
		armaEvolucionada2 = armasElegidas[2];

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

		System.out.println(Dialogos.cajaObjetoInfo());

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println();
		System.out.println(Dialogos.cajaIntroduccion());

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogos.cajaProta(personajeElegido));

		// Batalla Demonio del refugio
		System.out.println();
		System.out.println(Dialogos.cajaBoss(demonio));
		Batalla.batalla(personajeElegido, demonio);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(demonio));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(estus, 5));
		personajeElegido.agregarObjeto(estus, 5);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla Golems de cristal(2 batallas)
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(Dialogos.cajaGCEncuentro(personajeElegido, golemCristal));
		Batalla.batalla(personajeElegido, golemCristal);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaGCDerrota(personajeElegido, golemCristal));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(amuletoDelResguardo, 2));
		personajeElegido.agregarObjeto(amuletoDelResguardo, 2);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(Dialogos.cajaGCEncuentro(personajeElegido, golemCristal));
		Batalla.batalla(personajeElegido, golemCristal);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaGCDerrota(personajeElegido, golemCristal));
		
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(amuletoDelResguardo, 1));
		sc.nextLine();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla Golem de hierro
		System.out.println(centrarLinea("Estadística"));
		System.out.println();
		System.out.println(Dialogos.cajaBoss(golemHierro));
		Batalla.batalla(personajeElegido, golemHierro);
		if (personajeElegido.getVitalidad() <= 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(golemHierro));
		System.out.println(Dialogos.cajaObjeto(estus, 2));
		personajeElegido.agregarObjeto(estus, 2);

		// Evolucion arma y armadura
		System.out.println(Dialogos.cajaEvolucion(armaElegida, armaEvolucionada, conjuntoAnticuado,
				conjuntoHierro));
		personajeElegido.equiparArma(armaEvolucionada);
		personajeElegido.equiparArmadura(conjuntoHierro);

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla esqueletos
		System.out.println();
		System.out.println(Dialogos.cajaEqEncuentro(personajeElegido, esqueleto));
		Batalla.batalla(personajeElegido, esqueleto);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println(Dialogos.cajaEqDerrotado(personajeElegido, esqueleto));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(cretina, 2));
		personajeElegido.agregarObjeto(cretina, 2);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println();
		System.out.println(Dialogos.cajaEqEncuentro(personajeElegido, esqueleto));
		Batalla.batalla(personajeElegido, esqueleto);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println(Dialogos.cajaEqDerrotado(personajeElegido, esqueleto));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(cretina, 2));
		personajeElegido.agregarObjeto(cretina, 2);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Escoger otra habilidad
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		seleccionarHabilidad(personajeElegido, sc);

		// Batalla Nito
		System.out.println();
		System.out.println(Dialogos.cajaBoss(nito));
		Batalla.batalla(personajeElegido, nito);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(nito));
		// Recoges objeto
		System.out.println(Dialogos.cajaObjeto(estus, 2));
		personajeElegido.agregarObjeto(estus, 2);

		System.out.println(Dialogos.cajaObjeto(cuerpoDeCristo, 3));
		personajeElegido.agregarObjeto(cuerpoDeCristo, 3);

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla Caballeor hueco
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		System.out.println(Dialogos.cajaCHEncuentro(personajeElegido, caballeroHueco));
		Batalla.batalla(personajeElegido, caballeroHueco);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaCHDerrotado(personajeElegido, caballeroHueco));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		System.out.println(Dialogos.cajaCHEncuentro(personajeElegido, caballeroHueco));
		Batalla.batalla(personajeElegido, caballeroHueco);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}

		System.out.println();
		System.out.println(Dialogos.cajaCHDerrotado(personajeElegido, caballeroHueco));

		// Evolucion arma y armadura
		System.out.println(Dialogos.cajaEvolucion(armaEvolucionada, armaEvolucionada2,
				conjuntoHierro, conjuntoTitanita));
		personajeElegido.equiparArma(armaEvolucionada2);
		personajeElegido.equiparArmadura(conjuntoTitanita);

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Batalla final Gwyn
		System.out.println();
		System.out.println(Dialogos.cajaBoss(gwyn));
		Batalla.batalla(personajeElegido, gwyn);
		if (personajeElegido.getVitalidad() < 0) {
			return "derrota";
		}
		System.out.println(Dialogos.cajaBossDerrotado(gwyn));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println();
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));

		return "finDeLaPartida";
	}

	// Atributo para almacenar la habilidad seleccionada anteriormente
	private static int habilidadElegidaAnterior = 0;

	// Método para seleccionar la habilidad del personaje principal (3 habilidades) y añadirla al personaje
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

	// Método para seleccionar el personaje principal (10 personajes) y devolver el personaje seleccionado
	public static Personaje seleccionarPersonaje(Scanner sc, String nombre) {
		System.out.println(Dialogos.cajaEscogerPersonaje());
		System.out.println("Ingrese el numero correspondiente al personaje: ");

		int opcion = obtenerOpcionValida(sc, 1, 10);

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
		} else if (opcion == 10) {
			personajeElegido = new Hechizero(nombre);
		}

		return personajeElegido;
	}

	// Método para seleccionar el arma del personaje principal y sus evoluciones (3 armas)
	// Se utiliza un array de Arma para devolver las 3 armas seleccionadas
	public static Arma[] seleccionarArma(Scanner sc) {
		Arma[] armas = new Arma[3];

		System.out.println(Dialogos.cajaEscogerArma());
		System.out.println("Ingrese el numero correspondiente al arma: ");

		while (!sc.hasNextInt()) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			sc.next(); // Consumir la entrada incorrecta para evitar un bucle infinito
		}

		int opcion = sc.nextInt();

		while (opcion < 1 || opcion > 3) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			armas[0] = new Katana();
			armas[1] = new Muramasa();
			armas[2] = new Uchigatana();
		} else if (opcion == 2) {
			armas[0] = new EspadaOxidada();
			armas[1] = new Excalibur();
			armas[2] = new EspadaArtorias();
		} else if (opcion == 3) {
			armas[0] = new HachaDeMano();
			armas[1] = new HachaDeGuerra();
			armas[2] = new HachaDragon();
		}

		return armas;
	}

	// Método para obtener una opción válida (entero) entre un rango de valores (min y max)
	private static int obtenerOpcionValida(Scanner sc, int min, int max) {

		/*
		 * !sc.hasNextInt() verifica si el siguiente token es un entero. Si no es un
		 * entero, el bucle se repite.
		 */
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
