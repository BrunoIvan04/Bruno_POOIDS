package edu.Bruno.Reto11.Idioma;

public class Portugues  extends Idiomas{
    //Clase para el idioma Portugues
    @Override
    public String suma() {
        return "Soma";
    }

    @Override
    public String resta() {
        return "Subtracao";
    }

    @Override
    public String multiplicacion() {
        return "Multiplicacao";
    }

    @Override
    public String division() {
        return "Divisao";
    }

    @Override
    public String modulo() {
        return "Modulo";
    }

    @Override
    public String potencia() {
        return "Poder";
    }

    @Override
    public String raiz() {
        return "Raiz Quadrada";
    }
}