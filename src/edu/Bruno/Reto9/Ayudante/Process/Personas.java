package edu.Bruno.Reto9.Ayudante.Process;
import java.util.Random;
/**
 * @author bruno
 * Esta clase contiene el generador de caracteristicas de las personas
 */
public class Personas {
    private int numeroDeOjos;
    private String colorDePiel;
    private String altura;
    private int nivelCreacion;
    private int nivelArreglo;
    private int nivelDestructivo;

    public Personas() {
        // Genera características aleatorias para cada ayudante
        Random rand = new Random();
        this.numeroDeOjos = rand.nextInt(2) + 1;
        this.colorDePiel = (rand.nextInt(2) == 0) ? "amarilla" : "morada";
        this.altura = (rand.nextInt(2) == 0) ? "mediana" : "alta";
        this.nivelCreacion = rand.nextInt(5) + 1;
        this.nivelArreglo = rand.nextInt(5) + 1;
        this.nivelDestructivo = rand.nextInt(5) + 1;
    }

    @Override
    public String toString() {
        return "Ayudante: [Ojos: " + numeroDeOjos + ", Piel: " + colorDePiel + ", Altura: " + altura
                + ", Nivel de Creación: " + nivelCreacion + ", Nivel de Arreglo: " + nivelArreglo
                + ", Nivel Destructivo: " + nivelDestructivo + "]";
    }
}