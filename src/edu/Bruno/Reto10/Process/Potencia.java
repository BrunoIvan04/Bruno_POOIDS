package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * En esta clase se realiza la potencia
 */

public class Potencia extends OperacionAritmetica {
    public Potencia(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return Math.pow(operando1, operando2);
    }
}