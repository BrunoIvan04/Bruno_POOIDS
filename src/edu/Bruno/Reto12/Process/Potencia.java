package Reto12.Process;

public class Potencia  extends Multiplicacion{
    /**
     * Calcula el resultado de elevar un número a una potencia dada.
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = super.calcular(resultado,num1);
        }
        return resultado;
    }
    /**
     * Obtiene el símbolo representativo de la operación.
     */
    @Override
    public String getSimbolo() {
        return "^";
    }
}