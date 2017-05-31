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
		BOOLEANLITERAL=25, CHARLIT=26, STRINGLIT=27, ID=28, ARITMOP=29, OPMULT=30, 
		OPDIVI=31, OPSOMA=32, OPSUBT=33, OPREMA=34, RELOP=35, BGTOP=36, SMTOP=37, 
		BGEQTOP=38, SMEQTOP=39, COMPOP=40, ISEQUAL=41, NOTEQUAL=42, CONDOP=43, 
		CONDAND=44, CONDOR=45, ASOP=46, EQU=47, MOREQU=48, LESSEQU=49, EXC=50, 
		LCOMMENT=51, SCOMMENT=52, WS=53;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_tyinit = 2, RULE_method_decl = 3, 
		RULE_block = 4, RULE_var_decl = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_methodcall = 8, RULE_methodnome = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_lit = 12, RULE_binops = 13, RULE_calloutarg = 14;
	public static final String[] ruleNames = {
		"program", "field_decl", "tyinit", "method_decl", "block", "var_decl", 
		"type", "statement", "methodcall", "methodnome", "location", "expr", "lit", 
		"binops", "calloutarg"
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
			setState(30);
			match(TKCLASS);
			setState(31);
			match(LCURLY);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					field_decl();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(38);
				method_decl();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(46);
			tyinit();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(VIG);
					setState(48);
					type();
					setState(49);
					match(ID);
					setState(50);
					match(LBAR);
					setState(51);
					match(INTLIT);
					setState(52);
					match(RBAR);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(59);
				match(VIG);
				setState(60);
				type();
				setState(61);
				match(ID);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				type();
				setState(71);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				type();
				setState(74);
				match(ID);
				setState(75);
				match(LBAR);
				setState(76);
				match(INTLIT);
				setState(77);
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
			setState(83);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(81);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case INT:
				{
				setState(82);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85);
			match(ID);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(86);
				match(LPA);
				setState(87);
				type();
				setState(88);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(89);
					match(VIG);
					setState(90);
					type();
					setState(91);
					match(ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(RPA);
				}
				break;
			case 2:
				{
				setState(100);
				match(LPA);
				setState(101);
				match(RPA);
				}
				break;
			}
			setState(104);
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
			setState(106);
			match(LCURLY);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(107);
				var_decl();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
			setState(121);
			type();
			setState(122);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(123);
				match(VIG);
				setState(124);
				match(ID);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(132);
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
		public TerminalNode ASOP() { return getToken(DecafParser.ASOP, 0); }
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				location();
				setState(135);
				match(ASOP);
				setState(136);
				expr(0);
				setState(137);
				match(PV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				methodcall();
				setState(140);
				match(PV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(IF);
				setState(143);
				match(LPA);
				setState(144);
				expr(0);
				setState(145);
				match(RPA);
				setState(146);
				match(LCURLY);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOLEAN || _la==INT) {
					{
					{
					setState(147);
					var_decl();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(153);
					statement();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(RCURLY);
				setState(175);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(160);
					match(ELSE);
					setState(161);
					match(LCURLY);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BOOLEAN || _la==INT) {
						{
						{
						setState(162);
						var_decl();
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
						{
						{
						setState(168);
						statement();
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(174);
					match(RCURLY);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(FOR);
				setState(178);
				match(ID);
				setState(179);
				match(EQU);
				setState(180);
				expr(0);
				setState(181);
				match(PV);
				setState(182);
				expr(0);
				setState(183);
				match(PV);
				setState(184);
				match(LCURLY);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOLEAN || _la==INT) {
					{
					{
					setState(185);
					var_decl();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(191);
					statement();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(RCURLY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(RETURN);
				setState(201);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPA) | (1L << CALLOUT) | (1L << INTLIT) | (1L << BOOLEANLITERAL) | (1L << CHARLIT) | (1L << ID) | (1L << OPSUBT) | (1L << EXC))) != 0)) {
					{
					setState(200);
					expr(0);
					}
				}

				setState(203);
				match(PV);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(BREAK);
				setState(205);
				match(PV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(CONTINUE);
				setState(207);
				match(PV);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
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
			setState(238);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				methodnome();
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(212);
					match(LPA);
					setState(213);
					expr(0);
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIG) {
						{
						{
						setState(214);
						match(VIG);
						setState(215);
						expr(0);
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(221);
					match(RPA);
					}
					break;
				case 2:
					{
					setState(223);
					match(LPA);
					setState(224);
					match(RPA);
					}
					break;
				}
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(CALLOUT);
				setState(228);
				match(LPA);
				setState(229);
				match(STRINGLIT);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(230);
					match(VIG);
					setState(231);
					calloutarg();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
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
			setState(240);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(ID);
				setState(244);
				match(LBAR);
				setState(245);
				expr(0);
				setState(246);
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
		public TerminalNode OPSUBT() { return getToken(DecafParser.OPSUBT, 0); }
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(251);
				location();
				}
				break;
			case 2:
				{
				setState(252);
				methodcall();
				}
				break;
			case 3:
				{
				setState(253);
				lit();
				}
				break;
			case 4:
				{
				setState(254);
				match(OPSUBT);
				setState(255);
				expr(4);
				}
				break;
			case 5:
				{
				setState(256);
				match(EXC);
				setState(257);
				expr(2);
				}
				break;
			case 6:
				{
				setState(258);
				match(LPA);
				setState(259);
				expr(0);
				setState(260);
				match(RPA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
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
					setState(264);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(265);
					binops();
					setState(266);
					expr(4);
					}
					} 
				}
				setState(272);
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
			setState(273);
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
		public TerminalNode ARITMOP() { return getToken(DecafParser.ARITMOP, 0); }
		public TerminalNode RELOP() { return getToken(DecafParser.RELOP, 0); }
		public TerminalNode COMPOP() { return getToken(DecafParser.COMPOP, 0); }
		public TerminalNode CONDOP() { return getToken(DecafParser.CONDOP, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARITMOP) | (1L << RELOP) | (1L << COMPOP) | (1L << CONDOP))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_calloutarg);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case LPA:
			case CALLOUT:
			case INTLIT:
			case BOOLEANLITERAL:
			case CHARLIT:
			case ID:
			case OPSUBT:
			case EXC:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				expr(0);
				}
				break;
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3"+
		"\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\5\3"+
		"\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\3"+
		"\5\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\7"+
		"\6u\n\6\f\6\16\6x\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7"+
		"\u0083\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\t\7\t\u009d\n\t\f\t"+
		"\16\t\u00a0\13\t\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3\t"+
		"\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\t\5\t\u00b2\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3\t\7\t\u00c3\n\t"+
		"\f\t\16\t\u00c6\13\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00d4\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00db\n\n\f\n\16\n\u00de\13"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00e4\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u00eb\n\n\f\n"+
		"\16\n\u00ee\13\n\3\n\5\n\u00f1\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00fb\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0109"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u010f\n\r\f\r\16\r\u0112\13\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\5\20\u011a\n\20\3\20\2\3\30\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\5\4\2\f\f\23\23\3\2\32\34\6\2\37\37%%**--\u0132\2 \3"+
		"\2\2\2\4\60\3\2\2\2\6Q\3\2\2\2\bU\3\2\2\2\nl\3\2\2\2\f{\3\2\2\2\16\u0086"+
		"\3\2\2\2\20\u00d3\3\2\2\2\22\u00f0\3\2\2\2\24\u00f2\3\2\2\2\26\u00fa\3"+
		"\2\2\2\30\u0108\3\2\2\2\32\u0113\3\2\2\2\34\u0115\3\2\2\2\36\u0119\3\2"+
		"\2\2 !\7\13\2\2!%\7\3\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%"+
		"&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\4\2\2/\3\3\2\2\2\60:\5\6\4\2\61\62"+
		"\7\n\2\2\62\63\5\16\b\2\63\64\7\36\2\2\64\65\7\5\2\2\65\66\7\32\2\2\66"+
		"\67\7\6\2\2\679\3\2\2\28\61\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;C\3"+
		"\2\2\2<:\3\2\2\2=>\7\n\2\2>?\5\16\b\2?@\7\36\2\2@B\3\2\2\2A=\3\2\2\2B"+
		"E\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\t\2\2G\5\3\2\2\2"+
		"HI\5\16\b\2IJ\7\36\2\2JR\3\2\2\2KL\5\16\b\2LM\7\36\2\2MN\7\5\2\2NO\7\32"+
		"\2\2OP\7\6\2\2PR\3\2\2\2QH\3\2\2\2QK\3\2\2\2R\7\3\2\2\2SV\7\25\2\2TV\5"+
		"\16\b\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2Wh\7\36\2\2XY\7\7\2\2YZ\5\16\b\2"+
		"Za\7\36\2\2[\\\7\n\2\2\\]\5\16\b\2]^\7\36\2\2^`\3\2\2\2_[\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\b\2\2ei\3\2\2\2fg\7"+
		"\7\2\2gi\7\b\2\2hX\3\2\2\2hf\3\2\2\2ij\3\2\2\2jk\5\n\6\2k\t\3\2\2\2lp"+
		"\7\3\2\2mo\5\f\7\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2r"+
		"p\3\2\2\2su\5\20\t\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2"+
		"xv\3\2\2\2yz\7\4\2\2z\13\3\2\2\2{|\5\16\b\2|\u0081\7\36\2\2}~\7\n\2\2"+
		"~\u0080\7\36\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\t"+
		"\2\2\u0085\r\3\2\2\2\u0086\u0087\t\2\2\2\u0087\17\3\2\2\2\u0088\u0089"+
		"\5\26\f\2\u0089\u008a\7\60\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\t\2"+
		"\2\u008c\u00d4\3\2\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\t\2\2\u008f"+
		"\u00d4\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0092\7\7\2\2\u0092\u0093\5"+
		"\30\r\2\u0093\u0094\7\b\2\2\u0094\u0098\7\3\2\2\u0095\u0097\5\f\7\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009e\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\5\20\t\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00b1\7\4\2\2\u00a2"+
		"\u00a3\7\21\2\2\u00a3\u00a7\7\3\2\2\u00a4\u00a6\5\f\7\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\5\20\t\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\7\4\2\2\u00b1\u00a2\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00d4\3\2\2\2\u00b3\u00b4\7\22\2\2\u00b4"+
		"\u00b5\7\36\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8"+
		"\7\t\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\t\2\2\u00ba\u00be\7\3\2\2"+
		"\u00bb\u00bd\5\f\7\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c3\5\20\t\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\7\4\2\2\u00c8\u00d4\3\2\2\2\u00c9\u00cb\7\24\2\2\u00ca\u00cc\5"+
		"\30\r\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d4\7\t\2\2\u00ce\u00cf\7\r\2\2\u00cf\u00d4\7\t\2\2\u00d0\u00d1\7\20"+
		"\2\2\u00d1\u00d4\7\t\2\2\u00d2\u00d4\5\n\6\2\u00d3\u0088\3\2\2\2\u00d3"+
		"\u008d\3\2\2\2\u00d3\u0090\3\2\2\2\u00d3\u00b3\3\2\2\2\u00d3\u00c9\3\2"+
		"\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\21\3\2\2\2\u00d5\u00e3\5\24\13\2\u00d6\u00d7\7\7\2\2\u00d7\u00dc\5\30"+
		"\r\2\u00d8\u00d9\7\n\2\2\u00d9\u00db\5\30\r\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e4\3\2\2\2\u00e1"+
		"\u00e2\7\7\2\2\u00e2\u00e4\7\b\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00f1\3\2\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\7\7\2\2\u00e7"+
		"\u00ec\7\35\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00eb\5\36\20\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\b\2\2\u00f0\u00d5\3\2"+
		"\2\2\u00f0\u00e5\3\2\2\2\u00f1\23\3\2\2\2\u00f2\u00f3\7\36\2\2\u00f3\25"+
		"\3\2\2\2\u00f4\u00fb\7\36\2\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\7\5\2\2"+
		"\u00f7\u00f8\5\30\r\2\u00f8\u00f9\7\6\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4"+
		"\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\27\3\2\2\2\u00fc\u00fd\b\r\1\2\u00fd"+
		"\u0109\5\26\f\2\u00fe\u0109\5\22\n\2\u00ff\u0109\5\32\16\2\u0100\u0101"+
		"\7#\2\2\u0101\u0109\5\30\r\6\u0102\u0103\7\64\2\2\u0103\u0109\5\30\r\4"+
		"\u0104\u0105\7\7\2\2\u0105\u0106\5\30\r\2\u0106\u0107\7\b\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u00ff\3\2\2\2\u0108"+
		"\u0100\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0109\u0110\3\2"+
		"\2\2\u010a\u010b\f\5\2\2\u010b\u010c\5\34\17\2\u010c\u010d\5\30\r\6\u010d"+
		"\u010f\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\31\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114"+
		"\t\3\2\2\u0114\33\3\2\2\2\u0115\u0116\t\4\2\2\u0116\35\3\2\2\2\u0117\u011a"+
		"\5\30\r\2\u0118\u011a\7\35\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2"+
		"\u011a\37\3\2\2\2\36%+:CQUahpv\u0081\u0098\u009e\u00a7\u00ad\u00b1\u00be"+
		"\u00c4\u00cb\u00d3\u00dc\u00e3\u00ec\u00f0\u00fa\u0108\u0110\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}