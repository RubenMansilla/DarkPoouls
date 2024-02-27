package modelo;

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

	public static String modeloCajaOtrosPersonajes(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '*', '*');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.CYAN);
	}

	public static String modeloCajaNarrador(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String modeloCajaFinales(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.YELLOW);
	}

	/* Cajas de texto de Inicio */

	public static String cajaIntroduccion() {
		String[] textoParaCaja = { "¡Hola jugador!",
				"en esta aventura usted llevará a cabo una misión en el espacio mientras se enfrenta a numerosas dificultades" };
		return modeloCajaIntroduccion(textoParaCaja);
	}

	public static String cajaInicio() {
		String[] textoParaCaja = { "Año 2026",
				"Hoy por fin es el día de la misión, el ser humano no pisa la luna desde el 72" };
		return modeloCajaNarrador(textoParaCaja);
	}

	/* Cajas de texto de Error */

	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		return modeloCajaError(textoParaCaja);
	}

}
