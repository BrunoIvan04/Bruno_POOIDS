package edu.Bruno.RetoFinal.Ui;

/**
 * La interfaz Español proporciona mensajes en español para el juego.
 */
public interface Español {

    /**
     * Muestra el menú de selección del modo de juego en español.
     */
    static void mostrarMenuModoJuegoEspañol() {
        System.out.println("Seleccione el modo de juego (Escribe el numero del modo de juego):");
        System.out.println("(1). Dos jugadores");
        System.out.println("(2). Contra la máquina");
        System.out.println("(3). Ver Puntuación");
        System.out.println("(4). Salir");
    }

    /**
     * Obtiene el mensaje para ingresar el nombre del jugador en español.
     *
     * @param simbolo Símbolo del jugador.
     * @return Mensaje de ingreso de nombre.
     */
    public static String obtenerMensajeIngresoNombreEspañol(char simbolo) {
        return "Ingresa tu nombre, Jugador " + simbolo + ": ";
    }

    /**
     * Obtiene el mensaje para ingresar la fila y columna en español.
     *
     * @param idioma  Idioma del juego.
     * @param simbolo Símbolo del jugador.
     * @param nombre  Nombre del jugador.
     * @return Mensaje de ingreso de fila y columna.
     */
    public static String obtenerMensajeIngresoFilaColumnaEspañol(int idioma, char simbolo, String nombre) {
        return "Jugador " + nombre + " (" + obtenerNombreJugador(idioma, simbolo) + "), ingresa tu movimiento (fila y columna): ";
    }

    /**
     * Obtiene el nombre del jugador en español.
     *
     * @param idioma  Idioma del juego.
     * @param simbolo Símbolo del jugador.
     * @return Nombre del jugador.
     */
    private static String obtenerNombreJugador(int idioma, char simbolo) {
        return String.valueOf(simbolo);
    }

    /**
     * Obtiene el mensaje de movimiento inválido en español.
     *
     * @return Mensaje de movimiento inválido.
     */
    public static String obtenerMensajeMovimientoInvalidoEspañol() {
        return "Movimiento inválido. Inténtalo de nuevo.";
    }

    /**
     * Obtiene el mensaje de victoria del jugador en español.
     *
     * @param nombre Nombre del jugador ganador.
     * @return Mensaje de victoria.
     */
    public static String obtenerMensajeGanadorEspañol(String nombre) {
        return nombre + " ha ganado!";
    }

    /**
     * Obtiene el mensaje de empate en español.
     *
     * @return Mensaje de empate.
     */
    public static String obtenerMensajeEmpateEspañol() {
        return "¡Es un empate!";
    }

    /**
     * Obtiene el mensaje para volver al menú principal en español.
     *
     * @return Mensaje de volver al menú principal.
     */
    public static String obtenerMensajeVolverMenuEspañol() {
        return "¿Quieres volver al menú principal? ( (1). Sí / (2). No)";
    }

    /**
     * Obtiene el mensaje del Scoreboard en español.
     *
     * @return Mensaje del Scoreboard.
     */
    public static String obtenerMensajeScoreboardEspañol() {
        return "----- Tabla de Puntuación -----";
    }

    /**
     * Obtiene el mensaje para guardar el Scoreboard en un archivo en español.
     *
     * @return Mensaje para guardar el Scoreboard en un archivo.
     */
    public static String obtenerMensajeGuardarScoreboardEspañol() {
        return "¿Quieres guardar la puntuación en un archivo? ( (1). Sí / (2). No)";
    }

    /**
     * Obtiene el mensaje de que el Scoreboard ha sido guardado con éxito en español.
     *
     * @return Mensaje de Scoreboard guardado con éxito.
     */
    public static String obtenerMensajeScoreboardGuardadoEspañol() {
        return "Se ha guardado correctamente el archivo";
    }

    /**
     * Obtiene el mensaje de error al guardar el Scoreboard en español.
     *
     * @return Mensaje de error al guardar el Scoreboard.
     */
    public static String obtenerMensajeErrorGuardandoScoreboardEspañol() {
        return "Ha ocurrido un error guardando el archivo";
    }
}