package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * En esta clase se realiza la division
 */

public class Division extends OperacionNoAritmetica {
    public Division(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        if (operando2 != 0) {
            return operando1 / operando2;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }
}