parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: TKCLASS LCURLY field_decl+ method_decl+  RCURLY ;

field_decl: ( ID | ID LBAR INTLIT RBAR ) ( VIG ID LBAR INTLIT RBAR)* ( VIG ID )*  PV ;

method_decl: (TYPE | VOID) ID LPA ( TYPE ID ( VIG TYPE ID )* | BLANK ) RPA block PV;

block: LCURLY var_decl+ statement+ RCURLY PV ;

var_decl: TYPE ID ( VIG ID )* PV;

statement: location ASOP expr |
 methodcall |
 ( IF LPA expr RPA block | IF LPA expr RPA block ELSE block ) |
 FOR LPA ID EQU expr PV expr PV block RPA |
 ( RETURN | RETURN expr ) |
 BREAK |
 CONTINUE |
 block ;

methodcall: methodnome LPA ( expr ( VIG expr)* | BLANK )  RPA | 
 CALLOUT LPA STRINGLIT ( VIG calloutarg )*  RPA ;

methodnome: ID ;

location: ID | ID LBAR expr RBAR ;

expr: location | methodcall | lit | expr binops expr | OPSUBT expr | EXC expr | LPA expr RPA ;

lit: INTLIT | CHARLIT | BOOLEANLITERAL ;

binops: ARITMOP | RELOP | COMPOP | CONDOP ;

calloutarg: expr | STRINGLIT ; 
