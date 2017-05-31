// Generated from /home/uniceub/thomas/trabalhocompiladores/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_tyinit = 2, RULE_method_decl = 3, 
		RULE_block = 4, RULE_var_decl = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_methodcall = 8, RULE_methodnome = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_lit = 12, RULE_binops = 13, RULE_aritmop = 14, RULE_relop = 15, RULE_compop = 16, 
		RULE_condop = 17, RULE_asop = 18, RULE_calloutarg = 19;
	public static final String[] ruleNames = {
		"program", "field_decl", "tyinit", "method_decl", "block", "var_decl", 
		"type", "statement", "methodcall", "methodnome", "location", "expr", "lit", 
		"binops", "aritmop", "relop", "compop", "condop", "asop", "calloutarg"
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

	@Override
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode TKCLASS() { return getToken(DecafParser.TKCLASS, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TKCLASS);
			setState(41);
			match(LCURLY);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					field_decl();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(48);
				method_decl();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(RCURLY);
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

	public static class Field_declContext extends ParserRuleContext {
		public TyinitContext tyinit() {
			return getRuleContext(TyinitContext.class,0);
		}
		public TerminalNode PV() { return getToken(DecafParser.PV, 0); }
		public List<TerminalNode> VIG() { return getTokens(DecafParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(DecafParser.VIG, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> LBAR() { return getTokens(DecafParser.LBAR); }
		public TerminalNode LBAR(int i) {
			return getToken(DecafParser.LBAR, i);
		}
		public List<TerminalNode> INTLIT() { return getTokens(DecafParser.INTLIT); }
		public TerminalNode INTLIT(int i) {
			return getToken(DecafParser.INTLIT, i);
		}
		public List<TerminalNode> RBAR() { return getTokens(DecafParser.RBAR); }
		public TerminalNode RBAR(int i) {
			return getToken(DecafParser.RBAR, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			tyinit();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					match(VIG);
					setState(58);
					type();
					setState(59);
					match(ID);
					setState(60);
					match(LBAR);
					setState(61);
					match(INTLIT);
					setState(62);
					match(RBAR);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(69);
				match(VIG);
				setState(70);
				type();
				setState(71);
				match(ID);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(PV);
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

	public static class TyinitContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBAR() { return getToken(DecafParser.LBAR, 0); }
		public TerminalNode INTLIT() { return getToken(DecafParser.INTLIT, 0); }
		public TerminalNode RBAR() { return getToken(DecafParser.RBAR, 0); }
		public TyinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterTyinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitTyinit(this);
		}
	}

	public final TyinitContext tyinit() throws RecognitionException {
		TyinitContext _localctx = new TyinitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tyinit);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				type();
				setState(81);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				type();
				setState(84);
				match(ID);
				setState(85);
				match(LBAR);
				setState(86);
				match(INTLIT);
				setState(87);
				match(RBAR);
				}
				break;
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

	public static class Method_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LPA() { return getToken(DecafParser.LPA, 0); }
		public TerminalNode RPA() { return getToken(DecafParser.RPA, 0); }
		public List<TerminalNode> VIG() { return getTokens(DecafParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(DecafParser.VIG, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(91);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case INT:
				{
				setState(92);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(96);
				match(LPA);
				setState(97);
				type();
				setState(98);
				match(ID);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(99);
					match(VIG);
					setState(100);
					type();
					setState(101);
					match(ID);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(RPA);
				}
				break;
			case 2:
				{
				setState(110);
				match(LPA);
				setState(111);
				match(RPA);
				}
				break;
			}
			setState(114);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LCURLY);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(117);
				var_decl();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(123);
				statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RCURLY);
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PV() { return getToken(DecafParser.PV, 0); }
		public List<TerminalNode> VIG() { return getTokens(DecafParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(DecafParser.VIG, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			type();
			setState(132);
			match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(133);
				match(VIG);
				setState(134);
				match(ID);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(PV);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public AsopContext asop() {
			return getRuleContext(AsopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(DecafParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(DecafParser.PV, i);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode LPA() { return getToken(DecafParser.LPA, 0); }
		public TerminalNode RPA() { return getToken(DecafParser.RPA, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(DecafParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(DecafParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(DecafParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(DecafParser.RCURLY, i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EQU() { return getToken(DecafParser.EQU, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				location();
				setState(145);
				asop();
				setState(146);
				expr(0);
				setState(147);
				match(PV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				methodcall();
				setState(150);
				match(PV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(IF);
				setState(153);
				match(LPA);
				setState(154);
				expr(0);
				setState(155);
				match(RPA);
				setState(156);
				match(LCURLY);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOLEAN || _la==INT) {
					{
					{
					setState(157);
					var_decl();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(163);
					statement();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RCURLY);
				setState(185);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(170);
					match(ELSE);
					setState(171);
					match(LCURLY);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BOOLEAN || _la==INT) {
						{
						{
						setState(172);
						var_decl();
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
						{
						{
						setState(178);
						statement();
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(184);
					match(RCURLY);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(FOR);
				setState(188);
				match(ID);
				setState(189);
				match(EQU);
				setState(190);
				expr(0);
				setState(191);
				match(PV);
				setState(192);
				expr(0);
				setState(193);
				match(PV);
				setState(194);
				match(LCURLY);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOLEAN || _la==INT) {
					{
					{
					setState(195);
					var_decl();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(201);
					statement();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(RCURLY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(RETURN);
				setState(211);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPA) | (1L << CALLOUT) | (1L << INTLIT) | (1L << BOOLEANLITERAL) | (1L << CHARLIT) | (1L << ID) | (1L << SUBT) | (1L << EXC))) != 0)) {
					{
					setState(210);
					expr(0);
					}
				}

				setState(213);
				match(PV);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(BREAK);
				setState(215);
				match(PV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				match(CONTINUE);
				setState(217);
				match(PV);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				block();
				}
				break;
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

	public static class MethodcallContext extends ParserRuleContext {
		public MethodnomeContext methodnome() {
			return getRuleContext(MethodnomeContext.class,0);
		}
		public TerminalNode LPA() { return getToken(DecafParser.LPA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPA() { return getToken(DecafParser.RPA, 0); }
		public List<TerminalNode> VIG() { return getTokens(DecafParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(DecafParser.VIG, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRINGLIT() { return getToken(DecafParser.STRINGLIT, 0); }
		public List<CalloutargContext> calloutarg() {
			return getRuleContexts(CalloutargContext.class);
		}
		public CalloutargContext calloutarg(int i) {
			return getRuleContext(CalloutargContext.class,i);
		}
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodcall(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodcall);
		int _la;
		try {
			setState(248);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				methodnome();
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(222);
					match(LPA);
					setState(223);
					expr(0);
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIG) {
						{
						{
						setState(224);
						match(VIG);
						setState(225);
						expr(0);
						}
						}
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(231);
					match(RPA);
					}
					break;
				case 2:
					{
					setState(233);
					match(LPA);
					setState(234);
					match(RPA);
					}
					break;
				}
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(CALLOUT);
				setState(238);
				match(LPA);
				setState(239);
				match(STRINGLIT);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(240);
					match(VIG);
					setState(241);
					calloutarg();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(RPA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MethodnomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public MethodnomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodnome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodnome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodnome(this);
		}
	}

	public final MethodnomeContext methodnome() throws RecognitionException {
		MethodnomeContext _localctx = new MethodnomeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodnome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ID);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBAR() { return getToken(DecafParser.LBAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBAR() { return getToken(DecafParser.RBAR, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_location);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(ID);
				setState(254);
				match(LBAR);
				setState(255);
				expr(0);
				setState(256);
				match(RBAR);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode SUBT() { return getToken(DecafParser.SUBT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXC() { return getToken(DecafParser.EXC, 0); }
		public TerminalNode LPA() { return getToken(DecafParser.LPA, 0); }
		public TerminalNode RPA() { return getToken(DecafParser.RPA, 0); }
		public BinopsContext binops() {
			return getRuleContext(BinopsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(261);
				location();
				}
				break;
			case 2:
				{
				setState(262);
				methodcall();
				}
				break;
			case 3:
				{
				setState(263);
				lit();
				}
				break;
			case 4:
				{
				setState(264);
				match(SUBT);
				setState(265);
				expr(4);
				}
				break;
			case 5:
				{
				setState(266);
				match(EXC);
				setState(267);
				expr(2);
				}
				break;
			case 6:
				{
				setState(268);
				match(LPA);
				setState(269);
				expr(0);
				setState(270);
				match(RPA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(274);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(275);
					binops();
					setState(276);
					expr(4);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LitContext extends ParserRuleContext {
		public TerminalNode INTLIT() { return getToken(DecafParser.INTLIT, 0); }
		public TerminalNode CHARLIT() { return getToken(DecafParser.CHARLIT, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(DecafParser.BOOLEANLITERAL, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLit(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLIT) | (1L << BOOLEANLITERAL) | (1L << CHARLIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class BinopsContext extends ParserRuleContext {
		public AritmopContext aritmop() {
			return getRuleContext(AritmopContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public CondopContext condop() {
			return getRuleContext(CondopContext.class,0);
		}
		public BinopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBinops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBinops(this);
		}
	}

	public final BinopsContext binops() throws RecognitionException {
		BinopsContext _localctx = new BinopsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binops);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case MULT:
			case DIVI:
			case SOMA:
			case SUBT:
			case REMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				aritmop();
				}
				break;
			case BGTOP:
			case SMTOP:
			case BGEQTOP:
			case SMEQTOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				relop();
				}
				break;
			case ISEQUAL:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				compop();
				}
				break;
			case CONDAND:
			case CONDOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				condop();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AritmopContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(DecafParser.MULT, 0); }
		public TerminalNode DIVI() { return getToken(DecafParser.DIVI, 0); }
		public TerminalNode SOMA() { return getToken(DecafParser.SOMA, 0); }
		public TerminalNode SUBT() { return getToken(DecafParser.SUBT, 0); }
		public TerminalNode REMA() { return getToken(DecafParser.REMA, 0); }
		public AritmopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAritmop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAritmop(this);
		}
	}

	public final AritmopContext aritmop() throws RecognitionException {
		AritmopContext _localctx = new AritmopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aritmop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVI) | (1L << SOMA) | (1L << SUBT) | (1L << REMA))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode BGTOP() { return getToken(DecafParser.BGTOP, 0); }
		public TerminalNode SMTOP() { return getToken(DecafParser.SMTOP, 0); }
		public TerminalNode BGEQTOP() { return getToken(DecafParser.BGEQTOP, 0); }
		public TerminalNode SMEQTOP() { return getToken(DecafParser.SMEQTOP, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BGTOP) | (1L << SMTOP) | (1L << BGEQTOP) | (1L << SMEQTOP))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class CompopContext extends ParserRuleContext {
		public TerminalNode ISEQUAL() { return getToken(DecafParser.ISEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(DecafParser.NOTEQUAL, 0); }
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==ISEQUAL || _la==NOTEQUAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class CondopContext extends ParserRuleContext {
		public TerminalNode CONDAND() { return getToken(DecafParser.CONDAND, 0); }
		public TerminalNode CONDOR() { return getToken(DecafParser.CONDOR, 0); }
		public CondopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCondop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCondop(this);
		}
	}

	public final CondopContext condop() throws RecognitionException {
		CondopContext _localctx = new CondopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==CONDAND || _la==CONDOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class AsopContext extends ParserRuleContext {
		public TerminalNode EQU() { return getToken(DecafParser.EQU, 0); }
		public TerminalNode MOREQU() { return getToken(DecafParser.MOREQU, 0); }
		public TerminalNode LESSEQU() { return getToken(DecafParser.LESSEQU, 0); }
		public AsopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAsop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAsop(this);
		}
	}

	public final AsopContext asop() throws RecognitionException {
		AsopContext _localctx = new AsopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << MOREQU) | (1L << LESSEQU))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class CalloutargContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRINGLIT() { return getToken(DecafParser.STRINGLIT, 0); }
		public CalloutargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calloutarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCalloutarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCalloutarg(this);
		}
	}

	public final CalloutargContext calloutarg() throws RecognitionException {
		CalloutargContext _localctx = new CalloutargContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_calloutarg);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case LPA:
			case CALLOUT:
			case INTLIT:
			case BOOLEANLITERAL:
			case CHARLIT:
			case ID:
			case SUBT:
			case EXC:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				expr(0);
				}
				break;
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(STRINGLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0134\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\5\5`\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\5"+
		"\5s\n\5\3\5\3\5\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\7\6\177\n\6\f\6\16"+
		"\6\u0082\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa"+
		"\13\t\3\t\3\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\3\t\7\t\u00b6"+
		"\n\t\f\t\16\t\u00b9\13\t\3\t\5\t\u00bc\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00c7\n\t\f\t\16\t\u00ca\13\t\3\t\7\t\u00cd\n\t\f\t\16\t"+
		"\u00d0\13\t\3\t\3\t\3\t\3\t\5\t\u00d6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00de\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00e5\n\n\f\n\16\n\u00e8\13\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f5\n\n\f\n\16\n\u00f8"+
		"\13\n\3\n\5\n\u00fb\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0105\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0113\n\r\3\r\3"+
		"\r\3\r\3\r\7\r\u0119\n\r\f\r\16\r\u011c\13\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\5\17\u0124\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\5\25\u0132\n\25\3\25\2\3\30\26\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(\2\t\4\2\f\f\23\23\3\2\32\34\3\2\37#\3\2$\'\3\2()\3\2*"+
		"+\3\2,.\u0148\2*\3\2\2\2\4:\3\2\2\2\6[\3\2\2\2\b_\3\2\2\2\nv\3\2\2\2\f"+
		"\u0085\3\2\2\2\16\u0090\3\2\2\2\20\u00dd\3\2\2\2\22\u00fa\3\2\2\2\24\u00fc"+
		"\3\2\2\2\26\u0104\3\2\2\2\30\u0112\3\2\2\2\32\u011d\3\2\2\2\34\u0123\3"+
		"\2\2\2\36\u0125\3\2\2\2 \u0127\3\2\2\2\"\u0129\3\2\2\2$\u012b\3\2\2\2"+
		"&\u012d\3\2\2\2(\u0131\3\2\2\2*+\7\13\2\2+/\7\3\2\2,.\5\4\3\2-,\3\2\2"+
		"\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61/\3\2\2\2\62\64\5"+
		"\b\5\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\67\65\3\2\2\289\7\4\2\29\3\3\2\2\2:D\5\6\4\2;<\7\n\2\2<=\5\16\b\2"+
		"=>\7\36\2\2>?\7\5\2\2?@\7\32\2\2@A\7\6\2\2AC\3\2\2\2B;\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EM\3\2\2\2FD\3\2\2\2GH\7\n\2\2HI\5\16\b\2IJ\7\36"+
		"\2\2JL\3\2\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2"+
		"\2\2PQ\7\t\2\2Q\5\3\2\2\2RS\5\16\b\2ST\7\36\2\2T\\\3\2\2\2UV\5\16\b\2"+
		"VW\7\36\2\2WX\7\5\2\2XY\7\32\2\2YZ\7\6\2\2Z\\\3\2\2\2[R\3\2\2\2[U\3\2"+
		"\2\2\\\7\3\2\2\2]`\7\25\2\2^`\5\16\b\2_]\3\2\2\2_^\3\2\2\2`a\3\2\2\2a"+
		"r\7\36\2\2bc\7\7\2\2cd\5\16\b\2dk\7\36\2\2ef\7\n\2\2fg\5\16\b\2gh\7\36"+
		"\2\2hj\3\2\2\2ie\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2"+
		"\2\2no\7\b\2\2os\3\2\2\2pq\7\7\2\2qs\7\b\2\2rb\3\2\2\2rp\3\2\2\2st\3\2"+
		"\2\2tu\5\n\6\2u\t\3\2\2\2vz\7\3\2\2wy\5\f\7\2xw\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{\u0080\3\2\2\2|z\3\2\2\2}\177\5\20\t\2~}\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\7\4\2\2\u0084\13\3\2\2\2\u0085\u0086"+
		"\5\16\b\2\u0086\u008b\7\36\2\2\u0087\u0088\7\n\2\2\u0088\u008a\7\36\2"+
		"\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\t\2\2\u008f"+
		"\r\3\2\2\2\u0090\u0091\t\2\2\2\u0091\17\3\2\2\2\u0092\u0093\5\26\f\2\u0093"+
		"\u0094\5&\24\2\u0094\u0095\5\30\r\2\u0095\u0096\7\t\2\2\u0096\u00de\3"+
		"\2\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7\t\2\2\u0099\u00de\3\2\2\2\u009a"+
		"\u009b\7\26\2\2\u009b\u009c\7\7\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7"+
		"\b\2\2\u009e\u00a2\7\3\2\2\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a8\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00bb\7\4\2\2\u00ac\u00ad\7\21\2\2\u00ad"+
		"\u00b1\7\3\2\2\u00ae\u00b0\5\f\7\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bc\7\4\2\2\u00bb\u00ac\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00de\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\7\36\2\2\u00bf"+
		"\u00c0\7,\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5\30"+
		"\r\2\u00c3\u00c4\7\t\2\2\u00c4\u00c8\7\3\2\2\u00c5\u00c7\5\f\7\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\5\20\t\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\4\2\2\u00d2"+
		"\u00de\3\2\2\2\u00d3\u00d5\7\24\2\2\u00d4\u00d6\5\30\r\2\u00d5\u00d4\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00de\7\t\2\2\u00d8"+
		"\u00d9\7\r\2\2\u00d9\u00de\7\t\2\2\u00da\u00db\7\20\2\2\u00db\u00de\7"+
		"\t\2\2\u00dc\u00de\5\n\6\2\u00dd\u0092\3\2\2\2\u00dd\u0097\3\2\2\2\u00dd"+
		"\u009a\3\2\2\2\u00dd\u00bd\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d8\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\21\3\2\2\2\u00df\u00ed"+
		"\5\24\13\2\u00e0\u00e1\7\7\2\2\u00e1\u00e6\5\30\r\2\u00e2\u00e3\7\n\2"+
		"\2\u00e3\u00e5\5\30\r\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ec\7\7\2\2\u00ec"+
		"\u00ee\7\b\2\2\u00ed\u00e0\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00fb\3\2"+
		"\2\2\u00ef\u00f0\7\16\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f6\7\35\2\2\u00f2"+
		"\u00f3\7\n\2\2\u00f3\u00f5\5(\25\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fb\7\b\2\2\u00fa\u00df\3\2\2\2\u00fa\u00ef\3\2"+
		"\2\2\u00fb\23\3\2\2\2\u00fc\u00fd\7\36\2\2\u00fd\25\3\2\2\2\u00fe\u0105"+
		"\7\36\2\2\u00ff\u0100\7\36\2\2\u0100\u0101\7\5\2\2\u0101\u0102\5\30\r"+
		"\2\u0102\u0103\7\6\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff"+
		"\3\2\2\2\u0105\27\3\2\2\2\u0106\u0107\b\r\1\2\u0107\u0113\5\26\f\2\u0108"+
		"\u0113\5\22\n\2\u0109\u0113\5\32\16\2\u010a\u010b\7\"\2\2\u010b\u0113"+
		"\5\30\r\6\u010c\u010d\7/\2\2\u010d\u0113\5\30\r\4\u010e\u010f\7\7\2\2"+
		"\u010f\u0110\5\30\r\2\u0110\u0111\7\b\2\2\u0111\u0113\3\2\2\2\u0112\u0106"+
		"\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010a\3\2\2\2\u0112"+
		"\u010c\3\2\2\2\u0112\u010e\3\2\2\2\u0113\u011a\3\2\2\2\u0114\u0115\f\5"+
		"\2\2\u0115\u0116\5\34\17\2\u0116\u0117\5\30\r\6\u0117\u0119\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\31\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\t\3\2\2\u011e\33"+
		"\3\2\2\2\u011f\u0124\5\36\20\2\u0120\u0124\5 \21\2\u0121\u0124\5\"\22"+
		"\2\u0122\u0124\5$\23\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0122\3\2\2\2\u0124\35\3\2\2\2\u0125\u0126\t\4\2\2\u0126"+
		"\37\3\2\2\2\u0127\u0128\t\5\2\2\u0128!\3\2\2\2\u0129\u012a\t\6\2\2\u012a"+
		"#\3\2\2\2\u012b\u012c\t\7\2\2\u012c%\3\2\2\2\u012d\u012e\t\b\2\2\u012e"+
		"\'\3\2\2\2\u012f\u0132\5\30\r\2\u0130\u0132\7\35\2\2\u0131\u012f\3\2\2"+
		"\2\u0131\u0130\3\2\2\2\u0132)\3\2\2\2\37/\65DM[_krz\u0080\u008b\u00a2"+
		"\u00a8\u00b1\u00b7\u00bb\u00c8\u00ce\u00d5\u00dd\u00e6\u00ed\u00f6\u00fa"+
		"\u0104\u0112\u011a\u0123\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}