package edu.Bruno.Reto9.Pelota;
import edu.Bruno.Reto9.Pelota.Process.Pelota;
import edu.Bruno.Reto9.Pelota.Ui.Cli;
public class Main {
    public static void main(String[] args) {
        Cli cli = new Cli();
        Pelota pelota = cli.crearPelota();

        System.out.println("Pelota creada:");
        System.out.println("Color: " + pelota.getColor());
        System.out.println("Rapidez: " + pelota.getRapidez());
        System.out.println("Poder: " + pelota.getPoder());
    }
}
