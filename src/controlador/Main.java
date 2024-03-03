package controlador;

import static view.FuncionesDialogo.centrarLinea;

import java.util.Scanner;

import modelo.*;

import view.*;

public class Main {

	public static void main(String[] args) {

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

		// Objetos del personaje
		Personaje personajeElegido = null;
		Arma armaElegida = null;
		Habilidad habilidadElegida = null;

		// Variables
		int opcion = 0;

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
		
		while (opcion < 1 || opcion > 3) {
			System.out.println(Dialogos.cajaErrorOpcionArma());
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			armaElegida = new Katana();
		} else if (opcion == 2) {
			armaElegida = new EspadaOxidada();
		} else if (opcion == 3) {
			armaElegida = new HachaDeMano();
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

		while (opcion < 1 || opcion > 4) {
			System.out.println(Dialogos.cajaErrorOpcionHabilidad());
			opcion = sc.nextInt();
		}
		
		if (opcion == 1) {
			habilidadElegida = new Berserker();
		} else if (opcion == 2) {
			habilidadElegida = new AuraPurificadora();
		} else if (opcion == 3) {
			habilidadElegida = new EscudoMagico();
		} else if (opcion == 4) {
			habilidadElegida = new Aturdir();
		}
		
		personajeElegido.equiparArma(armaElegida);
		personajeElegido.equiparArmadura(conjuntoAnticuado);
		personajeElegido.agregarHabilidad(habilidadElegida);

		
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		
		System.out.println(centrarLinea("Estadisticas"));
		System.out.println(Dialogos.cajaPersonaje(personajeElegido));
		
		

	}

}
