lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

LCURLY : '{' ;
RCURLY : '}' ;
LBAR : '[' ;
RBAR : ']' ;
LPA : '(' ;
RPA : ')' ;
PV: ';' ;
VIG: ',' ;

TK_class: 'class Program';


BOOLEAN: 'boolean' ;
BREAK: 'break' ;
CALLOUT: 'callout' ;
CLASS: 'class' ;
CONTINUE: 'continue' ;
ELSE: 'else' ;
FOR: 'for' ;
INT: 'int' ;
RETURN: 'return' ;
VOID: 'void' ;
IF: 'if' ;
FALSE: 'false' ;
TRUE: 'true' ;
FORPAR: 'forpar' ;

BINOPS: ARITMOP | RELOP | COMPOP | CONDOP ;

ARITMOP: OPSOMA | OPSUBT | OPDIVI | OPMULT | OPREMA ;
OPSOMA: '+' ;
OPSUBT: '-' ;
OPDIVI: '/' ;
OPMULT: '*' ;
OPREMA: '%' ;

RELOP: BGTOP | SMTOP | BGEQTOP | SMEQTOP ;
BGTOP: '>' ;
SMTOP: '<' ;
BGEQTOP: '>=' ;
SMEQTOP: '<=' ;

COMPOP: ISEQUAL | NOTEQUAL ;
ISEQUAL: '==' ;
NOTEQUAL: '!=' ;

CONDOP: CONDAND | CONDOR ;
CONDAND: '&&' ;
CONDOR: '||' ;

ASOP: '=' | '+=' | '-=' ;

LIT: INTLIT | CHARLIT | BOOLEANLITERAL ;

INTLIT: HEXADECIMAL | DECIMAL ;

fragment
HEXADECIMAL: '0x' HEXA+ ;

fragment
DECIMAL: DIGIT [1-9]* ;


fragment DIGIT: [0-9] ;
fragment OCTAL: [0-7] ;
fragment HEXA: [0-9a-fA-F] ;


BOOLEANLITERAL: 'true' | 'false' ;


// Character literals
CHARLIT : '\'' SINGLE_CHARACTER '\'' | '\'' ESC '\'';

fragment
SINGLE_CHARACTER : ~["'\\];

//String Literals
STRINGLIT : '"' STRING_CHARACTERS? '"';

fragment
STRING_CHARACTERS : STRING_CHARACTER+ ;

fragment
STRING_CHARACTER : ~['"\\] | ESC;

// Escape Sequences for char and strings

fragment
ESC : '\\' [tnfr"'\\];


ID: ALPHA ALPHANUM* ;

fragment ALPHA: [a-zA-Z_] ;

fragment ALPHANUM: ALPHA | DIGIT ;


LCOMMENT: '//' .*? '\r'? '\n' -> skip ;
SCOMMENT: '/*' .*? '*/' -> skip ;

WS : [ \t\r\n]+ -> skip ;

//fragment
//ESC: '\\' ('n'|'t'|'\"'|'\\'|'\'');
