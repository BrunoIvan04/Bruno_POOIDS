package edu.Bruno.Reto10.Process;
/**
 * @author bruno
 * Esta clase la utilize para los calculos resta,raiz,division, log y modulo
 */

class OperacionNoAritmetica extends Operacion {
    double operando1;
    double operando2;

    public OperacionNoAritmetica(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    @Override
    public double calcular() {
        return 0;
    }
}