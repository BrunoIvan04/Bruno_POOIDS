package edu.Bruno.Reto11.Idioma;

public class Ingles extends Idiomas{
    //Clase para el idioma Ingles
    @Override
    public String suma() {
        return "Addition";
    }

    @Override
    public String resta() {
        return "Subtract";
    }

    @Override
    public String multiplicacion() {
        return "Multiply";
    }

    @Override
    public String division() {
        return "Divide";
    }

    @Override
    public String modulo() {
        return "Modulus";
    }

    @Override
    public String potencia() {
        return "Power";
    }

    @Override
    public String raiz() {
        return "Square Root";
    }
}