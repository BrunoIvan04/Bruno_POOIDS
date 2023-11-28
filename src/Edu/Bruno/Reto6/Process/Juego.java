package Edu.Bruno.Reto6.Process;
/**
 * @author bruno
 * Esta clase contiene la logica del juego
 */
import java.util.Scanner;

public class Juego {
    public static void iniciarJuego(int nivel) {
        String palabraBase = seleccionarPalabraBase(nivel);
        StringBuilder palabraAdivinada = new StringBuilder("_".repeat(palabraBase.length()));

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("¡Adivina la palabra!");
        System.out.println(palabraAdivinada.toString());

        while (intentos < 5) {
            System.out.println("Introduce una letra: ");
            char letra = scanner.next().charAt(0);

            boolean acierto = false;
            // Actualizar la palabra adivinada
            for (int i = 0; i < palabraBase.length(); i++) {
                if (palabraBase.charAt(i) == letra) {
                    palabraAdivinada.setCharAt(i, letra);
                    acierto = true;
                }
            }
            // Mensaje de intento
            if (!acierto) {
                intentos++;
                System.out.println("Intentalo de nuevo!");
            }
             // Mostrar la palabra adivinada
            System.out.println(palabraAdivinada.toString());

            // Salir del bucle si la palabra fue adivinada
            if (palabraAdivinada.toString().equals(palabraBase)) {
                System.out.println("¡Has adivinado la palabra! La palabra es: " + palabraBase);
                break;
            }
        }
        // Mensaje de fin de juego si la palabra no fue adivinada
        if (!palabraAdivinada.toString().equals(palabraBase)) {
            System.out.println("Agotaste tus intentos. La palabra era: " + palabraBase);
        }
    }
    // Seleccionar la palabra base según el nivel
    private static String seleccionarPalabraBase(int nivel) {
        String palabra = "";
        switch (nivel) {
            case 1:
                palabra = "lata";
                break;
            case 2:
                palabra = "alemania";
                break;
            case 3:
                palabra = "autopista";
                break;
        }
        return palabra;
    }
}

