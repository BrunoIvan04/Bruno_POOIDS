package edu.Bruno.Reto10.Process;
import edu.Bruno.Reto10.Process.OperacionAritmetica;
public class Main {
    public static void main(String[] args) {
        /** @Author Bruno
         *  El programa tiene como objetivo realizar
         *  operaciones aritmeticas y ponemos en
         *  practica el polimorfismo
         */

        //Instancias creadas de las clases de operaciones
        OperacionAritmetica Suma = new Suma();
        OperacionAritmetica Resta = new Resta();
        OperacionAritmetica Multiplicacion = new Multiplicacion();
        OperacionAritmetica Division = new Division();
        OperacionAritmetica Modulo = new Modulo();
        OperacionAritmetica Potencia = new Potencia();
        OperacionAritmetica Raiz = new Raiz();

        double num1 = 12;
        double num2 = 9;

        //Operaciones utilizando polimorfismo
        System.out.println("Suma: " + Suma.operar(num1, num2));
        System.out.println("Resta: " + Resta.operar(num1, num2));
        System.out.println("Multiplicacion: " + Multiplicacion.operar(num1, num2));
        System.out.println("Division: " + Division.operar(num1, num2));
        System.out.println("Modulo: " + Modulo.operar(num1, num2));

        double base = 2;
        double exponente = 3;
        System.out.println("Potencia: " + Potencia.operar(base, exponente));

        double radicando = 9;
        double indiceRaiz = 2;
        System.out.println("Raiz: " + Raiz.operar(radicando, indiceRaiz));
        System.out.println("Que tenga buen dia :)");
    }
}