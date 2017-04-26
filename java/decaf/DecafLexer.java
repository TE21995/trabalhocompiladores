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
		TK_class=1, LCURLY=2, RCURLY=3, RW=4, ID=5, HEXADECIMALNUM=6, DECIMALNUM=7, 
		CHARLIT=8, STRINGLIT=9, OPE=10, LCOMMENT=11, SCOMMENT=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "RW", "ALPHA", "ALPHANUM", "DIGIT", "OCTAL", "HEXADECIMAL", 
		"ID", "HEXADECIMALNUM", "DECIMALNUM", "CHAR", "ESC", "CHARLIT", "STRINGLIT", 
		"OPE", "LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "RW", "ID", "HEXADECIMALNUM", "DECIMALNUM", 
		"CHARLIT", "STRINGLIT", "OPE", "LCOMMENT", "SCOMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u00db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\6\3\6\5\6s\n\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3\13\3\13\6\13\u0086"+
		"\n\13\r\13\16\13\u0087\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\5"+
		"\r\u0092\n\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u009a\n\17\3\17\3\17\3"+
		"\20\3\20\6\20\u00a0\n\20\r\20\16\20\u00a1\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b5\n\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00bb\n\22\f\22\16\22\u00be\13\22\3\22\5\22"+
		"\u00c1\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00cb\n\23\f"+
		"\23\16\23\u00ce\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00d6\n\24\r"+
		"\24\16\24\u00d7\3\24\3\24\4\u00bc\u00cc\2\25\3\4\5\5\7\6\t\2\13\2\r\2"+
		"\17\2\21\2\23\7\25\b\27\t\31\2\33\2\35\n\37\13!\f#\r%\16\'\17\3\2\13\5"+
		"\2C\\aac|\3\2\62;\3\2\629\5\2\62;CHch\7\2\"#%(*\60\62]_\u0080\6\2$$^^"+
		"ppvv\b\2\'\',-//\61\61>>@@\n\2##*+..\60\60==]]__}}\5\2\13\f\17\17\"\""+
		"\u00f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2\13r\3\2\2\2\r"+
		"t\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25\u0081\3\2\2\2\27\u0089"+
		"\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0096\3\2\2\2\37\u009d\3"+
		"\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00c6\3\2\2\2\'\u00d5\3\2\2\2)*"+
		"\7}\2\2*\4\3\2\2\2+,\7\177\2\2,\6\3\2\2\2-.\7d\2\2./\7q\2\2/\60\7q\2\2"+
		"\60\61\7n\2\2\61\62\7g\2\2\62\63\7c\2\2\63m\7p\2\2\64\65\7d\2\2\65\66"+
		"\7t\2\2\66\67\7g\2\2\678\7c\2\28m\7m\2\29:\7e\2\2:;\7c\2\2;<\7n\2\2<="+
		"\7n\2\2=>\7q\2\2>?\7w\2\2?m\7v\2\2@A\7e\2\2AB\7n\2\2BC\7c\2\2CD\7u\2\2"+
		"Dm\7u\2\2EF\7e\2\2FG\7q\2\2GH\7p\2\2HI\7v\2\2IJ\7k\2\2JK\7p\2\2KL\7w\2"+
		"\2Lm\7g\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2Pm\7g\2\2QR\7h\2\2RS\7c\2\2ST\7"+
		"n\2\2TU\7u\2\2Um\7g\2\2VW\7h\2\2WX\7q\2\2Xm\7t\2\2YZ\7k\2\2Z[\7p\2\2["+
		"m\7v\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2am\7p\2\2bc\7v\2"+
		"\2cd\7t\2\2de\7w\2\2em\7g\2\2fg\7x\2\2gh\7q\2\2hi\7k\2\2im\7f\2\2jk\7"+
		"k\2\2km\7h\2\2l-\3\2\2\2l\64\3\2\2\2l9\3\2\2\2l@\3\2\2\2lE\3\2\2\2lM\3"+
		"\2\2\2lQ\3\2\2\2lV\3\2\2\2lY\3\2\2\2l\\\3\2\2\2lb\3\2\2\2lf\3\2\2\2lj"+
		"\3\2\2\2m\b\3\2\2\2no\t\2\2\2o\n\3\2\2\2ps\5\t\5\2qs\5\r\7\2rp\3\2\2\2"+
		"rq\3\2\2\2s\f\3\2\2\2tu\t\3\2\2u\16\3\2\2\2vw\t\4\2\2w\20\3\2\2\2xy\t"+
		"\5\2\2y\22\3\2\2\2z~\5\t\5\2{}\5\13\6\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\24\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\62\2\2\u0082"+
		"\u0083\7z\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\21\t\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\26\3\2\2\2\u0089\u008d\5\r\7\2\u008a\u008c\5\r\7\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\30"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\32\3\2\2\2\u0093\u0094\7^\2\2\u0094\u0095\t\7\2\2\u0095\34\3\2\2\2\u0096"+
		"\u0099\7)\2\2\u0097\u009a\5\33\16\2\u0098\u009a\5\31\r\2\u0099\u0097\3"+
		"\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7)\2\2\u009c"+
		"\36\3\2\2\2\u009d\u009f\7$\2\2\u009e\u00a0\5\35\17\2\u009f\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4 \3\2\2\2\u00a5\u00b5\t\b\2\2\u00a6\u00a7"+
		"\7>\2\2\u00a7\u00b5\7?\2\2\u00a8\u00a9\7@\2\2\u00a9\u00b5\7?\2\2\u00aa"+
		"\u00b5\7?\2\2\u00ab\u00ac\7?\2\2\u00ac\u00b5\7?\2\2\u00ad\u00ae\7#\2\2"+
		"\u00ae\u00b5\7?\2\2\u00af\u00b0\7(\2\2\u00b0\u00b5\7(\2\2\u00b1\u00b2"+
		"\7~\2\2\u00b2\u00b5\7~\2\2\u00b3\u00b5\t\t\2\2\u00b4\u00a5\3\2\2\2\u00b4"+
		"\u00a6\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ab\3\2"+
		"\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\7\61\2"+
		"\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\13\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\b\22\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8"+
		"\7,\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d1\7\61\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\b\23\2\2\u00d3&\3\2\2\2\u00d4\u00d6\t\n\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\24\2\2\u00da(\3\2\2\2\20\2"+
		"lr~\u0087\u008d\u0091\u0099\u00a1\u00b4\u00bc\u00c0\u00cc\u00d7\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}