package edu.Bruno.RetoFinal.Ui;

import edu.Bruno.RetoFinal.Process.Gato;
import edu.Bruno.RetoFinal.Process.JugadorHumano;
import edu.Bruno.RetoFinal.Process.JugadorMaquina;
import edu.Bruno.RetoFinal.Process.Scoreboard;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


 /**
 * @author Bruno
 *Esta es la clase CLI contiene el menú de usuario
  * y varios métodos para llevar a cabo el juego.
 */
public class CLI {
    private Gato gato;
    private JugadorHumano jugadorActual2;
    private JugadorMaquina jugadorActual3;
    private Scanner scanner;
    private Scoreboard scoreboard;
    private int idioma;

    /**
     * Constructor de la clase CLI.
     */
    public CLI() {
        gato = new Gato();
        scanner = new Scanner(System.in);
        scoreboard = new Scoreboard();
    }

    /**
     * Método para mostrar el tablero del juego.
     */
    public void mostrarTablero() {
        System.out.println("  0 1 2");
        for (int fila = 0; fila < 3; fila++) {
            System.out.print(fila + " ");
            for (int columna = 0; columna < 3; columna++) {
                char simbolo = gato.obtenerCasilla(fila, columna);
                System.out.print((simbolo == '\u0000') ? ' ' : simbolo);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Método principal para gestionar el juego.
     */
    public void jugar() {
        idioma = Idiomas.seleccionarIdioma();
        boolean juegoTerminado;

        do {
            int modoJuego = Idiomas.mostrarMenuModoJuego(idioma);
            juegoTerminado = false;

            switch (modoJuego) {
                case 1:
                    JugadorHumano jugadorMachine = new JugadorHumano();
                    jugadorMachine.setSimbolo('O');
                    char simbolo = jugadorMachine.setSimbolo('O');
                    System.out.println(Idiomas.obtenerMensajeIngresoNombre(idioma, simbolo));
                    String nombre = scanner.next();
                    jugadorMachine.setNombre(nombre);

                    JugadorHumano jugadorXMachine = new JugadorHumano();
                    jugadorXMachine.setSimbolo('X');
                    char simbolo2 = jugadorXMachine.setSimbolo('X');
                    System.out.println(Idiomas.obtenerMensajeIngresoNombre(idioma, simbolo2));
                    String nombre2 = scanner.next();
                    jugadorXMachine.setNombre(nombre2);

                    jugarPartidaHumano(jugadorXMachine, jugadorMachine);
                    break;
                case 2:
                    JugadorMaquina jugadorMachine2 = new JugadorMaquina();
                    jugadorMachine2.setSimbolo('O');

                    String nombre3 = "Machine";
                    jugadorMachine2.setNombre(nombre3);

                    JugadorMaquina jugadorXMachine2 = new JugadorMaquina();
                    jugadorXMachine2.setSimbolo('X');
                    char simbolo4 = jugadorXMachine2.setSimbolo('X');
                    System.out.println(Idiomas.obtenerMensajeIngresoNombre(idioma, simbolo4));
                    String nombre4 = scanner.next();
                    jugadorXMachine2.setNombre(nombre4);

                    jugarPartidaMaquina(jugadorXMachine2, jugadorMachine2);
                    break;
                case 3:
                    mostrarScoreboard();
                    break;
                case 4:
                    juegoTerminado = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue; // Volver al inicio del bucle para seleccionar nuevamente
            }

        } while (!juegoTerminado);
    }

    /**
     * Método para jugar una partida entre dos jugadores humanos.
     */
    private void jugarPartidaHumano(JugadorHumano jugadorXMachine, JugadorHumano jugadorMachine) {
        boolean juegoTerminado = false;
        gato.inicializarTablero();
        jugadorActual2 = jugadorXMachine;

        do {
            mostrarTablero();
            jugadorActual2.realizarTurno(gato, scanner, idioma, jugadorActual2.getNombre());

            if (gato.verificarVictoria(jugadorActual2.getSimbolo())) {
                mostrarTablero();
                System.out.println(Idiomas.obtenerMensajeGanador(idioma, jugadorActual2.getNombre()));
                juegoTerminado = true;
            } else if (gato.tableroLleno()) {
                mostrarTablero();
                System.out.println(Idiomas.obtenerMensajeEmpate(idioma));
                juegoTerminado = true;
            } else {
                jugadorActual2 = (jugadorActual2 == jugadorXMachine) ? jugadorMachine : jugadorXMachine;
            }
        } while (!juegoTerminado);

        // Al salir de la partida, registrar el resultado en el Scoreboard
        scoreboard.registrarResultado(jugadorActual2.getNombre(), juegoTerminado);

        // Pregunta al usuario si desea ver el Scoreboard en el Bloc de notas
        System.out.println(Idiomas.obtenerMensajeGuardarScoreboard(idioma));
        int verScoreboard = scanner.nextInt();

        if (verScoreboard == 1) {
            try {
                // Guarda el Scoreboard en un archivo temporal
                String tempFilePath = "scoreboard_temp.txt";
                scoreboard.guardarEnArchivo(tempFilePath);

                // Abre el Bloc de notas con el archivo temporal
                Path path = Paths.get(tempFilePath);
                ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", path.toString());
                processBuilder.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Pregunta al usuario si desea volver al menú principal
        System.out.println(Idiomas.obtenerMensajeVolverMenu(idioma));
        int volverAlMenu = scanner.nextInt();

        if (volverAlMenu == 1) {
            juegoTerminado = false;
        } else {
            // Al seleccionar 'No', regresar a la selección de idioma
            idioma = Idiomas.seleccionarIdioma();
        }
    }

    /**
     * Método para jugar una partida contra la máquina.
     */
    private void jugarPartidaMaquina(JugadorMaquina jugadorXMachine2, JugadorMaquina jugadorMachine2) {
        boolean juegoTerminado = false;
        gato.inicializarTablero();
        jugadorActual3 = jugadorXMachine2;

        do {
            mostrarTablero();
            jugadorActual3.realizarTurno(gato, scanner, idioma, jugadorActual3.getNombre());

            if (gato.verificarVictoria(jugadorActual3.getSimbolo())) {
                mostrarTablero();
                System.out.println(Idiomas.obtenerMensajeGanador(idioma, jugadorActual3.getNombre()));
                juegoTerminado = true;
            } else if (gato.tableroLleno()) {
                mostrarTablero();
                System.out.println(Idiomas.obtenerMensajeEmpate(idioma));
                juegoTerminado = true;
            } else {
                jugadorActual3 = (jugadorActual3 == jugadorXMachine2) ? jugadorMachine2 : jugadorXMachine2;
            }
        } while (!juegoTerminado);

        // Al salir de la partida, registrar el resultado en el Scoreboard
        scoreboard.registrarResultado(jugadorActual3.getNombre(), juegoTerminado);

        // Pregunta al usuario si desea ver el Scoreboard en el Bloc de notas
        System.out.println(Idiomas.obtenerMensajeGuardarScoreboard(idioma));
        int verScoreboard = scanner.nextInt();

        if (verScoreboard == 1) {
            try {
                // Guarda el Scoreboard en un archivo temporal
                String tempFilePath = "scoreboard_temp.txt";
                scoreboard.guardarEnArchivo(tempFilePath);

                // Abre el Bloc de notas con el archivo temporal
                Path path = Paths.get(tempFilePath);
                ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", path.toString());
                processBuilder.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Pregunta al usuario si desea volver al menú principal
        System.out.println(Idiomas.obtenerMensajeVolverMenu(idioma));
        int volverAlMenu = scanner.nextInt();

        if (volverAlMenu == 1) {
            juegoTerminado = false;
        } else {
            // Al seleccionar 'No', regresar a la selección de idioma
            idioma = Idiomas.seleccionarIdioma();
        }
    }

    /**
     * Método para mostrar el Scoreboard y dar la opción de guardarlo en un archivo.
     */
    private void mostrarScoreboard() {
        System.out.println(Idiomas.obtenerMensajeScoreboard(idioma));
        scoreboard.mostrarPuntuacion();
        System.out.println(Idiomas.obtenerMensajeGuardarScoreboard(idioma));

        int saveToFile = scanner.nextInt();
        if (saveToFile == 1) {
            guardarScoreboardEnArchivo();
        }
    }

    /**
     * Método para guardar el Scoreboard en un archivo.
     */
    private void guardarScoreboardEnArchivo() {
        try {
            System.out.println("Enter the file path to save the scoreboard (e.g., C:\\path\\to\\file.txt): ");
            String filePath = scanner.next();

            // Guarda el marcador en el archivo especificado
            scoreboard.guardarEnArchivo(filePath);

            System.out.println(Idiomas.obtenerMensajeScoreboardGuardado(idioma));
        } catch (IOException e) {
            System.out.println(Idiomas.obtenerMensajeErrorGuardandoScoreboard(idioma));
            e.printStackTrace();
        }
    }
}