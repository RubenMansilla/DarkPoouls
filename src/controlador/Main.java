package controlador;

import modelo.*;

public class Main {

	public static void main(String[] args) {

		System.out.println(Dialogos.cajaErrorInicio());
		System.out.println();

		Marginado marginado = new Marginado("ruben");
		Estus estus = new Estus();
		Creatina cretina = new Creatina();
		CuerpoDeCristo cuerpoDeCristo = new CuerpoDeCristo();
		Berserker berserker = new Berserker();
		VinculoAncestral vinculoAncenstral = new VinculoAncestral();

		Inventario inventario = new Inventario();
		ListaDeHabilidades habilidades = new ListaDeHabilidades();

		inventario.agregarObjeto(cuerpoDeCristo);
		inventario.agregarObjeto(cretina);
		inventario.agregarObjeto(estus);

		habilidades.agregarHabilidad(vinculoAncenstral);
		habilidades.agregarHabilidad(berserker);

		marginado.agregarInventario(inventario);
		marginado.agregarListaDeHabilidades(habilidades);

		Katana katana = new Katana("excalibur");
		ConjuntoAnticuado armadura = new ConjuntoAnticuado("g");
		

		marginado.equiparArma(katana);

		System.out.println(marginado);
		System.out.println();
		marginado.equiparArmadura(armadura);


		System.out.println(marginado);

	}

}
