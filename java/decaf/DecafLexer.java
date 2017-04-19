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
		TK_class=1, LCURLY=2, RCURLY=3, RW=4, AOPER=5, ROPER=6, LOPER=7, ID=8, 
		HEXADECIMALNUM=9, DECIMALNUM=10, CHARL=11, STRINGL=12, LCOMMENT=13, SCOMMENT=14, 
		WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "RW", "AOPER", "ROPER", "LOPER", "ALPHA", "ALPHANUM", 
		"ID", "DIGIT", "OCTAL", "HEXADECIMAL", "HEXADECIMALNUM", "DECIMALNUM", 
		"CHARL", "STRINGL", "LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "RW", "AOPER", "ROPER", "LOPER", 
		"ID", "HEXADECIMALNUM", "DECIMALNUM", "CHARL", "STRINGL", "LCOMMENT", 
		"SCOMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4k\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\t\3\t\5\t\u0085\n\t\3\n\3\n\7"+
		"\n\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\6\16\u0098\n\16\r\16\16\16\u0099\3\17\3\17\7\17\u009e\n\17\f"+
		"\17\16\17\u00a1\13\17\3\20\3\20\7\20\u00a5\n\20\f\20\16\20\u00a8\13\20"+
		"\3\20\3\20\3\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13\22\3\22\5\22"+
		"\u00bf\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00c9\n\23\f"+
		"\23\16\23\u00cc\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00d4\n\24\r"+
		"\24\16\24\u00d5\3\24\3\24\6\u00a6\u00af\u00ba\u00ca\2\25\3\4\5\5\7\6\t"+
		"\7\13\b\r\t\17\2\21\2\23\n\25\2\27\2\31\2\33\13\35\f\37\r!\16#\17%\20"+
		"\'\21\3\2\t\6\2\'\',-//\61\61\4\2>>@@\5\2C\\aac|\3\2\62;\3\2\629\5\2\62"+
		";CHch\5\2\13\f\17\17\"\"\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2"+
		"\2\5+\3\2\2\2\7j\3\2\2\2\tl\3\2\2\2\13w\3\2\2\2\r~\3\2\2\2\17\u0080\3"+
		"\2\2\2\21\u0084\3\2\2\2\23\u0086\3\2\2\2\25\u008d\3\2\2\2\27\u008f\3\2"+
		"\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u009b\3\2\2\2\37\u00a2\3\2\2"+
		"\2!\u00ab\3\2\2\2#\u00b4\3\2\2\2%\u00c4\3\2\2\2\'\u00d3\3\2\2\2)*\7}\2"+
		"\2*\4\3\2\2\2+,\7\177\2\2,\6\3\2\2\2-.\7d\2\2./\7q\2\2/\60\7q\2\2\60\61"+
		"\7n\2\2\61\62\7g\2\2\62\63\7c\2\2\63k\7p\2\2\64\65\7d\2\2\65\66\7t\2\2"+
		"\66\67\7g\2\2\678\7c\2\28k\7m\2\29:\7e\2\2:;\7c\2\2;<\7n\2\2<=\7n\2\2"+
		"=>\7q\2\2>?\7w\2\2?k\7v\2\2@A\7e\2\2AB\7n\2\2BC\7c\2\2CD\7u\2\2Dk\7u\2"+
		"\2EF\7e\2\2FG\7q\2\2GH\7p\2\2HI\7v\2\2IJ\7k\2\2JK\7p\2\2KL\7w\2\2Lk\7"+
		"g\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2Pk\7g\2\2QR\7h\2\2RS\7c\2\2ST\7n\2\2T"+
		"U\7u\2\2Uk\7g\2\2VW\7h\2\2WX\7q\2\2Xk\7t\2\2YZ\7k\2\2Z[\7p\2\2[k\7v\2"+
		"\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ak\7p\2\2bc\7v\2\2cd\7"+
		"t\2\2de\7w\2\2ek\7g\2\2fg\7x\2\2gh\7q\2\2hi\7k\2\2ik\7f\2\2j-\3\2\2\2"+
		"j\64\3\2\2\2j9\3\2\2\2j@\3\2\2\2jE\3\2\2\2jM\3\2\2\2jQ\3\2\2\2jV\3\2\2"+
		"\2jY\3\2\2\2j\\\3\2\2\2jb\3\2\2\2jf\3\2\2\2k\b\3\2\2\2lm\t\2\2\2m\n\3"+
		"\2\2\2no\7?\2\2ox\7?\2\2px\t\3\2\2qr\7>\2\2rx\7?\2\2st\7@\2\2tx\7?\2\2"+
		"uv\7#\2\2vx\7?\2\2wn\3\2\2\2wp\3\2\2\2wq\3\2\2\2ws\3\2\2\2wu\3\2\2\2x"+
		"\f\3\2\2\2yz\7(\2\2z\177\7(\2\2{|\7~\2\2|\177\7~\2\2}\177\7#\2\2~y\3\2"+
		"\2\2~{\3\2\2\2~}\3\2\2\2\177\16\3\2\2\2\u0080\u0081\t\4\2\2\u0081\20\3"+
		"\2\2\2\u0082\u0085\5\17\b\2\u0083\u0085\5\25\13\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\22\3\2\2\2\u0086\u008a\5\17\b\2\u0087\u0089"+
		"\5\21\t\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\24\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\t\5\2\2\u008e\26\3\2\2\2\u008f\u0090\t\6\2\2\u0090\30\3\2\2\2\u0091\u0092"+
		"\t\7\2\2\u0092\32\3\2\2\2\u0093\u0094\7\62\2\2\u0094\u0095\7z\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0098\5\31\r\2\u0097\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\34\3\2\2\2\u009b"+
		"\u009f\5\25\13\2\u009c\u009e\5\25\13\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\36\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a6\7)\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa \3\2\2\2\u00ab"+
		"\u00af\7$\2\2\u00ac\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7\61\2\2"+
		"\u00b5\u00b6\7\61\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\17\2\2\u00be\u00bd\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\b\22\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7\61\2"+
		"\2\u00c5\u00c6\7,\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\13\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\7\61"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\23\2\2\u00d1&\3\2\2\2\u00d2\u00d4"+
		"\t\b\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\24\2\2\u00d8(\3\2\2\2"+
		"\20\2jw~\u0084\u008a\u0099\u009f\u00a6\u00af\u00ba\u00be\u00ca\u00d5\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}