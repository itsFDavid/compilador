package analizara;
import static analizara.Token.*;
%%

%class Lexer
%type Token


L=[a-zA-Z_]
D=[0-9]
WHITE=[ ,\t,\r]
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
falso {tipo=yytext(); return RESERVADAS;}

{WHITE} {/*Ignore*/}
"//".* {/*Ignore*/}
")"     {return PARENTESIS_DER;} 
"("     {return PARENTESIS_IZQ;} 
"="     {return ASIGNAR;} 
"=="    {return IGUAL;} 
"+"     {return SUMA;} 
"-"     {return RESTA;} 
"*"     {return MULTIPLICACION;} 
"/"     {return DIVISION;} 
"^"     {return POTENCIA;} 
"%"     {return MODULO;} 
";"     {return PUNTO_COMA;} 
"<="    {return MENOR_IGUAL;} 
">="    {return MAYOR_IGUAL;} 
"<"     {return MENOR;} 
">"     {return MAYOR;} 
"{"     {return LLAVE_IZQ;} 
"}"     {return LLAVE_DER;} 
"["     {return CORCHETE_IZQ;} 
"]"     {return CORCHETE_DER;} 
","     {return COMA;} 
"."     {return PUNTO;}
":"     {return DOS_PUNTOS;} 
"'"     {return COMILLA_SIMPLE;}
"!="    {return DIFERENTE;}
"imprimir"  {return METODO_IMPRIMIR;}
"\n"    {return Linea;}


{L}({L}|{D})* {tipo=yytext(); return IDENTIFICADOR;} 
("(-"{D}+")") | {D}+ {tipo=yytext(); return VALOR_NUMERICO;} 

. {return ERROR;} 






