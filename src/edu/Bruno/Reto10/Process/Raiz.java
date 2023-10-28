package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * En esta clase se realiza la Raiz
 */

public class Raiz extends OperacionAritmetica {
    public Raiz(double operando1) {
        super(operando1, 0);
    }

    @Override
    public double calcular() {
        return Math.sqrt(operando1);
    }
}



