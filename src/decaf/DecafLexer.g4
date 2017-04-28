lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

tokens
{
  TK_class
}

LCURLY : '{' ;
RCURLY : '}' ;

RW: 'boolean' | 'break' | 'callout' | 'class' | 'continue' | 'else' |
'false' | 'for' | 'int' | 'return' | 'true' | 'void' | 'if' ;

fragment ALPHA: [a-zA-Z_] ;

fragment ALPHANUM: ALPHA | DIGIT ;

fragment DIGIT: [0-9] ;
fragment OCTAL: [0-7] ;
fragment HEXADECIMAL: [0-9a-fA-F] ;

ID: ALPHA ALPHANUM* ;


HEXADECIMALNUM: '0x' HEXADECIMAL+ ;
DECIMALNUM: DIGIT DIGIT* ;

fragment CHAR: ' ' | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' |
 ',' | '-' | '.' | [0-9] | ':' | ';' | '<' | '=' | '>' | '?' | '@' |
[A-Z] | '[' | ']' | '^' | '_' | '`' | [a-z] | '{' | '|' | '}' | '~' ;

fragment ESC: '\\' ('n'|'t'|'\"'|'\\'|'\'');

CHARLIT: '\'' (CHAR | ESC) '\'' ;

STRINGLIT: '\"' (CHAR | ESC)+ '\"' ;  

OPE: '-' | '+' | '*' | '/' | '%' | '<' | '>' | '<=' | '>=' | '=' | '==' |
'!=' | '&&' | '||' | '!' | ';' | ',' | '.' | '[' | ']' | '(' | ')' |'{' |
']' ;

LCOMMENT: '//' .*? '\r'? '\n' -> skip ;
SCOMMENT: '/*' .*? '*/' -> skip ;

WS : (' ' | '\t' | '\r' | '\n')+ -> skip ;


