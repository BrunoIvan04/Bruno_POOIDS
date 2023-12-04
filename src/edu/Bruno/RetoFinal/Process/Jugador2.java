package edu.Bruno.RetoFinal.Process;
/**
 * @author Bruno
 * Esta es la jugador2 que se encarga de obtener el simbolo y nombre del jugador
 */
public class Jugador2 {

    protected String nombre;
    protected char simbolo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el símbolo del jugador.
     *
     * @return El símbolo del jugador.
     */
    public char getSimbolo() {
        return simbolo;
    }

    public char setSimbolo(char simbolo) {
        return this.simbolo = simbolo;
    }

}
