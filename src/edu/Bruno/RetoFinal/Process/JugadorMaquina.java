package edu.Bruno.RetoFinal.Process;

import edu.Bruno.RetoFinal.Ui.Idiomas;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Bruno
 * Esta es la clase jugadorMaquina que contiene la logica
 * de como la maquina realiza su turno
 */
public class JugadorMaquina extends Jugador2 {

    /**
     * Método para que la máquina o jugador realice su turno.
     *
     * @param gato     Objeto de la clase Gato que representa el estado del juego.
     * @param scanner  Objeto Scanner para la entrada de datos.
     * @param idioma   Entero que representa el idioma en el que se mostrarán los mensajes.
     * @param nmbre    Nombre del jugador.
     */
    public void realizarTurno(Gato gato, Scanner scanner, int idioma, String nmbre) {
        // Mostrar mensaje de ingreso de fila y columna según el idioma y nombre del jugador
        System.out.println(Idiomas.obtenerMensajeIngresoFilaColumna(idioma, simbolo, nombre));

        int fila, columna;

        // Verificar si el jugador es la máquina
        if (nombre.equals("Machine")) {
            // Lógica para la máquina (movimiento aleatorio)
            Random rand = new Random();
            do {
                fila = rand.nextInt(3);
                columna = rand.nextInt(3);
            } while (!gato.hacerMovimiento(fila, columna, simbolo));

        } else {
            // Lógica para el jugador humano
            fila = scanner.nextInt();
            columna = scanner.nextInt();

            // Solicitar movimiento al jugador humano hasta que sea válido
            while (!gato.hacerMovimiento(fila, columna, simbolo)) {
                System.out.println(Idiomas.obtenerMensajeMovimientoInvalido(idioma));
                fila = scanner.nextInt();
                columna = scanner.nextInt();
            }
        }
    }
}