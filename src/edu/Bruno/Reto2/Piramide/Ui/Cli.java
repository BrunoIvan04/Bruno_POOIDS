package Reto2.Piramide.Ui;
import Reto2.Piramide.Process.Piramide;
import java.util.Scanner;
/**
 * @author bruno
 * Esta clase contiene el diseño del menu en el que el usario da la altura deseada de la piramide
 */
public class Cli {
    public static void showMenu(){
        /**
         * Utilize scanner para para que el usuario pueda ingresar la altura deseada
         * Utilize system println para que apareceria en el menu
         * y scanner nextint para que pueda leer lo ingresado
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa altura de la piramide");
        int altura = scanner.nextInt();

        Piramide.Imprimirpiramide(altura);

    }

}
