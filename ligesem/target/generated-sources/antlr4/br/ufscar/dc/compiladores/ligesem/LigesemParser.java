// Generated from br/ufscar/dc/compiladores/ligesem/Ligesem.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.ligesem;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LigesemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TEXTO=9, 
		NUMINT=10, NUMINTPOS=11, DATA=12, NOME_DISCIPLINAS=13, COMENTARIO=14, 
		WS=15;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_info = 2, RULE_bloco_disciplina = 3, 
		RULE_disciplina = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "info", "bloco_disciplina", "disciplina"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nome: '", "'universidade: '", "'perfil: '", "'data: '", "'DISCIPLINA'", 
			"'END_DISCIPLINA'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TEXTO", "NUMINT", 
			"NUMINTPOS", "DATA", "NOME_DISCIPLINAS", "COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Ligesem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LigesemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LigesemParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LigesemVisitor ) return ((LigesemVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			body();
			setState(11);
			match(EOF);
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

	public static class BodyContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<Bloco_disciplinaContext> bloco_disciplina() {
			return getRuleContexts(Bloco_disciplinaContext.class);
		}
		public Bloco_disciplinaContext bloco_disciplina(int i) {
			return getRuleContext(Bloco_disciplinaContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LigesemVisitor ) return ((LigesemVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			info();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(14);
				bloco_disciplina();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InfoContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(LigesemParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(LigesemParser.TEXTO, i);
		}
		public TerminalNode NUMINT() { return getToken(LigesemParser.NUMINT, 0); }
		public TerminalNode DATA() { return getToken(LigesemParser.DATA, 0); }
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LigesemVisitor ) return ((LigesemVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(TEXTO);
			setState(22);
			match(T__1);
			setState(23);
			match(TEXTO);
			setState(24);
			match(T__2);
			setState(25);
			match(NUMINT);
			setState(26);
			match(T__3);
			setState(27);
			match(DATA);
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

	public static class Bloco_disciplinaContext extends ParserRuleContext {
		public List<DisciplinaContext> disciplina() {
			return getRuleContexts(DisciplinaContext.class);
		}
		public DisciplinaContext disciplina(int i) {
			return getRuleContext(DisciplinaContext.class,i);
		}
		public Bloco_disciplinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_disciplina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).enterBloco_disciplina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).exitBloco_disciplina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LigesemVisitor ) return ((LigesemVisitor<? extends T>)visitor).visitBloco_disciplina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_disciplinaContext bloco_disciplina() throws RecognitionException {
		Bloco_disciplinaContext _localctx = new Bloco_disciplinaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco_disciplina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__4);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				disciplina();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOME_DISCIPLINAS );
			setState(35);
			match(T__5);
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

	public static class DisciplinaContext extends ParserRuleContext {
		public TerminalNode NOME_DISCIPLINAS() { return getToken(LigesemParser.NOME_DISCIPLINAS, 0); }
		public List<TerminalNode> TEXTO() { return getTokens(LigesemParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(LigesemParser.TEXTO, i);
		}
		public TerminalNode NUMINT() { return getToken(LigesemParser.NUMINT, 0); }
		public DisciplinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disciplina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).enterDisciplina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LigesemListener ) ((LigesemListener)listener).exitDisciplina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LigesemVisitor ) return ((LigesemVisitor<? extends T>)visitor).visitDisciplina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisciplinaContext disciplina() throws RecognitionException {
		DisciplinaContext _localctx = new DisciplinaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disciplina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(NOME_DISCIPLINAS);
			setState(38);
			match(T__6);
			setState(39);
			match(TEXTO);
			setState(40);
			match(T__6);
			setState(41);
			match(NUMINT);
			setState(42);
			match(T__6);
			setState(43);
			match(TEXTO);
			setState(44);
			match(T__7);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0010"+
		"\b\u0001\n\u0001\f\u0001\u0013\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0004\u0003 \b\u0003\u000b\u0003\f\u0003!\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000+\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000"+
		"\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b%\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001"+
		"\u0001\u0000\u0000\u0000\r\u0011\u0003\u0004\u0002\u0000\u000e\u0010\u0003"+
		"\u0006\u0003\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005"+
		"\t\u0000\u0000\u0016\u0017\u0005\u0002\u0000\u0000\u0017\u0018\u0005\t"+
		"\u0000\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019\u001a\u0005\n\u0000"+
		"\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b\u001c\u0005\f\u0000\u0000"+
		"\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001f\u0005\u0005\u0000\u0000"+
		"\u001e \u0003\b\u0004\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0006\u0000\u0000$\u0007\u0001"+
		"\u0000\u0000\u0000%&\u0005\r\u0000\u0000&\'\u0005\u0007\u0000\u0000\'"+
		"(\u0005\t\u0000\u0000()\u0005\u0007\u0000\u0000)*\u0005\n\u0000\u0000"+
		"*+\u0005\u0007\u0000\u0000+,\u0005\t\u0000\u0000,-\u0005\b\u0000\u0000"+
		"-\t\u0001\u0000\u0000\u0000\u0002\u0011!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}