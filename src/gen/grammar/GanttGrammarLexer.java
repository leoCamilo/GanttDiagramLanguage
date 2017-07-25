// Generated from C:/Users/Leonardo/OneDrive/development/IntelliJ Projects/Grammar Gantt/src/grammar\GanttGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

    import gantt.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GanttGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_DATE=1, DURATION=2, NAME_RESP=3, PERCENT=4, BEGIN=5, END=6, WS=7, 
		INT=8, NUM=9, WORD=10, DATE=11, THEME_WORD=12, TASK_WORD=13, INTERVAL_WORD=14, 
		LBRACE=15, RBRACE=16, COLON=17, BAR=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN_DATE", "DURATION", "NAME_RESP", "PERCENT", "BEGIN", "END", "WS", 
		"INT", "NUM", "WORD", "DATE", "THEME_WORD", "TASK_WORD", "INTERVAL_WORD", 
		"LBRACE", "RBRACE", "COLON", "BAR"
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


	public GanttGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GanttGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\6\bT\n\b\r\b\16\b"+
		"U\3\b\3\b\3\t\6\t[\n\t\r\t\16\t\\\3\n\3\n\3\13\6\13b\n\13\r\13\16\13c"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5\5\2\13\f\17\17\"\"\3"+
		"\2\62;\3\2c|\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\7\67\3\2\2\2\t"+
		"@\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17S\3\2\2\2\21Z\3\2\2\2\23^\3\2\2\2\25"+
		"a\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33w\3\2\2\2\35\u0082\3\2\2\2\37\u008e"+
		"\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'(\7f\2\2()\7c\2"+
		"\2)*\7v\2\2*+\7c\2\2+,\7K\2\2,-\7p\2\2-.\7k\2\2.\4\3\2\2\2/\60\7f\2\2"+
		"\60\61\7w\2\2\61\62\7t\2\2\62\63\7c\2\2\63\64\7e\2\2\64\65\7c\2\2\65\66"+
		"\7q\2\2\66\6\3\2\2\2\678\7p\2\289\7q\2\29:\7o\2\2:;\7g\2\2;<\7T\2\2<="+
		"\7g\2\2=>\7u\2\2>?\7r\2\2?\b\3\2\2\2@A\7r\2\2AB\7g\2\2BC\7t\2\2CD\7e\2"+
		"\2DE\7g\2\2EF\7p\2\2FG\7v\2\2G\n\3\2\2\2HI\7d\2\2IJ\7g\2\2JK\7i\2\2KL"+
		"\7k\2\2LM\7p\2\2M\f\3\2\2\2NO\7g\2\2OP\7p\2\2PQ\7f\2\2Q\16\3\2\2\2RT\t"+
		"\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\b\2\2X\20"+
		"\3\2\2\2Y[\5\23\n\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\22\3\2"+
		"\2\2^_\t\3\2\2_\24\3\2\2\2`b\t\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2d\26\3\2\2\2ef\5\21\t\2fg\5%\23\2gh\5\21\t\2hi\5%\23\2ij\5\21\t"+
		"\2j\30\3\2\2\2kl\7e\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7v\2\2pq\7g\2\2q"+
		"r\7V\2\2rs\7j\2\2st\7g\2\2tu\7o\2\2uv\7g\2\2v\32\3\2\2\2wx\7e\2\2xy\7"+
		"t\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|}\7g\2\2}~\7V\2\2~\177\7c\2\2\177\u0080"+
		"\7u\2\2\u0080\u0081\7m\2\2\u0081\34\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7K\2\2\u0086\u0087\7p\2\2\u0087"+
		"\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a\u008b\7x\2\2"+
		"\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\36\3\2\2\2\u008e\u008f\7"+
		"}\2\2\u008f \3\2\2\2\u0090\u0091\7\177\2\2\u0091\"\3\2\2\2\u0092\u0093"+
		"\7<\2\2\u0093$\3\2\2\2\u0094\u0095\7\61\2\2\u0095&\3\2\2\2\6\2U\\c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}