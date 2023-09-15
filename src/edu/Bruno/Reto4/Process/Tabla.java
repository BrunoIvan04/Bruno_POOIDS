package edu.Bruno.Reto4.Process;
/**
 * @author bruno
 * Esta clase contiene la tabla y te dice cual fue el mas vendido
 */
public class Tabla {

    public static int getSaborMasProductivo(int[][] ventas) {
        int valorTrimestral = 0;
        for (int i = 0; i < ventas.length; i++) {
            int saborMasVendido = Integer.MIN_VALUE;
            int saborMasVendidoIndex = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] > saborMasVendido) {
                    saborMasVendido = ventas[i][j];

                }
                System.out.print(ventas[i][j] + "  ");
            }
            System.out.print("    **    " +    saborMasVendido);
            System.out.println();
        }
        return valorTrimestral;
    }

    public static void main(String[] args) {
        String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
        int[][] ventas = new int[][]{
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308},

        };
        getSaborMasProductivo(ventas);
        for (int i = 0; i < ventas.length; i++) {

        }
        int[][] x = new int[3][3];
        x[0][0] = 5;
        int[][] x2 = new int[3][3];
        x2[0] = new int[3];
        x2[0] = new int[3];
        x2[0] = new int[3];
        x[0][0] = 5;
    }


}



