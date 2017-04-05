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

LCURLY : '{';
RCURLY : '}';
RW: 'boolean' | 'break' | 'callout' | 'class' | 'continue' | 'else' | 'false' | 'for' |
 'int' | 'return' | 'true' | 'void';
ID  :
  ['a'..'z''A'..'Z''_']+;

WS_ : (' ' | '\n' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

CHARLITERAL : '\'' (ESC|~'\'') '\'';
STRINGLITERAL : '"' (ESC|~'"')* '"';

fragment
ESC :  '\\' ('n'|'"');
