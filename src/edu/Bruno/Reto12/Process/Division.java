package Reto12.Process;

public class Division  extends Resta{
    /**
     * Calcula el resultado de la división entre dos números.
     *
     * Se usa un override
     */
    @Override
    public double calcular(double num1, double num2) {

        if (num2 != 0) {
            double resultado = 0;
            while (num1 >= num2) {
                num1 = super.calcular(num1, num2);
                resultado++;
            }
            return resultado;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación de división.
     *
     * @return Cadena de texto que representa el símbolo de la resta, que es el signo "/".
     */
    @Override
    public String getSimbolo() {
        return "/";
    }
}