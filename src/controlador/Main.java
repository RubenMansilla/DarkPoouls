package controlador;

import modelo.*;

import view.Dialogos;

public class Main {

	public static void main(String[] args) {
		
		/*

		System.out.println(Dialogos.cajaIntroduccion());
		System.out.println(Dialogos.cajaErrorInicio());
		System.out.println(Dialogos.cajaProta());

		*/
		Uchigatana katana = new Uchigatana();
		DemonioRefugio demonio = new DemonioRefugio();
		Marginado marginado = new Marginado("Ruben");
		ConjuntoAnticuado armadura = new ConjuntoAnticuado();
		marginado.equiparArma(katana);
		marginado.equiparArmadura(armadura);
		
		Estus estus = new Estus();
		Creatina cretina = new Creatina();
		CuerpoDeCristo cuerpoDeCristo = new CuerpoDeCristo();
		Berserker berserker = new Berserker();
		EscudoMagico escudoMagico = new EscudoMagico();
		

		marginado.agregarObjeto(cuerpoDeCristo);
		marginado.agregarObjeto(cretina);
		marginado.agregarObjeto(cretina);
		marginado.agregarObjeto(estus);

		marginado.agregarHabilidad(berserker);
		marginado.agregarHabilidad(escudoMagico);
		
		
		System.out.println(Dialogos.cajaPersonaje(marginado));
		
		marginado.batalla(demonio);
		
	}

}
