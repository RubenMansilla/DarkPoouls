package modelo;

import java.util.ArrayList;

public class ListaDeHabilidades {
	
	private ArrayList<Habilidad> listaDeHabilidades;
	
	public ListaDeHabilidades() {
		this.listaDeHabilidades = new ArrayList<>();
	}
	
	public void agregarHabilidad(Habilidad habilidad) {
        // Verificar si ya existe una habilidad del mismo tipo
        if (!existeHabilidadDelMismoTipo(habilidad)) {
            listaDeHabilidades.add(habilidad);
        } else {
            System.out.println("Ya tienes una habilidad del mismo tipo.");
        }
    }

    private boolean existeHabilidadDelMismoTipo(Habilidad habilidad) {
        for (Habilidad hab : listaDeHabilidades) {
            if (hab.getClass().equals(habilidad.getClass())) {
                return true;
            }
        }
        return false;
    }
	
	public void eliminarHabilidad(Habilidad habilidad) {
		listaDeHabilidades.remove(habilidad);
	}

	@Override
	public String toString() {
		return "Habilidades = " + listaDeHabilidades;
	}
	

}
