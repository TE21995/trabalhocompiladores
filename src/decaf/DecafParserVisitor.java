// Generated from DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(DecafParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#tyinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyinit(DecafParser.TyinitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DecafParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DecafParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DecafParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#methodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(DecafParser.MethodcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#methodnome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodnome(DecafParser.MethodnomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(DecafParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DecafParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(DecafParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#binops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinops(DecafParser.BinopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#aritmop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmop(DecafParser.AritmopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(DecafParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(DecafParser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#condop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondop(DecafParser.CondopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#asop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsop(DecafParser.AsopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#calloutarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutarg(DecafParser.CalloutargContext ctx);
}