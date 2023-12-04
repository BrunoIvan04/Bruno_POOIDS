package Reto12.Process;

public class Suma  extends OperacionesAritmeticas{
    /**
     * Realiza una operación de suma entre dos números usando un override.
     */
    @Override
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * Obtiene el símbolo perteneciente de la operación de suma usando un override.
     */
    @Override
    public String getSimbolo() {
        return "+";
    }
}