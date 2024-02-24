package modelo;

import java.util.ArrayList;

public class Inventario {

	private ArrayList<Objeto> inventario;

	public Inventario() {
		this.inventario = new ArrayList<>();
	}

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
			inventario.removeIf(o -> o.getCantidad() <= 0);
		}
	}

	@Override
	public String toString() {
		return inventario + "";
	}
}
