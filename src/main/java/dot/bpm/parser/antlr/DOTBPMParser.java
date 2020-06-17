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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, POOL_OPEN=16, 
		POOL_CLOSE=17, LANE_OPEN=18, LANE_CLOSE=19, CURLY_OPEN=20, CURLY_CLOSE=21, 
		SQRE_OPEN=22, SQRE_CLOSE=23, PAREN_OPEN=24, PAREN_CLOSE=25, ANGLE_OPEN=26, 
		ANGLE_CLOSE=27, STMT_TERM=28, VERT_LINE=29, DVERT_LINE=30, REF=31, X=32, 
		OR=33, XOR=34, AND=35, STAR=36, PLUS=37, BLANK=38, SLASH=39, DASH=40, 
		BACKWARD=41, BANG=42, QUESTION=43, CARET=44, TILDE=45, AT_SYMB=46, ELLIPSIS=47, 
		X_BANG=48, PROCESS=49, SUBPROCESS=50, USER=51, SERVICE=52, SCRIPT=53, 
		IN=54, OUT=55, DEFAULT=56, FORK=57, XOR_SPLIT=58, OR_SPLIT=59, EVENT_SPLIT=60, 
		JOIN=61, OR_JOIN=62, XOR_JOIN=63, STRING=64, NUMBER=65, BOOLEAN=66, ID=67, 
		COMMENT=68, LINE_COMMENT=69, WS=70;
	public static final int
		RULE_process = 0, RULE_subprocess = 1, RULE_pool_list = 2, RULE_pool = 3, 
		RULE_lane_list = 4, RULE_lane = 5, RULE_stmt_list = 6, RULE_stmt = 7, 
		RULE_sequence = 8, RULE_sequence_elem = 9, RULE_activity = 10, RULE_task = 11, 
		RULE_task_type = 12, RULE_event = 13, RULE_event_category = 14, RULE_event_type = 15, 
		RULE_boundary_event = 16, RULE_gateway = 17, RULE_fork_diverge = 18, RULE_event_diverge = 19, 
		RULE_condition_diverge = 20, RULE_and_converge = 21, RULE_or_converge = 22, 
		RULE_inflows = 23, RULE_outflows = 24, RULE_cond_outflows = 25, RULE_cond_outflow = 26, 
		RULE_message = 27, RULE_sender = 28, RULE_recipient = 29, RULE_association = 30, 
		RULE_artifact = 31, RULE_assoc_flow = 32, RULE_dir_assoc = 33, RULE_undir_assoc = 34, 
		RULE_sequence_flow = 35, RULE_message_flow = 36, RULE_input_set = 37, 
		RULE_output_set = 38, RULE_attr_list = 39, RULE_attribute = 40, RULE_attr_value = 41, 
		RULE_param_list = 42, RULE_param = 43, RULE_param_type = 44, RULE_id = 45, 
		RULE_namespace_id = 46, RULE_link_list = 47, RULE_event_links = 48, RULE_link = 49, 
		RULE_activity_link = 50, RULE_event_link = 51, RULE_gateway_link = 52, 
		RULE_pool_link = 53, RULE_endpoint_link = 54, RULE_expression = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"process", "subprocess", "pool_list", "pool", "lane_list", "lane", "stmt_list", 
			"stmt", "sequence", "sequence_elem", "activity", "task", "task_type", 
			"event", "event_category", "event_type", "boundary_event", "gateway", 
			"fork_diverge", "event_diverge", "condition_diverge", "and_converge", 
			"or_converge", "inflows", "outflows", "cond_outflows", "cond_outflow", 
			"message", "sender", "recipient", "association", "artifact", "assoc_flow", 
			"dir_assoc", "undir_assoc", "sequence_flow", "message_flow", "input_set", 
			"output_set", "attr_list", "attribute", "attr_value", "param_list", "param", 
			"param_type", "id", "namespace_id", "link_list", "event_links", "link", 
			"activity_link", "event_link", "gateway_link", "pool_link", "endpoint_link", 
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
			null, null, null, "'(*)'"
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
			"IN", "OUT", "DEFAULT", "FORK", "XOR_SPLIT", "OR_SPLIT", "EVENT_SPLIT", 
			"JOIN", "OR_JOIN", "XOR_JOIN", "STRING", "NUMBER", "BOOLEAN", "ID", "COMMENT", 
			"LINE_COMMENT", "WS"
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
			setState(112);
			match(PROCESS);
			setState(113);
			id();
			setState(114);
			match(CURLY_OPEN);
			setState(117);
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
				setState(115);
				stmt_list();
				}
				break;
			case POOL_OPEN:
				{
				setState(116);
				pool_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119);
			match(CURLY_CLOSE);
			setState(120);
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
			setState(122);
			match(SUBPROCESS);
			setState(123);
			id();
			setState(124);
			match(CURLY_OPEN);
			setState(125);
			stmt_list();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_LINE) {
				{
				{
				setState(126);
				match(VERT_LINE);
				setState(127);
				boundary_event();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				pool();
				}
				}
				setState(138); 
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

	public static class PoolContext extends ParserRuleContext {
		public TerminalNode POOL_OPEN() { return getToken(DOTBPMParser.POOL_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode VERT_LINE() { return getToken(DOTBPMParser.VERT_LINE, 0); }
		public TerminalNode POOL_CLOSE() { return getToken(DOTBPMParser.POOL_CLOSE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Lane_listContext lane_list() {
			return getRuleContext(Lane_listContext.class,0);
		}
		public TerminalNode STMT_TERM() { return getToken(DOTBPMParser.STMT_TERM, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
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
		enterRule(_localctx, 6, RULE_pool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(POOL_OPEN);
			setState(141);
			id();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(142);
				match(STMT_TERM);
				setState(143);
				attr_list();
				}
			}

			setState(146);
			match(VERT_LINE);
			setState(149);
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
				setState(147);
				stmt_list();
				}
				break;
			case LANE_OPEN:
				{
				setState(148);
				lane_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
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
		enterRule(_localctx, 8, RULE_lane_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				lane();
				}
				}
				setState(156); 
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

	public static class LaneContext extends ParserRuleContext {
		public TerminalNode LANE_OPEN() { return getToken(DOTBPMParser.LANE_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode VERT_LINE() { return getToken(DOTBPMParser.VERT_LINE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode LANE_CLOSE() { return getToken(DOTBPMParser.LANE_CLOSE, 0); }
		public TerminalNode STMT_TERM() { return getToken(DOTBPMParser.STMT_TERM, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_lane);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LANE_OPEN);
			setState(159);
			id();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(160);
				match(STMT_TERM);
				setState(161);
				attr_list();
				}
			}

			setState(164);
			match(VERT_LINE);
			setState(165);
			stmt_list();
			setState(166);
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
		enterRule(_localctx, 12, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRE_OPEN) | (1L << PAREN_OPEN) | (1L << ANGLE_OPEN) | (1L << DVERT_LINE) | (1L << REF) | (1L << SUBPROCESS))) != 0)) {
				{
				{
				setState(168);
				stmt();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STMT_TERM) {
					{
					setState(169);
					match(STMT_TERM);
					}
				}

				}
				}
				setState(176);
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
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				sequence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				sequence_elem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
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
		enterRule(_localctx, 16, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			sequence_elem();
			setState(183);
			sequence_flow();
			setState(184);
			sequence_elem();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(185);
				sequence_flow();
				setState(186);
				sequence_elem();
				}
				}
				setState(192);
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
		enterRule(_localctx, 18, RULE_sequence_elem);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRE_OPEN:
			case SUBPROCESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				activity();
				}
				break;
			case ANGLE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				gateway();
				}
				break;
			case PAREN_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				event();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
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
		enterRule(_localctx, 20, RULE_activity);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				task();
				}
				break;
			case SUBPROCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
		enterRule(_localctx, 22, RULE_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SQRE_OPEN);
			setState(204);
			task_type();
			setState(205);
			id();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(206);
				match(STMT_TERM);
				setState(207);
				attr_list();
				}
			}

			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(210);
				match(VERT_LINE);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(211);
					input_set();
					}
				}

				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUT) {
					{
					setState(214);
					output_set();
					}
				}

				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_LINE) {
				{
				{
				setState(219);
				match(VERT_LINE);
				setState(220);
				boundary_event();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
		enterRule(_localctx, 24, RULE_task_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USER) | (1L << SERVICE) | (1L << SCRIPT))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(PAREN_OPEN);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(231);
				event_type();
				}
				break;
			case 2:
				{
				setState(232);
				event_category();
				}
				break;
			case 3:
				{
				setState(233);
				event_category();
				setState(234);
				match(T__0);
				setState(235);
				event_type();
				}
				break;
			}
			setState(239);
			id();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(240);
				match(VERT_LINE);
				setState(241);
				attr_list();
				}
			}

			setState(244);
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

	public static class Event_categoryContext extends ParserRuleContext {
		public TerminalNode ANGLE_CLOSE() { return getToken(DOTBPMParser.ANGLE_CLOSE, 0); }
		public TerminalNode SLASH() { return getToken(DOTBPMParser.SLASH, 0); }
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
		enterRule(_localctx, 28, RULE_event_category);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==ANGLE_CLOSE || _la==SLASH) ) {
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
		enterRule(_localctx, 30, RULE_event_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << X) | (1L << STAR) | (1L << PLUS) | (1L << BACKWARD) | (1L << BANG) | (1L << QUESTION) | (1L << CARET) | (1L << TILDE) | (1L << AT_SYMB) | (1L << ELLIPSIS) | (1L << X_BANG))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_boundary_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			event();
			setState(251);
			sequence_flow();
			setState(252);
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
		enterRule(_localctx, 34, RULE_gateway);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ANGLE_OPEN);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORK:
				{
				setState(255);
				fork_diverge();
				}
				break;
			case XOR_SPLIT:
			case OR_SPLIT:
				{
				setState(256);
				condition_diverge();
				}
				break;
			case EVENT_SPLIT:
				{
				setState(257);
				event_diverge();
				}
				break;
			case JOIN:
				{
				setState(258);
				and_converge();
				}
				break;
			case OR_JOIN:
			case XOR_JOIN:
				{
				setState(259);
				or_converge();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
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
		enterRule(_localctx, 36, RULE_fork_diverge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(FORK);
			setState(265);
			id();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(266);
				match(VERT_LINE);
				setState(267);
				attr_list();
				}
				break;
			}
			setState(270);
			match(VERT_LINE);
			setState(271);
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
		enterRule(_localctx, 38, RULE_event_diverge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(EVENT_SPLIT);
			setState(274);
			match(VERT_LINE);
			setState(275);
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
		enterRule(_localctx, 40, RULE_condition_diverge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==XOR_SPLIT || _la==OR_SPLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(278);
			id();
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(279);
				match(VERT_LINE);
				setState(280);
				attr_list();
				}
				break;
			}
			setState(283);
			match(VERT_LINE);
			setState(284);
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
		enterRule(_localctx, 42, RULE_and_converge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(JOIN);
			setState(287);
			id();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(288);
				match(VERT_LINE);
				setState(289);
				attr_list();
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(292);
				match(VERT_LINE);
				setState(293);
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
		enterRule(_localctx, 44, RULE_or_converge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==OR_JOIN || _la==XOR_JOIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(297);
			id();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(298);
				match(VERT_LINE);
				setState(299);
				attr_list();
				}
				break;
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(302);
				match(VERT_LINE);
				setState(303);
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
		enterRule(_localctx, 46, RULE_inflows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IN);
			setState(307);
			match(T__0);
			setState(308);
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
		enterRule(_localctx, 48, RULE_outflows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OUT);
			setState(311);
			match(T__0);
			setState(312);
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
		enterRule(_localctx, 50, RULE_cond_outflows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(OUT);
			setState(315);
			match(T__0);
			setState(316);
			cond_outflow();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(317);
				match(T__1);
				setState(318);
				cond_outflow();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(324);
				match(DEFAULT);
				setState(325);
				match(T__0);
				setState(326);
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
		enterRule(_localctx, 52, RULE_cond_outflow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			expression();
			setState(330);
			match(T__0);
			setState(331);
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
		enterRule(_localctx, 54, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			sender();
			setState(334);
			message_flow();
			setState(335);
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
		enterRule(_localctx, 56, RULE_sender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(337);
				activity_link();
				}
				break;
			case 2:
				{
				setState(338);
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
		enterRule(_localctx, 58, RULE_recipient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(341);
				activity_link();
				}
				break;
			case 2:
				{
				setState(342);
				event_link();
				}
				break;
			case 3:
				{
				setState(343);
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
		enterRule(_localctx, 60, RULE_association);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REF:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(346);
				link();
				setState(347);
				assoc_flow();
				setState(348);
				artifact();
				}
				}
				break;
			case DVERT_LINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(350);
				artifact();
				setState(351);
				assoc_flow();
				setState(352);
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
		enterRule(_localctx, 62, RULE_artifact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(DVERT_LINE);
			setState(357);
			id();
			setState(358);
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
		enterRule(_localctx, 64, RULE_assoc_flow);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				dir_assoc();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
		enterRule(_localctx, 66, RULE_dir_assoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		enterRule(_localctx, 68, RULE_undir_assoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		enterRule(_localctx, 70, RULE_sequence_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		enterRule(_localctx, 72, RULE_message_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
		enterRule(_localctx, 74, RULE_input_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IN);
			setState(373);
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
		enterRule(_localctx, 76, RULE_output_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(OUT);
			setState(376);
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
		enterRule(_localctx, 78, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			attribute();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(379);
				match(T__1);
				setState(380);
				attribute();
				}
				}
				setState(385);
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
		enterRule(_localctx, 80, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(386);
				namespace_id();
				}
				break;
			case 2:
				{
				setState(387);
				id();
				}
				break;
			}
			setState(390);
			match(T__6);
			setState(391);
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
		enterRule(_localctx, 82, RULE_attr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING - 64)) | (1L << (NUMBER - 64)) | (1L << (BOOLEAN - 64)))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			param();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(396);
				match(T__1);
				setState(397);
				param();
				}
				}
				setState(402);
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
		enterRule(_localctx, 86, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			id();
			setState(404);
			match(T__0);
			setState(405);
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
		enterRule(_localctx, 88, RULE_param_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 92, RULE_namespace_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			id();
			setState(412);
			match(T__0);
			setState(413);
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
		enterRule(_localctx, 94, RULE_link_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			link();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(416);
				match(T__1);
				setState(417);
				link();
				}
				}
				setState(422);
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
		enterRule(_localctx, 96, RULE_event_links);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			event_link();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(424);
				match(T__1);
				setState(425);
				event_link();
				}
				}
				setState(430);
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
		enterRule(_localctx, 98, RULE_link);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				activity_link();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				event_link();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
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
		enterRule(_localctx, 100, RULE_activity_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(REF);
			setState(437);
			match(SQRE_OPEN);
			setState(438);
			id();
			setState(439);
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
		enterRule(_localctx, 102, RULE_event_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(REF);
			setState(442);
			match(PAREN_OPEN);
			setState(443);
			id();
			setState(444);
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
		enterRule(_localctx, 104, RULE_gateway_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(REF);
			setState(447);
			match(ANGLE_OPEN);
			setState(448);
			id();
			setState(449);
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
		enterRule(_localctx, 106, RULE_pool_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(REF);
			setState(452);
			match(POOL_OPEN);
			setState(453);
			id();
			setState(454);
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
		enterRule(_localctx, 108, RULE_endpoint_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(REF);
			setState(457);
			match(CURLY_OPEN);
			setState(458);
			id();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(459);
				match(T__13);
				setState(460);
				id();
				}
			}

			setState(463);
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
		enterRule(_localctx, 110, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__14);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(466);
					matchWildcard();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(472);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u01dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\5\2"+
		"x\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086"+
		"\13\3\3\3\3\3\3\4\6\4\u008b\n\4\r\4\16\4\u008c\3\5\3\5\3\5\3\5\5\5\u0093"+
		"\n\5\3\5\3\5\3\5\5\5\u0098\n\5\3\5\3\5\3\6\6\6\u009d\n\6\r\6\16\6\u009e"+
		"\3\7\3\7\3\7\3\7\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00ad\n\b\7"+
		"\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00c8\n\13\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00d3\n\r\3"+
		"\r\3\r\5\r\u00d7\n\r\3\r\5\r\u00da\n\r\5\r\u00dc\n\r\3\r\3\r\7\r\u00e0"+
		"\n\r\f\r\16\r\u00e3\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00f0\n\17\3\17\3\17\3\17\5\17\u00f5\n\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0107\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u010f\n\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u011c\n\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\5\27\u0125\n\27\3\27\3\27\5\27\u0129\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u012f\n\30\3\30\3\30\5\30\u0133\n\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u0142\n\33"+
		"\f\33\16\33\u0145\13\33\3\33\3\33\3\33\5\33\u014a\n\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u0156\n\36\3\37\3\37\3\37\5\37"+
		"\u015b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0165\n \3!\3!\3!\3!\3\"\3\"\5"+
		"\"\u016d\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\7)"+
		"\u0180\n)\f)\16)\u0183\13)\3*\3*\5*\u0187\n*\3*\3*\3*\3+\3+\3,\3,\3,\7"+
		",\u0191\n,\f,\16,\u0194\13,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\7\61\u01a5\n\61\f\61\16\61\u01a8\13\61\3\62\3\62\3\62"+
		"\7\62\u01ad\n\62\f\62\16\62\u01b0\13\62\3\63\3\63\3\63\5\63\u01b5\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\58\u01d0\n8\38\38\39\39"+
		"\79\u01d6\n9\f9\169\u01d9\139\39\39\39\3\u01d7\2:\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"\2\t\3\2\65\67\4\2\35\35))\5\2\"\"&\'+\62\3\2<=\3\2@A\3\2BD\3\2\n\17\2"+
		"\u01d6\2r\3\2\2\2\4|\3\2\2\2\6\u008a\3\2\2\2\b\u008e\3\2\2\2\n\u009c\3"+
		"\2\2\2\f\u00a0\3\2\2\2\16\u00b0\3\2\2\2\20\u00b6\3\2\2\2\22\u00b8\3\2"+
		"\2\2\24\u00c7\3\2\2\2\26\u00cb\3\2\2\2\30\u00cd\3\2\2\2\32\u00e6\3\2\2"+
		"\2\34\u00e8\3\2\2\2\36\u00f8\3\2\2\2 \u00fa\3\2\2\2\"\u00fc\3\2\2\2$\u0100"+
		"\3\2\2\2&\u010a\3\2\2\2(\u0113\3\2\2\2*\u0117\3\2\2\2,\u0120\3\2\2\2."+
		"\u012a\3\2\2\2\60\u0134\3\2\2\2\62\u0138\3\2\2\2\64\u013c\3\2\2\2\66\u014b"+
		"\3\2\2\28\u014f\3\2\2\2:\u0155\3\2\2\2<\u015a\3\2\2\2>\u0164\3\2\2\2@"+
		"\u0166\3\2\2\2B\u016c\3\2\2\2D\u016e\3\2\2\2F\u0170\3\2\2\2H\u0172\3\2"+
		"\2\2J\u0174\3\2\2\2L\u0176\3\2\2\2N\u0179\3\2\2\2P\u017c\3\2\2\2R\u0186"+
		"\3\2\2\2T\u018b\3\2\2\2V\u018d\3\2\2\2X\u0195\3\2\2\2Z\u0199\3\2\2\2\\"+
		"\u019b\3\2\2\2^\u019d\3\2\2\2`\u01a1\3\2\2\2b\u01a9\3\2\2\2d\u01b4\3\2"+
		"\2\2f\u01b6\3\2\2\2h\u01bb\3\2\2\2j\u01c0\3\2\2\2l\u01c5\3\2\2\2n\u01ca"+
		"\3\2\2\2p\u01d3\3\2\2\2rs\7\63\2\2st\5\\/\2tw\7\26\2\2ux\5\16\b\2vx\5"+
		"\6\4\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2yz\7\27\2\2z{\7\2\2\3{\3\3\2\2\2|"+
		"}\7\64\2\2}~\5\\/\2~\177\7\26\2\2\177\u0084\5\16\b\2\u0080\u0081\7\37"+
		"\2\2\u0081\u0083\5\"\22\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\27\2\2\u0088\5\3\2\2\2\u0089\u008b\5\b\5\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\7\3\2\2\2\u008e\u008f\7\22\2\2\u008f\u0092\5\\/\2\u0090\u0091\7\36\2"+
		"\2\u0091\u0093\5P)\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0097\7\37\2\2\u0095\u0098\5\16\b\2\u0096\u0098\5\n\6\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\7\23\2\2\u009a\t\3\2\2\2\u009b\u009d\5\f\7\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13\3\2\2"+
		"\2\u00a0\u00a1\7\24\2\2\u00a1\u00a4\5\\/\2\u00a2\u00a3\7\36\2\2\u00a3"+
		"\u00a5\5P)\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2"+
		"\2\u00a6\u00a7\7\37\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7\25\2\2\u00a9"+
		"\r\3\2\2\2\u00aa\u00ac\5\20\t\2\u00ab\u00ad\7\36\2\2\u00ac\u00ab\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\17\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b7\5\22\n\2\u00b4\u00b7\5\24\13\2\u00b5\u00b7"+
		"\5> \2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\21\3\2\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\5H%\2\u00ba\u00c0\5\24\13"+
		"\2\u00bb\u00bc\5H%\2\u00bc\u00bd\5\24\13\2\u00bd\u00bf\3\2\2\2\u00be\u00bb"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\23\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c8\5\26\f\2\u00c4\u00c8\5$\23"+
		"\2\u00c5\u00c8\5\34\17\2\u00c6\u00c8\5d\63\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\25\3\2\2"+
		"\2\u00c9\u00cc\5\30\r\2\u00ca\u00cc\5\4\3\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00cf\5\32"+
		"\16\2\u00cf\u00d2\5\\/\2\u00d0\u00d1\7\36\2\2\u00d1\u00d3\5P)\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00db\3\2\2\2\u00d4\u00d6\7\37"+
		"\2\2\u00d5\u00d7\5L\'\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00da\5N(\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2"+
		"\2\u00da\u00dc\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e1"+
		"\3\2\2\2\u00dd\u00de\7\37\2\2\u00de\u00e0\5\"\22\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\31\2\2\u00e5\31\3\2\2\2\u00e6"+
		"\u00e7\t\2\2\2\u00e7\33\3\2\2\2\u00e8\u00ef\7\32\2\2\u00e9\u00f0\5 \21"+
		"\2\u00ea\u00f0\5\36\20\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\3\2\2\u00ed"+
		"\u00ee\5 \21\2\u00ee\u00f0\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2"+
		"\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\5\\/\2\u00f2"+
		"\u00f3\7\37\2\2\u00f3\u00f5\5P)\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\33\2\2\u00f7\35\3\2\2\2\u00f8\u00f9"+
		"\t\3\2\2\u00f9\37\3\2\2\2\u00fa\u00fb\t\4\2\2\u00fb!\3\2\2\2\u00fc\u00fd"+
		"\5\34\17\2\u00fd\u00fe\5H%\2\u00fe\u00ff\5d\63\2\u00ff#\3\2\2\2\u0100"+
		"\u0106\7\34\2\2\u0101\u0107\5&\24\2\u0102\u0107\5*\26\2\u0103\u0107\5"+
		"(\25\2\u0104\u0107\5,\27\2\u0105\u0107\5.\30\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\35\2\2\u0109%\3\2\2\2\u010a\u010b"+
		"\7;\2\2\u010b\u010e\5\\/\2\u010c\u010d\7\37\2\2\u010d\u010f\5P)\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\37"+
		"\2\2\u0111\u0112\5\62\32\2\u0112\'\3\2\2\2\u0113\u0114\7>\2\2\u0114\u0115"+
		"\7\37\2\2\u0115\u0116\5b\62\2\u0116)\3\2\2\2\u0117\u0118\t\5\2\2\u0118"+
		"\u011b\5\\/\2\u0119\u011a\7\37\2\2\u011a\u011c\5P)\2\u011b\u0119\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\37\2\2\u011e"+
		"\u011f\5\64\33\2\u011f+\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0124\5\\/\2"+
		"\u0122\u0123\7\37\2\2\u0123\u0125\5P)\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\7\37\2\2\u0127\u0129\5\60\31"+
		"\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129-\3\2\2\2\u012a\u012b"+
		"\t\6\2\2\u012b\u012e\5\\/\2\u012c\u012d\7\37\2\2\u012d\u012f\5P)\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\7\37"+
		"\2\2\u0131\u0133\5\60\31\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"/\3\2\2\2\u0134\u0135\78\2\2\u0135\u0136\7\3\2\2\u0136\u0137\5`\61\2\u0137"+
		"\61\3\2\2\2\u0138\u0139\79\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5`\61\2"+
		"\u013b\63\3\2\2\2\u013c\u013d\79\2\2\u013d\u013e\7\3\2\2\u013e\u0143\5"+
		"\66\34\2\u013f\u0140\7\4\2\2\u0140\u0142\5\66\34\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7:\2\2\u0147\u0148\7\3\2\2\u0148"+
		"\u014a\5d\63\2\u0149\u0146\3\2\2\2\u0149\u014a\3\2\2\2\u014a\65\3\2\2"+
		"\2\u014b\u014c\5p9\2\u014c\u014d\7\3\2\2\u014d\u014e\5d\63\2\u014e\67"+
		"\3\2\2\2\u014f\u0150\5:\36\2\u0150\u0151\5J&\2\u0151\u0152\5<\37\2\u0152"+
		"9\3\2\2\2\u0153\u0156\5f\64\2\u0154\u0156\5h\65\2\u0155\u0153\3\2\2\2"+
		"\u0155\u0154\3\2\2\2\u0156;\3\2\2\2\u0157\u015b\5f\64\2\u0158\u015b\5"+
		"h\65\2\u0159\u015b\5n8\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b=\3\2\2\2\u015c\u015d\5d\63\2\u015d\u015e\5B\"\2\u015e"+
		"\u015f\5@!\2\u015f\u0165\3\2\2\2\u0160\u0161\5@!\2\u0161\u0162\5B\"\2"+
		"\u0162\u0163\5d\63\2\u0163\u0165\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u0160"+
		"\3\2\2\2\u0165?\3\2\2\2\u0166\u0167\7 \2\2\u0167\u0168\5\\/\2\u0168\u0169"+
		"\7 \2\2\u0169A\3\2\2\2\u016a\u016d\5D#\2\u016b\u016d\5F$\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016b\3\2\2\2\u016dC\3\2\2\2\u016e\u016f\7\5\2\2\u016f"+
		"E\3\2\2\2\u0170\u0171\7\6\2\2\u0171G\3\2\2\2\u0172\u0173\7\7\2\2\u0173"+
		"I\3\2\2\2\u0174\u0175\7\b\2\2\u0175K\3\2\2\2\u0176\u0177\78\2\2\u0177"+
		"\u0178\5V,\2\u0178M\3\2\2\2\u0179\u017a\79\2\2\u017a\u017b\5V,\2\u017b"+
		"O\3\2\2\2\u017c\u0181\5R*\2\u017d\u017e\7\4\2\2\u017e\u0180\5R*\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182Q\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0187\5^\60\2\u0185\u0187"+
		"\5\\/\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\7\t\2\2\u0189\u018a\5T+\2\u018aS\3\2\2\2\u018b\u018c\t\7\2\2\u018c"+
		"U\3\2\2\2\u018d\u0192\5X-\2\u018e\u018f\7\4\2\2\u018f\u0191\5X-\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193W\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\5\\/\2\u0196\u0197"+
		"\7\3\2\2\u0197\u0198\5Z.\2\u0198Y\3\2\2\2\u0199\u019a\t\b\2\2\u019a[\3"+
		"\2\2\2\u019b\u019c\7E\2\2\u019c]\3\2\2\2\u019d\u019e\5\\/\2\u019e\u019f"+
		"\7\3\2\2\u019f\u01a0\5\\/\2\u01a0_\3\2\2\2\u01a1\u01a6\5d\63\2\u01a2\u01a3"+
		"\7\4\2\2\u01a3\u01a5\5d\63\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7a\3\2\2\2\u01a8\u01a6\3\2\2\2"+
		"\u01a9\u01ae\5h\65\2\u01aa\u01ab\7\4\2\2\u01ab\u01ad\5h\65\2\u01ac\u01aa"+
		"\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"c\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b5\5f\64\2\u01b2\u01b5\5h\65\2"+
		"\u01b3\u01b5\5j\66\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b5e\3\2\2\2\u01b6\u01b7\7!\2\2\u01b7\u01b8\7\30\2\2\u01b8"+
		"\u01b9\5\\/\2\u01b9\u01ba\7\31\2\2\u01bag\3\2\2\2\u01bb\u01bc\7!\2\2\u01bc"+
		"\u01bd\7\32\2\2\u01bd\u01be\5\\/\2\u01be\u01bf\7\33\2\2\u01bfi\3\2\2\2"+
		"\u01c0\u01c1\7!\2\2\u01c1\u01c2\7\34\2\2\u01c2\u01c3\5\\/\2\u01c3\u01c4"+
		"\7\35\2\2\u01c4k\3\2\2\2\u01c5\u01c6\7!\2\2\u01c6\u01c7\7\22\2\2\u01c7"+
		"\u01c8\5\\/\2\u01c8\u01c9\7\23\2\2\u01c9m\3\2\2\2\u01ca\u01cb\7!\2\2\u01cb"+
		"\u01cc\7\26\2\2\u01cc\u01cf\5\\/\2\u01cd\u01ce\7\20\2\2\u01ce\u01d0\5"+
		"\\/\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\7\27\2\2\u01d2o\3\2\2\2\u01d3\u01d7\7\21\2\2\u01d4\u01d6\13\2\2"+
		"\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7\21\2\2"+
		"\u01dbq\3\2\2\2+w\u0084\u008c\u0092\u0097\u009e\u00a4\u00ac\u00b0\u00b6"+
		"\u00c0\u00c7\u00cb\u00d2\u00d6\u00d9\u00db\u00e1\u00ef\u00f4\u0106\u010e"+
		"\u011b\u0124\u0128\u012e\u0132\u0143\u0149\u0155\u015a\u0164\u016c\u0181"+
		"\u0186\u0192\u01a6\u01ae\u01b4\u01cf\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}