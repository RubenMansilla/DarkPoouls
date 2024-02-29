package modelo;

import java.util.ArrayList;

public class Personaje {

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
	private ArrayList<Inventario> inventario;
	private ArrayList<ListaDeHabilidades> listaDeHabilidades;

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
		this.listaDeHabilidades = new ArrayList<ListaDeHabilidades>();
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

	public int getFeMaxima() {
		return feMaxima;
	}

	public void setFeMaxima(int feMaxima) {
		this.feMaxima = feMaxima;
	}

	public void agregarInventario(Inventario objeto) {
		this.inventario.add(objeto);
	}

	public void eliminarInventario(Inventario objeto) {
		this.inventario.remove(objeto);
	}

	public void agregarListaDeHabilidades(ListaDeHabilidades habilidad) {
		this.listaDeHabilidades.add(habilidad);
	}

	public void eliminarListaDeHabilidades(ListaDeHabilidades habilidad) {
		this.listaDeHabilidades.remove(habilidad);
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

	public ArrayList<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Inventario> inventario) {
		this.inventario = inventario;
	}

	public ArrayList<ListaDeHabilidades> getListaDeHabilidades() {
		return listaDeHabilidades;
	}

	public void setListaDeHabilidades(ArrayList<ListaDeHabilidades> listaDeHabilidades) {
		this.listaDeHabilidades = listaDeHabilidades;
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
	
	public void equiparArma(Arma nuevaArma) {
        this.arma = nuevaArma;
        this.fuerza = this.fuerza + nuevaArma.getDaño();
    }
	
	public void equiparArmadura(Armadura nuevaArmadura) {
        this.armadura = nuevaArmadura;
        this.resistencia = this.resistencia + nuevaArmadura.getDefensa();
    }
	
	public void luchar(Personaje enemigo) {
		
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
	    System.out.println(this.nombre + " ataca a " + enemigo.getNombre() + "y le hace " + dañoPersonaje + " puntos de daño.");
	    System.out.println();
	    System.out.println(enemigo.getVitalidad());
	    
	    
	    // Ser atacado 
	    int dañoEnemigo = enemigo.getFuerza();
	    
	    this.setVitalidad(this.getVitalidad() - (dañoEnemigo - this.getResistencia()));
	    
	    System.out.println();
	    
	    System.out.println(enemigo.getNombre() + " ataca a " + this.nombre + " y le hace " + dañoEnemigo + " puntos de daño.");
	    System.out.println();
	    System.out.println(this.getVitalidad());
	}


	@Override
	public String toString() {
		return "Personaje [nivel=" + nivel + ", vitalidad=" + vitalidad + ", fuerza=" + fuerza + ", resistencia="
				+ resistencia + ", fe=" + fe + ", arma=" + arma + ", inventario=" + inventario + ", listaDeHabilidades="
				+ listaDeHabilidades + "]";
	}

}
