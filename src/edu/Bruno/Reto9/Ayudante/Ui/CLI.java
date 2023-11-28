package edu.Bruno.Reto9.Ayudante.Ui;
import edu.Bruno.Reto9.Ayudante.Process.Personas;
import java.util.Scanner;

public class CLI {
    public int obtenerCantidadAyudantes() {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 5;

        System.out.print("Ingrese la cantidad de ayudantes (predeterminado es 5): ");
        if (scanner.hasNextInt()) {
            cantidad = scanner.nextInt();
        }

        return cantidad;
    }

    public void ejecutar() {
        int cantidadAyudantes = obtenerCantidadAyudantes();

        for (int i = 0; i < cantidadAyudantes; i++) {
            Personas ayudante = new Personas();
            System.out.println(ayudante);
        }
    }
}