package edu.Bruno.RetoFinal.Process;

/**
 * @author Bruno
 * Esta es la clase gato que contiene logicas del juego de donde se pone la X o 0
 * y tambien inclue el diseño del tablero el diseño del tablero
 */
public class Gato {
    private char[][] tablero;

    /**
     * Constructor de la clase Gato. Inicializa el tablero.
     */
    public Gato() {
        tablero = new char[3][3];
        inicializarTablero();
    }

    /**
     * Inicializa el tablero con espacios en blanco.
     */
    public void inicializarTablero() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    /**
     * Realiza un movimiento en el tablero.
     *
     * @param fila     La fila en la que se realiza el movimiento.
     * @param columna  La columna en la que se realiza el movimiento.
     * @param jugador  El símbolo del jugador ('X' o 'O').
     * @return         true si el movimiento es válido, false si la casilla está ocupada o fuera del rango.
     */
    public boolean hacerMovimiento(int fila, int columna, char jugador) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugador;
            return true;
        }
        return false;
    }

    /**
     * Obtiene el contenido de una casilla en el tablero.
     *
     * @param fila     La fila de la casilla.
     * @param columna  La columna de la casilla.
     * @return         El contenido de la casilla ('X', 'O' o ' ').
     */
    public char obtenerCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }

    /**
     * Verifica si un jugador ha ganado el juego.
     *
     * @param jugador  El símbolo del jugador ('X' o 'O').
     * @return         true si el jugador ha ganado, false de lo contrario.
     */
    public boolean verificarVictoria(char jugador) {
        // Verificar filas, columnas y diagonales para determinar si el jugador ha ganado.
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true; // Victoria en una fila
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true; // Victoria en una columna
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true; // Victoria en la diagonal principal
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true; // Victoria en la diagonal secundaria
        }
        return false;
    }

    /**
     * Verifica si el tablero está lleno, lo que indica un empate.
     *
     * @return true si el tablero está lleno, false de lo contrario.
     */
    public boolean tableroLleno() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[fila][columna] == ' ') {
                    return false; // El tablero no está lleno
                }
            }
        }
        return true; // El tablero está lleno (empate)
    }
}