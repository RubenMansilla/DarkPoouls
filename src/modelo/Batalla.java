package modelo;

import static view.FuncionesDialogo.centrarLinea;
import java.util.Random;
import java.util.Scanner;
import view.*;

public class Batalla {

    private static int tiempoHabilidad = 0; // Variable estática para llevar el seguimiento del tiempo de uso de
                                            // habilidades
    private static int batallas = 0; // Variable estática para llevar el seguimiento de la cantidad de batallas

    // Ataque entre dos personajes
    // un método estático puede ser llamado sin crear una instancia de la clase
    // es decir, se puede llamar a un método estático sin crear un objeto de la
    // clase
    public static void atacar(Personaje jugador, Personaje enemigo) {
        // Calcular el daño base del ataque (fuerza del jugador - resistencia del
        // enemigo)
        int dañoPersonaje = jugador.getFuerza() - enemigo.getResistencia();

        // Verificar si el jugador tiene un arma y si es una Katana
        // o una Espada Oxidada para ejecutar sus habilidades
        // instanceof es un operador que verifica si un objeto es una instancia de una
        // clase, subclase o interfaz

        // En este caso, jugador.arma instanceof Katana verifica si el arma equipada por
        // el jugador es una instancia de la clase Katana. Si es verdadero, se ejecuta
        // el código dentro de ese bloque
        if (jugador.arma instanceof Katana) {
            // Calcular el daño adicional de la habilidad de la Katana
            dañoPersonaje += ((Katana) jugador.getArma()).habilidadArma();

            // En este caso, jugador.arma instanceof EspadaOxidada verifica si el arma
            // equipada por el jugador es una instancia de la clase EspadaOxidada. Si es
            // verdadero, se ejecuta el código dentro de ese bloque
        } else if (jugador.arma instanceof EspadaOxidada) {
            // Ejecutar la habilidad de la Espada Oxidada
            ((EspadaOxidada) jugador.getArma()).habilidadArma(enemigo);
        }

        // Restar el daño al enemigo
        enemigo.setVitalidad(enemigo.getVitalidad() - (dañoPersonaje));

        // Imprimir mensaje de ataque
        System.out.println();
        System.out.println(Dialogos.cajaResultadoAtaque(jugador, enemigo, dañoPersonaje));
        System.out.println();

        // Si el enemigo sigue con vitalidad, realizar ataque del enemigo
        if (enemigo.getVitalidad() > 0) {
            Random random = new Random();
            int probAtaqueEnemigo = random.nextInt(10) + 1; // Probabilidad de ataque del enemigo

            int danoPorFe = 0;

            if (probAtaqueEnemigo != 1) {
                enemigo.setFe(enemigo.getFe() + 5);

                // Si la fe del enemigo llega a 20, causar daño adicional por enfado
                if (enemigo.getFe() == 20) {
                    danoPorFe = 5;
                    enemigo.setFe(0);
                    System.out.println(Dialogos.cajaEnfadoEnemigo(enemigo));
                }

                // Calcular y aplicar el daño al jugador
                int danoEnemigo = enemigo.getFuerza() + danoPorFe - jugador.getResistencia();
                jugador.setVitalidad(jugador.getVitalidad() - danoEnemigo);

                // Imprimir mensaje de ataque del enemigo
                System.out.println();
                System.out.println(Dialogos.cajaResultadoAtaque(enemigo, jugador, danoEnemigo));
                System.out.println();
            } else {
                // Si el enemigo falla el ataque, imprimir mensaje
                System.out.println("\n" + enemigo.getNombre() + " falla el ataque");
            }
        }
    }

    // Mostrar la introducción de la batalla
    private static void mostrarIntroduccionBatalla(Personaje jugador, Personaje enemigo, Scanner scanner) {
        System.out.println();
        System.out.println(Dialogos.cajaAtaque(jugador));
        System.out.println();
        System.out.println(Recursos.vs);
        System.out.println();
        System.out.println(Dialogos.cajaAtaque(enemigo));
        System.out.println();

        scanner.nextLine();
        System.out.println(centrarLinea("Presione START para continuar"));
        scanner.nextLine();

        System.out.println(Dialogos.cajaPersonaje(jugador));
        System.out.println(Dialogos.cajaEnemigo(enemigo));
    }

    // Lógica principal de la batalla
    public static void batalla(Personaje jugador, Personaje enemigo) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean objetoUsado = false;
        boolean habilidadUsada = false;

        // Mostrar la introducción de la batalla
        mostrarIntroduccionBatalla(jugador, enemigo, scanner);

