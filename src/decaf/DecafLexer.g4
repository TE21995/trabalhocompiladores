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


INTLIT: HEXADECIMAL | DECIMAL ;

HEXADECIMAL: '0x' HEXA+ ;
DECIMAL: DIGIT [1-9]* ;


fragment DIGIT: [0-9] ;
fragment OCTAL: [0-7] ;
fragment HEXA: [0-9a-fA-F] ;


BOOLEANLITERAL: 'true' | 'false' ;


CHARLIT: '\'' (CHAR | ESC)+ '\'' ;

fragment
CHAR: ' ' | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' |
 ',' | '-' | '.' | [0-9] | ':' | ';' | '<' | '=' | '>' | '?' | '@' |
[A-Z] | '[' | ']' | '^' | '_' | '`' | [a-z] | '{' | '|' | '}' | '~' ;


STRINGLIT: '\"' STRINGCHAR_REP? '\"' ;  

fragment
STRINGCHAR_REP:  STRINGCHAR+;

fragment
STRINGCHAR: CHAR | ESC;


ID: ALPHA ALPHANUM* ;

fragment ALPHA: [a-zA-Z_] ;

fragment ALPHANUM: ALPHA | DIGIT ;


LCOMMENT: '//' .*? '\r'? '\n' -> skip ;
SCOMMENT: '/*' .*? '*/' -> skip ;

WS : [ \t\r\n]+ -> skip ;

fragment
ESC: '\\' ('n'|'t'|'\"'|'\\'|'\'');
