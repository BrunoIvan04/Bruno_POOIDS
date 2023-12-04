package edu.Bruno.RetoFinal.Process;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno
 * Esta es la clase Scoreboard que gestiona las puntuaciones de los jugadores
 * y las lanza en un archivo.txt
 */
public class Scoreboard {
    private Map<String, Integer> puntuacion;

    /**
     * Constructor de la clase Scoreboard. Inicializa la puntuación y carga datos anteriores si existen.
     */
    public Scoreboard() {
        puntuacion = new HashMap<>();
        cargarPuntuacion(); // Cargar la puntuación existente al iniciar el juego
    }

    /**
     * Registra el resultado de una partida para un jugador y actualiza la puntuación.
     *
     * @param nombreJugador  El nombre del jugador.
     * @param juegoTerminado Indica si el juego ha terminado (true) o no (false).
     */
    public void registrarResultado(String nombreJugador, boolean juegoTerminado) {
        if (!puntuacion.containsKey(nombreJugador)) {
            puntuacion.put(nombreJugador, 0);
        }

        if (juegoTerminado) {
            int puntosActuales = puntuacion.get(nombreJugador);
            puntuacion.put(nombreJugador, puntosActuales + 1);
            guardarPuntuacion(); // Guardar la puntuación después de cada partida
        }
    }

    /**
     * Muestra la puntuación actual de los jugadores.
     */
    public void mostrarPuntuacion() {
        for (Map.Entry<String, Integer> entry : puntuacion.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " puntos");
        }
    }

    /**
     * Carga la puntuación desde un archivo de texto.
     */
    private void cargarPuntuacion() {
        try (BufferedReader br = new BufferedReader(new FileReader("puntuacion.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
                String nombreJugador = partes[0];
                int puntos = Integer.parseInt(partes[1]);
                puntuacion.put(nombreJugador, puntos);
            }
        } catch (IOException e) {
            // Manejar la excepción, por ejemplo, imprimir un mensaje de error
            System.err.println("Error al cargar la puntuación: " + e.getMessage());
        }
    }

    /**
     * Guarda la puntuación en un archivo de texto.
     *
     * @param filePath Ruta del archivo donde se guardará la puntuación.
     * @throws IOException Si hay un error al escribir en el archivo.
     */
    public void guardarEnArchivo(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Escribe las puntuaciones en el archivo
        for (Map.Entry<String, Integer> entry : puntuacion.entrySet()) {
            printWriter.println(entry.getKey() + ": " + entry.getValue() + " wins");
        }

        printWriter.close();
    }

    /**
     * Guarda la puntuación en un archivo de texto (por defecto "puntuacion.txt").
     */
    private void guardarPuntuacion() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("puntuacion.txt"))) {
            for (Map.Entry<String, Integer> entry : puntuacion.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            // Manejar la excepción, por ejemplo, imprimir un mensaje de error
            System.err.println("Error al guardar la puntuación: " + e.getMessage());
        }
    }
}