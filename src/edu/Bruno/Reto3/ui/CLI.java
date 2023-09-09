package edu.Bruno.Reto3.ui;
/**
 * @author bruno
 * Esta clase contiene el menu de usuario
 */
import edu.Bruno.Reto3.Process.Conversion;

import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Conversion conversion = new Conversion();

        System.out.println("Bienvenido al programa de conversiones entre bases numéricas");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir de decimal a binario.");
            System.out.println("2. Convertir de decimal a octal.");
            System.out.println("3. Convertir de binario a decimal.");
            System.out.println("4. Convertir de octal a decimal.");
            System.out.println("5. Convertir de hexadecimal a decimal.");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Conversion.convertirDecimalABinario();
                    break;
                case 2:
                    Conversion.convertirDecimalAOctal();
                    break;
                case 3:
                    Conversion.convertirBinarioADecimal();
                    break;
                case 4:
                    Conversion.convertirOctalADecimal();
                    break;
                case 5:
                    Conversion.convertirHexadecimalADecimal();
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa de conversiones. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
