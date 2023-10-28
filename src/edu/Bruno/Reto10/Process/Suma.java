package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * En esta clase se realiza la suma
 */

public class Suma extends OperacionAritmetica {
    public Suma(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 + operando2;
    }
}