package analizara;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Analizara {

    public static void main(String[] args) throws Exception {
        // Suponiendo que el archivo 'lexer.flex' siempre está en la misma ruta relativa
        String basePath = System.getProperty("user.dir");  // Obtiene el directorio base del proyecto
        String path = basePath + "/src/analizara/lexer.flex";  // Construye el path relativo
        String path2 = basePath + "/src/analizara/lexerCup.flex";
        String[] pathS = {
        "-parser", "Sintax", basePath + "/src/analizara/Sintax.cup"
        }; 

        generar(path, path2, pathS);
    }

    public static void generar(String path, String path2, String[] pathS) throws IOException, Exception {
        File file;
        file = new File(path);
        JFlex.Main.generate(file);
        file = new File(path2);
        JFlex.Main.generate(file);
        java_cup.Main.main(pathS);
        String basePath = System.getProperty("user.dir");
        
        Path rutaSym = Paths.get(basePath + "/src/analizara/sym.java");
        
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get(basePath + "/sym.java"),
                Paths.get(basePath + "/src/analizara/sym.java")
        );
        
        Path rutaSin = Paths.get(basePath + "/src/analizara/Sintax.java");
         if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get(basePath + "/Sintax.java"),
                Paths.get(basePath + "/src/analizara/Sintax.java")
        );
    }
}
