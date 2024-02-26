package modelo;

import java.util.ArrayList;

public abstract class Personaje {

	// Atrivutos
	private int nivel = 1;
	private int vitalidad;
	private int vidaMaxima;
	private int fuerza;
	private int fuerzaMaxima;
	private int resistencia;
	private int resistenciaMaxima;
	private int fe;
	private ArrayList<Inventario> inventario;
	// private ArrayList<ListaHabilidades> listaHabilidades;

	// Constructores
	public Personaje() {
		// listaHabilidades = new ArrayList<>;
		this.inventario = new ArrayList<>();
	}

	public Personaje(int vitalidad, int fuerza, int resistencia, int fe) {
		super();
		this.vitalidad = vitalidad;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.fe = fe;
		calcularVidaMaxima();
		// this.listaHabilidades = new ArrayList<ListaHabilidades>;
		this.inventario = new ArrayList<Inventario>();
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

	public void crearInventario(Inventario objeto) {
		this.inventario.add(objeto);
	}

	public void eliminaragregarInventario(Inventario objeto) {
		this.inventario.remove(objeto);
	}

//Metodos varios

	// Se suben nivel y estadísticas
	public void subirNivel() {

		this.setNivel(nivel + 1);
		this.setVitalidad(vitalidad + 2);
		this.setFuerza(fuerza + 2);
		this.setFuerzaMaxima(this.getFuerza());
		this.setResistencia(resistencia + 2);
		this.setResistenciaMaxima(this.getResistencia());
		this.setFe(fe + 2);
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

	@Override
	public String toString() {
		return " nivel = " + nivel + ", vitalidad = " + vitalidad + ", fuerza = " + fuerza + ", resistencia = "
				+ resistencia + ", fe = " + fe + ", inventario = " + inventario;
	}

}
