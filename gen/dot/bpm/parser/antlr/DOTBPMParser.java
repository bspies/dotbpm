// Generated from D:/Home/Brennan/Alienware Files/Projects/dotbpm/src/main/java/dot/bpm/parser/antlr/DOTBPM.g4 by ANTLR 4.13.2
package dot.bpm.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DOTBPMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, POOL_OPEN=16, 
		POOL_CLOSE=17, LANE_OPEN=18, LANE_CLOSE=19, CURLY_OPEN=20, CURLY_CLOSE=21, 
		SQRE_OPEN=22, SQRE_CLOSE=23, PAREN_OPEN=24, PAREN_CLOSE=25, ANGLE_OPEN=26, 
		ANGLE_CLOSE=27, STMT_TERM=28, VERT_LINE=29, DVERT_LINE=30, REF=31, X=32, 
		OR=33, XOR=34, AND=35, STAR=36, PLUS=37, BLANK=38, SLASH=39, DASH=40, 
		BACKWARD=41, BANG=42, QUESTION=43, CARET=44, TILDE=45, AT_SYMB=46, ELLIPSIS=47, 
		X_BANG=48, PROCESS=49, SUBPROCESS=50, USER=51, SERVICE=52, SCRIPT=53, 
		CATCH=54, THROW=55, IN=56, OUT=57, DEFAULT=58, FORK=59, XOR_SPLIT=60, 
		OR_SPLIT=61, EVENT_SPLIT=62, JOIN=63, OR_JOIN=64, XOR_JOIN=65, STRING=66, 
		NUMBER=67, BOOLEAN=68, ID=69, COMMENT=70, LINE_COMMENT=71, WS=72;
	public static final int
		RULE_process = 0, RULE_subprocess = 1, RULE_pool_list = 2, RULE_pool_header = 3, 
		RULE_pool = 4, RULE_lane_list = 5, RULE_lane_header = 6, RULE_lane = 7, 
		RULE_stmt_list = 8, RULE_stmt = 9, RULE_sequence = 10, RULE_sequence_elem = 11, 
		RULE_activity = 12, RULE_task = 13, RULE_task_type = 14, RULE_event = 15, 
		RULE_event_category = 16, RULE_event_type = 17, RULE_boundary_event = 18, 
		RULE_gateway = 19, RULE_fork_diverge = 20, RULE_event_diverge = 21, RULE_condition_diverge = 22, 
		RULE_and_converge = 23, RULE_or_converge = 24, RULE_inflows = 25, RULE_outflows = 26, 
		RULE_cond_outflows = 27, RULE_cond_outflow = 28, RULE_message = 29, RULE_sender = 30, 
		RULE_recipient = 31, RULE_association = 32, RULE_artifact = 33, RULE_assoc_flow = 34, 
		RULE_dir_assoc = 35, RULE_undir_assoc = 36, RULE_sequence_flow = 37, RULE_message_flow = 38, 
		RULE_input_set = 39, RULE_output_set = 40, RULE_attr_list = 41, RULE_attribute = 42, 
		RULE_attr_value = 43, RULE_param_list = 44, RULE_param = 45, RULE_param_type = 46, 
		RULE_id = 47, RULE_namespace_id = 48, RULE_link_list = 49, RULE_event_links = 50, 
		RULE_link = 51, RULE_activity_link = 52, RULE_event_link = 53, RULE_gateway_link = 54, 
		RULE_pool_link = 55, RULE_endpoint_link = 56, RULE_expression = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"process", "subprocess", "pool_list", "pool_header", "pool", "lane_list", 
			"lane_header", "lane", "stmt_list", "stmt", "sequence", "sequence_elem", 
			"activity", "task", "task_type", "event", "event_category", "event_type", 
			"boundary_event", "gateway", "fork_diverge", "event_diverge", "condition_diverge", 
			"and_converge", "or_converge", "inflows", "outflows", "cond_outflows", 
			"cond_outflow", "message", "sender", "recipient", "association", "artifact", 
			"assoc_flow", "dir_assoc", "undir_assoc", "sequence_flow", "message_flow", 
			"input_set", "output_set", "attr_list", "attribute", "attr_value", "param_list", 
			"param", "param_type", "id", "namespace_id", "link_list", "event_links", 
			"link", "activity_link", "event_link", "gateway_link", "pool_link", "endpoint_link", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'->-'", "'---'", "'==>'", "'-->'", "'='", "'string'", 
			"'boolean'", "'number'", "'date'", "'datetime'", "'time'", "'.'", "'`'", 
			"'(('", "'))'", "'|['", "']|'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"'<'", "'>'", "';'", "'|'", "'||'", "'#'", "'X'", "'OR'", "'XOR'", "'AND'", 
			"'*'", "'+'", "'_'", "'/'", "'-'", "'<<'", "'!'", "'?'", "'^'", "'~'", 
			"'@'", "'..'", "'X!'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'(*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "POOL_OPEN", "POOL_CLOSE", "LANE_OPEN", "LANE_CLOSE", 
			"CURLY_OPEN", "CURLY_CLOSE", "SQRE_OPEN", "SQRE_CLOSE", "PAREN_OPEN", 
			"PAREN_CLOSE", "ANGLE_OPEN", "ANGLE_CLOSE", "STMT_TERM", "VERT_LINE", 
			"DVERT_LINE", "REF", "X", "OR", "XOR", "AND", "STAR", "PLUS", "BLANK", 
			"SLASH", "DASH", "BACKWARD", "BANG", "QUESTION", "CARET", "TILDE", "AT_SYMB", 
			"ELLIPSIS", "X_BANG", "PROCESS", "SUBPROCESS", "USER", "SERVICE", "SCRIPT", 
			"CATCH", "THROW", "IN", "OUT", "DEFAULT", "FORK", "XOR_SPLIT", "OR_SPLIT", 
			"EVENT_SPLIT", "JOIN", "OR_JOIN", "XOR_JOIN", "STRING", "NUMBER", "BOOLEAN", 
			"ID", "COMMENT", "LINE_COMMENT", "WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode PROCESS() { return getToken(DOTBPMParser.PROCESS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CURLY_OPEN() { return getToken(DOTBPMParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(DOTBPMParser.CURLY_CLOSE, 0); }
		public TerminalNode EOF() { return getToken(DOTBPMParser.EOF, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Pool_listContext pool_list() {
			return getRuleContext(Pool_listContext.class,0);
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
			setState(116);
			match(PROCESS);
			setState(117);
			id();
			setState(118);
			match(CURLY_OPEN);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURLY_CLOSE:
			case SQRE_OPEN:
			case PAREN_OPEN:
			case ANGLE_OPEN:
			case DVERT_LINE:
			case REF:
			case SUBPROCESS:
				{
				setState(119);
				stmt_list();
				}
				break;
			case POOL_OPEN:
				{
				setState(120);
				pool_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			match(CURLY_CLOSE);
			setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubprocessContext extends ParserRuleContext {
		public TerminalNode SUBPROCESS() { return getToken(DOTBPMParser.SUBPROCESS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CURLY_OPEN() { return getToken(DOTBPMParser.CURLY_OPEN, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(DOTBPMParser.CURLY_CLOSE, 0); }
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public List<Boundary_eventContext> boundary_event() {
			return getRuleContexts(Boundary_eventContext.class);
		}
		public Boundary_eventContext boundary_event(int i) {
			return getRuleContext(Boundary_eventContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SUBPROCESS);
			setState(127);
			id();
			setState(128);
			match(CURLY_OPEN);
			setState(129);
			stmt_list();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_LINE) {
				{
				{
				setState(130);
				match(VERT_LINE);
				setState(131);
				boundary_event();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(CURLY_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pool_listContext extends ParserRuleContext {
		public List<PoolContext> pool() {
			return getRuleContexts(PoolContext.class);
		}
		public PoolContext pool(int i) {
			return getRuleContext(PoolContext.class,i);
		}
		public Pool_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterPool_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitPool_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitPool_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pool_listContext pool_list() throws RecognitionException {
		Pool_listContext _localctx = new Pool_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pool_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				pool();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==POOL_OPEN );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pool_headerContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STMT_TERM() { return getToken(DOTBPMParser.STMT_TERM, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Pool_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterPool_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitPool_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitPool_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pool_headerContext pool_header() throws RecognitionException {
		Pool_headerContext _localctx = new Pool_headerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pool_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			id();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(145);
				match(STMT_TERM);
				setState(146);
				attr_list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PoolContext extends ParserRuleContext {
		public TerminalNode POOL_OPEN() { return getToken(DOTBPMParser.POOL_OPEN, 0); }
		public Pool_headerContext pool_header() {
			return getRuleContext(Pool_headerContext.class,0);
		}
		public TerminalNode VERT_LINE() { return getToken(DOTBPMParser.VERT_LINE, 0); }
		public TerminalNode POOL_CLOSE() { return getToken(DOTBPMParser.POOL_CLOSE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Lane_listContext lane_list() {
			return getRuleContext(Lane_listContext.class,0);
		}
		public PoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterPool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitPool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitPool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolContext pool() throws RecognitionException {
		PoolContext _localctx = new PoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(POOL_OPEN);
			setState(150);
			pool_header();
			setState(151);
			match(VERT_LINE);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POOL_CLOSE:
			case SQRE_OPEN:
			case PAREN_OPEN:
			case ANGLE_OPEN:
			case DVERT_LINE:
			case REF:
			case SUBPROCESS:
				{
				setState(152);
				stmt_list();
				}
				break;
			case LANE_OPEN:
				{
				setState(153);
				lane_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			match(POOL_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lane_listContext extends ParserRuleContext {
		public List<LaneContext> lane() {
			return getRuleContexts(LaneContext.class);
		}
		public LaneContext lane(int i) {
			return getRuleContext(LaneContext.class,i);
		}
		public Lane_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lane_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterLane_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitLane_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitLane_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lane_listContext lane_list() throws RecognitionException {
		Lane_listContext _localctx = new Lane_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lane_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				lane();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LANE_OPEN );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lane_headerContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STMT_TERM() { return getToken(DOTBPMParser.STMT_TERM, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Lane_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lane_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterLane_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitLane_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitLane_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lane_headerContext lane_header() throws RecognitionException {
		Lane_headerContext _localctx = new Lane_headerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lane_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			id();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(164);
				match(STMT_TERM);
				setState(165);
				attr_list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LaneContext extends ParserRuleContext {
		public TerminalNode LANE_OPEN() { return getToken(DOTBPMParser.LANE_OPEN, 0); }
		public Lane_headerContext lane_header() {
			return getRuleContext(Lane_headerContext.class,0);
		}
		public TerminalNode VERT_LINE() { return getToken(DOTBPMParser.VERT_LINE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode LANE_CLOSE() { return getToken(DOTBPMParser.LANE_CLOSE, 0); }
		public LaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterLane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitLane(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitLane(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaneContext lane() throws RecognitionException {
		LaneContext _localctx = new LaneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LANE_OPEN);
			setState(169);
			lane_header();
			setState(170);
			match(VERT_LINE);
			setState(171);
			stmt_list();
			setState(172);
			match(LANE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> STMT_TERM() { return getTokens(DOTBPMParser.STMT_TERM); }
		public TerminalNode STMT_TERM(int i) {
			return getToken(DOTBPMParser.STMT_TERM, i);
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
		enterRule(_localctx, 16, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125903216148480L) != 0)) {
				{
				{
				setState(174);
				stmt();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STMT_TERM) {
					{
					setState(175);
					match(STMT_TERM);
					}
				}

				}
				}
				setState(182);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public Sequence_elemContext sequence_elem() {
			return getRuleContext(Sequence_elemContext.class,0);
		}
		public AssociationContext association() {
			return getRuleContext(AssociationContext.class,0);
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
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				sequence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				sequence_elem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				association();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ParserRuleContext {
		public List<Sequence_elemContext> sequence_elem() {
			return getRuleContexts(Sequence_elemContext.class);
		}
		public Sequence_elemContext sequence_elem(int i) {
			return getRuleContext(Sequence_elemContext.class,i);
		}
		public List<Sequence_flowContext> sequence_flow() {
			return getRuleContexts(Sequence_flowContext.class);
		}
		public Sequence_flowContext sequence_flow(int i) {
			return getRuleContext(Sequence_flowContext.class,i);
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
		enterRule(_localctx, 20, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			sequence_elem();
			setState(189);
			sequence_flow();
			setState(190);
			sequence_elem();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(191);
				sequence_flow();
				setState(192);
				sequence_elem();
				}
				}
				setState(198);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sequence_elemContext extends ParserRuleContext {
		public ActivityContext activity() {
			return getRuleContext(ActivityContext.class,0);
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
		public Sequence_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSequence_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSequence_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSequence_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_elemContext sequence_elem() throws RecognitionException {
		Sequence_elemContext _localctx = new Sequence_elemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sequence_elem);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRE_OPEN:
			case SUBPROCESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				activity();
				}
				break;
			case ANGLE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				gateway();
				}
				break;
			case PAREN_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				event();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityContext extends ParserRuleContext {
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public SubprocessContext subprocess() {
			return getRuleContext(SubprocessContext.class,0);
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
		enterRule(_localctx, 24, RULE_activity);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				task();
				}
				break;
			case SUBPROCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				subprocess();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TaskContext extends ParserRuleContext {
		public TerminalNode SQRE_OPEN() { return getToken(DOTBPMParser.SQRE_OPEN, 0); }
		public Task_typeContext task_type() {
			return getRuleContext(Task_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SQRE_CLOSE() { return getToken(DOTBPMParser.SQRE_CLOSE, 0); }
		public TerminalNode STMT_TERM() { return getToken(DOTBPMParser.STMT_TERM, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public List<Boundary_eventContext> boundary_event() {
			return getRuleContexts(Boundary_eventContext.class);
		}
		public Boundary_eventContext boundary_event(int i) {
			return getRuleContext(Boundary_eventContext.class,i);
		}
		public Input_setContext input_set() {
			return getRuleContext(Input_setContext.class,0);
		}
		public Output_setContext output_set() {
			return getRuleContext(Output_setContext.class,0);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(SQRE_OPEN);
			setState(210);
			task_type();
			setState(211);
			id();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(212);
				match(STMT_TERM);
				setState(213);
				attr_list();
				}
			}

			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(216);
				match(VERT_LINE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(217);
					input_set();
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUT) {
					{
					setState(220);
					output_set();
					}
				}

				}
				break;
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_LINE) {
				{
				{
				setState(225);
				match(VERT_LINE);
				setState(226);
				boundary_event();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(SQRE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Task_typeContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(DOTBPMParser.USER, 0); }
		public TerminalNode SERVICE() { return getToken(DOTBPMParser.SERVICE, 0); }
		public TerminalNode SCRIPT() { return getToken(DOTBPMParser.SCRIPT, 0); }
		public Task_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterTask_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitTask_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitTask_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_typeContext task_type() throws RecognitionException {
		Task_typeContext _localctx = new Task_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_task_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventContext extends ParserRuleContext {
		public TerminalNode PAREN_OPEN() { return getToken(DOTBPMParser.PAREN_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(DOTBPMParser.PAREN_CLOSE, 0); }
		public Event_typeContext event_type() {
			return getRuleContext(Event_typeContext.class,0);
		}
		public Event_categoryContext event_category() {
			return getRuleContext(Event_categoryContext.class,0);
		}
		public TerminalNode VERT_LINE() { return getToken(DOTBPMParser.VERT_LINE, 0); }
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
		enterRule(_localctx, 30, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(PAREN_OPEN);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(237);
				event_type();
				}
				break;
			case 2:
				{
				setState(238);
				event_category();
				}
				break;
			case 3:
				{
				setState(239);
				event_category();
				setState(240);
				match(T__0);
				setState(241);
				event_type();
				}
				break;
			}
			setState(245);
			id();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(246);
				match(VERT_LINE);
				setState(247);
				attr_list();
				}
			}

			setState(250);
			match(PAREN_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Event_categoryContext extends ParserRuleContext {
		public TerminalNode ANGLE_CLOSE() { return getToken(DOTBPMParser.ANGLE_CLOSE, 0); }
		public TerminalNode SLASH() { return getToken(DOTBPMParser.SLASH, 0); }
		public TerminalNode CATCH() { return getToken(DOTBPMParser.CATCH, 0); }
		public TerminalNode THROW() { return getToken(DOTBPMParser.THROW, 0); }
		public Event_categoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_category; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEvent_category(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEvent_category(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEvent_category(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_categoryContext event_category() throws RecognitionException {
		Event_categoryContext _localctx = new Event_categoryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_event_category);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043745418477568L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Event_typeContext extends ParserRuleContext {
		public TerminalNode X_BANG() { return getToken(DOTBPMParser.X_BANG, 0); }
		public TerminalNode BACKWARD() { return getToken(DOTBPMParser.BACKWARD, 0); }
		public TerminalNode X() { return getToken(DOTBPMParser.X, 0); }
		public TerminalNode STAR() { return getToken(DOTBPMParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(DOTBPMParser.PLUS, 0); }
		public TerminalNode BANG() { return getToken(DOTBPMParser.BANG, 0); }
		public TerminalNode QUESTION() { return getToken(DOTBPMParser.QUESTION, 0); }
		public TerminalNode CARET() { return getToken(DOTBPMParser.CARET, 0); }
		public TerminalNode TILDE() { return getToken(DOTBPMParser.TILDE, 0); }
		public TerminalNode AT_SYMB() { return getToken(DOTBPMParser.AT_SYMB, 0); }
		public TerminalNode ELLIPSIS() { return getToken(DOTBPMParser.ELLIPSIS, 0); }
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
		enterRule(_localctx, 34, RULE_event_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 560961383563264L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boundary_eventContext extends ParserRuleContext {
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public Sequence_flowContext sequence_flow() {
			return getRuleContext(Sequence_flowContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Boundary_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundary_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterBoundary_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitBoundary_event(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitBoundary_event(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boundary_eventContext boundary_event() throws RecognitionException {
		Boundary_eventContext _localctx = new Boundary_eventContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boundary_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			event();
			setState(257);
			sequence_flow();
			setState(258);
			link();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GatewayContext extends ParserRuleContext {
		public TerminalNode ANGLE_OPEN() { return getToken(DOTBPMParser.ANGLE_OPEN, 0); }
		public TerminalNode ANGLE_CLOSE() { return getToken(DOTBPMParser.ANGLE_CLOSE, 0); }
		public Fork_divergeContext fork_diverge() {
			return getRuleContext(Fork_divergeContext.class,0);
		}
		public Condition_divergeContext condition_diverge() {
			return getRuleContext(Condition_divergeContext.class,0);
		}
		public Event_divergeContext event_diverge() {
			return getRuleContext(Event_divergeContext.class,0);
		}
		public And_convergeContext and_converge() {
			return getRuleContext(And_convergeContext.class,0);
		}
		public Or_convergeContext or_converge() {
			return getRuleContext(Or_convergeContext.class,0);
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
		enterRule(_localctx, 38, RULE_gateway);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ANGLE_OPEN);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORK:
				{
				setState(261);
				fork_diverge();
				}
				break;
			case XOR_SPLIT:
			case OR_SPLIT:
				{
				setState(262);
				condition_diverge();
				}
				break;
			case EVENT_SPLIT:
				{
				setState(263);
				event_diverge();
				}
				break;
			case JOIN:
				{
				setState(264);
				and_converge();
				}
				break;
			case OR_JOIN:
			case XOR_JOIN:
				{
				setState(265);
				or_converge();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			match(ANGLE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fork_divergeContext extends ParserRuleContext {
		public TerminalNode FORK() { return getToken(DOTBPMParser.FORK, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public OutflowsContext outflows() {
			return getRuleContext(OutflowsContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Fork_divergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fork_diverge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterFork_diverge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitFork_diverge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitFork_diverge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fork_divergeContext fork_diverge() throws RecognitionException {
		Fork_divergeContext _localctx = new Fork_divergeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fork_diverge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(FORK);
			setState(271);
			id();
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(272);
				match(VERT_LINE);
				setState(273);
				attr_list();
				}
				break;
			}
			setState(276);
			match(VERT_LINE);
			setState(277);
			outflows();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Event_divergeContext extends ParserRuleContext {
		public TerminalNode EVENT_SPLIT() { return getToken(DOTBPMParser.EVENT_SPLIT, 0); }
		public TerminalNode VERT_LINE() { return getToken(DOTBPMParser.VERT_LINE, 0); }
		public Event_linksContext event_links() {
			return getRuleContext(Event_linksContext.class,0);
		}
		public Event_divergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_diverge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEvent_diverge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEvent_diverge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEvent_diverge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_divergeContext event_diverge() throws RecognitionException {
		Event_divergeContext _localctx = new Event_divergeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_event_diverge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(EVENT_SPLIT);
			setState(280);
			match(VERT_LINE);
			setState(281);
			event_links();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_divergeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public Cond_outflowsContext cond_outflows() {
			return getRuleContext(Cond_outflowsContext.class,0);
		}
		public TerminalNode OR_SPLIT() { return getToken(DOTBPMParser.OR_SPLIT, 0); }
		public TerminalNode XOR_SPLIT() { return getToken(DOTBPMParser.XOR_SPLIT, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Condition_divergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_diverge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterCondition_diverge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitCondition_diverge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitCondition_diverge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_divergeContext condition_diverge() throws RecognitionException {
		Condition_divergeContext _localctx = new Condition_divergeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition_diverge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==XOR_SPLIT || _la==OR_SPLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(284);
			id();
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(285);
				match(VERT_LINE);
				setState(286);
				attr_list();
				}
				break;
			}
			setState(289);
			match(VERT_LINE);
			setState(290);
			cond_outflows();
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_convergeContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(DOTBPMParser.JOIN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public InflowsContext inflows() {
			return getRuleContext(InflowsContext.class,0);
		}
		public And_convergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_converge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterAnd_converge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitAnd_converge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitAnd_converge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_convergeContext and_converge() throws RecognitionException {
		And_convergeContext _localctx = new And_convergeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_and_converge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(JOIN);
			setState(293);
			id();
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(294);
				match(VERT_LINE);
				setState(295);
				attr_list();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(298);
				match(VERT_LINE);
				setState(299);
				inflows();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Or_convergeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode XOR_JOIN() { return getToken(DOTBPMParser.XOR_JOIN, 0); }
		public TerminalNode OR_JOIN() { return getToken(DOTBPMParser.OR_JOIN, 0); }
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public InflowsContext inflows() {
			return getRuleContext(InflowsContext.class,0);
		}
		public Or_convergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_converge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterOr_converge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitOr_converge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitOr_converge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_convergeContext or_converge() throws RecognitionException {
		Or_convergeContext _localctx = new Or_convergeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_or_converge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==OR_JOIN || _la==XOR_JOIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(303);
			id();
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(304);
				match(VERT_LINE);
				setState(305);
				attr_list();
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(308);
				match(VERT_LINE);
				setState(309);
				inflows();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InflowsContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(DOTBPMParser.IN, 0); }
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public InflowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inflows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterInflows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitInflows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitInflows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InflowsContext inflows() throws RecognitionException {
		InflowsContext _localctx = new InflowsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inflows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(IN);
			setState(313);
			match(T__0);
			setState(314);
			link_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutflowsContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(DOTBPMParser.OUT, 0); }
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public OutflowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outflows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterOutflows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitOutflows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitOutflows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutflowsContext outflows() throws RecognitionException {
		OutflowsContext _localctx = new OutflowsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outflows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(OUT);
			setState(317);
			match(T__0);
			setState(318);
			link_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_outflowsContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(DOTBPMParser.OUT, 0); }
		public List<Cond_outflowContext> cond_outflow() {
			return getRuleContexts(Cond_outflowContext.class);
		}
		public Cond_outflowContext cond_outflow(int i) {
			return getRuleContext(Cond_outflowContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(DOTBPMParser.DEFAULT, 0); }
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Cond_outflowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_outflows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterCond_outflows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitCond_outflows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitCond_outflows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_outflowsContext cond_outflows() throws RecognitionException {
		Cond_outflowsContext _localctx = new Cond_outflowsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cond_outflows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(OUT);
			setState(321);
			match(T__0);
			setState(322);
			cond_outflow();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(323);
				match(T__1);
				setState(324);
				cond_outflow();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(330);
				match(DEFAULT);
				setState(331);
				match(T__0);
				setState(332);
				link();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_outflowContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Cond_outflowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_outflow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterCond_outflow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitCond_outflow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitCond_outflow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_outflowContext cond_outflow() throws RecognitionException {
		Cond_outflowContext _localctx = new Cond_outflowContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cond_outflow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			expression();
			setState(336);
			match(T__0);
			setState(337);
			link();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MessageContext extends ParserRuleContext {
		public SenderContext sender() {
			return getRuleContext(SenderContext.class,0);
		}
		public Message_flowContext message_flow() {
			return getRuleContext(Message_flowContext.class,0);
		}
		public RecipientContext recipient() {
			return getRuleContext(RecipientContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			sender();
			setState(340);
			message_flow();
			setState(341);
			recipient();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SenderContext extends ParserRuleContext {
		public Activity_linkContext activity_link() {
			return getRuleContext(Activity_linkContext.class,0);
		}
		public Event_linkContext event_link() {
			return getRuleContext(Event_linkContext.class,0);
		}
		public SenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSender(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenderContext sender() throws RecognitionException {
		SenderContext _localctx = new SenderContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(343);
				activity_link();
				}
				break;
			case 2:
				{
				setState(344);
				event_link();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecipientContext extends ParserRuleContext {
		public Activity_linkContext activity_link() {
			return getRuleContext(Activity_linkContext.class,0);
		}
		public Event_linkContext event_link() {
			return getRuleContext(Event_linkContext.class,0);
		}
		public Endpoint_linkContext endpoint_link() {
			return getRuleContext(Endpoint_linkContext.class,0);
		}
		public RecipientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterRecipient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitRecipient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitRecipient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipientContext recipient() throws RecognitionException {
		RecipientContext _localctx = new RecipientContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_recipient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(347);
				activity_link();
				}
				break;
			case 2:
				{
				setState(348);
				event_link();
				}
				break;
			case 3:
				{
				setState(349);
				endpoint_link();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssociationContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Assoc_flowContext assoc_flow() {
			return getRuleContext(Assoc_flowContext.class,0);
		}
		public ArtifactContext artifact() {
			return getRuleContext(ArtifactContext.class,0);
		}
		public AssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationContext association() throws RecognitionException {
		AssociationContext _localctx = new AssociationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_association);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REF:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(352);
				link();
				setState(353);
				assoc_flow();
				setState(354);
				artifact();
				}
				}
				break;
			case DVERT_LINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(356);
				artifact();
				setState(357);
				assoc_flow();
				setState(358);
				link();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArtifactContext extends ParserRuleContext {
		public List<TerminalNode> DVERT_LINE() { return getTokens(DOTBPMParser.DVERT_LINE); }
		public TerminalNode DVERT_LINE(int i) {
			return getToken(DOTBPMParser.DVERT_LINE, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArtifactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artifact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterArtifact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitArtifact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitArtifact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArtifactContext artifact() throws RecognitionException {
		ArtifactContext _localctx = new ArtifactContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_artifact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(DVERT_LINE);
			setState(363);
			id();
			setState(364);
			match(DVERT_LINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assoc_flowContext extends ParserRuleContext {
		public Dir_assocContext dir_assoc() {
			return getRuleContext(Dir_assocContext.class,0);
		}
		public Undir_assocContext undir_assoc() {
			return getRuleContext(Undir_assocContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_assoc_flow);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				dir_assoc();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				undir_assoc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dir_assocContext extends ParserRuleContext {
		public Dir_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterDir_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitDir_assoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitDir_assoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dir_assocContext dir_assoc() throws RecognitionException {
		Dir_assocContext _localctx = new Dir_assocContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dir_assoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Undir_assocContext extends ParserRuleContext {
		public Undir_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undir_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterUndir_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitUndir_assoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitUndir_assoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undir_assocContext undir_assoc() throws RecognitionException {
		Undir_assocContext _localctx = new Undir_assocContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_undir_assoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sequence_flowContext extends ParserRuleContext {
		public Sequence_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterSequence_flow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitSequence_flow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitSequence_flow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_flowContext sequence_flow() throws RecognitionException {
		Sequence_flowContext _localctx = new Sequence_flowContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sequence_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Message_flowContext extends ParserRuleContext {
		public Message_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterMessage_flow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitMessage_flow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitMessage_flow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_flowContext message_flow() throws RecognitionException {
		Message_flowContext _localctx = new Message_flowContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_message_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_setContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(DOTBPMParser.IN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Input_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterInput_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitInput_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitInput_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_setContext input_set() throws RecognitionException {
		Input_setContext _localctx = new Input_setContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_input_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(IN);
			setState(379);
			param_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Output_setContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(DOTBPMParser.OUT, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Output_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterOutput_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitOutput_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitOutput_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_setContext output_set() throws RecognitionException {
		Output_setContext _localctx = new Output_setContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_output_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(OUT);
			setState(382);
			param_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attr_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
		enterRule(_localctx, 82, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			attribute();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(385);
				match(T__1);
				setState(386);
				attribute();
				}
				}
				setState(391);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public Namespace_idContext namespace_id() {
			return getRuleContext(Namespace_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(392);
				namespace_id();
				}
				break;
			case 2:
				{
				setState(393);
				id();
				}
				break;
			}
			setState(396);
			match(T__6);
			setState(397);
			attr_value();
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 86, RULE_attr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			param();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(402);
				match(T__1);
				setState(403);
				param();
				}
				}
				setState(408);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			id();
			setState(410);
			match(T__0);
			setState(411);
			param_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Param_typeContext extends ParserRuleContext {
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitParam_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitParam_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_param_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 94, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_idContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Namespace_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterNamespace_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitNamespace_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitNamespace_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_idContext namespace_id() throws RecognitionException {
		Namespace_idContext _localctx = new Namespace_idContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_namespace_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			id();
			setState(418);
			match(T__0);
			setState(419);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Link_listContext extends ParserRuleContext {
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public Link_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterLink_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitLink_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitLink_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_listContext link_list() throws RecognitionException {
		Link_listContext _localctx = new Link_listContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_link_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			link();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(422);
				match(T__1);
				setState(423);
				link();
				}
				}
				setState(428);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Event_linksContext extends ParserRuleContext {
		public List<Event_linkContext> event_link() {
			return getRuleContexts(Event_linkContext.class);
		}
		public Event_linkContext event_link(int i) {
			return getRuleContext(Event_linkContext.class,i);
		}
		public Event_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEvent_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEvent_links(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEvent_links(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_linksContext event_links() throws RecognitionException {
		Event_linksContext _localctx = new Event_linksContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_event_links);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			event_link();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(430);
				match(T__1);
				setState(431);
				event_link();
				}
				}
				setState(436);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkContext extends ParserRuleContext {
		public Activity_linkContext activity_link() {
			return getRuleContext(Activity_linkContext.class,0);
		}
		public Event_linkContext event_link() {
			return getRuleContext(Event_linkContext.class,0);
		}
		public Gateway_linkContext gateway_link() {
			return getRuleContext(Gateway_linkContext.class,0);
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
		enterRule(_localctx, 102, RULE_link);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				activity_link();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				event_link();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				gateway_link();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Activity_linkContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DOTBPMParser.REF, 0); }
		public TerminalNode SQRE_OPEN() { return getToken(DOTBPMParser.SQRE_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SQRE_CLOSE() { return getToken(DOTBPMParser.SQRE_CLOSE, 0); }
		public Activity_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activity_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterActivity_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitActivity_link(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitActivity_link(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Activity_linkContext activity_link() throws RecognitionException {
		Activity_linkContext _localctx = new Activity_linkContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_activity_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(REF);
			setState(443);
			match(SQRE_OPEN);
			setState(444);
			id();
			setState(445);
			match(SQRE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Event_linkContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DOTBPMParser.REF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(DOTBPMParser.PAREN_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(DOTBPMParser.PAREN_CLOSE, 0); }
		public Event_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEvent_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEvent_link(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEvent_link(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_linkContext event_link() throws RecognitionException {
		Event_linkContext _localctx = new Event_linkContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_event_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(REF);
			setState(448);
			match(PAREN_OPEN);
			setState(449);
			id();
			setState(450);
			match(PAREN_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Gateway_linkContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DOTBPMParser.REF, 0); }
		public TerminalNode ANGLE_OPEN() { return getToken(DOTBPMParser.ANGLE_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ANGLE_CLOSE() { return getToken(DOTBPMParser.ANGLE_CLOSE, 0); }
		public Gateway_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateway_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterGateway_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitGateway_link(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitGateway_link(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gateway_linkContext gateway_link() throws RecognitionException {
		Gateway_linkContext _localctx = new Gateway_linkContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gateway_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(REF);
			setState(453);
			match(ANGLE_OPEN);
			setState(454);
			id();
			setState(455);
			match(ANGLE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pool_linkContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DOTBPMParser.REF, 0); }
		public TerminalNode POOL_OPEN() { return getToken(DOTBPMParser.POOL_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode POOL_CLOSE() { return getToken(DOTBPMParser.POOL_CLOSE, 0); }
		public Pool_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterPool_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitPool_link(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitPool_link(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pool_linkContext pool_link() throws RecognitionException {
		Pool_linkContext _localctx = new Pool_linkContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pool_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(REF);
			setState(458);
			match(POOL_OPEN);
			setState(459);
			id();
			setState(460);
			match(POOL_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Endpoint_linkContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DOTBPMParser.REF, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(DOTBPMParser.CURLY_OPEN, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(DOTBPMParser.CURLY_CLOSE, 0); }
		public Endpoint_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpoint_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterEndpoint_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitEndpoint_link(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitEndpoint_link(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endpoint_linkContext endpoint_link() throws RecognitionException {
		Endpoint_linkContext _localctx = new Endpoint_linkContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_endpoint_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(REF);
			setState(463);
			match(CURLY_OPEN);
			setState(464);
			id();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(465);
				match(T__13);
				setState(466);
				id();
				}
			}

			setState(469);
			match(CURLY_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__14);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(472);
					matchWildcard();
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(478);
			match(T__14);
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
		"\u0004\u0001H\u01e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000z\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0085\b\u0001\n\u0001\f\u0001\u0088\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0004\u0002\u008d\b\u0002\u000b\u0002\f"+
		"\u0002\u008e\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0094\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u009b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\u00a0\b"+
		"\u0005\u000b\u0005\f\u0005\u00a1\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00a7\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00b1\b\b\u0005\b\u00b3\b\b"+
		"\n\b\f\b\u00b6\t\b\u0001\t\u0001\t\u0001\t\u0003\t\u00bb\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c3\b\n\n\n\f\n\u00c6\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cc\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u00d0\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00d7\b\r\u0001\r\u0001\r\u0003\r\u00db\b\r\u0001\r\u0003\r"+
		"\u00de\b\r\u0003\r\u00e0\b\r\u0001\r\u0001\r\u0005\r\u00e4\b\r\n\r\f\r"+
		"\u00e7\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00f4\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f9\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010b"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0113\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0120\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0129"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012d\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0133\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0137\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0146\b\u001b"+
		"\n\u001b\f\u001b\u0149\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u014e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u015a\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u015f"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0169\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0171\b"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0005)\u0184\b)\n"+
		")\f)\u0187\t)\u0001*\u0001*\u0003*\u018b\b*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0005,\u0195\b,\n,\f,\u0198\t,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00051\u01a9\b1\n1\f1\u01ac\t1\u00012\u00012\u0001"+
		"2\u00052\u01b1\b2\n2\f2\u01b4\t2\u00013\u00013\u00013\u00033\u01b9\b3"+
		"\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00018\u00018\u00038\u01d4\b8\u00018\u00018\u0001"+
		"9\u00019\u00059\u01da\b9\n9\f9\u01dd\t9\u00019\u00019\u00019\u0001\u01db"+
		"\u0000:\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0007"+
		"\u0001\u000035\u0003\u0000\u001b\u001b\'\'67\u0003\u0000  $%)0\u0001\u0000"+
		"<=\u0001\u0000@A\u0001\u0000BD\u0001\u0000\b\r\u01d8\u0000t\u0001\u0000"+
		"\u0000\u0000\u0002~\u0001\u0000\u0000\u0000\u0004\u008c\u0001\u0000\u0000"+
		"\u0000\u0006\u0090\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000\u0000\u0000"+
		"\n\u009f\u0001\u0000\u0000\u0000\f\u00a3\u0001\u0000\u0000\u0000\u000e"+
		"\u00a8\u0001\u0000\u0000\u0000\u0010\u00b4\u0001\u0000\u0000\u0000\u0012"+
		"\u00ba\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000\u0000\u0016"+
		"\u00cb\u0001\u0000\u0000\u0000\u0018\u00cf\u0001\u0000\u0000\u0000\u001a"+
		"\u00d1\u0001\u0000\u0000\u0000\u001c\u00ea\u0001\u0000\u0000\u0000\u001e"+
		"\u00ec\u0001\u0000\u0000\u0000 \u00fc\u0001\u0000\u0000\u0000\"\u00fe"+
		"\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0104\u0001\u0000"+
		"\u0000\u0000(\u010e\u0001\u0000\u0000\u0000*\u0117\u0001\u0000\u0000\u0000"+
		",\u011b\u0001\u0000\u0000\u0000.\u0124\u0001\u0000\u0000\u00000\u012e"+
		"\u0001\u0000\u0000\u00002\u0138\u0001\u0000\u0000\u00004\u013c\u0001\u0000"+
		"\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u014f\u0001\u0000\u0000\u0000"+
		":\u0153\u0001\u0000\u0000\u0000<\u0159\u0001\u0000\u0000\u0000>\u015e"+
		"\u0001\u0000\u0000\u0000@\u0168\u0001\u0000\u0000\u0000B\u016a\u0001\u0000"+
		"\u0000\u0000D\u0170\u0001\u0000\u0000\u0000F\u0172\u0001\u0000\u0000\u0000"+
		"H\u0174\u0001\u0000\u0000\u0000J\u0176\u0001\u0000\u0000\u0000L\u0178"+
		"\u0001\u0000\u0000\u0000N\u017a\u0001\u0000\u0000\u0000P\u017d\u0001\u0000"+
		"\u0000\u0000R\u0180\u0001\u0000\u0000\u0000T\u018a\u0001\u0000\u0000\u0000"+
		"V\u018f\u0001\u0000\u0000\u0000X\u0191\u0001\u0000\u0000\u0000Z\u0199"+
		"\u0001\u0000\u0000\u0000\\\u019d\u0001\u0000\u0000\u0000^\u019f\u0001"+
		"\u0000\u0000\u0000`\u01a1\u0001\u0000\u0000\u0000b\u01a5\u0001\u0000\u0000"+
		"\u0000d\u01ad\u0001\u0000\u0000\u0000f\u01b8\u0001\u0000\u0000\u0000h"+
		"\u01ba\u0001\u0000\u0000\u0000j\u01bf\u0001\u0000\u0000\u0000l\u01c4\u0001"+
		"\u0000\u0000\u0000n\u01c9\u0001\u0000\u0000\u0000p\u01ce\u0001\u0000\u0000"+
		"\u0000r\u01d7\u0001\u0000\u0000\u0000tu\u00051\u0000\u0000uv\u0003^/\u0000"+
		"vy\u0005\u0014\u0000\u0000wz\u0003\u0010\b\u0000xz\u0003\u0004\u0002\u0000"+
		"yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0005\u0015\u0000\u0000|}\u0005\u0000\u0000\u0001}\u0001\u0001"+
		"\u0000\u0000\u0000~\u007f\u00052\u0000\u0000\u007f\u0080\u0003^/\u0000"+
		"\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0086\u0003\u0010\b\u0000\u0082"+
		"\u0083\u0005\u001d\u0000\u0000\u0083\u0085\u0003$\u0012\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0015\u0000\u0000\u008a\u0003\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0003\b\u0004\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0005\u0001\u0000\u0000\u0000\u0090\u0093\u0003"+
		"^/\u0000\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u0094\u0003R)\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0007\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0010\u0000\u0000"+
		"\u0096\u0097\u0003\u0006\u0003\u0000\u0097\u009a\u0005\u001d\u0000\u0000"+
		"\u0098\u009b\u0003\u0010\b\u0000\u0099\u009b\u0003\n\u0005\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0011\u0000\u0000\u009d"+
		"\t\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u000e\u0007\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u000b"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0003^/\u0000\u00a4\u00a5\u0005\u001c"+
		"\u0000\u0000\u00a5\u00a7\u0003R)\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\r\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0012\u0000\u0000\u00a9\u00aa\u0003\f\u0006\u0000\u00aa\u00ab"+
		"\u0005\u001d\u0000\u0000\u00ab\u00ac\u0003\u0010\b\u0000\u00ac\u00ad\u0005"+
		"\u0013\u0000\u0000\u00ad\u000f\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003"+
		"\u0012\t\u0000\u00af\u00b1\u0005\u001c\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u0011\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bb\u0003\u0014\n\u0000\u00b8\u00bb\u0003\u0016\u000b"+
		"\u0000\u00b9\u00bb\u0003@ \u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u0013\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b\u0000\u00bd"+
		"\u00be\u0003J%\u0000\u00be\u00c4\u0003\u0016\u000b\u0000\u00bf\u00c0\u0003"+
		"J%\u0000\u00c0\u00c1\u0003\u0016\u000b\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u0015\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00cc\u0003\u0018\f\u0000\u00c8\u00cc\u0003&\u0013\u0000"+
		"\u00c9\u00cc\u0003\u001e\u000f\u0000\u00ca\u00cc\u0003f3\u0000\u00cb\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u0017"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d0\u0003\u001a\r\u0000\u00ce\u00d0\u0003"+
		"\u0002\u0001\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0016\u0000\u0000\u00d2\u00d3\u0003\u001c\u000e\u0000\u00d3\u00d6\u0003"+
		"^/\u0000\u00d4\u00d5\u0005\u001c\u0000\u0000\u00d5\u00d7\u0003R)\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00df\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\u001d\u0000\u0000"+
		"\u00d9\u00db\u0003N\'\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0003P(\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00d8\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\u001d\u0000\u0000\u00e2\u00e4\u0003"+
		"$\u0012\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0017\u0000\u0000\u00e9\u001b\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0007\u0000\u0000\u0000\u00eb\u001d\u0001\u0000"+
		"\u0000\u0000\u00ec\u00f3\u0005\u0018\u0000\u0000\u00ed\u00f4\u0003\"\u0011"+
		"\u0000\u00ee\u00f4\u0003 \u0010\u0000\u00ef\u00f0\u0003 \u0010\u0000\u00f0"+
		"\u00f1\u0005\u0001\u0000\u0000\u00f1\u00f2\u0003\"\u0011\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003^/\u0000\u00f6\u00f7\u0005\u001d"+
		"\u0000\u0000\u00f7\u00f9\u0003R)\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0019\u0000\u0000\u00fb\u001f\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0007\u0001\u0000\u0000\u00fd!\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0007\u0002\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0003\u001e\u000f\u0000\u0101\u0102\u0003J%\u0000\u0102\u0103\u0003f"+
		"3\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u010a\u0005\u001a\u0000\u0000"+
		"\u0105\u010b\u0003(\u0014\u0000\u0106\u010b\u0003,\u0016\u0000\u0107\u010b"+
		"\u0003*\u0015\u0000\u0108\u010b\u0003.\u0017\u0000\u0109\u010b\u00030"+
		"\u0018\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000"+
		"\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005\u001b\u0000\u0000\u010d\'\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0005;\u0000\u0000\u010f\u0112\u0003^/\u0000\u0110"+
		"\u0111\u0005\u001d\u0000\u0000\u0111\u0113\u0003R)\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005\u001d\u0000\u0000\u0115\u0116\u0003"+
		"4\u001a\u0000\u0116)\u0001\u0000\u0000\u0000\u0117\u0118\u0005>\u0000"+
		"\u0000\u0118\u0119\u0005\u001d\u0000\u0000\u0119\u011a\u0003d2\u0000\u011a"+
		"+\u0001\u0000\u0000\u0000\u011b\u011c\u0007\u0003\u0000\u0000\u011c\u011f"+
		"\u0003^/\u0000\u011d\u011e\u0005\u001d\u0000\u0000\u011e\u0120\u0003R"+
		")\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u001d\u0000"+
		"\u0000\u0122\u0123\u00036\u001b\u0000\u0123-\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0005?\u0000\u0000\u0125\u0128\u0003^/\u0000\u0126\u0127\u0005"+
		"\u001d\u0000\u0000\u0127\u0129\u0003R)\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u001d\u0000\u0000\u012b\u012d\u00032\u0019\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d/\u0001\u0000\u0000\u0000\u012e\u012f\u0007\u0004\u0000\u0000\u012f"+
		"\u0132\u0003^/\u0000\u0130\u0131\u0005\u001d\u0000\u0000\u0131\u0133\u0003"+
		"R)\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u001d\u0000"+
		"\u0000\u0135\u0137\u00032\u0019\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u01371\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u00058\u0000\u0000\u0139\u013a\u0005\u0001\u0000\u0000\u013a\u013b"+
		"\u0003b1\u0000\u013b3\u0001\u0000\u0000\u0000\u013c\u013d\u00059\u0000"+
		"\u0000\u013d\u013e\u0005\u0001\u0000\u0000\u013e\u013f\u0003b1\u0000\u013f"+
		"5\u0001\u0000\u0000\u0000\u0140\u0141\u00059\u0000\u0000\u0141\u0142\u0005"+
		"\u0001\u0000\u0000\u0142\u0147\u00038\u001c\u0000\u0143\u0144\u0005\u0002"+
		"\u0000\u0000\u0144\u0146\u00038\u001c\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014d\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0005:\u0000\u0000"+
		"\u014b\u014c\u0005\u0001\u0000\u0000\u014c\u014e\u0003f3\u0000\u014d\u014a"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e7\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0003r9\u0000\u0150\u0151\u0005\u0001\u0000"+
		"\u0000\u0151\u0152\u0003f3\u0000\u01529\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0003<\u001e\u0000\u0154\u0155\u0003L&\u0000\u0155\u0156\u0003"+
		">\u001f\u0000\u0156;\u0001\u0000\u0000\u0000\u0157\u015a\u0003h4\u0000"+
		"\u0158\u015a\u0003j5\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a=\u0001\u0000\u0000\u0000\u015b\u015f\u0003"+
		"h4\u0000\u015c\u015f\u0003j5\u0000\u015d\u015f\u0003p8\u0000\u015e\u015b"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015f?\u0001\u0000\u0000\u0000\u0160\u0161\u0003"+
		"f3\u0000\u0161\u0162\u0003D\"\u0000\u0162\u0163\u0003B!\u0000\u0163\u0169"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0003B!\u0000\u0165\u0166\u0003D"+
		"\"\u0000\u0166\u0167\u0003f3\u0000\u0167\u0169\u0001\u0000\u0000\u0000"+
		"\u0168\u0160\u0001\u0000\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000"+
		"\u0169A\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u001e\u0000\u0000\u016b"+
		"\u016c\u0003^/\u0000\u016c\u016d\u0005\u001e\u0000\u0000\u016dC\u0001"+
		"\u0000\u0000\u0000\u016e\u0171\u0003F#\u0000\u016f\u0171\u0003H$\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000"+
		"\u0171E\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173"+
		"G\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0004\u0000\u0000\u0175I\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u0005\u0000\u0000\u0177K\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005\u0006\u0000\u0000\u0179M\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u00058\u0000\u0000\u017b\u017c\u0003X,\u0000\u017c"+
		"O\u0001\u0000\u0000\u0000\u017d\u017e\u00059\u0000\u0000\u017e\u017f\u0003"+
		"X,\u0000\u017fQ\u0001\u0000\u0000\u0000\u0180\u0185\u0003T*\u0000\u0181"+
		"\u0182\u0005\u0002\u0000\u0000\u0182\u0184\u0003T*\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186S\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0003`0\u0000"+
		"\u0189\u018b\u0003^/\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\u0007\u0000\u0000\u018d\u018e\u0003V+\u0000\u018eU\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0007\u0005\u0000\u0000\u0190W\u0001\u0000\u0000"+
		"\u0000\u0191\u0196\u0003Z-\u0000\u0192\u0193\u0005\u0002\u0000\u0000\u0193"+
		"\u0195\u0003Z-\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001"+
		"\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197Y\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0003^/\u0000\u019a\u019b\u0005\u0001\u0000\u0000"+
		"\u019b\u019c\u0003\\.\u0000\u019c[\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0007\u0006\u0000\u0000\u019e]\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"E\u0000\u0000\u01a0_\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003^/\u0000"+
		"\u01a2\u01a3\u0005\u0001\u0000\u0000\u01a3\u01a4\u0003^/\u0000\u01a4a"+
		"\u0001\u0000\u0000\u0000\u01a5\u01aa\u0003f3\u0000\u01a6\u01a7\u0005\u0002"+
		"\u0000\u0000\u01a7\u01a9\u0003f3\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01abc\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b2\u0003j5\u0000\u01ae\u01af\u0005"+
		"\u0002\u0000\u0000\u01af\u01b1\u0003j5\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3e\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b9\u0003h4\u0000\u01b6\u01b9"+
		"\u0003j5\u0000\u01b7\u01b9\u0003l6\u0000\u01b8\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9g\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u001f\u0000\u0000"+
		"\u01bb\u01bc\u0005\u0016\u0000\u0000\u01bc\u01bd\u0003^/\u0000\u01bd\u01be"+
		"\u0005\u0017\u0000\u0000\u01bei\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"\u001f\u0000\u0000\u01c0\u01c1\u0005\u0018\u0000\u0000\u01c1\u01c2\u0003"+
		"^/\u0000\u01c2\u01c3\u0005\u0019\u0000\u0000\u01c3k\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0005\u001f\u0000\u0000\u01c5\u01c6\u0005\u001a\u0000"+
		"\u0000\u01c6\u01c7\u0003^/\u0000\u01c7\u01c8\u0005\u001b\u0000\u0000\u01c8"+
		"m\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u001f\u0000\u0000\u01ca\u01cb"+
		"\u0005\u0010\u0000\u0000\u01cb\u01cc\u0003^/\u0000\u01cc\u01cd\u0005\u0011"+
		"\u0000\u0000\u01cdo\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u001f\u0000"+
		"\u0000\u01cf\u01d0\u0005\u0014\u0000\u0000\u01d0\u01d3\u0003^/\u0000\u01d1"+
		"\u01d2\u0005\u000e\u0000\u0000\u01d2\u01d4\u0003^/\u0000\u01d3\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005\u0015\u0000\u0000\u01d6q\u0001\u0000"+
		"\u0000\u0000\u01d7\u01db\u0005\u000f\u0000\u0000\u01d8\u01da\t\u0000\u0000"+
		"\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000"+
		"\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0005\u000f\u0000\u0000\u01dfs\u0001\u0000\u0000\u0000"+
		")y\u0086\u008e\u0093\u009a\u00a1\u00a6\u00b0\u00b4\u00ba\u00c4\u00cb\u00cf"+
		"\u00d6\u00da\u00dd\u00df\u00e5\u00f3\u00f8\u010a\u0112\u011f\u0128\u012c"+
		"\u0132\u0136\u0147\u014d\u0159\u015e\u0168\u0170\u0185\u018a\u0196\u01aa"+
		"\u01b2\u01b8\u01d3\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}