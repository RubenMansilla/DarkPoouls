package controlador;

import view.*;

public class Main {

	public static void main(String[] args) {

		String nombreFinal = null;

		String finalDeLaPartida = Aventura.aventura(nombreFinal);

		if (finalDeLaPartida.equals("derrota")) {
            System.out.println(Recursos.gameOver);
        } else if (finalDeLaPartida.equals("finDeLaPartida")) {
            System.out.println(Dialogos.cajaFinPartida());
            System.out.println();
            System.out.println(Recursos.finDelJuego);
        }

	}

	

}
