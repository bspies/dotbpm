// Generated from E:/Brennan/Projects/dotbpm/src/main/java/dot/bpm/parser/antlr\DOTBPM.g4 by ANTLR 4.8
package dot.bpm.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTBPMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, PROCESS=33, SUBPROCESS=34, STRING=35, NUMBER=36, BOOLEAN=37, 
		ID=38, COMMENT=39, LINE_COMMENT=40, WS=41;
	public static final int
		RULE_process = 0, RULE_subprocess = 1, RULE_stmt_list = 2, RULE_stmt = 3, 
		RULE_sequence = 4, RULE_sequence_element = 5, RULE_activity = 6, RULE_activity_type = 7, 
		RULE_event = 8, RULE_event_type = 9, RULE_gateway = 10, RULE_gateway_type = 11, 
		RULE_assoc_flow = 12, RULE_seq_flow = 13, RULE_msg_flow = 14, RULE_attr_list = 15, 
		RULE_attr_value = 16, RULE_id = 17, RULE_link = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"process", "subprocess", "stmt_list", "stmt", "sequence", "sequence_element", 
			"activity", "activity_type", "event", "event_type", "gateway", "gateway_type", 
			"assoc_flow", "seq_flow", "msg_flow", "attr_list", "attr_value", "id", 
			"link"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'['", "':'", "'|'", "']'", "'task'", "'script'", 
			"'action'", "'('", "')'", "'>'", "'-'", "'<<'", "'X'", "'*'", "'+'", 
			"'!'", "'?'", "'^'", "'~'", "'@'", "'..'", "'<'", "'O'", "'--'", "'=>'", 
			"'->'", "'='", "','", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PROCESS", "SUBPROCESS", 
			"STRING", "NUMBER", "BOOLEAN", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "DOTBPM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DOTBPMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode PROCESS() { return getToken(DOTBPMParser.PROCESS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PROCESS);
			setState(39);
			id();
			setState(40);
			match(T__0);
			setState(41);
			stmt_list();
			setState(42);
			match(T__1);
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

	public static class SubprocessContext extends ParserRuleContext {
		public TerminalNode SUBPROCESS() { return getToken(DOTBPMParser.SUBPROCESS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public SubprocessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprocess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSubprocess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSubprocess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSubprocess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprocessContext subprocess() throws RecognitionException {
		SubprocessContext _localctx = new SubprocessContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subprocess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(SUBPROCESS);
			setState(45);
			id();
			setState(46);
			match(T__0);
			setState(47);
			stmt_list();
			setState(48);
			match(T__1);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__31) | (1L << SUBPROCESS))) != 0)) {
				{
				{
				setState(50);
				stmt();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(51);
					match(T__2);
					}
				}

				}
				}
				setState(58);
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

	public static class StmtContext extends ParserRuleContext {
		public ActivityContext activity() {
			return getRuleContext(ActivityContext.class,0);
		}
		public SubprocessContext subprocess() {
			return getRuleContext(SubprocessContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				activity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				subprocess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				sequence();
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

	public static class SequenceContext extends ParserRuleContext {
		public List<Sequence_elementContext> sequence_element() {
			return getRuleContexts(Sequence_elementContext.class);
		}
		public Sequence_elementContext sequence_element(int i) {
			return getRuleContext(Sequence_elementContext.class,i);
		}
		public List<Seq_flowContext> seq_flow() {
			return getRuleContexts(Seq_flowContext.class);
		}
		public Seq_flowContext seq_flow(int i) {
			return getRuleContext(Seq_flowContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			sequence_element();
			setState(65);
			seq_flow();
			setState(66);
			sequence_element();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(67);
				seq_flow();
				setState(68);
				sequence_element();
				}
				}
				setState(74);
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

	public static class Sequence_elementContext extends ParserRuleContext {
		public ActivityContext activity() {
			return getRuleContext(ActivityContext.class,0);
		}
		public SubprocessContext subprocess() {
			return getRuleContext(SubprocessContext.class,0);
		}
		public GatewayContext gateway() {
			return getRuleContext(GatewayContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Sequence_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSequence_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSequence_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSequence_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_elementContext sequence_element() throws RecognitionException {
		Sequence_elementContext _localctx = new Sequence_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sequence_element);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				activity();
				}
				break;
			case SUBPROCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				subprocess();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				gateway();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				event();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				link();
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

	public static class ActivityContext extends ParserRuleContext {
		public Activity_typeContext activity_type() {
			return getRuleContext(Activity_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public ActivityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterActivity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitActivity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitActivity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityContext activity() throws RecognitionException {
		ActivityContext _localctx = new ActivityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_activity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__3);
			setState(83);
			activity_type();
			setState(84);
			match(T__4);
			setState(85);
			id();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(86);
				match(T__5);
				setState(87);
				attr_list();
				}
			}

			setState(90);
			match(T__6);
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

	public static class Activity_typeContext extends ParserRuleContext {
		public Activity_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activity_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterActivity_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitActivity_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitActivity_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Activity_typeContext activity_type() throws RecognitionException {
		Activity_typeContext _localctx = new Activity_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_activity_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class EventContext extends ParserRuleContext {
		public Event_typeContext event_type() {
			return getRuleContext(Event_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__10);
			setState(95);
			event_type();
			setState(96);
			match(T__4);
			setState(97);
			id();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(98);
				match(T__5);
				setState(99);
				attr_list();
				}
			}

			setState(102);
			match(T__11);
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

	public static class Event_typeContext extends ParserRuleContext {
		public Event_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEvent_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEvent_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEvent_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_typeContext event_type() throws RecognitionException {
		Event_typeContext _localctx = new Event_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_event_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class GatewayContext extends ParserRuleContext {
		public Gateway_typeContext gateway_type() {
			return getRuleContext(Gateway_typeContext.class,0);
		}
		public Event_typeContext event_type() {
			return getRuleContext(Event_typeContext.class,0);
		}
		public GatewayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateway; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterGateway(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitGateway(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitGateway(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GatewayContext gateway() throws RecognitionException {
		GatewayContext _localctx = new GatewayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_gateway);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__24);
				setState(107);
				gateway_type();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				event_type();
				setState(109);
				match(T__12);
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

	public static class Gateway_typeContext extends ParserRuleContext {
		public Gateway_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateway_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterGateway_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitGateway_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitGateway_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gateway_typeContext gateway_type() throws RecognitionException {
		Gateway_typeContext _localctx = new Gateway_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_gateway_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Assoc_flowContext extends ParserRuleContext {
		public Assoc_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterAssoc_flow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitAssoc_flow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitAssoc_flow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assoc_flowContext assoc_flow() throws RecognitionException {
		Assoc_flowContext _localctx = new Assoc_flowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assoc_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__26);
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

	public static class Seq_flowContext extends ParserRuleContext {
		public Seq_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSeq_flow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSeq_flow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSeq_flow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seq_flowContext seq_flow() throws RecognitionException {
		Seq_flowContext _localctx = new Seq_flowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_seq_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__27);
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

	public static class Msg_flowContext extends ParserRuleContext {
		public Msg_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterMsg_flow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitMsg_flow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitMsg_flow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Msg_flowContext msg_flow() throws RecognitionException {
		Msg_flowContext _localctx = new Msg_flowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_msg_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__28);
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

	public static class Attr_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Attr_valueContext> attr_value() {
			return getRuleContexts(Attr_valueContext.class);
		}
		public Attr_valueContext attr_value(int i) {
			return getRuleContext(Attr_valueContext.class,i);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterAttr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitAttr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitAttr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				id();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(122);
					match(T__29);
					setState(123);
					attr_value();
					}
				}

				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(126);
					match(T__30);
					}
				}

				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Attr_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DOTBPMParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DOTBPMParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(DOTBPMParser.BOOLEAN, 0); }
		public Attr_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterAttr_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitAttr_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitAttr_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_valueContext attr_value() throws RecognitionException {
		Attr_valueContext _localctx = new Attr_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DOTBPMParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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

	public static class LinkContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__31);
			setState(138);
			id();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\4\67\n\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\5\5A\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\3\7\3\7\5\7S\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\ng\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fr\n\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\177\n\21\3\21\5\21\u0082"+
		"\n\21\6\21\u0084\n\21\r\21\16\21\u0085\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\n"+
		"\f\3\2\17\32\4\2\22\24\34\34\3\2%\'\2\u008a\2(\3\2\2\2\4.\3\2\2\2\6:\3"+
		"\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20^\3\2\2\2\22`\3"+
		"\2\2\2\24j\3\2\2\2\26q\3\2\2\2\30s\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36"+
		"y\3\2\2\2 \u0083\3\2\2\2\"\u0087\3\2\2\2$\u0089\3\2\2\2&\u008b\3\2\2\2"+
		"()\7#\2\2)*\5$\23\2*+\7\3\2\2+,\5\6\4\2,-\7\4\2\2-\3\3\2\2\2./\7$\2\2"+
		"/\60\5$\23\2\60\61\7\3\2\2\61\62\5\6\4\2\62\63\7\4\2\2\63\5\3\2\2\2\64"+
		"\66\5\b\5\2\65\67\7\5\2\2\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\64"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3\2\2\2=A\5\16\b\2"+
		">A\5\4\3\2?A\5\n\6\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\t\3\2\2\2BC\5\f\7"+
		"\2CD\5\34\17\2DJ\5\f\7\2EF\5\34\17\2FG\5\f\7\2GI\3\2\2\2HE\3\2\2\2IL\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2\2\2MS\5\16\b\2NS\5\4\3\2"+
		"OS\5\26\f\2PS\5\22\n\2QS\5&\24\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2"+
		"\2RQ\3\2\2\2S\r\3\2\2\2TU\7\6\2\2UV\5\20\t\2VW\7\7\2\2WZ\5$\23\2XY\7\b"+
		"\2\2Y[\5 \21\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\t\2\2]\17\3\2\2\2^"+
		"_\t\2\2\2_\21\3\2\2\2`a\7\r\2\2ab\5\24\13\2bc\7\7\2\2cf\5$\23\2de\7\b"+
		"\2\2eg\5 \21\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\16\2\2i\23\3\2\2\2jk"+
		"\t\3\2\2k\25\3\2\2\2lm\7\33\2\2mr\5\30\r\2no\5\24\13\2op\7\17\2\2pr\3"+
		"\2\2\2ql\3\2\2\2qn\3\2\2\2r\27\3\2\2\2st\t\4\2\2t\31\3\2\2\2uv\7\35\2"+
		"\2v\33\3\2\2\2wx\7\36\2\2x\35\3\2\2\2yz\7\37\2\2z\37\3\2\2\2{~\5$\23\2"+
		"|}\7 \2\2}\177\5\"\22\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"\u0082\7!\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2"+
		"\2\2\u0083{\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086!\3\2\2\2\u0087\u0088\t\5\2\2\u0088#\3\2\2\2\u0089\u008a"+
		"\7(\2\2\u008a%\3\2\2\2\u008b\u008c\7\"\2\2\u008c\u008d\5$\23\2\u008d\'"+
		"\3\2\2\2\r\66:@JRZfq~\u0081\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}