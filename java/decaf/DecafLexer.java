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
		LCURLY=1, RCURLY=2, LBAR=3, RBAR=4, LPA=5, RPA=6, PV=7, VIG=8, TKCLASS=9, 
		BOOLEAN=10, BREAK=11, CALLOUT=12, CLASS=13, CONTINUE=14, ELSE=15, FOR=16, 
		INT=17, RETURN=18, VOID=19, IF=20, FALSE=21, TRUE=22, FORPAR=23, INTLIT=24, 
		BOOLEANLITERAL=25, CHARLIT=26, STRINGLIT=27, ID=28, MULT=29, DIVI=30, 
		SOMA=31, SUBT=32, REMA=33, BGTOP=34, SMTOP=35, BGEQTOP=36, SMEQTOP=37, 
		ISEQUAL=38, NOTEQUAL=39, CONDAND=40, CONDOR=41, EQU=42, MOREQU=43, LESSEQU=44, 
		EXC=45, LCOMMENT=46, SCOMMENT=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "VIG", "TKCLASS", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "INTLIT", "HEXADECIMAL", 
		"DECIMAL", "DIGIT", "OCTAL", "HEXA", "BOOLEANLITERAL", "CHARLIT", "SINGLE_CHARACTER", 
		"STRINGLIT", "STRING_CHARACTERS", "STRING_CHARACTER", "ESC", "ID", "ALPHA", 
		"ALPHANUM", "MULT", "DIVI", "SOMA", "SUBT", "REMA", "BGTOP", "SMTOP", 
		"BGEQTOP", "SMEQTOP", "ISEQUAL", "NOTEQUAL", "CONDAND", "CONDOR", "EQU", 
		"MOREQU", "LESSEQU", "EXC", "LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'class Program'", 
		"'boolean'", "'break'", "'callout'", "'class'", "'continue'", "'else'", 
		"'for'", "'int'", "'return'", "'void'", "'if'", "'false'", "'true'", "'forpar'", 
		null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'%'", "'>'", 
		"'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'='", "'+='", 
		"'-='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "VIG", "TKCLASS", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "INTLIT", "BOOLEANLITERAL", 
		"CHARLIT", "STRINGLIT", "ID", "MULT", "DIVI", "SOMA", "SUBT", "REMA", 
		"BGTOP", "SMTOP", "BGEQTOP", "SMEQTOP", "ISEQUAL", "NOTEQUAL", "CONDAND", 
		"CONDOR", "EQU", "MOREQU", "LESSEQU", "EXC", "LCOMMENT", "SCOMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0186\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00ed\n\31\3\32\3\32\3\32"+
		"\3\32\6\32\u00f3\n\32\r\32\16\32\u00f4\3\33\6\33\u00f8\n\33\r\33\16\33"+
		"\u00f9\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u010b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0115\n \3!\3!\3"+
		"\"\3\"\5\"\u011b\n\"\3\"\3\"\3#\6#\u0120\n#\r#\16#\u0121\3$\3$\5$\u0126"+
		"\n$\3%\3%\3%\3&\3&\7&\u012d\n&\f&\16&\u0130\13&\3\'\3\'\3(\3(\5(\u0136"+
		"\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3:\3:\7:\u0166\n:\f:\16:\u0169"+
		"\13:\3:\5:\u016c\n:\3:\3:\3:\3:\3;\3;\3;\3;\7;\u0176\n;\f;\16;\u0179\13"+
		";\3;\3;\3;\3;\3;\3<\6<\u0181\n<\r<\16<\u0182\3<\3<\4\u0167\u0177\2=\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\2=\33?\34"+
		"A\2C\35E\2G\2I\2K\36M\2O\2Q\37S U!W\"Y#[$]%_&a\'c(e)g*i+k,m-o.q/s\60u"+
		"\61w\62\3\2\t\3\2\62;\3\2\629\5\2\62;CHch\5\2$$))^^\t\2$$))^^hhppttvv"+
		"\5\2C\\aac|\5\2\13\f\17\17\"\"\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2C\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t"+
		"\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0087"+
		"\3\2\2\2\23\u0089\3\2\2\2\25\u0097\3\2\2\2\27\u009f\3\2\2\2\31\u00a5\3"+
		"\2\2\2\33\u00ad\3\2\2\2\35\u00b3\3\2\2\2\37\u00bc\3\2\2\2!\u00c1\3\2\2"+
		"\2#\u00c5\3\2\2\2%\u00c9\3\2\2\2\'\u00d0\3\2\2\2)\u00d5\3\2\2\2+\u00d8"+
		"\3\2\2\2-\u00de\3\2\2\2/\u00e3\3\2\2\2\61\u00ec\3\2\2\2\63\u00ee\3\2\2"+
		"\2\65\u00f7\3\2\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u010a"+
		"\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E\u011f\3\2\2\2G"+
		"\u0125\3\2\2\2I\u0127\3\2\2\2K\u012a\3\2\2\2M\u0131\3\2\2\2O\u0135\3\2"+
		"\2\2Q\u0137\3\2\2\2S\u0139\3\2\2\2U\u013b\3\2\2\2W\u013d\3\2\2\2Y\u013f"+
		"\3\2\2\2[\u0141\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a\u0148\3\2\2\2c"+
		"\u014b\3\2\2\2e\u014e\3\2\2\2g\u0151\3\2\2\2i\u0154\3\2\2\2k\u0157\3\2"+
		"\2\2m\u0159\3\2\2\2o\u015c\3\2\2\2q\u015f\3\2\2\2s\u0161\3\2\2\2u\u0171"+
		"\3\2\2\2w\u0180\3\2\2\2yz\7}\2\2z\4\3\2\2\2{|\7\177\2\2|\6\3\2\2\2}~\7"+
		"]\2\2~\b\3\2\2\2\177\u0080\7_\2\2\u0080\n\3\2\2\2\u0081\u0082\7*\2\2\u0082"+
		"\f\3\2\2\2\u0083\u0084\7+\2\2\u0084\16\3\2\2\2\u0085\u0086\7=\2\2\u0086"+
		"\20\3\2\2\2\u0087\u0088\7.\2\2\u0088\22\3\2\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\u008e\7u\2\2"+
		"\u008e\u008f\7\"\2\2\u008f\u0090\7R\2\2\u0090\u0091\7t\2\2\u0091\u0092"+
		"\7q\2\2\u0092\u0093\7i\2\2\u0093\u0094\7t\2\2\u0094\u0095\7c\2\2\u0095"+
		"\u0096\7o\2\2\u0096\24\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099\7q\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2"+
		"\u009d\u009e\7p\2\2\u009e\26\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7"+
		"t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7m\2\2\u00a4\30"+
		"\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac\32\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7"+
		"c\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7u\2\2\u00b2\34\3\2\2\2\u00b3\u00b4"+
		"\7e\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\36\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7"+
		"u\2\2\u00bf\u00c0\7g\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00c4\7t\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7v\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7t\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\u00d3\7k\2\2\u00d3\u00d4\7f\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7h\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da"+
		"\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd,\3\2\2\2\u00de"+
		"\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2.\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7t\2"+
		"\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\60\3"+
		"\2\2\2\u00ea\u00ed\5\63\32\2\u00eb\u00ed\5\65\33\2\u00ec\u00ea\3\2\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7\62\2\2\u00ef\u00f0"+
		"\7z\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\5;\36\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\64\3\2\2"+
		"\2\u00f6\u00f8\5\67\34\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\t\2\2"+
		"\2\u00fc8\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe:\3\2\2\2\u00ff\u0100\t\4\2"+
		"\2\u0100<\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103\u0104\7"+
		"w\2\2\u0104\u010b\7g\2\2\u0105\u0106\7h\2\2\u0106\u0107\7c\2\2\u0107\u0108"+
		"\7n\2\2\u0108\u0109\7u\2\2\u0109\u010b\7g\2\2\u010a\u0101\3\2\2\2\u010a"+
		"\u0105\3\2\2\2\u010b>\3\2\2\2\u010c\u010d\7)\2\2\u010d\u010e\5A!\2\u010e"+
		"\u010f\7)\2\2\u010f\u0115\3\2\2\2\u0110\u0111\7)\2\2\u0111\u0112\5I%\2"+
		"\u0112\u0113\7)\2\2\u0113\u0115\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0110"+
		"\3\2\2\2\u0115@\3\2\2\2\u0116\u0117\n\5\2\2\u0117B\3\2\2\2\u0118\u011a"+
		"\7$\2\2\u0119\u011b\5E#\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\7$\2\2\u011dD\3\2\2\2\u011e\u0120\5G$\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122F\3\2\2\2\u0123\u0126\n\5\2\2\u0124\u0126\5I%\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0124\3\2\2\2\u0126H\3\2\2\2\u0127\u0128\7^\2\2\u0128\u0129"+
		"\t\6\2\2\u0129J\3\2\2\2\u012a\u012e\5M\'\2\u012b\u012d\5O(\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"L\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\t\7\2\2\u0132N\3\2\2\2\u0133"+
		"\u0136\5M\'\2\u0134\u0136\5\67\34\2\u0135\u0133\3\2\2\2\u0135\u0134\3"+
		"\2\2\2\u0136P\3\2\2\2\u0137\u0138\7,\2\2\u0138R\3\2\2\2\u0139\u013a\7"+
		"\61\2\2\u013aT\3\2\2\2\u013b\u013c\7-\2\2\u013cV\3\2\2\2\u013d\u013e\7"+
		"/\2\2\u013eX\3\2\2\2\u013f\u0140\7\'\2\2\u0140Z\3\2\2\2\u0141\u0142\7"+
		"@\2\2\u0142\\\3\2\2\2\u0143\u0144\7>\2\2\u0144^\3\2\2\2\u0145\u0146\7"+
		"@\2\2\u0146\u0147\7?\2\2\u0147`\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a"+
		"\7?\2\2\u014ab\3\2\2\2\u014b\u014c\7?\2\2\u014c\u014d\7?\2\2\u014dd\3"+
		"\2\2\2\u014e\u014f\7#\2\2\u014f\u0150\7?\2\2\u0150f\3\2\2\2\u0151\u0152"+
		"\7(\2\2\u0152\u0153\7(\2\2\u0153h\3\2\2\2\u0154\u0155\7~\2\2\u0155\u0156"+
		"\7~\2\2\u0156j\3\2\2\2\u0157\u0158\7?\2\2\u0158l\3\2\2\2\u0159\u015a\7"+
		"-\2\2\u015a\u015b\7?\2\2\u015bn\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e"+
		"\7?\2\2\u015ep\3\2\2\2\u015f\u0160\7#\2\2\u0160r\3\2\2\2\u0161\u0162\7"+
		"\61\2\2\u0162\u0163\7\61\2\2\u0163\u0167\3\2\2\2\u0164\u0166\13\2\2\2"+
		"\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0168\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\7\17\2\2"+
		"\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\7\f\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b:\2\2\u0170t\3\2\2\2\u0171\u0172"+
		"\7\61\2\2\u0172\u0173\7,\2\2\u0173\u0177\3\2\2\2\u0174\u0176\13\2\2\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7,\2\2\u017b"+
		"\u017c\7\61\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b;\2\2\u017ev\3\2\2\2"+
		"\u017f\u0181\t\b\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b<\2\2\u0185"+
		"x\3\2\2\2\21\2\u00ec\u00f4\u00f9\u010a\u0114\u011a\u0121\u0125\u012e\u0135"+
		"\u0167\u016b\u0177\u0182\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}