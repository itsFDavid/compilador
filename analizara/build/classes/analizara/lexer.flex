package analizara;
import static analizara.Token.*;
%%

%class Lexer
%type Token


L=[a-zA-Z_]
D=[0-9]
WHITE=[ \t\r\n]
%{
public String tipo;
%}

%% 
publico |
privado |
protegido |
Cadena |
caracter |
entero |
doble |
flotante |
booleano |
si |
mientras |
opcion |
caso |
break |
hacer |
clase |
retorno |
vacio |
nulo |
nuevo |
importar |
estatico |
extiende |
implementa |
interface |
intentar |
capturar |
de otro modo |
y |
o |
verdadero |
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


{L}({L}|{D})* {tipo=yytext(); return IDENTIFICADOR;} 
("(-"{D}+")") | {D}+ {tipo=yytext(); return VALOR_NUMERICO;} 

. {return ERROR;} 






