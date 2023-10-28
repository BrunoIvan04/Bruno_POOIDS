package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * En esta clase se realiza el Log
 */

public class Logaritmo extends OperacionNoAritmetica {
    public Logaritmo(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return Math.log(operando1) / Math.log(operando2);
    }
}