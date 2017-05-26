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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EQU() { return getToken(DecafParser.EQU, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
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
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
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
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
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
					block();
					}
					break;
				case 2:
					{
					setState(148);
					match(IF);
					setState(149);
					match(LPA);
					setState(150);
					expr(0);
					setState(151);
					match(RPA);
					setState(152);
					block();
					setState(153);
					match(ELSE);
					setState(154);
					block();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(FOR);
				setState(159);
				match(ID);
				setState(160);
				match(EQU);
				setState(161);
				expr(0);
				setState(162);
				match(PV);
				setState(163);
				expr(0);
				setState(164);
				match(PV);
				setState(165);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(167);
					match(RETURN);
					setState(168);
					match(PV);
					}
					break;
				case 2:
					{
					setState(169);
					match(RETURN);
					setState(170);
					expr(0);
					setState(171);
					match(PV);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(BREAK);
				setState(176);
				match(PV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(CONTINUE);
				setState(178);
				match(PV);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
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
			setState(209);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				methodnome();
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(183);
					match(LPA);
					setState(184);
					expr(0);
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIG) {
						{
						{
						setState(185);
						match(VIG);
						setState(186);
						expr(0);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(192);
					match(RPA);
					}
					break;
				case 2:
					{
					setState(194);
					match(LPA);
					setState(195);
					match(RPA);
					}
					break;
				}
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(CALLOUT);
				setState(199);
				match(LPA);
				setState(200);
				match(STRINGLIT);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(201);
					match(VIG);
					setState(202);
					calloutarg();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
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
			setState(211);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(ID);
				setState(215);
				match(LBAR);
				setState(216);
				expr(0);
				setState(217);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(222);
				location();
				}
				break;
			case 2:
				{
				setState(223);
				methodcall();
				}
				break;
			case 3:
				{
				setState(224);
				lit();
				}
				break;
			case 4:
				{
				setState(225);
				match(OPSUBT);
				setState(226);
				expr(3);
				}
				break;
			case 5:
				{
				setState(227);
				match(EXC);
				setState(228);
				expr(2);
				}
				break;
			case 6:
				{
				setState(229);
				match(LPA);
				setState(230);
				expr(0);
				setState(231);
				match(RPA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(235);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(236);
					binops();
					setState(237);
					expr(5);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode OPSUBT() { return getToken(DecafParser.OPSUBT, 0); }
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
		try {
			setState(249);
			switch (_input.LA(1)) {
			case OPSUBT:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(OPSUBT);
				setState(245);
				match(INTLIT);
				}
				break;
			case INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(INTLIT);
				}
				break;
			case CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(CHARLIT);
				}
				break;
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(BOOLEANLITERAL);
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
			setState(251);
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
			setState(255);
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
				setState(253);
				expr(0);
				}
				break;
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3"+
		"\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\5\3"+
		"\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\3"+
		"\5\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\7"+
		"\6u\n\6\f\6\16\6x\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7"+
		"\u0083\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00be\n\n\f\n\16"+
		"\n\u00c1\13\n\3\n\3\n\3\n\3\n\5\n\u00c7\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ce"+
		"\n\n\f\n\16\n\u00d1\13\n\3\n\5\n\u00d4\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00de\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00ec\n\r\3\r\3\r\3\r\3\r\7\r\u00f2\n\r\f\r\16\r\u00f5\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00fc\n\16\3\17\3\17\3\20\3\20\5\20\u0102\n\20"+
		"\3\20\2\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\4\2\f\f\23"+
		"\23\6\2\37\37%%**--\u0117\2 \3\2\2\2\4\60\3\2\2\2\6Q\3\2\2\2\bU\3\2\2"+
		"\2\nl\3\2\2\2\f{\3\2\2\2\16\u0086\3\2\2\2\20\u00b6\3\2\2\2\22\u00d3\3"+
		"\2\2\2\24\u00d5\3\2\2\2\26\u00dd\3\2\2\2\30\u00eb\3\2\2\2\32\u00fb\3\2"+
		"\2\2\34\u00fd\3\2\2\2\36\u0101\3\2\2\2 !\7\13\2\2!%\7\3\2\2\"$\5\4\3\2"+
		"#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*\5\b"+
		"\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\4"+
		"\2\2/\3\3\2\2\2\60:\5\6\4\2\61\62\7\n\2\2\62\63\5\16\b\2\63\64\7\36\2"+
		"\2\64\65\7\5\2\2\65\66\7\32\2\2\66\67\7\6\2\2\679\3\2\2\28\61\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;C\3\2\2\2<:\3\2\2\2=>\7\n\2\2>?\5\16\b"+
		"\2?@\7\36\2\2@B\3\2\2\2A=\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7\t\2\2G\5\3\2\2\2HI\5\16\b\2IJ\7\36\2\2JR\3\2\2\2KL"+
		"\5\16\b\2LM\7\36\2\2MN\7\5\2\2NO\7\32\2\2OP\7\6\2\2PR\3\2\2\2QH\3\2\2"+
		"\2QK\3\2\2\2R\7\3\2\2\2SV\7\25\2\2TV\5\16\b\2US\3\2\2\2UT\3\2\2\2VW\3"+
		"\2\2\2Wh\7\36\2\2XY\7\7\2\2YZ\5\16\b\2Za\7\36\2\2[\\\7\n\2\2\\]\5\16\b"+
		"\2]^\7\36\2\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2"+
		"\2\2ca\3\2\2\2de\7\b\2\2ei\3\2\2\2fg\7\7\2\2gi\7\b\2\2hX\3\2\2\2hf\3\2"+
		"\2\2ij\3\2\2\2jk\5\n\6\2k\t\3\2\2\2lp\7\3\2\2mo\5\f\7\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2rp\3\2\2\2su\5\20\t\2ts\3\2\2\2ux"+
		"\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\4\2\2z\13\3\2\2\2"+
		"{|\5\16\b\2|\u0081\7\36\2\2}~\7\n\2\2~\u0080\7\36\2\2\177}\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0085\7\t\2\2\u0085\r\3\2\2\2\u0086\u0087"+
		"\t\2\2\2\u0087\17\3\2\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\60\2\2\u008a"+
		"\u008b\5\30\r\2\u008b\u008c\7\t\2\2\u008c\u00b7\3\2\2\2\u008d\u008e\5"+
		"\22\n\2\u008e\u008f\7\t\2\2\u008f\u00b7\3\2\2\2\u0090\u0091\7\26\2\2\u0091"+
		"\u0092\7\7\2\2\u0092\u0093\5\30\r\2\u0093\u0094\7\b\2\2\u0094\u0095\5"+
		"\n\6\2\u0095\u009f\3\2\2\2\u0096\u0097\7\26\2\2\u0097\u0098\7\7\2\2\u0098"+
		"\u0099\5\30\r\2\u0099\u009a\7\b\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7"+
		"\21\2\2\u009c\u009d\5\n\6\2\u009d\u009f\3\2\2\2\u009e\u0090\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009f\u00b7\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7"+
		"\36\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\t\2\2"+
		"\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00b7"+
		"\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00b0\7\t\2\2\u00ab\u00ac\7\24\2\2"+
		"\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\t\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9"+
		"\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2"+
		"\u00b7\7\t\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b7\7\t\2\2\u00b5\u00b7\5"+
		"\n\6\2\u00b6\u0088\3\2\2\2\u00b6\u008d\3\2\2\2\u00b6\u009e\3\2\2\2\u00b6"+
		"\u00a0\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b3\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7\21\3\2\2\2\u00b8\u00c6\5\24\13\2\u00b9"+
		"\u00ba\7\7\2\2\u00ba\u00bf\5\30\r\2\u00bb\u00bc\7\n\2\2\u00bc\u00be\5"+
		"\30\r\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\b"+
		"\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c7\7\b\2\2\u00c6"+
		"\u00b9\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00d4\3\2\2\2\u00c8\u00c9\7\16"+
		"\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cf\7\35\2\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"\u00ce\5\36\20\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d4\7\b\2\2\u00d3\u00b8\3\2\2\2\u00d3\u00c8\3\2\2\2\u00d4\23\3\2\2"+
		"\2\u00d5\u00d6\7\36\2\2\u00d6\25\3\2\2\2\u00d7\u00de\7\36\2\2\u00d8\u00d9"+
		"\7\36\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\6\2\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de\27"+
		"\3\2\2\2\u00df\u00e0\b\r\1\2\u00e0\u00ec\5\26\f\2\u00e1\u00ec\5\22\n\2"+
		"\u00e2\u00ec\5\32\16\2\u00e3\u00e4\7#\2\2\u00e4\u00ec\5\30\r\5\u00e5\u00e6"+
		"\7\64\2\2\u00e6\u00ec\5\30\r\4\u00e7\u00e8\7\7\2\2\u00e8\u00e9\5\30\r"+
		"\2\u00e9\u00ea\7\b\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e1"+
		"\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb"+
		"\u00e7\3\2\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\f\6\2\2\u00ee\u00ef\5\34"+
		"\17\2\u00ef\u00f0\5\30\r\7\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\31\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\u00fc\7\32\2\2\u00f8\u00fc"+
		"\7\32\2\2\u00f9\u00fc\7\34\2\2\u00fa\u00fc\7\33\2\2\u00fb\u00f6\3\2\2"+
		"\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\33"+
		"\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe\35\3\2\2\2\u00ff\u0102\5\30\r\2\u0100"+
		"\u0102\7\35\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\37\3\2\2"+
		"\2\31%+:CQUahpv\u0081\u009e\u00af\u00b6\u00bf\u00c6\u00cf\u00d3\u00dd"+
		"\u00eb\u00f3\u00fb\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}