        // Mientras ambos personajes tengan vitalidad
        while (jugador.getVitalidad() > 0 && enemigo.getVitalidad() > 0) {
            System.out.println("");
            System.out.println("1. Atacar");
            System.out.println("2. Usar Objeto");
            System.out.println("3. Usar Habilidad");
            System.out.print("Elige una opción: ");

            // Validar la opción ingresada por el jugador (solo números enteros)
            while (!scanner.hasNextInt()) {
                System.out.println(Dialogos.cajaErrorOpcionBatalla());
                scanner.next();
            }

            opcion = scanner.nextInt();

            // Validar la opción
            while (opcion != 1 && opcion != 2 && opcion != 3) {
                System.out.println(Dialogos.cajaErrorOpcionBatalla());
                opcion = scanner.nextInt();
            }

            // Realizar la acción según la opción seleccionada
            if (opcion == 1) {
                // Atacar
                atacar(jugador, enemigo);
                // Reiniciar el uso de objeto y habilidad al atacar
                objetoUsado = false;
                habilidadUsada = false;
                scanner.nextLine();
                System.out.println(centrarLinea("Presione START para continuar"));
                scanner.nextLine();

                // Aumentar tiempo de uso de la habilidad
                tiempoHabilidad++;

                // Reiniciar estadísticas por uso de habilidad
                if (tiempoHabilidad == 2) {
                    jugador.setFuerza(jugador.getFuerzaMaxima());
                    jugador.setResistencia(jugador.getResistenciaMaxima());
                }

                // Usar objeto
            } else if (opcion == 2) {
                // si el jugador tiene objetos en el inventario y no ha usado un objeto en el
                // turno
                if (!jugador.getInventario().isEmpty() && !objetoUsado) {
                    System.out.println("Objetos disponibles:");
                    for (int i = 0; i < jugador.getInventario().size(); i++) {
                        System.out.println((i + 1) + ". " + jugador.getInventario().get(i).getNombre() + "("
                                + jugador.getInventario().get(i).getCantidad() + ")");
                    }

                    int indiceObjeto;

                    // Validar el índice del objeto
                    do {
                        System.out.print("Elige un objeto introduciendo su número: ");
                        indiceObjeto = scanner.nextInt();

                        // Validar el índice del objeto seleccionado por el jugador si es menor o igual
                        // a 0 o mayor que el tamaño del inventario
                        if (indiceObjeto <= 0 || indiceObjeto > jugador.getInventario().size()) {
                            System.out.println(Dialogos.cajaErrorTurnoObjeto2());
                        }

                    } while (indiceObjeto <= 0 || indiceObjeto > jugador.getInventario().size());

                    // Llamar al método usarObjeto con el objeto seleccionado
                    // (indiceObjeto - 1) para obtener el índice correcto del objeto en el
                    // inventario (ya que el índice del jugador comienza en 0)
                    jugador.usarObjeto(jugador.getInventario().get(indiceObjeto - 1));
                    // Eliminar el objeto del inventario
                    jugador.eliminarObjeto(jugador.getInventario().get(indiceObjeto - 1));

                    // Marcar el objeto como usado
                    objetoUsado = true;

                    // Si el jugador no tiene objetos en el inventario, imprimir mensaje
                } else if (jugador.getInventario().isEmpty()) {
                    System.out.println(Dialogos.cajaInventarioVacio());

                    // Si el jugador ya ha usado un objeto en el turno, imprimir mensaje
                } else {
                    System.out.println(Dialogos.cajaErrorTurnoObjeto());
                }

                scanner.nextLine();
                System.out.println(centrarLinea("Presione START para continuar"));
                scanner.nextLine();

                // Usar habilidad
            } else if (opcion == 3) {

                // Si el jugador tiene habilidades en la lista y no ha usado una habilidad en el
                // turno
                if (!jugador.getListaDeHabilidades().isEmpty() && !habilidadUsada) {
                    System.out.println();
                    System.out.println(centrarLinea("Habilidades disponibles:"));

                    // Imprimir las habilidades disponibles
                    for (int i = 0; i < jugador.getListaDeHabilidades().size(); i++) {
                        System.out.println(
                                (i + 1) + ". " + jugador.getListaDeHabilidades().get(i).getNombre() + "( Coste: "
                                        + jugador.getListaDeHabilidades().get(i).getCosteFe() + " )");
                    }

                    int indiceHabilidad;

                    // Validar el índice de la habilidad
                    do {
                        System.out.println();
                        System.out.print(centrarLinea("Elige una habilidad introduciendo su número: "));
                        indiceHabilidad = scanner.nextInt();

                        // Validar el índice de la habilidad seleccionada por el jugador si es menor o
                        // igual a 0 o mayor que el tamaño de la lista de habilidades
                        if (indiceHabilidad <= 0 || indiceHabilidad > jugador.getListaDeHabilidades().size()) {
                            System.out.println(Dialogos.cajaErrorTurnoHabilidad2());
                        }

                    } while (indiceHabilidad <= 0 || indiceHabilidad > jugador.getListaDeHabilidades().size());

                    // Llamar al método usarHabilidad con la habilidad seleccionada
                    jugador.usarHabilidad(jugador.getListaDeHabilidades().get(indiceHabilidad - 1));

                    // Marcar la habilidad como usada
                    habilidadUsada = true;

                    // Si el jugador ya ha usado una habilidad en el turno, imprimir mensaje
                } else {
                    System.out.println(Dialogos.cajaErrorTurnoHabilidad());
                }

                scanner.nextLine();
                System.out.println(centrarLinea("Presione START para continuar"));
                scanner.nextLine();
            }

            // Fin del turno, imprimir estado actual de los personajes
            System.out.println(centrarLinea(("Estado después del turno:")));
            System.out.println(Dialogos.EstadoPersonaje(jugador));
            System.out.println(Dialogos.EstadoEnemigo(enemigo));
        }

        // Verificar si el enemigo ha sido derrotado
        batallas++;
        if (enemigo.getVitalidad() <= 0) {
            enemigo.reiniciarEstadisticas();
            jugador.reiniciarEstadisticas();
            System.out.println(Dialogos.reiniciarEstadisticas(jugador));
        }

        // Si se han completado 2 batallas y el jugador sigue con vida, subir de nivel
        // al jugador
        if (batallas == 2 && jugador.getVitalidad() > 0) {
            jugador.subirNivel();
            batallas = 0;
        }
    }
}
