lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

LCURLY: '{' ;
RCURLY: '}' ;
LBAR: '[' ;
RBAR: ']' ;
LPA: '(' ;
RPA: ')' ;
PV: ';' ;
VIG: ',' ;

TKCLASS: 'class Program';

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


INTLIT: HEXADECIMAL | DECIMAL ;

fragment
HEXADECIMAL: '0x' HEXA+ ;

fragment
DECIMAL: DIGIT+ ;


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

MULT: '*' ;
DIVI: '/' ;
SOMA: '+' ;
SUBT: '-' ;
REMA: '%' ;

BGTOP: '>' ;
SMTOP: '<' ;
BGEQTOP: '>=' ;
SMEQTOP: '<=' ;

ISEQUAL: '==' ;
NOTEQUAL: '!=' ;

CONDAND: '&&' ;
CONDOR: '||' ;

EQU: '=';
MOREQU: '+=' ;
LESSEQU: '-=' ;


EXC: '!' ;


LCOMMENT: '//' .*? '\r'? '\n' -> skip ;
SCOMMENT: '/*' .*? '*/' -> skip ;

WS : [ \t\r\n]+ -> skip ;

//fragment
//ESC: '\\' ('n'|'t'|'\"'|'\\'|'\'');
