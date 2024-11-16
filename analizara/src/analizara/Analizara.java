package analizara;

import java.io.File;

public class Analizara{


    public static void main(String[] args){
        String path="/Users/david/Desktop/Universidad/SEMESTRE_5/LYA/compilador/analizara/src/analizara/lexer.flex";
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
