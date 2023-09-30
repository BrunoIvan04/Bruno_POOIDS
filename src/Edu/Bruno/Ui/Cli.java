package Edu.Bruno.Ui;
/**
 * @author bruno
 * Esta clase contiene el menu de usuario
 */

import Edu.Bruno.Reto6.Process.Juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de adivinar palabras!");
        while (true) {
            try {
                System.out.println("Elige un nivel:");
                System.out.println("1. Fácil (4 letras)");
                System.out.println("2. Intermedio (8 letras)");
                System.out.println("3. Avanzado (12 letras)");
                System.out.println("0. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                // Salir del juego si el usuario elige 0
                if (opcion == 0) {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                }
                // Verificar que la opción esté en el rango válido
                if (opcion < 1 || opcion > 3) {
                    throw new IllegalArgumentException("Opción no válida. Debes elegir 1, 2, o 3.");
                }
                // Iniciar el juego con el nivel seleccionado
                Juego.iniciarJuego(opcion);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.nextLine(); // Consumir el valor no válido
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}