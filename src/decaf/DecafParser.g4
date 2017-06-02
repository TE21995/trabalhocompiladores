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

statement: location asop expr PV 
| methodcall PV 
| IF LPA expr RPA LCURLY var_decl* statement* RCURLY ( ELSE LCURLY var_decl* statement* RCURLY )?
| FOR ID EQU expr VIG expr LCURLY var_decl* statement* RCURLY
| RETURN expr? PV  
| BREAK PV 
| CONTINUE PV 
| block ;

methodcall: methodnome ( LPA expr ( VIG expr)* RPA | LPA RPA ) |  
 CALLOUT LPA STRINGLIT ( VIG calloutarg )*  RPA ;

methodnome: ID ;

location: ID | ID LBAR expr RBAR ;

expr: location | methodcall | lit | SUBT expr | expr binops expr | EXC expr | LPA expr RPA ;

lit: INTLIT | CHARLIT | BOOLEANLITERAL ;

binops: aritmop | relop | compop | condop ;

aritmop: MULT | DIVI | SOMA | SUBT | REMA ;

relop: BGTOP | SMTOP | BGEQTOP | SMEQTOP ;

compop: ISEQUAL | NOTEQUAL ;

condop: CONDAND | CONDOR ;

asop: EQU | MOREQU | LESSEQU ;


calloutarg: expr | STRINGLIT ; 
