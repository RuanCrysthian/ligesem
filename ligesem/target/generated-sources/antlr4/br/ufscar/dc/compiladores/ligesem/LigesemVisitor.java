// Generated from br/ufscar/dc/compiladores/ligesem/Ligesem.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.ligesem;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LigesemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LigesemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LigesemParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LigesemParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LigesemParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LigesemParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LigesemParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(LigesemParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LigesemParser#bloco_disciplina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_disciplina(LigesemParser.Bloco_disciplinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LigesemParser#disciplina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisciplina(LigesemParser.DisciplinaContext ctx);
}