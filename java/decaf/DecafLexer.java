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
		BOOLEANLITERAL=25, CHARLIT=26, STRINGLIT=27, ID=28, ARITMOP=29, OPMULT=30, 
		OPDIVI=31, OPSOMA=32, OPSUBT=33, OPREMA=34, RELOP=35, BGTOP=36, SMTOP=37, 
		BGEQTOP=38, SMEQTOP=39, COMPOP=40, ISEQUAL=41, NOTEQUAL=42, CONDOP=43, 
		CONDAND=44, CONDOR=45, ASOP=46, EQU=47, MOREQU=48, LESSEQU=49, EXC=50, 
		LCOMMENT=51, SCOMMENT=52, WS=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "VIG", "TKCLASS", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "INTLIT", "HEXADECIMAL", 
		"DECIMAL", "DIGIT", "OCTAL", "HEXA", "BOOLEANLITERAL", "CHARLIT", "SINGLE_CHARACTER", 
		"STRINGLIT", "STRING_CHARACTERS", "STRING_CHARACTER", "ESC", "ID", "ALPHA", 
		"ALPHANUM", "ARITMOP", "OPMULT", "OPDIVI", "OPSOMA", "OPSUBT", "OPREMA", 
		"RELOP", "BGTOP", "SMTOP", "BGEQTOP", "SMEQTOP", "COMPOP", "ISEQUAL", 
		"NOTEQUAL", "CONDOP", "CONDAND", "CONDOR", "ASOP", "EQU", "MOREQU", "LESSEQU", 
		"EXC", "LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'class Program'", 
		"'boolean'", "'break'", "'callout'", "'class'", "'continue'", "'else'", 
		"'for'", "'int'", "'return'", "'void'", "'if'", "'false'", "'true'", "'forpar'", 
		null, null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'%'", 
		null, "'>'", "'<'", "'>='", "'<='", null, "'=='", "'!='", null, "'&&'", 
		"'||'", null, "'='", "'+='", "'-='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "VIG", "TKCLASS", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "INTLIT", "BOOLEANLITERAL", 
		"CHARLIT", "STRINGLIT", "ID", "ARITMOP", "OPMULT", "OPDIVI", "OPSOMA", 
		"OPSUBT", "OPREMA", "RELOP", "BGTOP", "SMTOP", "BGEQTOP", "SMEQTOP", "COMPOP", 
		"ISEQUAL", "NOTEQUAL", "CONDOP", "CONDAND", "CONDOR", "ASOP", "EQU", "MOREQU", 
		"LESSEQU", "EXC", "LCOMMENT", "SCOMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u01aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5"+
		"\31\u00f7\n\31\3\32\3\32\3\32\3\32\6\32\u00fd\n\32\r\32\16\32\u00fe\3"+
		"\33\6\33\u0102\n\33\r\33\16\33\u0103\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0115\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u011f\n \3!\3!\3\"\3\"\5\"\u0125\n\"\3\"\3\"\3#\6#\u012a"+
		"\n#\r#\16#\u012b\3$\3$\5$\u0130\n$\3%\3%\3%\3&\3&\7&\u0137\n&\f&\16&\u013a"+
		"\13&\3\'\3\'\3(\3(\5(\u0140\n(\3)\3)\3)\3)\3)\5)\u0147\n)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\5/\u0157\n/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\5\64\u0165\n\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\5\67\u016f\n\67\38\38\38\39\39\39\3:\3:\3:\5:\u017a"+
		"\n:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3?\3?\7?\u018a\n?\f?\16?\u018d"+
		"\13?\3?\5?\u0190\n?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u019a\n@\f@\16@\u019d\13"+
		"@\3@\3@\3@\3@\3@\3A\6A\u01a5\nA\rA\16A\u01a6\3A\3A\4\u018b\u019b\2B\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\2=\33?\34"+
		"A\2C\35E\2G\2I\2K\36M\2O\2Q\37S U!W\"Y#[$]%_&a\'c(e)g*i+k,m-o.q/s\60u"+
		"\61w\62y\63{\64}\65\177\66\u0081\67\3\2\t\3\2\62;\3\2\629\5\2\62;CHch"+
		"\5\2$$))^^\t\2$$))^^hhppttvv\5\2C\\aac|\5\2\13\f\17\17\"\"\u01b7\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2"+
		"\2\5\u0085\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r"+
		"\u008d\3\2\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u00a1"+
		"\3\2\2\2\27\u00a9\3\2\2\2\31\u00af\3\2\2\2\33\u00b7\3\2\2\2\35\u00bd\3"+
		"\2\2\2\37\u00c6\3\2\2\2!\u00cb\3\2\2\2#\u00cf\3\2\2\2%\u00d3\3\2\2\2\'"+
		"\u00da\3\2\2\2)\u00df\3\2\2\2+\u00e2\3\2\2\2-\u00e8\3\2\2\2/\u00ed\3\2"+
		"\2\2\61\u00f6\3\2\2\2\63\u00f8\3\2\2\2\65\u0101\3\2\2\2\67\u0105\3\2\2"+
		"\29\u0107\3\2\2\2;\u0109\3\2\2\2=\u0114\3\2\2\2?\u011e\3\2\2\2A\u0120"+
		"\3\2\2\2C\u0122\3\2\2\2E\u0129\3\2\2\2G\u012f\3\2\2\2I\u0131\3\2\2\2K"+
		"\u0134\3\2\2\2M\u013b\3\2\2\2O\u013f\3\2\2\2Q\u0146\3\2\2\2S\u0148\3\2"+
		"\2\2U\u014a\3\2\2\2W\u014c\3\2\2\2Y\u014e\3\2\2\2[\u0150\3\2\2\2]\u0156"+
		"\3\2\2\2_\u0158\3\2\2\2a\u015a\3\2\2\2c\u015c\3\2\2\2e\u015f\3\2\2\2g"+
		"\u0164\3\2\2\2i\u0166\3\2\2\2k\u0169\3\2\2\2m\u016e\3\2\2\2o\u0170\3\2"+
		"\2\2q\u0173\3\2\2\2s\u0179\3\2\2\2u\u017b\3\2\2\2w\u017d\3\2\2\2y\u0180"+
		"\3\2\2\2{\u0183\3\2\2\2}\u0185\3\2\2\2\177\u0195\3\2\2\2\u0081\u01a4\3"+
		"\2\2\2\u0083\u0084\7}\2\2\u0084\4\3\2\2\2\u0085\u0086\7\177\2\2\u0086"+
		"\6\3\2\2\2\u0087\u0088\7]\2\2\u0088\b\3\2\2\2\u0089\u008a\7_\2\2\u008a"+
		"\n\3\2\2\2\u008b\u008c\7*\2\2\u008c\f\3\2\2\2\u008d\u008e\7+\2\2\u008e"+
		"\16\3\2\2\2\u008f\u0090\7=\2\2\u0090\20\3\2\2\2\u0091\u0092\7.\2\2\u0092"+
		"\22\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7n\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7u\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7R\2"+
		"\2\u009a\u009b\7t\2\2\u009b\u009c\7q\2\2\u009c\u009d\7i\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7o\2\2\u00a0\24\3\2\2\2\u00a1\u00a2"+
		"\7d\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\26\3\2\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2"+
		"\u00ad\u00ae\7m\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7"+
		"c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b6\7v\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\34\3\2\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7w\2\2"+
		"\u00c4\u00c5\7g\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7"+
		"n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca \3\2\2\2\u00cb\u00cc"+
		"\7h\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\"\3\2\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2$\3\2\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7p\2\2\u00d9&\3\2\2\2\u00da\u00db\7x\2\2\u00db"+
		"\u00dc\7q\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7f\2\2\u00de(\3\2\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7,\3\2\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7w\2"+
		"\2\u00eb\u00ec\7g\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7"+
		"q\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3\60\3\2\2\2\u00f4\u00f7\5\63\32\2\u00f5\u00f7\5\65\33\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\62\3\2\2\2\u00f8\u00f9\7\62\2"+
		"\2\u00f9\u00fa\7z\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5;\36\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\64\3\2\2\2\u0100\u0102\5\67\34\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\66\3\2\2\2\u0105\u0106"+
		"\t\2\2\2\u01068\3\2\2\2\u0107\u0108\t\3\2\2\u0108:\3\2\2\2\u0109\u010a"+
		"\t\4\2\2\u010a<\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e"+
		"\7w\2\2\u010e\u0115\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0115\7g\2\2\u0114\u010b\3\2\2"+
		"\2\u0114\u010f\3\2\2\2\u0115>\3\2\2\2\u0116\u0117\7)\2\2\u0117\u0118\5"+
		"A!\2\u0118\u0119\7)\2\2\u0119\u011f\3\2\2\2\u011a\u011b\7)\2\2\u011b\u011c"+
		"\5I%\2\u011c\u011d\7)\2\2\u011d\u011f\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
		"\u011a\3\2\2\2\u011f@\3\2\2\2\u0120\u0121\n\5\2\2\u0121B\3\2\2\2\u0122"+
		"\u0124\7$\2\2\u0123\u0125\5E#\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2"+
		"\2\u0125\u0126\3\2\2\2\u0126\u0127\7$\2\2\u0127D\3\2\2\2\u0128\u012a\5"+
		"G$\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cF\3\2\2\2\u012d\u0130\n\5\2\2\u012e\u0130\5I%\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130H\3\2\2\2\u0131\u0132\7^\2\2\u0132"+
		"\u0133\t\6\2\2\u0133J\3\2\2\2\u0134\u0138\5M\'\2\u0135\u0137\5O(\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139L\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\t\7\2\2\u013cN\3\2"+
		"\2\2\u013d\u0140\5M\'\2\u013e\u0140\5\67\34\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140P\3\2\2\2\u0141\u0147\5S*\2\u0142\u0147\5U+\2\u0143"+
		"\u0147\5W,\2\u0144\u0147\5Y-\2\u0145\u0147\5[.\2\u0146\u0141\3\2\2\2\u0146"+
		"\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2"+
		"\2\2\u0147R\3\2\2\2\u0148\u0149\7,\2\2\u0149T\3\2\2\2\u014a\u014b\7\61"+
		"\2\2\u014bV\3\2\2\2\u014c\u014d\7-\2\2\u014dX\3\2\2\2\u014e\u014f\7/\2"+
		"\2\u014fZ\3\2\2\2\u0150\u0151\7\'\2\2\u0151\\\3\2\2\2\u0152\u0157\5_\60"+
		"\2\u0153\u0157\5a\61\2\u0154\u0157\5c\62\2\u0155\u0157\5e\63\2\u0156\u0152"+
		"\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"^\3\2\2\2\u0158\u0159\7@\2\2\u0159`\3\2\2\2\u015a\u015b\7>\2\2\u015bb"+
		"\3\2\2\2\u015c\u015d\7@\2\2\u015d\u015e\7?\2\2\u015ed\3\2\2\2\u015f\u0160"+
		"\7>\2\2\u0160\u0161\7?\2\2\u0161f\3\2\2\2\u0162\u0165\5i\65\2\u0163\u0165"+
		"\5k\66\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165h\3\2\2\2\u0166"+
		"\u0167\7?\2\2\u0167\u0168\7?\2\2\u0168j\3\2\2\2\u0169\u016a\7#\2\2\u016a"+
		"\u016b\7?\2\2\u016bl\3\2\2\2\u016c\u016f\5o8\2\u016d\u016f\5q9\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fn\3\2\2\2\u0170\u0171\7(\2\2\u0171"+
		"\u0172\7(\2\2\u0172p\3\2\2\2\u0173\u0174\7~\2\2\u0174\u0175\7~\2\2\u0175"+
		"r\3\2\2\2\u0176\u017a\5u;\2\u0177\u017a\5w<\2\u0178\u017a\5y=\2\u0179"+
		"\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017at\3\2\2\2"+
		"\u017b\u017c\7?\2\2\u017cv\3\2\2\2\u017d\u017e\7-\2\2\u017e\u017f\7?\2"+
		"\2\u017fx\3\2\2\2\u0180\u0181\7/\2\2\u0181\u0182\7?\2\2\u0182z\3\2\2\2"+
		"\u0183\u0184\7#\2\2\u0184|\3\2\2\2\u0185\u0186\7\61\2\2\u0186\u0187\7"+
		"\61\2\2\u0187\u018b\3\2\2\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7\17\2\2\u018f\u018e\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\f\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\b?\2\2\u0194~\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197"+
		"\7,\2\2\u0197\u019b\3\2\2\2\u0198\u019a\13\2\2\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7,\2\2\u019f\u01a0\7\61\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\b@\2\2\u01a2\u0080\3\2\2\2\u01a3\u01a5\t\b"+
		"\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\bA\2\2\u01a9\u0082\3\2"+
		"\2\2\26\2\u00f6\u00fe\u0103\u0114\u011e\u0124\u012b\u012f\u0138\u013f"+
		"\u0146\u0156\u0164\u016e\u0179\u018b\u018f\u019b\u01a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}