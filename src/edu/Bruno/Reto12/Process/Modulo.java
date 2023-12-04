package Reto12.Process;

public class Modulo  extends Resta{
    /**
     * Calcula el resultado del módulo entre dos números.
     */
    @Override
    public double calcular(double num1, double num2) {
        if (num2 != 0) {
            while (num1 >= num2) {
                num1 = super.calcular(num1, num2);
            }
            return num1;
        } else {
            System.out.println("Error: Módulo por cero");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación .
     *
     * @return Cadena de texto que representa el símbolo del modulo, que es el signo "%".
     */
    @Override
    public String getSimbolo() {
        return "%";
    }
}