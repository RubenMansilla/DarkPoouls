package view;

import modelo.*;

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

	public static String modeloCajaBoss(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '*', '*');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.CYAN);
	}
	public static String modeloCajaBossDerrotado(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '*', '*');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.CYAN);
		
	}
	public static String modeloCajaBatalla(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String modeloCajaFinal(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.YELLOW);
	}
	
	public static String modeloCajaAtaque(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.WHITE_BACKGROUND + Recursos.BLACK);
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
	
	public static String cajaEscogerPersonaje(){
		String[] textoParaCaja = { "",
				"Escoge tu Personaje",
				"1 - Bandido",
				"2 - Caballero",
				"3 - Cazador",
				"4 - Clerigo",
				"5 - Guerrero",
				"6 - Ladrón",
				"7 - Marginado",
				"8 - Piromantico",
				"9 - Vagabundo",
				""};
		return modeloCajaProta(textoParaCaja);
	}
	
	public static String cajaEscogerArma(){
		String[] textoParaCaja = { "",
				"Escoge el Arma que portaras",
				"1 - Katana",
				"2 - Espada Oxidada",
				"3 - Hacha de Mano",
				""};
		return modeloCajaProta(textoParaCaja);
	}
	
	public static String cajaEscogerHabilidad(){
		String[] textoParaCaja = { "",
				"Escoge una Habilidad entre estas",
				"1 - Berserker",
				"2 - Aura Purificadora",
				"3 - Escudo Mágico",
				"4 - Aturdir",
				""};
		return modeloCajaProta(textoParaCaja);
	}
	
	public static String cajaBatalla(Personaje personaje) {
		String[] textoParaCaja = {"",
				"Mientras caminas por los campos de Lordran te topas con un: " +personaje.getNombre()
				
		};
		return modeloCajaBatalla(textoParaCaja);
	}
	public static String cajaBoss(DemonioRefugio personaje) {
		String[] textoParaCaja = {"",
				"Cuando encuentras la salida de las catacumbas, te topas con un: " +personaje.getNombre()+
				" Tu no deberías estar aquí, recluso. No deberías haber salido de tu celda. Ahora, pagarás por tu osadía",
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
	}
	public static String cajaBossDerrotado(DemonioRefugio personaje) {
		String[] textoParaCaja = {"",
				"Has derrotado a: " +personaje.getNombre()+
				" El demonio cae al suelo, y con su último aliento te dice: 'Yo pude haber fallado en detenerte, pero el mundo exterior ya no es lo que era antes.'",
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
		
	}
	public static String cajaBoss(GolemHierro personaje) {
		String[] textoParaCaja = {"",
				"Estas por entrar a la ciudad de 'Anorlondo', pero una siluteta tan grande como una torre de vigilancia te separa de la puerta, es el: " +personaje.getNombre()+
				" Alto viajero, nadie puede pasar sin el permiso del rey, y el rey no quiere que nadie pase. ",
				"Aqui es donde tu viaje termina",
				""
		};
		return modeloCajaBoss(textoParaCaja);
	}
	public static String cajaBossDerrotado(GolemHierro personaje) {
		String[] textoParaCaja = {"",
				"Has derrotado a: " +personaje.getNombre()+
				" El golem cae al suelo, y con su último aliento te dice: 'Viajero, ten cuidado, Anorlondo no es un lugar prospero como antaño. '",
				"'Mi misión no era evitar que entraras, sino evitar que los de dentro salieran.'",
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
	}
	public static String cajaBoss(Nito personaje) {
		String[] textoParaCaja = {"",
				"Llegas a la 'Tumba de los gigantes', despues de superar las distintas trampas y lagos de veneno estas parado frente a: " +personaje.getNombre()+ "' El rey de los muertos' y 'Dios de la muerte'. "+
				"'Galvain, quinto caballero de Gwyn, has llegado hasta aquí, supongo querrás saber la verdad hacerca de tu desaparición.' ",
				"La verdad es que, Gwyn, el señor de la ceniza, fue sometido por la oscuridad del abismo, mandando a misiones suicidas a sus caballeros ",
				"pero tu, Galvain, fuiste el único que se negó a seguir sus ordenes, por eso te encerraron, para que no pudieras interferir en sus planes. ",
				"Lo que Gwyn hizo fue traicionar a su pueblo, y ahora, el mundo esta sumido en la oscuridad, pero no tienes el poder como para cambiar la historia, Galvain. ",
				"Si consigues mi alma podrías tener una oportunidad, pero no pienso entregar mi vida a un mortal como tu.'",
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
	}
	public static String cajaBossDerrotado(Nito personaje) {
		String[] textoParaCaja = {"",
				"Has derrotado a: " +personaje.getNombre()+
				" El rey de los muertos cae al suelo, y con su último aliento te dice: 'Galvain, no te confundas, el mundo no necesita un salvador, necesita una llama que alumbre su camino, pero ese mo es tu destino.'",
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
	}
	public static String cajaBoss(Gwyn personaje) {
		String[] textoParaCaja = {"",
				"Despues de superar la 'Tumba de los gigantes' llegas al 'Horno de la primera llama', donde te encuentras con: " +personaje.getNombre()+ "' El señor de la ceniza'",
				"'Galvain, mi quinto, has llegado hasta aquí, supongo querrás saber la verdad hacerca de tu desaparición.' ",
				"'Tu lealtad y valentía me hubiesen creado problemas, por eso te borre de la historia, pero tu alma se negó a desaparecer y Nito, no quiso acabar con con tu vida.' ",
				"'Ahora, Galvain, tu alma es la única que me falta para completar mi plan, y no pienso dejar que te interpongas en mi camino.'",							
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
	}
	public static String cajaBossDerrotado(Gwyn personaje) {
		String[] textoParaCaja = {"",
				"Has derrotado a: " +personaje.getNombre()+
				" El señor de la ceniza cae al suelo, y con su último aliento te dice: 'Galvain, mi fiel soldado, gracias por liberarme de esta maldición.' ",
				"Las cenizas de Gwyn se dispersan por el viento, y ahora es tu cometido esperar a la llegada del 'Elegido' para que encienda la llama y devuelva la luz al mundo.",
				""
		};
		return modeloCajaBossDerrotado(textoParaCaja);
	}
	
	public static String cajaPersonaje(Personaje personaje){
		String[] textoParaCaja = { "",
				"Nombre: " + personaje.getNombre(),
				"Nivel: " + personaje.getNivel(),
				"Vitalidad: " + personaje.getVitalidad(),
				"Fuerza: " + personaje.getFuerza(),
				"Resistencia: " + personaje.getResistencia(),
				"Fe: " + personaje.getFe(),
				"Arma: " + personaje.getArma(),
				"Armadura: " + personaje.getArmadura(),
				"Inventario: " + personaje.getInventario(),
				"Habilidades" + personaje.getListaDeHabilidades(),
				""
				};
		return modeloCajaProta(textoParaCaja);
	}
	
	public static String cajaEnemigo(Personaje personaje){
		String[] textoParaCaja = { "",
				"Nombre: " + personaje.getNombre(),
				"Nivel: " + personaje.getNivel(),
				"Vitalidad: " + personaje.getVitalidad(),
				"Fuerza: " + personaje.getFuerza(),
				"Resistencia: " + personaje.getResistencia(),
				"Fe: " + personaje.getFe(),
				""
				};
		return modeloCajaProta(textoParaCaja);
	}
	
	public static String EstadoPersonaje(Personaje personaje){
		String[] textoParaCaja = { "",
				"" + personaje.getNombre(),
				"Vitalidad: " + personaje.getVitalidad(),
				"Fuerza: " + personaje.getFuerza(),
				"Resistencia: " + personaje.getResistencia(),
				"Fe: " + personaje.getFe(),
				"Inventario: " + personaje.getInventario(),
				"Habilidades" + personaje.getListaDeHabilidades(),
				""
				};
		return modeloCajaError(textoParaCaja);
	}
	
	public static String EstadoEnemigo(Personaje personaje){
		String[] textoParaCaja = { "",
				"" + personaje.getNombre(),
				"Nivel: " + personaje.getNivel(),
				"Vitalidad: " + personaje.getVitalidad(),
				"Fuerza: " + personaje.getFuerza(),
				"Resistencia: " + personaje.getResistencia(),
				"Fe: " + personaje.getFe(),
				""
				};
		return modeloCajaError(textoParaCaja);
	}
	
	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que su nombre tiene que empezar por una letra" };
		return modeloCajaError(textoParaCaja);
	}
	
	public static String cajaErrorOpcionPersonje() {
		String[] textoParaCaja = { "Error:", "Ingrese un número válido correspondiente al personaje" };
		return modeloCajaError(textoParaCaja);
	}
	
	public static String cajaErrorOpcionArma() {
		String[] textoParaCaja = { "Error:", "Ingrese un número válido correspondiente al arma" };
		return modeloCajaError(textoParaCaja);
	}
	
	public static String cajaErrorOpcionHabilidad() {
		String[] textoParaCaja = { "Error:", "Ingrese un número válido correspondiente a la habilidad" };
		return modeloCajaError(textoParaCaja);
	}
	
	public static String cajaResultadoAtaque(Personaje personaje, Personaje enemigo, int dañoPersonaje) {
		String[] textoParaCaja = {personaje.getNombre() + "ataca a " +  enemigo.getNombre() + "y le hace " + dañoPersonaje + " puntos de daño"};
		return modeloCajaAtaque(textoParaCaja);
	}


}
