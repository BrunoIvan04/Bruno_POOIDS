package edu.Bruno.Reto9.Pelota.Process;

public class Pelota {
    private String color;
    private int rapidez;
    private int poder;

    public Pelota(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    public void disminuirRapidez() {
        if (rapidez > 0) {
            rapidez--;
        }
    }

    public void aumentarPoder() {
        poder++;
    }

    public String getColor() {
        return color;
    }

    public int getRapidez() {
        return rapidez;
    }

    public int getPoder() {
        return poder;
    }
}