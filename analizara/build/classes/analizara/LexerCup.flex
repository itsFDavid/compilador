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
WHITE=[ \t\r\n]
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
Cadena {return new Symbol(sym.Cadena, yychar, yyline, yytext());}
caracter {return new Symbol(sym.Caracter, yychar, yyline, yytext());}
entero {return new Symbol(sym.Entero, yychar, yyline, yytext());}
doble {return new Symbol(sym.Doble, yychar, yyline, yytext());}
flotante {return new Symbol(sym.Flotante, yychar, yyline, yytext());}
booleano {return new Symbol(sym.Booleano, yychar, yyline, yytext());}
si {return new Symbol(sym.Si, yychar, yyline, yytext());}
Sino {return new Symbol(sym.Sino, yychar, yyline, yytext());}
hasta {return new Symbol(sym.Hasta, yychar, yyline, yytext());}
mientras {return new Symbol(sym.Mientras, yychar, yyline, yytext());}
opcion {return new Symbol(sym.Opcion, yychar, yyline, yytext());}
caso {return new Symbol(sym.Caso, yychar, yyline, yytext());}
rompe {return new Symbol(sym.Rompe, yychar, yyline, yytext());}
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
falso {return new Symbol(sym.Falso, yychar, yyline, yytext());}
final {return new Symbol(sym.Final_2, yychar, yyline, yytext());}

{WHITE} {/*Ignore*/}
"//".* {/*Ignore*/}
")"     {return new Symbol(sym.Parentesis_der, yychar, yyline, yytext());} 
"("     {return new Symbol(sym.Parentesis_izq, yychar, yyline, yytext());} 
"="     {return new Symbol(sym.Asignar, yychar, yyline, yytext());} 
"=="    {return new Symbol(sym.Igual, yychar, yyline, yytext());} 
"+"     {return new Symbol(sym.Suma, yychar, yyline, yytext());} 
"-"     {return new Symbol(sym.Resta, yychar, yyline, yytext());} 
"*"     {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());} 
"/"     {return new Symbol(sym.Division, yychar, yyline, yytext());} 
"^"     {return new Symbol(sym.Potencia, yychar, yyline, yytext());} 
"%"     {return new Symbol(sym.Modulo, yychar, yyline, yytext());} 
";"     {return new Symbol(sym.Punto_coma, yychar, yyline, yytext());} 
"<="    {return new Symbol(sym.Menor_igual, yychar, yyline, yytext());} 
">="    {return new Symbol(sym.Mayor_igual, yychar, yyline, yytext());} 
"<"     {return new Symbol(sym.Menor, yychar, yyline, yytext());} 
">"     {return new Symbol(sym.Mayor, yychar, yyline, yytext());} 
"{"     {return new Symbol(sym.Llave_izq, yychar, yyline, yytext());} 
"}"     {return new Symbol(sym.Llave_der, yychar, yyline, yytext());} 
"["     {return new Symbol(sym.Corchete_izq, yychar, yyline, yytext());} 
"]"     {return new Symbol(sym.Corchete_der, yychar, yyline, yytext());} 
","     {return new Symbol(sym.Coma, yychar, yyline, yytext());} 
"."     {return new Symbol(sym.Punto, yychar, yyline, yytext());}
":"     {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());} 
"'"     {return new Symbol(sym.Comilla_simple, yychar, yyline, yytext());}
"!="    {return new Symbol(sym.Diferente, yychar, yyline, yytext());}
"imprimir"  {return new Symbol(sym.Metodo_imprimir, yychar, yyline, yytext());}
\"      {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());} 
("(-"{D}+")") | {D}+ {return new Symbol(sym.Valor_numerico, yychar, yyline, yytext());} 

. {return new Symbol(sym.Error, yychar, yyline, yytext());} 







