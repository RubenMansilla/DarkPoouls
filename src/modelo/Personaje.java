package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import view.*;

public abstract class Personaje {

	// Atrivutos
	private int nivel = 1;
	protected String nombre;
	private int vitalidad;
	private int vidaMaxima;
	private int fuerza;
	private int fuerzaMaxima;
	private int resistencia;
	private int resistenciaMaxima;
	private int fe;
	private int feMaxima;
	private Arma arma;
	private Armadura armadura;
	private ArrayList<Objeto> inventario;
	private ArrayList<Habilidad> listaDeHabilidades;

	// Constructores
	public Personaje() {
		this.listaDeHabilidades = new ArrayList<>();
		this.inventario = new ArrayList<>();
	}

	public Personaje(int vitalidad, int fuerza, int resistencia, int fe) {
		super();
		this.vitalidad = vitalidad;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.fe = fe;
		calcularVidaMaxima();
		this.listaDeHabilidades = new ArrayList<Habilidad>();
		this.inventario = new ArrayList<Objeto>();
		;
	}

	// Getters y Setters
	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int nuevaVitalidad) {
		if (nuevaVitalidad > this.vitalidad) {
			this.vitalidad = nuevaVitalidad;
			calcularVidaMaxima(); // Llama a calcularVidaMaxima solo si la vitalidad aumenta
		} else {
			this.vitalidad = nuevaVitalidad;
		}
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getFe() {
		return fe;
	}

	public void setFe(int fe) {
		this.fe = fe;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getFuerzaMaxima() {
		return fuerzaMaxima;
	}

	public void setFuerzaMaxima(int fuerzaMaxima) {
		this.fuerzaMaxima = fuerzaMaxima;
	}

	public int getResistenciaMaxima() {
		return resistenciaMaxima;
	}

	public void setResistenciaMaxima(int resistenciaMaxima) {
		this.resistenciaMaxima = resistenciaMaxima;
	}

	public int getFeMaxima() {
		return feMaxima;
	}

	public void setFeMaxima(int feMaxima) {
		this.feMaxima = feMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public ArrayList<Objeto> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Objeto> inventario) {
		this.inventario = inventario;
	}

	public ArrayList<Habilidad> getListaDeHabilidades() {
		return listaDeHabilidades;
	}

	public void setListaDeHabilidades(ArrayList<Habilidad> listaDeHabilidades) {
		this.listaDeHabilidades = listaDeHabilidades;
	}

//Metodos varios

	public void agregarObjeto(Objeto objeto) {
		boolean objetoExistente = false;

		for (Objeto tipoObjeto : inventario) {

			if (tipoObjeto.getNombre().equals(objeto.getNombre())) {

				tipoObjeto.setCantidad(tipoObjeto.getCantidad() + 1);
				objetoExistente = true;
			}
		}

		if (!objetoExistente) {
			inventario.add(objeto);
		}
	}

	public void eliminarObjeto(Objeto objeto) {
		boolean objetoEncontrado = false;

		for (Objeto tipoObjeto : inventario) {

			if (tipoObjeto.getNombre().equals(objeto.getNombre())) {

				int nuevaCantidad = tipoObjeto.getCantidad() - 1;

				if (nuevaCantidad > 0) {
					tipoObjeto.setCantidad(nuevaCantidad);
				} else {
					objetoEncontrado = true;
				}
			}
		}

		if (objetoEncontrado) {
			inventario.remove(objeto);
		}
	}

	public void agregarHabilidad(Habilidad habilidad) {
		this.listaDeHabilidades.add(habilidad);
	}

	public void eliminarHabilidad(Habilidad habilidad) {
		this.listaDeHabilidades.remove(habilidad);
	}

	public void equiparArma(Arma nuevaArma) {
		this.arma = nuevaArma;
		this.fuerza = this.fuerza + nuevaArma.getDaño();
	}

	public void equiparArmadura(Armadura nuevaArmadura) {
		this.armadura = nuevaArmadura;
		this.resistencia = this.resistencia + nuevaArmadura.getDefensa();
	}

	// Se suben nivel y estadísticas

	public void subirNivel() {

		this.setNivel(nivel + 1);
		this.setVitalidad(vitalidad + 2);
		this.setFuerza(fuerza + 2);
		this.setFuerzaMaxima(this.getFuerza());
		this.setResistencia(resistencia + 2);
		this.setResistenciaMaxima(this.getResistencia());
		this.setFe(fe + 2);
		this.setFeMaxima(this.getFe());
	}

	private void calcularVidaMaxima() {
		this.vidaMaxima = this.vitalidad;
	}

	public void reiniciarEstadisticas() {
		this.setVitalidad(this.getVidaMaxima());
		this.setFuerza(this.getFuerzaMaxima());
		this.setResistencia(this.getResistenciaMaxima());
	}

	public void usarObjeto(Objeto objeto) {
		objeto.usarObjeto(this);
	}

	public void usarHabilidad(Habilidad habilidad) {
		habilidad.usarHabilidad(this);
	}

	public void atacar(Personaje enemigo) {

		// Calcular el daño base del ataque (fuerza)
		int dañoPersonaje = this.fuerza;

		// Verificar si el personaje tiene un arma y si es una Katana
		if (this.arma instanceof Katana) {
			// Calcular el daño adicional de la habilidad de la Katana
			dañoPersonaje += ((Katana) arma).habilidadArma();
		} else if (this.arma instanceof EspadaOxidada) {
			// Ejecutar la habilidad de la Espada Oxidada
			((EspadaOxidada) arma).habilidadArma(enemigo);
		}

		// Restar el daño al enemigo
		enemigo.setVitalidad(enemigo.getVitalidad() - (dañoPersonaje - enemigo.getResistencia()));

		// Imprimir mensaje de ataque
		System.out.println(
				this.nombre + " ataca a " + enemigo.getNombre() + "y le hace " + dañoPersonaje + " puntos de daño.");
		System.out.println();
		System.out.println(enemigo.getVitalidad());

		Random random = new Random();

		int probAtaqueEnemigo = random.nextInt(10) + 1;

		if (probAtaqueEnemigo != 1) {
			// Ser atacado
			int dañoEnemigo = enemigo.getFuerza();

			this.setVitalidad(this.getVitalidad() - (dañoEnemigo - this.getResistencia()));

			System.out.println();

			System.out.println(
					enemigo.getNombre() + " ataca a " + this.nombre + " y le hace " + dañoEnemigo + " puntos de daño.");
			System.out.println();
			System.out.println(this.getVitalidad());
		} else {
			System.out.println("\n" + enemigo.getNombre() + " falla el ataque");
		}

	}

	public void batalla(Personaje enemigo) {
	    Scanner scanner = new Scanner(System.in);
	    int opcion;

	    while (this.getVitalidad() > 0 && enemigo.getVitalidad() > 0) {
	        System.out.println("Turno de " + this.nombre);
	        System.out.println("1. Atacar");
	        System.out.println("2. Usar Objeto");
	        System.out.println("3. Usar Habilidad");
	        System.out.print("Elige una opción: ");

	        opcion = scanner.nextInt();

	        while (opcion != 1 && opcion != 2 && opcion != 3) {
	            System.out.println("Ingrese 1, 2 o 3 para elegir una opción");
	            opcion = scanner.nextInt();
	        }

	        // Atacar normalmente
	        if (opcion == 1) {
	            this.atacar(enemigo);
	        } else if (opcion == 2) {
	            // Usar objeto
	            if (!inventario.isEmpty()) {
	                System.out.println("Objetos disponibles:");
	                for (int i = 0; i < inventario.size(); i++) {
	                    System.out.println((i + 1) + ". " + inventario.get(i).getNombre());
	                }

	                int indiceObjeto;

	                do {
	                    System.out.print("Elige un objeto introduciendo su número: ");
	                    indiceObjeto = scanner.nextInt();

	                    if (indiceObjeto <= 0 || indiceObjeto > inventario.size()) {
	                        System.out.println("Opción no válida. Inténtalo de nuevo.");
	                    }

	                } while (indiceObjeto <= 0 || indiceObjeto > inventario.size());

	                // Llamar al método usarObjeto con el objeto seleccionado
	                this.usarObjeto(inventario.get(indiceObjeto - 1));
	            } else {
	                System.out.println("No tienes objetos en el inventario.");
	            }
	        } else if (opcion == 3) {
	            // Usar habilidad
	            if (!listaDeHabilidades.isEmpty()) {
	                System.out.println("Habilidades disponibles:");
	                for (int i = 0; i < listaDeHabilidades.size(); i++) {
	                    System.out.println((i + 1) + ". " + listaDeHabilidades.get(i).getNombre());
	                }

	                int indiceHabilidad;
	                do {
	                    System.out.print("Elige una habilidad introduciendo su número: ");
	                    indiceHabilidad = scanner.nextInt();

	                    if (indiceHabilidad <= 0 || indiceHabilidad > listaDeHabilidades.size()) {
	                        System.out.println("Opción no válida. Intenta de nuevo.");
	                    }
	                } while (indiceHabilidad <= 0 || indiceHabilidad > listaDeHabilidades.size());

	                // Llamar al método usarHabilidad con la habilidad seleccionada
	                this.usarHabilidad(listaDeHabilidades.get(indiceHabilidad - 1));
	            } else {
	                System.out.println("No tienes habilidades en la lista.");
	            }
	        }

	        // Fin del turno, imprimir estado actual de los personajes
	        System.out.println("Estado después del turno:");
	        System.out.println(Dialogos.EstadoPersonaje(this));
	        System.out.println(Dialogos.EstadoEnemigo(enemigo));
	    }
	}


	@Override
	public String toString() {
		return "\nNivel = " + nivel + "\nVitalidad = " + vitalidad + "\nFuerza = " + fuerza + "\nResistencia="
				+ resistencia + "\nFe=" + fe + "\nArma --> " + arma + "\nArmadura" + armadura + "\n" + inventario.size()
				+ "\n" + listaDeHabilidades;
	}

	public void personaje() {

	}

}
