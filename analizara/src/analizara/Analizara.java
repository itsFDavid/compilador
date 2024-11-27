package analizara;

import java.io.File;

public class Analizara{


    public static void main(String[] args){
        String path="/Users/danielyeraynogueziniestra/Desktop/Automatas/compilador/analizara/src/analizara/lexer.flex";
        generar(path);
    }

    /**
     *
     * @param path
     */
    public static void generar(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
    }
}
