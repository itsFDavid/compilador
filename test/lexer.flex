package analizara;
import static analizara.Token;
%%

%class Lexer
%type Token


L=[a-zA-Z_]
D=[0-9]
WHITE=[ \t\r\n]
%{
public String tipo
%}
%%
{WHITE} {*/Ignore*/}
"//".*  {*/Ignore*/}
"="     {return ASIGNAR;}
"+"     {return SUMA;}
"-"     {return RESTA;}
"*"     {return MULTIPLICACION;}
"/"     {return DIVISION;}
"^"     {return POTENCIA;}

{L}({L}|{D})* {typo=yytext();
return ID;}

("(-"{D}+")") | {D} +{type=yytext();
return INT;}

.{return ERROR;}
