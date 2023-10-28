package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * En esta clase se realiza la Multiplicacion
 */

public class Multiplicacion extends OperacionAritmetica {
    public Multiplicacion(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 * operando2;
    }
}