package Reto12.Process;

public class Resta extends OperacionesAritmeticas {
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Obtiene el símbolo representativo de la operación de resta.
     */
    @Override
    public String getSimbolo() {
        return "-";
    }
}