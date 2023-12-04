package Reto12.Process;

public class Multiplicacion extends Suma{
    /**
     * Calcula el resultado de la multiplicación entre dos números.
     */
    @Override
    public double calcular(double num1, double num2) {

        double resultado = 0;
        for (int i = 0; i < num1; i++) {
            resultado = super.calcular(resultado, num2);
        }
        return resultado;
    }
    /**
     * Obtiene el símbolo representativo de la operación .
     *
     * @return Cadena de texto que representa el símbolo de la multiplicación, que es el signo "*".
     */

    @Override
    public String getSimbolo() {
        return "*";
    }
}