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
 'false' | 'for' | 'int' | 'return' | 'true' | 'void' ;

BOOLEANLITERAL: 'true' | 'false' ;

fragment ALPHA: [a-zA-Z_] ;

fragment ALPHANUM: ALPHA | DIGIT ;

ID: ALPHA ALPHANUM* ;

fragment DIGIT: [0-9] ;
fragment OCTAL: [0-7] ;
fragment HEXADECIMAL: [0-9a-fA-F] ;

INTLITERAL: HEXADECIMALNUM | DECIMALNUM ;
HEXADECIMALNUM: '0x' HEXADECIMAL+ ;
DECIMALNUM: DIGIT DIGIT* ;

CHARLITERAL: ''' (WS | .)*? ''' ;

STRINGLITERAL: '"' (WS | .)*? '"' ;

LCOMMENT: '//' .*? '\r'? '\n' -> skip ;
SCOMMENT: '/*' .*? '*/' -> skip ;

WS : (' ' | '\t' | '\r' | '\n')+ -> skip ;

