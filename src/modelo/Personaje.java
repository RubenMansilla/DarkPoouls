package modelo;

import java.util.ArrayList;

import view.*;

public abstract class Personaje {

	// Atrivutos
	private int nivel = 1; // Atributo nivel
	protected String nombre; // Atributo nombre
	private int vitalidad; // Atributo vitalidad (vida)
	private int vidaMaxima; // Atributo vidaMaxima 
	private int fuerza; // Atributo fuerza (daño)
	private int fuerzaMaxima; // Atributo fuerzaMaxima
	private int resistencia; // Atributo resistencia (defensa)
	private int resistenciaMaxima; // Atributo resistenciaMaxima
	private int fe; // Atributo fe (energía)
	private int feMaxima; // Atributo feMaxima
	protected Arma arma; // Atributo arma. Asociación con la clase Arma
	private Armadura armadura; // Atributo armadura. Asociación con la clase Armadura
	private ArrayList<Objeto> inventario; // ArrayList de objetos. Asociación con la clase Objeto
	private ArrayList<Habilidad> listaDeHabilidades; // ArrayList de habilidades. Asociación con la clase Habilidad

	// Constructores
	public Personaje() {
		this.listaDeHabilidades = new ArrayList<>(); // Inicializa la lista de habilidades
		this.inventario = new ArrayList<>(); // Inicializa el inventario
	}

	// Constructor con parámetros
	public Personaje(int vitalidad, int fuerza, int resistencia, int fe) {
		super();
		this.vitalidad = vitalidad;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.fe = fe;
		calcularVidaMaxima();
		this.listaDeHabilidades = new ArrayList<Habilidad>(); // Inicializa la lista de habilidades
		this.inventario = new ArrayList<Objeto>(); // Inicializa el inventario
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

	// Agregar objetos
	public void agregarObjeto(Objeto objeto, int cantidad) {
		boolean objetoExistente = false;

		// for each para recorrer el inventario
		// Si el objeto ya existe, se suma la cantidad
		// Si el objeto no existe, se agrega al inventario
		// tipoObjeto es el objeto que se encuentra en el inventario
		for (Objeto tipoObjeto : inventario) {

			if (tipoObjeto.getNombre().equals(objeto.getNombre())) {

				tipoObjeto.setCantidad(tipoObjeto.getCantidad() + cantidad);
				objetoExistente = true;
			}
		}

		// Si el objeto no existe, se agrega al inventario
		// solo si objetoExistente  es falso
		if (!objetoExistente) {
			inventario.add(objeto);
			objeto.setCantidad(cantidad);
		}
	}

	// Eliminar objeto
	public void eliminarObjeto(Objeto objeto) {
		boolean objetoEncontrado = false;

		// for each para recorrer el inventario
		// Si el objeto ya existe, se resta la cantidad
		// Si la cantidad es 0, se elimina el objeto
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

	// Agregar habilidades
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

	// Subir de nivel
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

	// Calcular vida máxima
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

	// Metodo de impresion
	@Override
	public String toString() {
		return "\nNivel = " + nivel + "\nVitalidad = " + vitalidad + "\nFuerza = " + fuerza + "\nResistencia="
				+ resistencia + "\nFe=" + fe + "\nArma --> " + arma + "\nArmadura" + armadura + "\n" + inventario.size()
				+ "\n" + listaDeHabilidades;
	}

}
