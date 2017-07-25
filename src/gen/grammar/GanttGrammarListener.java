// Generated from C:/Users/Leonardo/OneDrive/development/IntelliJ Projects/Grammar Gantt/src/grammar\GanttGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

    import gantt.*;
    import java.util.ArrayList;

	import gen.grammar.GanttGrammarParser;
	import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GanttGrammarParser}.
 */
public interface GanttGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GanttGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GanttGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#set_interval}.
	 * @param ctx the parse tree
	 */
	void enterSet_interval(GanttGrammarParser.Set_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#set_interval}.
	 * @param ctx the parse tree
	 */
	void exitSet_interval(GanttGrammarParser.Set_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#theme_list}.
	 * @param ctx the parse tree
	 */
	void enterTheme_list(GanttGrammarParser.Theme_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#theme_list}.
	 * @param ctx the parse tree
	 */
	void exitTheme_list(GanttGrammarParser.Theme_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(GanttGrammarParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(GanttGrammarParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#task_list}.
	 * @param ctx the parse tree
	 */
	void enterTask_list(GanttGrammarParser.Task_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#task_list}.
	 * @param ctx the parse tree
	 */
	void exitTask_list(GanttGrammarParser.Task_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(GanttGrammarParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(GanttGrammarParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link GanttGrammarParser#task_info}.
	 * @param ctx the parse tree
	 */
	void enterTask_info(GanttGrammarParser.Task_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GanttGrammarParser#task_info}.
	 * @param ctx the parse tree
	 */
	void exitTask_info(GanttGrammarParser.Task_infoContext ctx);
}