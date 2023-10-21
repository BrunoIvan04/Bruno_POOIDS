package edu.Bruno.Reto9.Pelota.Ui;
import java.util.Scanner;
import edu.Bruno.Reto9.Pelota.Process.Pelota;

public class Cli {
    public Pelota crearPelota() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crear una nueva pelota");
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Rapidez: ");
        int rapidez = scanner.nextInt();
        System.out.print("Poder: ");
        int poder = scanner.nextInt();

        return new Pelota(color, rapidez, poder);
    }
}
