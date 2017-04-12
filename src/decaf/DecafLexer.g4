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

ALPHA: ['a'..'z''A'..'Z''_'];

DIGIT: [0-9];
OCTAL: [0-7];
HEXADECIMAL: [0-9a-fA-F];

ALPHANUM: ALPHA | DIGIT;

RW: 'boolean' | 'break' | 'callout' | 'class' | 'continue' | 'else' |
 'false' | 'for' | 'int' | 'return' | 'true' | 'void';

ID: ALPHA ALPHANUM*;

WS: (' ' | '\t' | '\n' | SL_COMMENT) -> skip;

SL_COMMENT : '//' (~'\n')* '\n';


INTLITERAL: HEXADECIMALNUM | DECIMALNUM;
HEXADECIMALNUM: '0x' HEXADECIMAL+;
DECIMALNUM: DIGIT DIGIT*;

BOOLEANLITERAL: 'true' | 'false';

CHARLITERAL : ''' (ESC|~''') ''';
STRINGLITERAL : '"' (ESC|~'"')+ '"';

fragment
ESC :  '\\' ('\n'|'"');
