package edu.Bruno.Reto11.Process;

public class Multiplicacion extends OperacionAritmetica {
    //Clase para la multiplicacion
    public double operar(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = new Suma().operar(resultado, num1);
        }
        return resultado;
    }
}