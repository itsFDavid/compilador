package analizara;
import static analizara.Token.*;
%%

%class Lexer
%type Token


L=[a-zA-Z_]
D=[0-9]
WHITE=[ \t\r]
%{
public String tipo;
%}

%% 
publico {tipo=yytext(); return Publico;}
privado {tipo=yytext(); return Privado;}
protegido {tipo=yytext(); return Protegido;}
cadena {tipo=yytext(); return Cadena;}
caracter {tipo=yytext(); return Caracter;}
entero {tipo=yytext(); return Entero;}
doble {tipo=yytext(); return Doble;}
flotante {tipo=yytext(); return Flotante;}
booleano {tipo=yytext(); return Booleano;}
si {tipo=yytext(); return Si;}
mientras {tipo=yytext(); return Mientras;}
opcion {tipo=yytext(); return Opcion;}
caso {tipo=yytext(); return Caso;}
break {tipo=yytext(); return Break;}
hacer {tipo=yytext(); return Hacer;}
clase {tipo=yytext(); return Clase;}
retorno {tipo=yytext(); return Retorno;}
vacio {tipo=yytext(); return Vacio;}
nulo {tipo=yytext(); return Nulo;}
nuevo {tipo=yytext(); return Nuevo;}
importar {tipo=yytext(); return Importar;}
estatico {tipo=yytext(); return Estatico;}
extiende {tipo=yytext(); return Extiende;}
implementa {tipo=yytext(); return Implementa;}
interface {tipo=yytext(); return Interface;}
intentar {tipo=yytext(); return Intentar;}
capturar {tipo=yytext(); return Capturar;}
de otro modo {tipo=yytext(); return De_otro_modo;}
y {tipo=yytext(); return Y;}
o {tipo=yytext(); return O;}
verdadero {tipo=yytext(); return Verdadero;}
falso {tipo=yytext(); return Falso;}
final {tipo=yytext(); return Final_2;}

{WHITE} {/*Ignore*/}
"//".* {/*Ignore*/}
")"     {tipo=yytext(); return Parentesis_der;} 
"("     {tipo=yytext(); return Parentesis_izq;} 
"="     {tipo=yytext(); return Asignar;} 
"=="    {tipo=yytext(); return Igual;} 
"+"     {tipo=yytext(); return Suma;} 
"-"     {tipo=yytext(); return Resta;} 
"*"     {tipo=yytext(); return Multiplicacion;} 
"/"     {tipo=yytext(); return Division;} 
"^"     {tipo=yytext(); return Potencia;} 
"%"     {tipo=yytext(); return Modulo;} 
";"     {tipo=yytext(); return Punto_coma;} 
"<="    {tipo=yytext(); return Menor_igual;} 
">="    {tipo=yytext(); return Mayor_igual;} 
"<"     {tipo=yytext(); return Menor;} 
">"     {tipo=yytext(); return Mayor;} 
"{"     {tipo=yytext(); return Llave_izq;} 
"}"     {tipo=yytext(); return Llave_der;} 
"["     {tipo=yytext(); return Corchete_izq;} 
"]"     {tipo=yytext(); return Corchete_der;} 
","     {tipo=yytext(); return Coma;} 
"."     {tipo=yytext(); return Punto;}
":"     {tipo=yytext(); return Dos_puntos;} 
"'"     {tipo=yytext(); return Comilla_simple;}
"!="    {tipo=yytext(); return Diferente;}
"imprimir"  {tipo=yytext(); return Metodo_imprimir;}
"\n"    {tipo=yytext(); return Linea;}
\"      {tipo=yytext(); return Comillas;}


{L}({L}|{D})* {tipo=yytext(); return Identificador;} 
("(-"{D}+")") | {D}+ {tipo=yytext(); return Valor_numerico;} 

. {return Error;} 






