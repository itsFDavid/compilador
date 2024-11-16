package analizara;

public class Analizara{


    public static void main(String[] args){
        String path="\Users\david\Desktop\Universidad\SEMESTRE_5\LYA\compilador\test\lexer.flex";
        generar(path);
    }


    public static void generar(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
    }
}
