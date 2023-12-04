package Reto12.Process;

public class RaizCuadrada extends Potencia{
    /**
     * Calcula la raíz cuadrada de un número utilizando un enfoque iterativo.
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0;
        double base =1;
        while (true)
        {
            resultado=super.calcular(base,num2);
            if(resultado>num1){
                base --;
                break;
            }
            base ++;
        }

        return base;
    }
    /**
     * Obtiene el símbolo asociado a la operación de raíz cuadrada.
     */

    @Override
    public String getSimbolo() {
        return "sqrt";
    }

}