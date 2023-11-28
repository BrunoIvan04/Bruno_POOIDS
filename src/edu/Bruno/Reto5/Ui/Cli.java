package edu.Bruno.Reto5.Ui;

import edu.Bruno.Reto5.Process.Juego;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de adivinar palabras!");
        while (true) {
            System.out.println("Elige un nivel:");
            System.out.println("1. Fácil (4 letras)");
            System.out.println("2. Intermedio (8 letras)");
            System.out.println("3. Avanzado (12 letras)");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }

            Juego.iniciarJuego(opcion);
        }
    }
}