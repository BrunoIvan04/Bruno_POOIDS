package edu.Bruno.RetoFinal.Process;

import edu.Bruno.RetoFinal.Ui.Idiomas;

import java.util.Scanner;
/**
 * @author Bruno
 * Esta es la clase jugadorHumano, que contiene la logica para que
 * tanto como el juego de dos jugadores o de jugador contra maquina
 * el programa sepa donde es que el jugador pone su ficha
 */
public class JugadorHumano extends Jugador2 {

    /**
     * Método para que el jugador humano realice su turno.
     *
     * @param gato     Objeto de la clase Gato que representa el estado del juego.
     * @param scanner  Objeto Scanner para la entrada de datos.
     * @param idioma   Entero que representa el idioma en el que se mostrarán los mensajes.
     * @param nmbre    Nombre del jugador.
     */
    public void realizarTurno(Gato gato, Scanner scanner, int idioma, String nmbre) {
        // Mostrar mensaje de ingreso de fila y columna según el idioma y nombre del jugador
        System.out.println(Idiomas.obtenerMensajeIngresoFilaColumna(idioma, simbolo, nombre));

        // Declarar variables para almacenar la fila y columna ingresadas por el jugador
        int fila, columna;

        // Leer la fila y la columna desde la entrada del jugador
        fila = scanner.nextInt();
        columna = scanner.nextInt();

        // Solicitar movimiento al jugador humano hasta que sea válido
        while (!gato.hacerMovimiento(fila, columna, simbolo)) {
            // Mostrar mensaje de movimiento inválido
            System.out.println(Idiomas.obtenerMensajeMovimientoInvalido(idioma));

            // Leer nuevamente la fila y la columna desde la entrada del jugador
            fila = scanner.nextInt();
            columna = scanner.nextInt();
        }
    }
}