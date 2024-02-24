package modelo;

import java.util.ArrayList;

public abstract class Personaje {
	
	//Atrivutos
	private int nivel = 1;
	private int vitalidad;
	private int fuerza;
	private int resistencia;
	private int fe;
	private ArrayList<Inventario> inventario;
	//private ArrayList<ListaHabilidades> listaHabilidades;
	
	//Constructores
	public Personaje () {
		//listaHabilidades = new ArrayList<>;
		this.inventario = new ArrayList<>();
	}

	public Personaje(int vitalidad, int fuerza, int resistencia, int fe) {
		super();
		this.vitalidad = vitalidad;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.fe = fe;
		//this.listaHabilidades = new ArrayList<ListaHabilidades>;
		this.inventario = new ArrayList<Inventario>();
	}

	//Getters y Setters
	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
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
	
	public void crearInventario(Inventario objeto) {
        this.inventario.add(objeto);
    }

    public void eliminaragregarInventario(Inventario objeto) {
        this.inventario.remove(objeto);
    }

//Metodos varios
	
	//Se suben nivel y estadísticas
	public void subirNivel() {
		setNivel(nivel + 1);
		setVitalidad(vitalidad + 2);
		setFuerza(fuerza + 2);
		setResistencia(resistencia + 2);
		setFe(fe + 2);
	}

	@Override
	public String toString() {
		return " nivel = " + nivel + ", vitalidad = " + vitalidad + ", fuerza = " + fuerza + ", resistencia="
				+ resistencia + ", fe = " + fe + ", inventario = " + inventario;
	}
	
		
}
