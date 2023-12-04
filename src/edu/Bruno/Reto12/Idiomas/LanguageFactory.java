package Reto12.Idiomas;

public class LanguageFactory {
    private static Language language;
    /**
     * Configura el idioma seleccionado según la opción proporcionada.
     * @param languageOption La opción que representa el idioma seleccionado.
     */
    public static void setLanguage(int languageOption) {
        switch (languageOption) {
            case 1:
                language = new Español();
                break;
            case 2:
                language = new Ingles();
                break;
            case 3:
                language = new Portugues();
                break;
            default:
                System.out.println("Idioma no disponible.");
                language = new Español();
        }
    }
    /**
     * Obtiene un mensaje o traducción en el idioma ingresado
     * y lo devuelve en dicho idioma
     */
    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Idioma no disponible";
    }
}