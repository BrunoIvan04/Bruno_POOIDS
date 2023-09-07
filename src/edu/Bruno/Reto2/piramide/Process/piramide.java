package edu.Bruno.Reto2.piramide.Process;
/**
 * @author bruno
 * Esta clase contiene las condicionales para formar la piramide
 */
public class piramide{
    /**
     * Esta clase contiene el diseño del menu en el que el usario da la altura deseada de la piramide
     */

    /**
     * i y j se utilizan para programar los arcos de circunferecnia en el plano x-y
     * y se da valores a estos para agregar los asteriscos
     */
    public static void Imprimirpiramide(int altura){
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

