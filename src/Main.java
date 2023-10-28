import edu.Bruno.Reto10.Process.*;
/**
 * @author bruno
 * En esta clase se ejecutan todas las operaciones a la vez,
 * tu ingresas los numeros que quieres calcular
 */
public class Main {

    public static void main(String[] args) {
        Operacion suma = new Suma(8, 9);
        Operacion resta = new Resta(12, 4);
        Operacion multiplicacion = new Multiplicacion(3, 2);
        Operacion division = new Division(3, 6);
        Operacion potencia = new Potencia(4, 3);
        Operacion logaritmo = new Logaritmo(100, 10);
        Operacion modulo = new Modulo(7, 4);
        Operacion raiz = new Raiz(25);


        System.out.println("Suma: " + suma.calcular());
        System.out.println("Resta: " + resta.calcular());
        System.out.println("Multiplicación: " + multiplicacion.calcular());
        System.out.println("División: " + division.calcular());
        System.out.println("Potencia: " + potencia.calcular());
        System.out.println("Logaritmo: " + logaritmo.calcular());
        System.out.println("Módulo: " + modulo.calcular());
        System.out.println("Raíz: " + raiz.calcular());
    }
}