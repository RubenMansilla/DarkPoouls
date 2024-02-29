package view;

public class Dialogos {
	
	/* Modelos */
	public static String modeloCajaIntroduccion(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, 'u', 'v');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String modeloCajaProta(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCaja(texto);
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String modeloCajaError(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '!');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}

	public static String modeloCajaBosses(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '*', '*');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.CYAN);
	}

	/*public static String modeloCajaNarrador(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}*/

	public static String modeloCajaFinal(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.YELLOW);
	}

	/* Cajas de texto de Inicio */

	public static String cajaIntroduccion() {
		
		String[] textoParaCaja = { "",
				"Tras la gran guerra entre los 'caballeros de Gwyn' y el abismo",
				"la historia de como, con coraje, los cuatro caballeros: Ornstein, Artorias, Ciaran y Gough, lucharon hasta el cansacio, o, en cuyo caso, la muerte",
				"Pero, la historia parece haberse olvidado del último caballero, Galvain, 'La espada ardiente'",
				""};
		return modeloCajaIntroduccion(textoParaCaja);
	}
	public static String cajaProta(){
		String[] textoParaCaja = { "",
				"Yo soy Sir Galvain, La espada ardiente. ",
				"Durante algún tiempo fui el verdugo de Gwyn, Señor de la eniza. Debido a mi lealtad y logros fui nombrado como el quinto miembro de 'Los caballeros de Gwyn'.",
				"En algún momento de la guerra quedé encerrado en unas catacumbas para pasar mis últimos días. Ahora que he conseguido liberarme, quiero saber el resultado de la guerra y porqué nadie me nombra junto a mis compañeros",
				""};
		return modeloCajaProta(textoParaCaja);
	}

	/*public static String cajaInicio() {
		String[] textoParaCaja = { "Año 2026",
				"Hoy por fin es el día de la misión, el ser humano no pisa la luna desde el 72" };
		return modeloCajaNarrador(textoParaCaja);
	}*/

	/* Cajas de texto de Error */

	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		return modeloCajaError(textoParaCaja);
	}

}
