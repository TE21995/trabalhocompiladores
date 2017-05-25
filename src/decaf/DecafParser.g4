parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: TKCLASS LCURLY field_decl* method_decl* RCURLY ;

field_decl: ( TYPE ( ID | ID LBAR INTLIT RBAR ) ) ( VIG TYPE ID LBAR INTLIT RBAR)* ( VIG TYPE ID )* PV ;

method_decl: ( VOID | TYPE) ID ( LPA TYPE ID ( VIG TYPE ID )* RPA | LPA RPA ) block ;

block: LCURLY var_decl* statement* RCURLY ;

var_decl: TYPE ID ( VIG ID )* PV;

statement: location ASOP expr  PV |
 methodcall PV |
 ( IF LPA expr RPA block | IF LPA expr RPA block ELSE block ) |
 FOR LPA ID EQU expr PV expr PV block RPA |
 ( RETURN | RETURN expr ) PV|
 BREAK PV |
 CONTINUE PV |
 block ;

methodcall: methodnome ( LPA expr ( VIG expr)* RPA | LPA RPA ) |  
 CALLOUT LPA STRINGLIT ( VIG calloutarg )*  RPA ;

methodnome: ID ;

location: ID | ID LBAR expr RBAR ;

expr: location | methodcall | lit | expr binops expr | OPSUBT expr | EXC expr | LPA expr RPA ;

lit: INTLIT | CHARLIT | BOOLEANLITERAL ;

binops: ARITMOP | RELOP | COMPOP | CONDOP ;

calloutarg: expr | STRINGLIT ; 
