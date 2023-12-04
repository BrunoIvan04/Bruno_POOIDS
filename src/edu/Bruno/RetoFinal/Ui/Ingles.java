package edu.Bruno.RetoFinal.Ui;

/**
 * La interfaz Ingles proporciona mensajes en inglés para el juego.
 */
public interface Ingles {

    /**
     * Muestra el menú de selección del modo de juego en inglés.
     */
    static void mostrarMenuModoJuegoIngles() {
        System.out.println("Select game mode (Type the number of the game mode):");
        System.out.println("(1). Two players");
        System.out.println("(2). Against the machine");
        System.out.println("(3). View Scoreboard");
        System.out.println("(4). Exit");
    }

    /**
     * Obtiene el mensaje para ingresar el nombre del jugador en inglés.
     *
     * @param simbolo Símbolo del jugador.
     * @return Mensaje de ingreso de nombre.
     */
    public static String obtenerMensajeIngresoNombreIngles(char simbolo) {
        return "Enter your name, Player " + simbolo + ": ";
    }

    /**
     * Obtiene el mensaje para ingresar la fila y columna en inglés.
     *
     * @param idioma  Idioma del juego.
     * @param simbolo Símbolo del jugador.
     * @param nombre  Nombre del jugador.
     * @return Mensaje de ingreso de fila y columna.
     */
    public static String obtenerMensajeIngresoFilaColumnaIngles(int idioma, char simbolo, String nombre) {
        return "Player " + nombre + " (" + obtenerNombreJugador(idioma, simbolo) + "), enter your move (row and column): ";
    }

    /**
     * Obtiene el nombre del jugador en inglés.
     *
     * @param idioma  Idioma del juego.
     * @param simbolo Símbolo del jugador.
     * @return Nombre del jugador.
     */
    private static String obtenerNombreJugador(int idioma, char simbolo) {
        return String.valueOf(simbolo);
    }

    /**
     * Obtiene el mensaje de movimiento inválido en inglés.
     *
     * @return Mensaje de movimiento inválido.
     */
    public static String obtenerMensajeMovimientoInvalidoIngles() {
        return "Invalid move. Try again.";
    }

    /**
     * Obtiene el mensaje de victoria del jugador en inglés.
     *
     * @param nombre Nombre del jugador ganador.
     * @return Mensaje de victoria.
     */
    public static String obtenerMensajeGanadorIngles(String nombre) {
        return nombre + " has won!";
    }

    /**
     * Obtiene el mensaje de empate en inglés.
     *
     * @return Mensaje de empate.
     */
    public static String obtenerMensajeEmpateIngles() {
        return "It's a draw!";
    }

    /**
     * Obtiene el mensaje para volver al menú principal en inglés.
     *
     * @return Mensaje de volver al menú principal.
     */
    public static String obtenerMensajeVolverMenuIngles() {
        return "Do you want to go back to the main menu? ( (1). Yes / (2). No)";
    }

    /**
     * Obtiene el mensaje del Scoreboard en inglés.
     *
     * @return Mensaje del Scoreboard.
     */
    public static String obtenerMensajeScoreboardIngles() {
        return "----- Scoreboard -----";
    }

    /**
     * Obtiene el mensaje para guardar el Scoreboard en un archivo en inglés.
     *
     * @return Mensaje para guardar el Scoreboard en un archivo.
     */
    public static String obtenerMensajeGuardarScoreboardIngles() {
        return "Do you want to save the scoreboard to a file? ( (1). Yes / (2). No)";
    }

    /**
     * Obtiene el mensaje de que el Scoreboard ha sido guardado con éxito en inglés.
     *
     * @return Mensaje de Scoreboard guardado con éxito.
     */
    public static String obtenerMensajeScoreboardGuardadoIngles() {
        return "File saved succesfully";
    }

    /**
     * Obtiene el mensaje de error al guardar el Scoreboard en inglés.
     *
     * @return Mensaje de error al guardar el Scoreboard.
     */
    public static String obtenerMensajeErrorGuardandoScoreboardIngles() {
        return "There was an error saving the file";
    }
}