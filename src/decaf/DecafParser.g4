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

//field_decl: (ID | ID LBAR INTLIT ( ',' INTLIT )*  RBAR) (ID | ID LBAR INTLIT ( ',' INTLIT )*  RBAR)* PV ;

//method_decl: (TYPE | VOID) ID LPA TYPE ID (',' TYPE ID)* RPA block ;

//block: LCURLY var_decl* statement* RCURLY PV ;

//var_decl: TYPE ID (',' TYPE ID)* ;
