package edu.Bruno.Reto2.boletos.Process;

public class Boletos {
    /**
     * @author bruno
     * Esta clase contiene el precio de los boletos y las condicionales que ayudaran en la eleccion de los boletos
     */
    public void venderBoleto(String tipoBoleto) {
        double precio;
        /**
         * Estos cases se utilizan para darle precios a los boletos
         */
        switch (tipoBoleto) {
            case "Adulto":
                precio = 100;
                break;
            case "Niño":
                precio = 70;
                break;
            case "Adulto Mayor con INAPAM":
                precio = 50;
                break;
            case "Adulto Mayor sin credencial":
                precio = 70;
                break;
            default:
                precio = 0.00;
                break;
        }
        /**
         * Aqui se utilizo if para dar con el boleto deseado ya que si el precio es mayor a cero dara el deseado
         */
        if (precio > 0) {
            System.out.println("El precio del boleto de " + tipoBoleto + " es: $" + precio);
        }
        /**
         * Utilize else por si el usuario ingresa un dato que no existe
         */
         else {
            System.out.println("Tipo de boleto no válido.");
        }
    }
}
