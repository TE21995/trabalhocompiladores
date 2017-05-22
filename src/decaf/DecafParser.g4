parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: TK_class LCURLY  RCURLY ;

//field_decl: ( ID | ID LBAR ( INTLIT ( VIG INTLIT )* | ' ' ) RBAR ) ( ID LBAR ( INTLIT ( VIG INTLIT )* | ' ' )  RBAR)*  PV ;

//method_decl: (TYPE | VOID) ID LPA ( TYPE ID ( VIG TYPE ID )* | ' ' ) RPA block PV;

//block: LCURLY var_decl+ statement+ RCURLY PV ;

//var_decl: TYPE ID ( VIG ID )* ;

//statement: location ASOP expr |
// methodcall |
// ( IF LPA expr RPA block | IF LPA expr RPA block ELSE block ) |
// FOR LPA ID '=' expr PV expr PV block RPA |
// ( RETURN | RETURN expr ) |
// BREAK |
// CONTINUE |
// block ;

//methodcall: methodnome LPA ( expr ( VIG expr)* | ' ' )  RPA | 
// CALLOUT LPA STRINGLIT calloutarg  RPA ;

//methodnome: ID ;

//location: ID | ID LBAR expr RBAR ;

//expr: location | methodcall | LIT | expr BINOPS expr | '-' expr | '!' expr | LPA expr RPA ;

//calloutarg: expr | STRINGLIT ; 
