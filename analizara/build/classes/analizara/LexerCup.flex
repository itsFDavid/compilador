package analizara;
import java_cup.runtime.Symbol;
%%

%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char


L=[a-zA-Z_]
D=[0-9]
WHITE=[ ,\t,\r,\n]
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%% 
publico {return new Symbol(sym.Publico, yychar, yyline, yytext());}
privado {return new Symbol(sym.Privado, yychar, yyline, yytext());}
protegido {return new Symbol(sym.Protegido, yychar, yyline, yytext());}
cadena {return new Symbol(sym.Cadena, yychar, yyline, yytext());}
caracter {return new Symbol(sym.Caracter, yychar, yyline, yytext());}
entero {return new Symbol(sym.Entero, yychar, yyline, yytext());}
doble {return new Symbol(sym.Doble, yychar, yyline, yytext());}
flotante {return new Symbol(sym.Flotante, yychar, yyline, yytext());}
booleano {return new Symbol(sym.Booleano, yychar, yyline, yytext());}
si {return new Symbol(sym.Si, yychar, yyline, yytext());}
mientras {return new Symbol(sym.Mientras, yychar, yyline, yytext());}
opcion {return new Symbol(sym.Opcion, yychar, yyline, yytext());}
caso {return new Symbol(sym.Caso, yychar, yyline, yytext());}
break {return new Symbol(sym.Break, yychar, yyline, yytext());}
hacer {return new Symbol(sym.Hacer, yychar, yyline, yytext());}
clase {return new Symbol(sym.Clase, yychar, yyline, yytext());}
retorno {return new Symbol(sym.Retorno, yychar, yyline, yytext());}
vacio {return new Symbol(sym.Vacio, yychar, yyline, yytext());}
nulo {return new Symbol(sym.Nulo, yychar, yyline, yytext());}
nuevo {return new Symbol(sym.Nuevo, yychar, yyline, yytext());}
importar {return new Symbol(sym.Importar, yychar, yyline, yytext());}
estatico {return new Symbol(sym.Estatico, yychar, yyline, yytext());}
extiende {return new Symbol(sym.Extiende, yychar, yyline, yytext());}
implementa {return new Symbol(sym.Implementa, yychar, yyline, yytext());}
interface {return new Symbol(sym.Interface, yychar, yyline, yytext());}
intentar {return new Symbol(sym.Intentar, yychar, yyline, yytext());}
capturar {return new Symbol(sym.Capturar, yychar, yyline, yytext());}
de otro modo {return new Symbol(sym.De_otro_modo, yychar, yyline, yytext());}
y {return new Symbol(sym.Y, yychar, yyline, yytext());}
o {return new Symbol(sym.O, yychar, yyline, yytext());}
verdadero {return new Symbol(sym.Verdadero, yychar, yyline, yytext());}
falso {return new Symbol(sym.RESERVADAS, yychar, yyline, yytext());}

{WHITE} {/*Ignore*/}
"//".* {/*Ignore*/}
")"     {return new Symbol(sym.PARENTESIS_DER, yychar, yyline, yytext());} 
"("     {return new Symbol(sym.PARENTESIS_IZQ, yychar, yyline, yytext());} 
"="     {return new Symbol(sym.ASIGNAR, yychar, yyline, yytext());} 
"=="    {return new Symbol(sym.IGUAL, yychar, yyline, yytext());} 
"+"     {return new Symbol(sym.SUMA, yychar, yyline, yytext());} 
"-"     {return new Symbol(sym.RESTA, yychar, yyline, yytext());} 
"*"     {return new Symbol(sym.MULTIPLICACION, yychar, yyline, yytext());} 
"/"     {return new Symbol(sym.DIVISION, yychar, yyline, yytext());} 
"^"     {return new Symbol(sym.POTENCIA, yychar, yyline, yytext());} 
"%"     {return new Symbol(sym.MODULO, yychar, yyline, yytext());} 
";"     {return new Symbol(sym.PUNTO_COMA, yychar, yyline, yytext());} 
"<="    {return new Symbol(sym.MENOR_IGUAL, yychar, yyline, yytext());} 
">="    {return new Symbol(sym.MAYOR_IGUAL, yychar, yyline, yytext());} 
"<"     {return new Symbol(sym.MENOR, yychar, yyline, yytext());} 
">"     {return new Symbol(sym.MAYOR, yychar, yyline, yytext());} 
"{"     {return new Symbol(sym.LLAVE_IZQ, yychar, yyline, yytext());} 
"}"     {return new Symbol(sym.LLAVE_DER, yychar, yyline, yytext());} 
"["     {return new Symbol(sym.CORCHETE_IZQ, yychar, yyline, yytext());} 
"]"     {return new Symbol(sym.CORCHETE_DER, yychar, yyline, yytext());} 
","     {return new Symbol(sym.COMA, yychar, yyline, yytext());} 
"."     {return new Symbol(sym.PUNTO, yychar, yyline, yytext());}
":"     {return new Symbol(sym.DOS_PUNTOS, yychar, yyline, yytext());} 
"'"     {return new Symbol(sym.COMILLA_SIMPLE, yychar, yyline, yytext());}
"!="    {return new Symbol(sym.DIFERENTE, yychar, yyline, yytext());}
"imprimir"  {return new Symbol(sym.METODO_IMPRIMIR, yychar, yyline, yytext());}

{L}({L}|{D})* {tipo=yytext(); return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());} 
("(-"{D}+")") | {D}+ {tipo=yytext(); return new Symbol(sym.VALOR_NUMERICO, yychar, yyline, yytext());} 

. {return new Symbol(sym.ERROR, yychar, yyline, yytext());} 







