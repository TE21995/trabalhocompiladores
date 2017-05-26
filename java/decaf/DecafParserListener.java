// Generated from /home/uniceub/thomas/trabalhocompiladores/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(DecafParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(DecafParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#tyinit}.
	 * @param ctx the parse tree
	 */
	void enterTyinit(DecafParser.TyinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#tyinit}.
	 * @param ctx the parse tree
	 */
	void exitTyinit(DecafParser.TyinitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DecafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(DecafParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(DecafParser.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodnome}.
	 * @param ctx the parse tree
	 */
	void enterMethodnome(DecafParser.MethodnomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodnome}.
	 * @param ctx the parse tree
	 */
	void exitMethodnome(DecafParser.MethodnomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(DecafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DecafParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DecafParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(DecafParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(DecafParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#binops}.
	 * @param ctx the parse tree
	 */
	void enterBinops(DecafParser.BinopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#binops}.
	 * @param ctx the parse tree
	 */
	void exitBinops(DecafParser.BinopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#calloutarg}.
	 * @param ctx the parse tree
	 */
	void enterCalloutarg(DecafParser.CalloutargContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#calloutarg}.
	 * @param ctx the parse tree
	 */
	void exitCalloutarg(DecafParser.CalloutargContext ctx);
}