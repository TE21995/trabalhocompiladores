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
		LCURLY=1, RCURLY=2, LBAR=3, RBAR=4, LPA=5, RPA=6, PV=7, TK_class=8, BOOLEAN=9, 
		BREAK=10, CALLOUT=11, CLASS=12, CONTINUE=13, ELSE=14, FOR=15, INT=16, 
		RETURN=17, VOID=18, IF=19, FALSE=20, TRUE=21, FORPAR=22, INTLIT=23, BOOLEANLITERAL=24, 
		TYPE=25, CHARLIT=26, STRINGLIT=27, ID=28, LCOMMENT=29, SCOMMENT=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "TK_class", "BOOLEAN", 
		"BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", "RETURN", 
		"VOID", "IF", "FALSE", "TRUE", "FORPAR", "INTLIT", "HEXADECIMAL", "DECIMAL", 
		"DIGIT", "OCTAL", "HEXA", "BOOLEANLITERAL", "TYPE", "CHARLIT", "SINGLE_CHARACTER", 
		"STRINGLIT", "STRING_CHARACTERS", "STRING_CHARACTER", "ESC", "ID", "ALPHA", 
		"ALPHANUM", "LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'class Program'", 
		"'boolean'", "'break'", "'callout'", "'class'", "'continue'", "'else'", 
		"'for'", "'int'", "'return'", "'void'", "'if'", "'false'", "'true'", "'forpar'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "TK_class", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "INTLIT", "BOOLEANLITERAL", 
		"TYPE", "CHARLIT", "STRINGLIT", "ID", "LCOMMENT", "SCOMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\5\30\u00c9\n\30\3\31\3\31\3\31\3\31\6\31\u00cf"+
		"\n\31\r\31\16\31\u00d0\3\32\3\32\7\32\u00d5\n\32\f\32\16\32\u00d8\13\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u00e9\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u00f5\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u00ff\n \3!\3!\3\"\3\"\5\""+
		"\u0105\n\"\3\"\3\"\3#\6#\u010a\n#\r#\16#\u010b\3$\3$\5$\u0110\n$\3%\3"+
		"%\3%\3&\3&\7&\u0117\n&\f&\16&\u011a\13&\3\'\3\'\3(\3(\5(\u0120\n(\3)\3"+
		")\3)\3)\7)\u0126\n)\f)\16)\u0129\13)\3)\5)\u012c\n)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\7*\u0136\n*\f*\16*\u0139\13*\3*\3*\3*\3*\3*\3+\6+\u0141\n+\r+\16"+
		"+\u0142\3+\3+\4\u0127\u0137\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\2\63\2\65\2\67\29\2;\32=\33?\34A\2C\35E\2G\2I\2K\36M\2O\2Q\37S U!\3\2"+
		"\n\3\2\63;\3\2\62;\3\2\629\5\2\62;CHch\5\2$$))^^\t\2$$))^^hhppttvv\5\2"+
		"C\\aac|\5\2\13\f\17\17\"\"\u0149\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C"+
		"\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2"+
		"\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21e\3\2"+
		"\2\2\23s\3\2\2\2\25{\3\2\2\2\27\u0081\3\2\2\2\31\u0089\3\2\2\2\33\u008f"+
		"\3\2\2\2\35\u0098\3\2\2\2\37\u009d\3\2\2\2!\u00a1\3\2\2\2#\u00a5\3\2\2"+
		"\2%\u00ac\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3\2\2\2+\u00ba\3\2\2\2-\u00bf"+
		"\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00d2\3\2\2\2\65\u00d9\3\2"+
		"\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00e8\3\2\2\2=\u00f4\3\2\2\2?\u00fe"+
		"\3\2\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E\u0109\3\2\2\2G\u010f\3\2\2\2I"+
		"\u0111\3\2\2\2K\u0114\3\2\2\2M\u011b\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2"+
		"\2\2S\u0131\3\2\2\2U\u0140\3\2\2\2WX\7}\2\2X\4\3\2\2\2YZ\7\177\2\2Z\6"+
		"\3\2\2\2[\\\7]\2\2\\\b\3\2\2\2]^\7_\2\2^\n\3\2\2\2_`\7*\2\2`\f\3\2\2\2"+
		"ab\7+\2\2b\16\3\2\2\2cd\7=\2\2d\20\3\2\2\2ef\7e\2\2fg\7n\2\2gh\7c\2\2"+
		"hi\7u\2\2ij\7u\2\2jk\7\"\2\2kl\7R\2\2lm\7t\2\2mn\7q\2\2no\7i\2\2op\7t"+
		"\2\2pq\7c\2\2qr\7o\2\2r\22\3\2\2\2st\7d\2\2tu\7q\2\2uv\7q\2\2vw\7n\2\2"+
		"wx\7g\2\2xy\7c\2\2yz\7p\2\2z\24\3\2\2\2{|\7d\2\2|}\7t\2\2}~\7g\2\2~\177"+
		"\7c\2\2\177\u0080\7m\2\2\u0080\26\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7w\2\2\u0087\u0088\7v\2\2\u0088\30\3\2\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\u008e\7u\2\2"+
		"\u008e\32\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7"+
		"p\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7w\2\2\u0096\u0097\7g\2\2\u0097\34\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\7h\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0 \3\2\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\"\3\2\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7p\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7x\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2\u00b0&\3\2\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9*\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7w\2"+
		"\2\u00bd\u00be\7g\2\2\u00be,\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7"+
		"q\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5.\3\2\2\2\u00c6\u00c9\5\61\31\2\u00c7\u00c9\5\63\32\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7\62\2"+
		"\2\u00cb\u00cc\7z\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\59\35\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\62\3\2\2\2\u00d2\u00d6\5\65\33\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\t\3\2\2\u00da\66\3\2\2\2\u00db"+
		"\u00dc\t\4\2\2\u00dc8\3\2\2\2\u00dd\u00de\t\5\2\2\u00de:\3\2\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e9\7g\2\2"+
		"\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\u00e9\7g\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9"+
		"<\3\2\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00f5\7v\2\2\u00ed"+
		"\u00ee\7d\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7n\2\2"+
		"\u00f1\u00f2\7g\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f5\7p\2\2\u00f4\u00ea"+
		"\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7\u00f8"+
		"\5A!\2\u00f8\u00f9\7)\2\2\u00f9\u00ff\3\2\2\2\u00fa\u00fb\7)\2\2\u00fb"+
		"\u00fc\5I%\2\u00fc\u00fd\7)\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f6\3\2\2"+
		"\2\u00fe\u00fa\3\2\2\2\u00ff@\3\2\2\2\u0100\u0101\n\6\2\2\u0101B\3\2\2"+
		"\2\u0102\u0104\7$\2\2\u0103\u0105\5E#\2\u0104\u0103\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7$\2\2\u0107D\3\2\2\2\u0108\u010a"+
		"\5G$\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010cF\3\2\2\2\u010d\u0110\n\6\2\2\u010e\u0110\5I%\2\u010f"+
		"\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110H\3\2\2\2\u0111\u0112\7^\2\2\u0112"+
		"\u0113\t\7\2\2\u0113J\3\2\2\2\u0114\u0118\5M\'\2\u0115\u0117\5O(\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119L\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\b\2\2\u011cN\3\2"+
		"\2\2\u011d\u0120\5M\'\2\u011e\u0120\5\65\33\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120P\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123\7\61\2"+
		"\2\u0123\u0127\3\2\2\2\u0124\u0126\13\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012c\7\17\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\f\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\b)\2\2\u0130R\3\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133"+
		"\7,\2\2\u0133\u0137\3\2\2\2\u0134\u0136\13\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7\61\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\b*\2\2\u013eT\3\2\2\2\u013f\u0141\t\t\2\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b+\2\2\u0145V\3\2\2\2\22\2\u00c8"+
		"\u00d0\u00d6\u00e8\u00f4\u00fe\u0104\u010b\u010f\u0118\u011f\u0127\u012b"+
		"\u0137\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}