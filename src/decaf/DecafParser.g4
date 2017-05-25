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

field_decl: tyinit ( VIG type ID LBAR INTLIT RBAR)* ( VIG type ID )* PV ;

tyinit: type ID | type ID LBAR INTLIT RBAR ;

method_decl: ( VOID | type ) ID ( LPA type ID ( VIG type ID )* RPA | LPA RPA ) block ;

block: LCURLY var_decl* statement* RCURLY ;

var_decl: type ID ( VIG ID )* PV;

type: INT | BOOLEAN ;

statement: location ASOP expr PV 
| methodcall PV 
| ( IF LPA expr RPA block | IF LAP expr RPA block ELSE block) 
| FOR ID EQU expr PV expr PV block 
| ( RETURN expr PV | RETURN PV ) 
| BREAK PV 
| CONTINUE PV 
| block ;

methodcall: methodnome ( LPA expr ( VIG expr)* RPA | LPA RPA ) |  
 CALLOUT LPA STRINGLIT ( VIG calloutarg )*  RPA ;

methodnome: ID ;

location: ID | ID LBAR expr RBAR ;

expr: location | methodcall | lit | expr binops expr | OPSUBT expr | EXC expr | LPA expr RPA ;

lit: INTLIT | CHARLIT | BOOLEANLITERAL ;

binops: ARITMOP | RELOP | COMPOP | CONDOP ;

calloutarg: expr | STRINGLIT ; 
