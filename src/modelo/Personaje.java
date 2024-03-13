package modelo;

import static view.FuncionesDialogo.centrarLinea;

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
	protected Arma arma;
	private Armadura armadura;
	private ArrayList<Objeto> inventario;
	private ArrayList<Habilidad> listaDeHabilidades;
	private int batallas = 0;
	private int tiempoHabilidad = 0;

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
	// Agregar y eliminar objetos y habilidades
	public void agregarObjeto(Objeto objeto, int cantidad) {
		boolean objetoExistente = false;

		for (Objeto tipoObjeto : inventario) {

			if (tipoObjeto.getNombre().equals(objeto.getNombre())) {

				tipoObjeto.setCantidad(tipoObjeto.getCantidad() + cantidad);
				objetoExistente = true;
			}
		}

		if (!objetoExistente) {
			inventario.add(objeto);
			objeto.setCantidad(cantidad);
		}
	}

	// Eliminar objeto
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

	// Agregar y eliminar habilidades
	public void agregarHabilidad(Habilidad habilidad) {
		this.listaDeHabilidades.add(habilidad);
	}

	// Eliminar habilidades
	public void eliminarHabilidad(Habilidad habilidad) {
		this.listaDeHabilidades.remove(habilidad);
	}

	// Equipar arma
	public void equiparArma(Arma nuevaArma) {
		this.arma = nuevaArma;
		this.fuerza = this.fuerza + nuevaArma.getDano();
		this.fuerzaMaxima = this.fuerzaMaxima + nuevaArma.getDano();
	}

	// Equipar armadura
	public void equiparArmadura(Armadura nuevaArmadura) {
		this.armadura = nuevaArmadura;
		this.resistencia = this.resistencia + nuevaArmadura.getDefensa();
		this.resistenciaMaxima = this.resistenciaMaxima + nuevaArmadura.getDefensa();
	}

	// Se suben nivel y estadísticas

	public void subirNivel() {

		this.setNivel(nivel + 1);
		this.setVitalidad(vitalidad + 2);
		this.setVidaMaxima(this.getVitalidad());
		this.setFuerza(fuerzaMaxima + 2);
		this.setFuerzaMaxima(this.getFuerza());
		this.setResistencia(resistenciaMaxima + 2);
		this.setResistenciaMaxima(this.getResistencia());
		this.setFe(feMaxima + 5);
		this.setFeMaxima(this.getFe());

		System.out.println(Dialogos.subirNivel(this));
	}

	private void calcularVidaMaxima() {
		this.vidaMaxima = this.vitalidad;
	}

	// Reiniciar estadísticas
	public void reiniciarEstadisticas() {
		this.setVitalidad(this.getVidaMaxima());
		this.setFuerza(this.getFuerzaMaxima());
		this.setResistencia(this.getResistenciaMaxima());
		this.setFe(this.getFeMaxima());
	}

	// Usar objetos y habilidades
	public void usarObjeto(Objeto objeto) {
		objeto.usarObjeto(this);
	}

	// Usar habilidades
	public void usarHabilidad(Habilidad habilidad) {
		habilidad.usarHabilidad(this);
	}

	// Atacar
	public void atacar(Personaje enemigo) {

		// Calcular el daño base del ataque (fuerza)
		int dañoPersonaje = this.fuerza - enemigo.getResistencia();

		// Verificar si el personaje tiene un arma y si es una Katana
		if (this.arma instanceof Katana) {
			// Calcular el daño adicional de la habilidad de la Katana
			dañoPersonaje += ((Katana) arma).habilidadArma();
		} else if (this.arma instanceof EspadaOxidada) {
			// Ejecutar la habilidad de la Espada Oxidada
			((EspadaOxidada) arma).habilidadArma(enemigo);
		}

		// Restar el daño al enemigo
		enemigo.setVitalidad(enemigo.getVitalidad() - (dañoPersonaje));
		// Imprimir mensaje de ataque
		System.out.println();
		System.out.println(Dialogos.cajaResultadoAtaque(this, enemigo, dañoPersonaje));
		System.out.println();

		if (enemigo.getVitalidad() > 0) {
			Random random = new Random();

			int probAtaqueEnemigo = random.nextInt(10) + 1;
			
			int danoPorFe = 0;

			if (probAtaqueEnemigo != 1) {
				
				enemigo.setFe(enemigo.getFe() + 5);
				
				if (enemigo.getFe() == 20) {
					danoPorFe = 5;
					enemigo.setFe(0);
					System.out.println(Dialogos.cajaEnfadoEnemigo(enemigo));
				}
				
				// Ser atacado
				int danoEnemigo = enemigo.getFuerza() + danoPorFe - this.getResistencia();

				this.setVitalidad(this.getVitalidad() - danoEnemigo);
				
				System.out.println();
				System.out.println(Dialogos.cajaResultadoAtaque(enemigo, this, danoEnemigo));
				System.out.println();
			} else {
				//TODO dialogo fallo ataque
				System.out.println("\n" + enemigo.getNombre() + " falla el ataque");
			}
		}

	}
	
	//Introduccion de la batalla
	private void mostrarIntroduccionBatalla(Personaje enemigo, Scanner scanner) {
		
		System.out.println();
		System.out.println(Dialogos.cajaAtaque(this));
		System.out.println();
		System.out.println(Recursos.vs);
		System.out.println();
		System.out.println(Dialogos.cajaAtaque(enemigo));
		System.out.println();
		
		scanner.nextLine();
		System.out.println(centrarLinea("Presione START para continuar"));
		scanner.nextLine();
		
		System.out.println(Dialogos.cajaPersonaje(this));
		System.out.println(Dialogos.cajaEnemigo(enemigo));
    }

	
	// Batalla
	public void batalla(Personaje enemigo) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		boolean objetoUsado = false;
		boolean habilidadUsada = false;
		
		mostrarIntroduccionBatalla(enemigo, scanner);
		
		
		// Mientras ambos personajes tengan vitalidad
		while (this.getVitalidad() > 0 && enemigo.getVitalidad() > 0) {
			System.out.println("");
			System.out.println("1. Atacar");
			System.out.println("2. Usar Objeto");
			System.out.println("3. Usar Habilidad");
			System.out.print("Elige una opción: ");

			while (!scanner.hasNextInt()) {
				System.out.println("Ingrese 1, 2 o 3 para elegir una opción");
				scanner.next();
			}

			opcion = scanner.nextInt();
			// Validar la opción
			while (opcion != 1 && opcion != 2 && opcion != 3) {
				System.out.println("Ingrese 1, 2 o 3 para elegir una opción");
				opcion = scanner.nextInt();
			}

			// Atacar normalmente
			if (opcion == 1) {
				this.atacar(enemigo);
				// Reiniciar el uso de objeto y habilidad al atacar
				objetoUsado = false;
				habilidadUsada = false;
				scanner.nextLine();
				System.out.println(centrarLinea("Presione START para continuar"));
				scanner.nextLine();
				
				//Aumentar tiempo de uso de la habilidad
				tiempoHabilidad++;
				
				//Reiniciar estadisticas por uso de habilidad
				if (tiempoHabilidad == 2) {
					this.setFuerza(this.getFuerzaMaxima());
					this.setResistencia(this.getResistenciaMaxima());
				}
				
			} else if (opcion == 2) {
				// Usar objeto
				if (!inventario.isEmpty() && !objetoUsado) {
					System.out.println("Objetos disponibles:");
					for (int i = 0; i < inventario.size(); i++) {
						System.out.println((i + 1) + ". " + inventario.get(i).getNombre()+ "(" + inventario.get(i).getCantidad() + ")");
					}

					int indiceObjeto;
					// Validar el índice del objeto
					do {
						System.out.print("Elige un objeto introduciendo su número: ");
						indiceObjeto = scanner.nextInt();

						if (indiceObjeto <= 0 || indiceObjeto > inventario.size()) {
							System.out.println(Dialogos.cajaErrorTurnoObjeto2());
						}

					} while (indiceObjeto <= 0 || indiceObjeto > inventario.size());

					// Llamar al método usarObjeto con el objeto seleccionado
					this.usarObjeto(inventario.get(indiceObjeto - 1));
					this.eliminarObjeto(inventario.get(indiceObjeto - 1));
					// Marcar el objeto como usado
					objetoUsado = true;
				} else if (inventario.isEmpty()) {
					System.out.println(Dialogos.cajaInventarioVacio());
				}else {
					System.out.println(Dialogos.cajaErrorTurnoObjeto());
				}

				scanner.nextLine();
				System.out.println(centrarLinea("Presione START para continuar"));
				scanner.nextLine();
			} else if (opcion == 3) {
				// Usar habilidad
				if (!listaDeHabilidades.isEmpty() && !habilidadUsada) {
					System.out.println();
					System.out.println(centrarLinea("Habilidades disponibles:"));
					for (int i = 0; i < listaDeHabilidades.size(); i++) {
						System.out.println((i + 1) + ". " + listaDeHabilidades.get(i).getNombre() + "( Coste: " + listaDeHabilidades.get(i).getCosteFe() + " )");
					}

					int indiceHabilidad;
					do {
						System.out.println();
						System.out.print(centrarLinea("Elige una habilidad introduciendo su número: "));
						indiceHabilidad = scanner.nextInt();

						if (indiceHabilidad <= 0 || indiceHabilidad > listaDeHabilidades.size()) {
							System.out.println(Dialogos.cajaErrorTurnoHabilidad2());						}
					} while (indiceHabilidad <= 0 || indiceHabilidad > listaDeHabilidades.size());

					// Llamar al método usarHabilidad con la habilidad seleccionada
					this.usarHabilidad(listaDeHabilidades.get(indiceHabilidad - 1));
					
					// Marcar la habilidad como usada
					habilidadUsada = true;
				} else {
					System.out.println(Dialogos.cajaErrorTurnoHabilidad());
				}

				scanner.nextLine();
				System.out.println(centrarLinea("Presione START para continuar"));
				scanner.nextLine();
			}

			// Fin del turno, imprimir estado actual de los personajes
			System.out.println(centrarLinea(("Estado después del turno:")));
			System.out.println(Dialogos.EstadoPersonaje(this));
			System.out.println(Dialogos.EstadoEnemigo(enemigo));
		}

		// Verificar si el personaje ha sido derrotado
		batallas++;
		if (enemigo.getVitalidad() <= 0) {
			enemigo.reiniciarEstadisticas();
			this.reiniciarEstadisticas();
			System.out.println(Dialogos.reiniciarEstadisticas(this));
			}
		if (batallas == 2 && this.getVitalidad() > 0) {
			this.subirNivel();
			batallas = 0;
		}
	}

	@Override
	public String toString() {
		return "\nNivel = " + nivel + "\nVitalidad = " + vitalidad + "\nFuerza = " + fuerza + "\nResistencia="
				+ resistencia + "\nFe=" + fe + "\nArma --> " + arma + "\nArmadura" + armadura + "\n" + inventario.size()
				+ "\n" + listaDeHabilidades;
	}

}
