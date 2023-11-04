package edu.Bruno.Reto11;
import edu.Bruno.Reto11.Idioma.Español;
import edu.Bruno.Reto11.Idioma.Idiomas;
import edu.Bruno.Reto11.Idioma.Ingles;
import edu.Bruno.Reto11.Idioma.Portugues;
import edu.Bruno.Reto11.Process.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** @Author Bruno
         *  El programa tiene como objetivo realizar
         *  operaciones aritmeticas y ponemos en
         *  practica el polimorfismo
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el idioma / Select the language / Selecione o idioma:");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Portugues");

        int opcionIdioma = scanner.nextInt();

        Idiomas idioma;
        switch (opcionIdioma) {
            case 1:
                idioma = new Español();
                break;
            case 2:
                idioma = new Ingles();
                break;
            case 3:
                idioma = new Portugues();
                break;
            default:
                System.out.println("Opcion no valida / Invalid option / Opcao invalida");
                return;
        }
        //Aqui se realizan las operaciones
        OperacionAritmetica Suma = new Suma();
        OperacionAritmetica Resta = new Resta();
        OperacionAritmetica Multiplicacion = new Multiplicacion();
        OperacionAritmetica Division = new Division();
        OperacionAritmetica Modulo = new Modulo();
        OperacionAritmetica Potencia = new Potencia();
        OperacionAritmetica Raiz = new Raiz();

        double num1 = 12;
        double num2 = 45;

        System.out.println(idioma.suma() + ": " + Suma.operar(num1, num2));
        System.out.println(idioma.resta() + ": " + Resta.operar(num1,num2));
        System.out.println(idioma.multiplicacion() + ": " + Multiplicacion.operar(num1, num2));
        System.out.println(idioma.division() + ": " + Division.operar(num1, num2));
        System.out.println(idioma.modulo() + ": " + Modulo.operar(num1, num2));

        double base = 6;
        double exponente = 8;
        System.out.println(idioma.potencia() + ": " + Potencia.operar(base, exponente));

        double radicando = 4;
        double indiceRaiz = 8;
        System.out.println(idioma.raiz() + ": " + Raiz.operar(radicando, indiceRaiz));

        scanner.close();
    }
}