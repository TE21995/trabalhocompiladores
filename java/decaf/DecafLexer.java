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
		LCURLY=1, RCURLY=2, LBAR=3, RBAR=4, LPA=5, RPA=6, PV=7, VIG=8, TK_class=9, 
		BOOLEAN=10, BREAK=11, CALLOUT=12, CLASS=13, CONTINUE=14, ELSE=15, FOR=16, 
		INT=17, RETURN=18, VOID=19, IF=20, FALSE=21, TRUE=22, FORPAR=23, BINOPS=24, 
		ARITMOP=25, OPSOMA=26, OPSUBT=27, OPDIVI=28, OPMULT=29, OPREMA=30, RELOP=31, 
		BGTOP=32, SMTOP=33, BGEQTOP=34, SMEQTOP=35, COMPOP=36, ISEQUAL=37, NOTEQUAL=38, 
		CONDOP=39, CONDAND=40, CONDOR=41, ASOP=42, LIT=43, INTLIT=44, BOOLEANLITERAL=45, 
		CHARLIT=46, STRINGLIT=47, ID=48, LCOMMENT=49, SCOMMENT=50, WS=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "VIG", "TK_class", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "BINOPS", "ARITMOP", 
		"OPSOMA", "OPSUBT", "OPDIVI", "OPMULT", "OPREMA", "RELOP", "BGTOP", "SMTOP", 
		"BGEQTOP", "SMEQTOP", "COMPOP", "ISEQUAL", "NOTEQUAL", "CONDOP", "CONDAND", 
		"CONDOR", "ASOP", "LIT", "INTLIT", "HEXADECIMAL", "DECIMAL", "DIGIT", 
		"OCTAL", "HEXA", "BOOLEANLITERAL", "CHARLIT", "SINGLE_CHARACTER", "STRINGLIT", 
		"STRING_CHARACTERS", "STRING_CHARACTER", "ESC", "ID", "ALPHA", "ALPHANUM", 
		"LCOMMENT", "SCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'class Program'", 
		"'boolean'", "'break'", "'callout'", "'class'", "'continue'", "'else'", 
		"'for'", "'int'", "'return'", "'void'", "'if'", "'false'", "'true'", "'forpar'", 
		null, null, "'+'", "'-'", "'/'", "'*'", "'%'", null, "'>'", "'<'", "'>='", 
		"'<='", null, "'=='", "'!='", null, "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBAR", "RBAR", "LPA", "RPA", "PV", "VIG", "TK_class", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FOR", "INT", 
		"RETURN", "VOID", "IF", "FALSE", "TRUE", "FORPAR", "BINOPS", "ARITMOP", 
		"OPSOMA", "OPSUBT", "OPDIVI", "OPMULT", "OPREMA", "RELOP", "BGTOP", "SMTOP", 
		"BGEQTOP", "SMEQTOP", "COMPOP", "ISEQUAL", "NOTEQUAL", "CONDOP", "CONDAND", 
		"CONDOR", "ASOP", "LIT", "INTLIT", "BOOLEANLITERAL", "CHARLIT", "STRINGLIT", 
		"ID", "LCOMMENT", "SCOMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u01ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5"+
		"\31\u00f5\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00fc\n\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u010c\n \3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\5%\u011a\n%\3&\3&\3&\3\'\3\'\3\'\3(\3(\5"+
		"(\u0124\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\5+\u0131\n+\3,\3,\3,\5,\u0136"+
		"\n,\3-\3-\5-\u013a\n-\3.\3.\3.\3.\6.\u0140\n.\r.\16.\u0141\3/\3/\7/\u0146"+
		"\n/\f/\16/\u0149\13/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u015a\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0164\n\64\3\65\3\65\3\66\3\66\5\66\u016a\n\66\3\66\3"+
		"\66\3\67\6\67\u016f\n\67\r\67\16\67\u0170\38\38\58\u0175\n8\39\39\39\3"+
		":\3:\7:\u017c\n:\f:\16:\u017f\13:\3;\3;\3<\3<\5<\u0185\n<\3=\3=\3=\3="+
		"\7=\u018b\n=\f=\16=\u018e\13=\3=\5=\u0191\n=\3=\3=\3=\3=\3>\3>\3>\3>\7"+
		">\u019b\n>\f>\16>\u019e\13>\3>\3>\3>\3>\3>\3?\6?\u01a6\n?\r?\16?\u01a7"+
		"\3?\3?\4\u018c\u019c\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c\2"+
		"e/g\60i\2k\61m\2o\2q\2s\62u\2w\2y\63{\64}\65\3\2\n\3\2\63;\3\2\62;\3\2"+
		"\629\5\2\62;CHch\5\2$$))^^\t\2$$))^^hhppttvv\5\2C\\aac|\5\2\13\f\17\17"+
		"\"\"\u01bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2"+
		"\2\2\2s\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0081"+
		"\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2"+
		"\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u009d\3\2\2"+
		"\2\27\u00a5\3\2\2\2\31\u00ab\3\2\2\2\33\u00b3\3\2\2\2\35\u00b9\3\2\2\2"+
		"\37\u00c2\3\2\2\2!\u00c7\3\2\2\2#\u00cb\3\2\2\2%\u00cf\3\2\2\2\'\u00d6"+
		"\3\2\2\2)\u00db\3\2\2\2+\u00de\3\2\2\2-\u00e4\3\2\2\2/\u00e9\3\2\2\2\61"+
		"\u00f4\3\2\2\2\63\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0101"+
		"\3\2\2\2;\u0103\3\2\2\2=\u0105\3\2\2\2?\u010b\3\2\2\2A\u010d\3\2\2\2C"+
		"\u010f\3\2\2\2E\u0111\3\2\2\2G\u0114\3\2\2\2I\u0119\3\2\2\2K\u011b\3\2"+
		"\2\2M\u011e\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u0130"+
		"\3\2\2\2W\u0135\3\2\2\2Y\u0139\3\2\2\2[\u013b\3\2\2\2]\u0143\3\2\2\2_"+
		"\u014a\3\2\2\2a\u014c\3\2\2\2c\u014e\3\2\2\2e\u0159\3\2\2\2g\u0163\3\2"+
		"\2\2i\u0165\3\2\2\2k\u0167\3\2\2\2m\u016e\3\2\2\2o\u0174\3\2\2\2q\u0176"+
		"\3\2\2\2s\u0179\3\2\2\2u\u0180\3\2\2\2w\u0184\3\2\2\2y\u0186\3\2\2\2{"+
		"\u0196\3\2\2\2}\u01a5\3\2\2\2\177\u0080\7}\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7\177\2\2\u0082\6\3\2\2\2\u0083\u0084\7]\2\2\u0084\b\3\2\2\2\u0085\u0086"+
		"\7_\2\2\u0086\n\3\2\2\2\u0087\u0088\7*\2\2\u0088\f\3\2\2\2\u0089\u008a"+
		"\7+\2\2\u008a\16\3\2\2\2\u008b\u008c\7=\2\2\u008c\20\3\2\2\2\u008d\u008e"+
		"\7.\2\2\u008e\22\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\u0095\7\"\2\2\u0095"+
		"\u0096\7R\2\2\u0096\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098\u0099\7i\2\2"+
		"\u0099\u009a\7t\2\2\u009a\u009b\7c\2\2\u009b\u009c\7o\2\2\u009c\24\3\2"+
		"\2\2\u009d\u009e\7d\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1"+
		"\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\26\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7m\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\u00b1\7w\2\2\u00b1\u00b2\7v\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7"+
		"e\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7u\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7g\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6 \3\2\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00ca\"\3\2\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce$\3\2\2\2\u00cf"+
		"\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7w\2\2"+
		"\u00d3\u00d4\7t\2\2\u00d4\u00d5\7p\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7x\2"+
		"\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7f\2\2\u00da(\3\2"+
		"\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd*\3\2\2\2\u00de\u00df"+
		"\7h\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7w\2\2\u00e7\u00e8\7g\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7c\2\2"+
		"\u00ee\u00ef\7t\2\2\u00ef\60\3\2\2\2\u00f0\u00f5\5\63\32\2\u00f1\u00f5"+
		"\5? \2\u00f2\u00f5\5I%\2\u00f3\u00f5\5O(\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\62\3\2\2\2\u00f6"+
		"\u00fc\5\65\33\2\u00f7\u00fc\5\67\34\2\u00f8\u00fc\59\35\2\u00f9\u00fc"+
		"\5;\36\2\u00fa\u00fc\5=\37\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\64\3\2\2"+
		"\2\u00fd\u00fe\7-\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7/\2\2\u01008\3\2\2"+
		"\2\u0101\u0102\7\61\2\2\u0102:\3\2\2\2\u0103\u0104\7,\2\2\u0104<\3\2\2"+
		"\2\u0105\u0106\7\'\2\2\u0106>\3\2\2\2\u0107\u010c\5A!\2\u0108\u010c\5"+
		"C\"\2\u0109\u010c\5E#\2\u010a\u010c\5G$\2\u010b\u0107\3\2\2\2\u010b\u0108"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c@\3\2\2\2\u010d"+
		"\u010e\7@\2\2\u010eB\3\2\2\2\u010f\u0110\7>\2\2\u0110D\3\2\2\2\u0111\u0112"+
		"\7@\2\2\u0112\u0113\7?\2\2\u0113F\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116"+
		"\7?\2\2\u0116H\3\2\2\2\u0117\u011a\5K&\2\u0118\u011a\5M\'\2\u0119\u0117"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011aJ\3\2\2\2\u011b\u011c\7?\2\2\u011c\u011d"+
		"\7?\2\2\u011dL\3\2\2\2\u011e\u011f\7#\2\2\u011f\u0120\7?\2\2\u0120N\3"+
		"\2\2\2\u0121\u0124\5Q)\2\u0122\u0124\5S*\2\u0123\u0121\3\2\2\2\u0123\u0122"+
		"\3\2\2\2\u0124P\3\2\2\2\u0125\u0126\7(\2\2\u0126\u0127\7(\2\2\u0127R\3"+
		"\2\2\2\u0128\u0129\7~\2\2\u0129\u012a\7~\2\2\u012aT\3\2\2\2\u012b\u0131"+
		"\7?\2\2\u012c\u012d\7-\2\2\u012d\u0131\7?\2\2\u012e\u012f\7/\2\2\u012f"+
		"\u0131\7?\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131V\3\2\2\2\u0132\u0136\5Y-\2\u0133\u0136\5g\64\2\u0134\u0136"+
		"\5e\63\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"X\3\2\2\2\u0137\u013a\5[.\2\u0138\u013a\5]/\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013aZ\3\2\2\2\u013b\u013c\7\62\2\2\u013c\u013d\7z\2\2"+
		"\u013d\u013f\3\2\2\2\u013e\u0140\5c\62\2\u013f\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\\\3\2\2\2\u0143"+
		"\u0147\5_\60\2\u0144\u0146\t\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148^\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014b\t\3\2\2\u014b`\3\2\2\2\u014c\u014d\t\4\2\2\u014d"+
		"b\3\2\2\2\u014e\u014f\t\5\2\2\u014fd\3\2\2\2\u0150\u0151\7v\2\2\u0151"+
		"\u0152\7t\2\2\u0152\u0153\7w\2\2\u0153\u015a\7g\2\2\u0154\u0155\7h\2\2"+
		"\u0155\u0156\7c\2\2\u0156\u0157\7n\2\2\u0157\u0158\7u\2\2\u0158\u015a"+
		"\7g\2\2\u0159\u0150\3\2\2\2\u0159\u0154\3\2\2\2\u015af\3\2\2\2\u015b\u015c"+
		"\7)\2\2\u015c\u015d\5i\65\2\u015d\u015e\7)\2\2\u015e\u0164\3\2\2\2\u015f"+
		"\u0160\7)\2\2\u0160\u0161\5q9\2\u0161\u0162\7)\2\2\u0162\u0164\3\2\2\2"+
		"\u0163\u015b\3\2\2\2\u0163\u015f\3\2\2\2\u0164h\3\2\2\2\u0165\u0166\n"+
		"\6\2\2\u0166j\3\2\2\2\u0167\u0169\7$\2\2\u0168\u016a\5m\67\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7$\2\2\u016c"+
		"l\3\2\2\2\u016d\u016f\5o8\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171n\3\2\2\2\u0172\u0175\n\6\2\2"+
		"\u0173\u0175\5q9\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175p\3\2"+
		"\2\2\u0176\u0177\7^\2\2\u0177\u0178\t\7\2\2\u0178r\3\2\2\2\u0179\u017d"+
		"\5u;\2\u017a\u017c\5w<\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017et\3\2\2\2\u017f\u017d\3\2\2\2"+
		"\u0180\u0181\t\b\2\2\u0181v\3\2\2\2\u0182\u0185\5u;\2\u0183\u0185\5_\60"+
		"\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185x\3\2\2\2\u0186\u0187"+
		"\7\61\2\2\u0187\u0188\7\61\2\2\u0188\u018c\3\2\2\2\u0189\u018b\13\2\2"+
		"\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018d\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\7\17\2\2"+
		"\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\7\f\2\2\u0193\u0194\3\2\2\2\u0194\u0195\b=\2\2\u0195z\3\2\2\2\u0196\u0197"+
		"\7\61\2\2\u0197\u0198\7,\2\2\u0198\u019c\3\2\2\2\u0199\u019b\13\2\2\2"+
		"\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019d\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7,\2\2\u01a0"+
		"\u01a1\7\61\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b>\2\2\u01a3|\3\2\2\2"+
		"\u01a4\u01a6\t\t\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b?\2\2\u01aa"+
		"~\3\2\2\2\30\2\u00f4\u00fb\u010b\u0119\u0123\u0130\u0135\u0139\u0141\u0147"+
		"\u0159\u0163\u0169\u0170\u0174\u017d\u0184\u018c\u0190\u019c\u01a7\3\b"+
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