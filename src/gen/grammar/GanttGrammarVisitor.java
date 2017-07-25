// Generated from C:/Users/Leonardo/OneDrive/development/IntelliJ Projects/Grammar Gantt/src/grammar\GanttGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

    import gantt.*;
    import java.util.ArrayList;

	import gen.grammar.GanttGrammarParser;
	import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GanttGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GanttGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GanttGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#set_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_interval(GanttGrammarParser.Set_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#theme_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme_list(GanttGrammarParser.Theme_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(GanttGrammarParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#task_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_list(GanttGrammarParser.Task_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(GanttGrammarParser.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link GanttGrammarParser#task_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_info(GanttGrammarParser.Task_infoContext ctx);
}