package edu.Bruno.Reto11.Process;
public class Modulo extends OperacionAritmetica {
    //Clase para modulo
    @Override
    public double operar(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("ERROR: Division por cero no permitida.");
            return 0;
        }

        while (num1 >= num2) {
            num1 = new Resta().operar(num1, num2);
        }
        return num1;
    }
}