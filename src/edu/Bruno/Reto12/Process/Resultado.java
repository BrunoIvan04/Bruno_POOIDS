package Reto12.Process;
import Reto12.Idiomas.LanguageFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *La clase Resultado encapsula el resultado de una operación aritmética
 *con métodos para calcularlo y generar un mensaje descriptivo.
 */
public class Resultado {
    private OperacionesAritmeticas operacion;
    private double num1;
    private double num2;
    /**
     * Constructor para crear un objeto `Resultado`.
     * Calcula y devuelve el resultado de la operación aritmética.
     */
    public Resultado(OperacionesAritmeticas op, double num1, double num2) {
        this.operacion = op;
        this.num1 = num1;
        this.num2 = num2;
    }
    /**
     * Genera un mensaje para la operacion y el resultado
     */

    public double obtenerResultado() {
        return operacion.calcular(num1, num2);
    }

    public String obtenerMensaje() {
        String simbolo = operacion.getSimbolo();
        String operacionStr = obtenerDescripcionOperacion(simbolo);
        /**
         *  Crea un mensaje formateado con información sobre la operación y su resultado.
         */
        String mensaje = String.format("%s, %s, %s, %s, %s, %s%n",
                operacionStr,
                num1,
                simbolo,
                num2,
                LanguageFactory.getMessage("is"),
                obtenerResultado());

        /**
         *  Utiliza el path deseado antes del try/catch
         */
        Path path = Paths.get("operaciones2.txt");

        try {
            /**
             *  Escribe el mensaje en el archivo, utilizando Files.write con StandardOpenOption.APPEND.
             */
            Files.write(path, mensaje.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mensaje;
    }
    private String obtenerDescripcionOperacion(String simbolo) {
        switch (simbolo) {
            case "+":
                return LanguageFactory.getMessage("Adding");
            case "-":
                return LanguageFactory.getMessage("Subtracting");
            case "*":
                return LanguageFactory.getMessage("Multiplying");
            case "/":
                return LanguageFactory.getMessage("Dividing");
            case "%":
                return LanguageFactory.getMessage("Calculating the modulus of");
            case "log":
                return LanguageFactory.getMessage("Calculating the logarithm of: ");
            case "^":
                return LanguageFactory.getMessage("Raising");
            case "sqrt":
                return LanguageFactory.getMessage("Calculating the square root of: ");
            default:
                return "Realizando operación";
        }




    }

}