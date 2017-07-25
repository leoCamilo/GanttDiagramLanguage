// Generated from C:/Users/Leonardo/OneDrive/development/IntelliJ Projects/Grammar Gantt/src/grammar\GanttGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

    import gantt.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GanttGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_DATE=1, DURATION=2, NAME_RESP=3, PERCENT=4, BEGIN=5, END=6, WS=7, 
		INT=8, NUM=9, WORD=10, DATE=11, THEME_WORD=12, TASK_WORD=13, INTERVAL_WORD=14, 
		LBRACE=15, RBRACE=16, COLON=17, BAR=18;
	public static final int
		RULE_program = 0, RULE_set_interval = 1, RULE_theme_list = 2, RULE_theme = 3, 
		RULE_task_list = 4, RULE_task = 5, RULE_task_info = 6;
	public static final String[] ruleNames = {
		"program", "set_interval", "theme_list", "theme", "task_list", "task", 
		"task_info"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dataIni'", "'duracao'", "'nomeResp'", "'percent'", "'begin'", 
		"'end'", null, null, null, null, null, "'createTheme'", "'createTask'", 
		"'setInterval'", "'{'", "'}'", "':'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN_DATE", "DURATION", "NAME_RESP", "PERCENT", "BEGIN", "END", 
		"WS", "INT", "NUM", "WORD", "DATE", "THEME_WORD", "TASK_WORD", "INTERVAL_WORD", 
		"LBRACE", "RBRACE", "COLON", "BAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GanttGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GanttGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Diagram diagram;
		public Set_intervalContext interval;
		public Theme_listContext themes;
		public TerminalNode BEGIN() { return getToken(GanttGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GanttGrammarParser.END, 0); }
		public Theme_listContext theme_list() {
			return getRuleContext(Theme_listContext.class,0);
		}
		public Set_intervalContext set_interval() {
			return getRuleContext(Set_intervalContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		((ProgramContext)_localctx).diagram =  new Diagram(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(BEGIN);
			setState(18);
			_la = _input.LA(1);
			if (_la==INTERVAL_WORD) {
				{
				setState(15);
				((ProgramContext)_localctx).interval = set_interval();
				_localctx.diagram.setInterval(((ProgramContext)_localctx).interval.result);
				}
			}

			setState(20);
			((ProgramContext)_localctx).themes = theme_list();
			_localctx.diagram.setThemeList(((ProgramContext)_localctx).themes.themeList);
			setState(22);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_intervalContext extends ParserRuleContext {
		public Integer result;
		public Token INT;
		public TerminalNode INTERVAL_WORD() { return getToken(GanttGrammarParser.INTERVAL_WORD, 0); }
		public TerminalNode INT() { return getToken(GanttGrammarParser.INT, 0); }
		public Set_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterSet_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitSet_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitSet_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_intervalContext set_interval() throws RecognitionException {
		Set_intervalContext _localctx = new Set_intervalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_set_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(INTERVAL_WORD);
			setState(25);
			((Set_intervalContext)_localctx).INT = match(INT);
			((Set_intervalContext)_localctx).result =  Integer.parseInt((((Set_intervalContext)_localctx).INT!=null?((Set_intervalContext)_localctx).INT.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Theme_listContext extends ParserRuleContext {
		public ArrayList<Theme> themeList;
		public ThemeContext tempTheme;
		public List<ThemeContext> theme() {
			return getRuleContexts(ThemeContext.class);
		}
		public ThemeContext theme(int i) {
			return getRuleContext(ThemeContext.class,i);
		}
		public Theme_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterTheme_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitTheme_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitTheme_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Theme_listContext theme_list() throws RecognitionException {
		Theme_listContext _localctx = new Theme_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_theme_list);
		 ((Theme_listContext)_localctx).themeList =  new ArrayList<Theme>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				((Theme_listContext)_localctx).tempTheme = theme();
				_localctx.themeList.add(((Theme_listContext)_localctx).tempTheme.myTheme);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==THEME_WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThemeContext extends ParserRuleContext {
		public Theme myTheme;
		public Token WORD;
		public Task_listContext tl;
		public TerminalNode THEME_WORD() { return getToken(GanttGrammarParser.THEME_WORD, 0); }
		public TerminalNode WORD() { return getToken(GanttGrammarParser.WORD, 0); }
		public TerminalNode LBRACE() { return getToken(GanttGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GanttGrammarParser.RBRACE, 0); }
		public Task_listContext task_list() {
			return getRuleContext(Task_listContext.class,0);
		}
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitTheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_theme);
		 ((ThemeContext)_localctx).myTheme =  new Theme(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(THEME_WORD);
			setState(36);
			((ThemeContext)_localctx).WORD = match(WORD);
			setState(37);
			match(LBRACE);
			_localctx.myTheme.setName((((ThemeContext)_localctx).WORD!=null?((ThemeContext)_localctx).WORD.getText():null));
			setState(39);
			((ThemeContext)_localctx).tl = task_list();
			_localctx.myTheme.addTasks(((ThemeContext)_localctx).tl.taskList);
			setState(41);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Task_listContext extends ParserRuleContext {
		public ArrayList<Task> taskList;
		public TaskContext t;
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public Task_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterTask_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitTask_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitTask_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_listContext task_list() throws RecognitionException {
		Task_listContext _localctx = new Task_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_task_list);
		 ((Task_listContext)_localctx).taskList =  new ArrayList<Task>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				((Task_listContext)_localctx).t = task();
				_localctx.taskList.add(((Task_listContext)_localctx).t.finalTask);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TASK_WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaskContext extends ParserRuleContext {
		public Task finalTask;
		public Token WORD;
		public Task_infoContext info;
		public TerminalNode TASK_WORD() { return getToken(GanttGrammarParser.TASK_WORD, 0); }
		public TerminalNode WORD() { return getToken(GanttGrammarParser.WORD, 0); }
		public TerminalNode LBRACE() { return getToken(GanttGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GanttGrammarParser.RBRACE, 0); }
		public Task_infoContext task_info() {
			return getRuleContext(Task_infoContext.class,0);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_task);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TASK_WORD);
			setState(51);
			((TaskContext)_localctx).WORD = match(WORD);
			setState(52);
			match(LBRACE);
			setState(53);
			((TaskContext)_localctx).info = task_info();
			((TaskContext)_localctx).info.myTask.setDescription((((TaskContext)_localctx).WORD!=null?((TaskContext)_localctx).WORD.getText():null)); ((TaskContext)_localctx).finalTask =  ((TaskContext)_localctx).info.myTask;
			setState(55);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Task_infoContext extends ParserRuleContext {
		public Task myTask;
		public Token DATE;
		public Token INT;
		public Token WORD;
		public TerminalNode BEGIN_DATE() { return getToken(GanttGrammarParser.BEGIN_DATE, 0); }
		public List<TerminalNode> COLON() { return getTokens(GanttGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GanttGrammarParser.COLON, i);
		}
		public TerminalNode DATE() { return getToken(GanttGrammarParser.DATE, 0); }
		public TerminalNode DURATION() { return getToken(GanttGrammarParser.DURATION, 0); }
		public List<TerminalNode> INT() { return getTokens(GanttGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GanttGrammarParser.INT, i);
		}
		public TerminalNode NAME_RESP() { return getToken(GanttGrammarParser.NAME_RESP, 0); }
		public TerminalNode WORD() { return getToken(GanttGrammarParser.WORD, 0); }
		public TerminalNode PERCENT() { return getToken(GanttGrammarParser.PERCENT, 0); }
		public Task_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).enterTask_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GanttGrammarListener ) ((GanttGrammarListener)listener).exitTask_info(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GanttGrammarVisitor ) return ((GanttGrammarVisitor<? extends T>)visitor).visitTask_info(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_infoContext task_info() throws RecognitionException {
		Task_infoContext _localctx = new Task_infoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_task_info);
		 ((Task_infoContext)_localctx).myTask =  new Task(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(BEGIN_DATE);
			setState(58);
			match(COLON);
			setState(59);
			((Task_infoContext)_localctx).DATE = match(DATE);
			_localctx.myTask.setDateStart((((Task_infoContext)_localctx).DATE!=null?((Task_infoContext)_localctx).DATE.getText():null));
			setState(61);
			match(DURATION);
			setState(62);
			match(COLON);
			setState(63);
			((Task_infoContext)_localctx).INT = match(INT);
			_localctx.myTask.setDuration((((Task_infoContext)_localctx).INT!=null?((Task_infoContext)_localctx).INT.getText():null));
			setState(65);
			match(NAME_RESP);
			setState(66);
			match(COLON);
			setState(67);
			((Task_infoContext)_localctx).WORD = match(WORD);
			_localctx.myTask.setNameResp((((Task_infoContext)_localctx).WORD!=null?((Task_infoContext)_localctx).WORD.getText():null));
			setState(73);
			_la = _input.LA(1);
			if (_la==PERCENT) {
				{
				setState(69);
				match(PERCENT);
				setState(70);
				match(COLON);
				setState(71);
				((Task_infoContext)_localctx).INT = match(INT);
				_localctx.myTask.setPercent((((Task_infoContext)_localctx).INT!=null?((Task_infoContext)_localctx).INT.getText():null));
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4\"\n\4\r\4\16\4#\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6\61\n\6\r\6\16\6\62\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bL\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2J\2\20\3\2\2\2\4\32"+
		"\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n\60\3\2\2\2\f\64\3\2\2\2\16;\3\2\2\2\20"+
		"\24\7\7\2\2\21\22\5\4\3\2\22\23\b\2\1\2\23\25\3\2\2\2\24\21\3\2\2\2\24"+
		"\25\3\2\2\2\25\26\3\2\2\2\26\27\5\6\4\2\27\30\b\2\1\2\30\31\7\b\2\2\31"+
		"\3\3\2\2\2\32\33\7\20\2\2\33\34\7\n\2\2\34\35\b\3\1\2\35\5\3\2\2\2\36"+
		"\37\5\b\5\2\37 \b\4\1\2 \"\3\2\2\2!\36\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$"+
		"\3\2\2\2$\7\3\2\2\2%&\7\16\2\2&\'\7\f\2\2\'(\7\21\2\2()\b\5\1\2)*\5\n"+
		"\6\2*+\b\5\1\2+,\7\22\2\2,\t\3\2\2\2-.\5\f\7\2./\b\6\1\2/\61\3\2\2\2\60"+
		"-\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3\2\2\2\64\65"+
		"\7\17\2\2\65\66\7\f\2\2\66\67\7\21\2\2\678\5\16\b\289\b\7\1\29:\7\22\2"+
		"\2:\r\3\2\2\2;<\7\3\2\2<=\7\23\2\2=>\7\r\2\2>?\b\b\1\2?@\7\4\2\2@A\7\23"+
		"\2\2AB\7\n\2\2BC\b\b\1\2CD\7\5\2\2DE\7\23\2\2EF\7\f\2\2FK\b\b\1\2GH\7"+
		"\6\2\2HI\7\23\2\2IJ\7\n\2\2JL\b\b\1\2KG\3\2\2\2KL\3\2\2\2L\17\3\2\2\2"+
		"\6\24#\62K";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}