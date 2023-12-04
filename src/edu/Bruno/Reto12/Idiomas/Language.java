package Reto12.Idiomas;

public interface Language {
    /**
     * Obtiene un mensaje o traducción en el idioma ingresado
     * y lo devuelve en dicho idioma
     */
    String getMessage(String key);
}