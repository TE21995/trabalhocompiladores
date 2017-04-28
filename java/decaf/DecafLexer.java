// Generated from /home/uniceub/thomas/trabalhocompiladores/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, LCURLY=2, RCURLY=3, OPE=4, RW=5, ID=6, HEXADECIMALNUM=7, DECIMALNUM=8, 
		CHARLIT=9, STRINGLIT=10, LCOMMENT=11, SCOMMENT=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "OPE", "RW", "ALPHA", "ALPHANUM", "DIGIT", "OCTAL", 
		"HEXADECIMAL", "ID", "HEXADECIMALNUM", "DECIMALNUM", "CHAR", "ESC", "CHARLIT", 
		"STRINGLIT", "LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "OPE", "RW", "ID", "HEXADECIMALNUM", 
		"DECIMALNUM", "CHARLIT", "STRINGLIT", "LCOMMENT", "SCOMMENT", "WS"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u00dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\7\3\7\5\7\u0084\n\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091\13\13\3\f\3\f\3\f"+
		"\3\f\6\f\u0097\n\f\r\f\16\f\u0098\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0"+
		"\13\r\3\16\5\16\u00a3\n\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ab\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\6\21\u00b2\n\21\r\21\16\21\u00b3\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf\13\22\3\22\5\22"+
		"\u00c2\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00cc\n\23\f"+
		"\23\16\23\u00cf\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00d7\n\24\r"+
		"\24\16\24\u00d8\3\24\3\24\4\u00bd\u00cd\2\25\3\4\5\5\7\6\t\7\13\2\r\2"+
		"\17\2\21\2\23\2\25\b\27\t\31\n\33\2\35\2\37\13!\f#\r%\16\'\17\3\2\13\b"+
		"\2\'\',-//\61\61>>@@\n\2##*+..\60\60==]]__}}\5\2C\\aac|\3\2\62;\3\2\62"+
		"9\5\2\62;CHch\7\2\"#%(*\60\62]_\u0080\7\2$$))^^ppvv\5\2\13\f\17\17\"\""+
		"\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7<\3\2\2\2\t}\3\2\2\2\13\177\3\2\2"+
		"\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u0089\3\2\2\2"+
		"\25\u008b\3\2\2\2\27\u0092\3\2\2\2\31\u009a\3\2\2\2\33\u00a2\3\2\2\2\35"+
		"\u00a4\3\2\2\2\37\u00a7\3\2\2\2!\u00ae\3\2\2\2#\u00b7\3\2\2\2%\u00c7\3"+
		"\2\2\2\'\u00d6\3\2\2\2)*\7}\2\2*\4\3\2\2\2+,\7\177\2\2,\6\3\2\2\2-=\t"+
		"\2\2\2./\7>\2\2/=\7?\2\2\60\61\7@\2\2\61=\7?\2\2\62=\7?\2\2\63\64\7?\2"+
		"\2\64=\7?\2\2\65\66\7#\2\2\66=\7?\2\2\678\7(\2\28=\7(\2\29:\7~\2\2:=\7"+
		"~\2\2;=\t\3\2\2<-\3\2\2\2<.\3\2\2\2<\60\3\2\2\2<\62\3\2\2\2<\63\3\2\2"+
		"\2<\65\3\2\2\2<\67\3\2\2\2<9\3\2\2\2<;\3\2\2\2=\b\3\2\2\2>?\7d\2\2?@\7"+
		"q\2\2@A\7q\2\2AB\7n\2\2BC\7g\2\2CD\7c\2\2D~\7p\2\2EF\7d\2\2FG\7t\2\2G"+
		"H\7g\2\2HI\7c\2\2I~\7m\2\2JK\7e\2\2KL\7c\2\2LM\7n\2\2MN\7n\2\2NO\7q\2"+
		"\2OP\7w\2\2P~\7v\2\2QR\7e\2\2RS\7n\2\2ST\7c\2\2TU\7u\2\2U~\7u\2\2VW\7"+
		"e\2\2WX\7q\2\2XY\7p\2\2YZ\7v\2\2Z[\7k\2\2[\\\7p\2\2\\]\7w\2\2]~\7g\2\2"+
		"^_\7g\2\2_`\7n\2\2`a\7u\2\2a~\7g\2\2bc\7h\2\2cd\7c\2\2de\7n\2\2ef\7u\2"+
		"\2f~\7g\2\2gh\7h\2\2hi\7q\2\2i~\7t\2\2jk\7k\2\2kl\7p\2\2l~\7v\2\2mn\7"+
		"t\2\2no\7g\2\2op\7v\2\2pq\7w\2\2qr\7t\2\2r~\7p\2\2st\7v\2\2tu\7t\2\2u"+
		"v\7w\2\2v~\7g\2\2wx\7x\2\2xy\7q\2\2yz\7k\2\2z~\7f\2\2{|\7k\2\2|~\7h\2"+
		"\2}>\3\2\2\2}E\3\2\2\2}J\3\2\2\2}Q\3\2\2\2}V\3\2\2\2}^\3\2\2\2}b\3\2\2"+
		"\2}g\3\2\2\2}j\3\2\2\2}m\3\2\2\2}s\3\2\2\2}w\3\2\2\2}{\3\2\2\2~\n\3\2"+
		"\2\2\177\u0080\t\4\2\2\u0080\f\3\2\2\2\u0081\u0084\5\13\6\2\u0082\u0084"+
		"\5\17\b\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\t\5\2\2\u0086\20\3\2\2\2\u0087\u0088\t\6\2\2\u0088\22\3\2\2\2\u0089"+
		"\u008a\t\7\2\2\u008a\24\3\2\2\2\u008b\u008f\5\13\6\2\u008c\u008e\5\r\7"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\26\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\62\2\2\u0093"+
		"\u0094\7z\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5\23\n\2\u0096\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009e\5\17\b\2\u009b\u009d\5\17\b\2\u009c\u009b\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\32\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\t\b\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\34\3\2\2\2\u00a4\u00a5\7^\2\2\u00a5\u00a6\t\t\2\2\u00a6\36\3"+
		"\2\2\2\u00a7\u00aa\7)\2\2\u00a8\u00ab\5\33\16\2\u00a9\u00ab\5\35\17\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\7)\2\2\u00ad \3\2\2\2\u00ae\u00b1\7$\2\2\u00af\u00b2\5\33\16\2\u00b0"+
		"\u00b2\5\35\17\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7$\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\7\61\2"+
		"\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\13\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\7\17\2\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\b\22\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9"+
		"\7,\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2\7\61\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\b\23\2\2\u00d4&\3\2\2\2\u00d5\u00d7\t\n\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\24\2\2\u00db(\3\2\2\2\21\2"+
		"<}\u0083\u008f\u0098\u009e\u00a2\u00aa\u00b1\u00b3\u00bd\u00c1\u00cd\u00d8"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}