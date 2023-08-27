// Generated from br/ufscar/dc/compiladores/ligesem/Ligesem.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.ligesem;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LigesemParser}.
 */
public interface LigesemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LigesemParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LigesemParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LigesemParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LigesemParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LigesemParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LigesemParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LigesemParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LigesemParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LigesemParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(LigesemParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LigesemParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(LigesemParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LigesemParser#bloco_disciplina}.
	 * @param ctx the parse tree
	 */
	void enterBloco_disciplina(LigesemParser.Bloco_disciplinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LigesemParser#bloco_disciplina}.
	 * @param ctx the parse tree
	 */
	void exitBloco_disciplina(LigesemParser.Bloco_disciplinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LigesemParser#disciplina}.
	 * @param ctx the parse tree
	 */
	void enterDisciplina(LigesemParser.DisciplinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LigesemParser#disciplina}.
	 * @param ctx the parse tree
	 */
	void exitDisciplina(LigesemParser.DisciplinaContext ctx);
}