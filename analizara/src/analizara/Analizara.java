package analizara;

import java.io.File;

public class Analizara {

    public static void main(String[] args) {
        // Suponiendo que el archivo 'lexer.flex' siempre está en la misma ruta relativa
        String basePath = System.getProperty("user.dir");  // Obtiene el directorio base del proyecto
        String path = basePath + "/src/analizara/lexer.flex";  // Construye el path relativo

        generar(path);
    }

    public static void generar(String path) {
        File file = new File(path);
        JFlex.Main.generate(file);
    }
}
