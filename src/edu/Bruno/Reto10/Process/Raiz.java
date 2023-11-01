package edu.Bruno.Reto10.Process;

class Raiz extends OperacionAritmetica{
    //Clase para la raiz
    @Override
    public double operar(double radicando, double indice) {
        if (radicando < 0 && indice % 2 == 0) {
            System.out.println("ERROR: No se puede calcular la raiz cuadrada de un numero negativo");
            return 0;
        }

        //Metodo para tener una aproximacion
        double x = radicando / 2;
        for (int i = 0; i < 10; i++) {
            x = new Division().operar(new Suma().operar(x, new Division().operar(radicando, x)), 2);
        }
        return x;
    }
}