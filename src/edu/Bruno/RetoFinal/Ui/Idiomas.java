package edu.Bruno.RetoFinal.Ui;

import java.util.Scanner;

/**
 * La clase Idiomas implementa la interfaz Lenguaje y proporciona métodos para manejar múltiples idiomas en el juego.
 */
public class Idiomas implements Lenguaje {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Permite al usuario seleccionar el idioma.
     *
     * @return El código del idioma seleccionado.
     */
    public static int seleccionarIdioma() {
        System.out.println("Selecciona el idioma ( (1)/Select the language (2):");
        System.out.println("(1). Español");
        System.out.println("(2). English");
        return scanner.nextInt();
    }

    /**
     * Muestra el menú de selección del modo de juego en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return La opción de modo de juego seleccionada por el usuario.
     */
    public static int mostrarMenuModoJuego(int idioma) {
        int modoJuego;
        if (idioma == 1) {
            Español.mostrarMenuModoJuegoEspañol();
            modoJuego = scanner.nextInt();
        } else {
            Ingles.mostrarMenuModoJuegoIngles();
            modoJuego = scanner.nextInt();
        }
        return modoJuego;
    }

    /**
     * Obtiene el mensaje para ingresar el nombre del jugador en el idioma correspondiente.
     *
     * @param idioma  Código del idioma.
     * @param simbolo Símbolo del jugador.
     * @return Mensaje de ingreso de nombre.
     */
    public static String obtenerMensajeIngresoNombre(int idioma, char simbolo) {
        if (idioma == 1) {
            return Español.obtenerMensajeIngresoNombreEspañol(simbolo);
        } else {
            return Ingles.obtenerMensajeIngresoNombreIngles(simbolo);
        }
    }

    /**
     * Obtiene el mensaje para ingresar la fila y columna en el idioma correspondiente.
     *
     * @param idioma  Código del idioma.
     * @param simbolo Símbolo del jugador.
     * @param nombre  Nombre del jugador.
     * @return Mensaje de ingreso de fila y columna.
     */
    public static String obtenerMensajeIngresoFilaColumna(int idioma, char simbolo, String nombre) {
        if (idioma == 1) {
            return Español.obtenerMensajeIngresoFilaColumnaEspañol(idioma, simbolo, nombre);
        } else {
            return Ingles.obtenerMensajeIngresoFilaColumnaIngles(idioma, simbolo, nombre);
        }
    }

    /**
     * Obtiene el mensaje de movimiento inválido en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje de movimiento inválido.
     */
    public static String obtenerMensajeMovimientoInvalido(int idioma) {
        if (idioma == 1) {
            return Español.obtenerMensajeMovimientoInvalidoEspañol();
        } else {
            return Ingles.obtenerMensajeMovimientoInvalidoIngles();
        }
    }

    /**
     * Obtiene el mensaje de victoria del jugador en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @param nombre Nombre del jugador ganador.
     * @return Mensaje de victoria.
     */
    public static String obtenerMensajeGanador(int idioma, String nombre) {
        if (idioma == 1) {
            return Español.obtenerMensajeGanadorEspañol(nombre);
        } else {
            return Ingles.obtenerMensajeGanadorIngles(nombre);
        }
    }

    /**
     * Obtiene el mensaje de empate en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje de empate.
     */
    public static String obtenerMensajeEmpate(int idioma) {
        if (idioma == 1) {
            return Español.obtenerMensajeEmpateEspañol();
        } else {
            return Ingles.obtenerMensajeEmpateIngles();
        }
    }

    /**
     * Obtiene el mensaje para volver al menú principal en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje de volver al menú principal.
     */
    public static String obtenerMensajeVolverMenu(int idioma) {
        if (idioma == 1) {
            return Español.obtenerMensajeVolverMenuEspañol();
        } else {
            return Ingles.obtenerMensajeVolverMenuIngles();
        }
    }

    /**
     * Obtiene el mensaje del Scoreboard en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje del Scoreboard.
     */
    public static String obtenerMensajeScoreboard(int idioma) {
        if (idioma == 1) {
            return Español.obtenerMensajeScoreboardEspañol();
        } else {
            return Ingles.obtenerMensajeScoreboardIngles();
        }
    }

    /**
     * Obtiene el mensaje para guardar el Scoreboard en un archivo en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje para guardar el Scoreboard en un archivo.
     */
    public static String obtenerMensajeGuardarScoreboard(int idioma) {
        if (idioma == 2) {
            return Ingles.obtenerMensajeGuardarScoreboardIngles();
        } else {
            return Español.obtenerMensajeGuardarScoreboardEspañol();
        }
    }

    /**
     * Obtiene el mensaje de que el Scoreboard ha sido guardado con éxito en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje de Scoreboard guardado con éxito.
     */
    public static String obtenerMensajeScoreboardGuardado(int idioma) {
        if (idioma == 2) {
            return Ingles.obtenerMensajeScoreboardGuardadoIngles();
        } else {
            return Español.obtenerMensajeScoreboardGuardadoEspañol();
        }
    }

    /**
     * Obtiene el mensaje de error al guardar el Scoreboard en el idioma correspondiente.
     *
     * @param idioma Código del idioma.
     * @return Mensaje de error al guardar el Scoreboard.
     */
    public static String obtenerMensajeErrorGuardandoScoreboard(int idioma) {
        if (idioma == 2) {
            return Ingles.obtenerMensajeErrorGuardandoScoreboardIngles();
        } else {
            return Español.obtenerMensajeErrorGuardandoScoreboardEspañol();
        }
    }
}