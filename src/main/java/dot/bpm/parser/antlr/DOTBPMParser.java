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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, POOL_OPEN=15, POOL_CLOSE=16, 
		LANE_OPEN=17, LANE_CLOSE=18, CURLY_OPEN=19, CURLY_CLOSE=20, SQRE_OPEN=21, 
		SQRE_CLOSE=22, PAREN_OPEN=23, PAREN_CLOSE=24, ANGLE_OPEN=25, ANGLE_CLOSE=26, 
		STMT_TERM=27, VERT_LINE=28, DVERT_LINE=29, REF=30, X=31, OR=32, XOR=33, 
		AND=34, STAR=35, PLUS=36, BLANK=37, SLASH=38, DASH=39, BACKWARD=40, BANG=41, 
		QUESTION=42, CARET=43, TILDE=44, AT_SYMB=45, ELLIPSIS=46, X_BANG=47, PROCESS=48, 
		SUBPROCESS=49, USER=50, SERVICE=51, SCRIPT=52, IN=53, OUT=54, DEFAULT=55, 
		FORK=56, XOR_SPLIT=57, OR_SPLIT=58, EVENT_SPLIT=59, JOIN=60, OR_JOIN=61, 
		XOR_JOIN=62, STRING=63, NUMBER=64, BOOLEAN=65, ID=66, COMMENT=67, LINE_COMMENT=68, 
		WS=69;
	public static final int
		RULE_process = 0, RULE_subprocess = 1, RULE_pool_list = 2, RULE_pool = 3, 
		RULE_lane_list = 4, RULE_lane = 5, RULE_stmt_list = 6, RULE_stmt = 7, 
		RULE_sequence = 8, RULE_sequence_elem = 9, RULE_activity = 10, RULE_task = 11, 
		RULE_task_type = 12, RULE_event = 13, RULE_event_type = 14, RULE_boundary_event = 15, 
		RULE_gateway = 16, RULE_fork_diverge = 17, RULE_event_diverge = 18, RULE_condition_diverge = 19, 
		RULE_and_converge = 20, RULE_or_converge = 21, RULE_inflows = 22, RULE_outflows = 23, 
		RULE_cond_outflows = 24, RULE_cond_outflow = 25, RULE_association = 26, 
		RULE_artifact = 27, RULE_assoc_flow = 28, RULE_dir_assoc = 29, RULE_undir_assoc = 30, 
		RULE_sequence_flow = 31, RULE_message_flow = 32, RULE_input_set = 33, 
		RULE_output_set = 34, RULE_attr_list = 35, RULE_attribute = 36, RULE_attr_value = 37, 
		RULE_param_list = 38, RULE_param = 39, RULE_param_type = 40, RULE_id = 41, 
		RULE_link_list = 42, RULE_event_links = 43, RULE_link = 44, RULE_activity_link = 45, 
		RULE_event_link = 46, RULE_gateway_link = 47, RULE_pool_link = 48, RULE_process_link = 49, 
		RULE_expression = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"process", "subprocess", "pool_list", "pool", "lane_list", "lane", "stmt_list", 
			"stmt", "sequence", "sequence_elem", "activity", "task", "task_type", 
			"event", "event_type", "boundary_event", "gateway", "fork_diverge", "event_diverge", 
			"condition_diverge", "and_converge", "or_converge", "inflows", "outflows", 
			"cond_outflows", "cond_outflow", "association", "artifact", "assoc_flow", 
			"dir_assoc", "undir_assoc", "sequence_flow", "message_flow", "input_set", 
			"output_set", "attr_list", "attribute", "attr_value", "param_list", "param", 
			"param_type", "id", "link_list", "event_links", "link", "activity_link", 
			"event_link", "gateway_link", "pool_link", "process_link", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'->-'", "'---'", "'==>'", "'-->'", "'='", "'string'", 
			"'boolean'", "'number'", "'date'", "'datetime'", "'time'", "'`'", "'(('", 
			"'))'", "'|['", "']|'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'<'", 
			"'>'", "';'", "'|'", "'||'", "'#'", "'X'", "'OR'", "'XOR'", "'AND'", 
			"'*'", "'+'", "'_'", "'/'", "'-'", "'<<'", "'!'", "'?'", "'^'", "'~'", 
			"'@'", "'..'", "'X!'", null, null, null, null, null, null, null, null, 
			null, null, null, "'(*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "POOL_OPEN", "POOL_CLOSE", "LANE_OPEN", "LANE_CLOSE", 
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
			setState(102);
			match(PROCESS);
			setState(103);
			id();
			setState(104);
			match(CURLY_OPEN);
			setState(107);
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
				setState(105);
				stmt_list();
				}
				break;
			case POOL_OPEN:
				{
				setState(106);
				pool_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(CURLY_CLOSE);
			setState(110);
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
			setState(112);
			match(SUBPROCESS);
			setState(113);
			id();
			setState(114);
			match(CURLY_OPEN);
			setState(115);
			stmt_list();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_LINE) {
				{
				{
				setState(116);
				match(VERT_LINE);
				setState(117);
				boundary_event();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				pool();
				}
				}
				setState(128); 
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
			setState(130);
			match(POOL_OPEN);
			setState(131);
			id();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(132);
				match(STMT_TERM);
				setState(133);
				attr_list();
				}
			}

			setState(136);
			match(VERT_LINE);
			setState(139);
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
				setState(137);
				stmt_list();
				}
				break;
			case LANE_OPEN:
				{
				setState(138);
				lane_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
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
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				lane();
				}
				}
				setState(146); 
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
			setState(148);
			match(LANE_OPEN);
			setState(149);
			id();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STMT_TERM) {
				{
				setState(150);
				match(STMT_TERM);
				setState(151);
				attr_list();
				}
			}

			setState(154);
			match(VERT_LINE);
			setState(155);
			stmt_list();
			setState(156);
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
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRE_OPEN) | (1L << PAREN_OPEN) | (1L << ANGLE_OPEN) | (1L << DVERT_LINE) | (1L << REF) | (1L << SUBPROCESS))) != 0)) {
				{
				{
				setState(158);
				stmt();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STMT_TERM) {
					{
					setState(159);
					match(STMT_TERM);
					}
				}

				}
				}
				setState(166);
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
		public Sequence_elemContext sequence_elem() {
			return getRuleContext(Sequence_elemContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				sequence_elem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				sequence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
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
			setState(172);
			sequence_elem();
			setState(173);
			sequence_flow();
			setState(174);
			sequence_elem();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(175);
				sequence_flow();
				setState(176);
				sequence_elem();
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRE_OPEN:
			case SUBPROCESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				activity();
				}
				break;
			case ANGLE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				gateway();
				}
				break;
			case PAREN_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				event();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				task();
				}
				break;
			case SUBPROCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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
		public List<TerminalNode> VERT_LINE() { return getTokens(DOTBPMParser.VERT_LINE); }
		public TerminalNode VERT_LINE(int i) {
			return getToken(DOTBPMParser.VERT_LINE, i);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
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
			setState(193);
			match(SQRE_OPEN);
			setState(194);
			task_type();
			setState(195);
			id();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(196);
				match(VERT_LINE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(197);
					input_set();
					}
				}

				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUT) {
					{
					setState(200);
					output_set();
					}
				}

				}
				break;
			}
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(205);
				match(VERT_LINE);
				setState(206);
				attr_list();
				}
				break;
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_LINE) {
				{
				{
				setState(209);
				match(VERT_LINE);
				setState(210);
				boundary_event();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
			setState(218);
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
		public Event_typeContext event_type() {
			return getRuleContext(Event_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(DOTBPMParser.PAREN_CLOSE, 0); }
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
			setState(220);
			match(PAREN_OPEN);
			setState(221);
			event_type();
			setState(222);
			id();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(223);
				match(VERT_LINE);
				setState(224);
				attr_list();
				}
			}

			setState(227);
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

	public static class Event_typeContext extends ParserRuleContext {
		public TerminalNode ANGLE_CLOSE() { return getToken(DOTBPMParser.ANGLE_CLOSE, 0); }
		public TerminalNode SLASH() { return getToken(DOTBPMParser.SLASH, 0); }
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
		public TerminalNode BLANK() { return getToken(DOTBPMParser.BLANK, 0); }
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
		enterRule(_localctx, 28, RULE_event_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANGLE_CLOSE) | (1L << X) | (1L << STAR) | (1L << PLUS) | (1L << BLANK) | (1L << SLASH) | (1L << BACKWARD) | (1L << BANG) | (1L << QUESTION) | (1L << CARET) | (1L << TILDE) | (1L << AT_SYMB) | (1L << ELLIPSIS) | (1L << X_BANG))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_boundary_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			event();
			setState(232);
			sequence_flow();
			setState(233);
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
		enterRule(_localctx, 32, RULE_gateway);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ANGLE_OPEN);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORK:
				{
				setState(236);
				fork_diverge();
				}
				break;
			case XOR_SPLIT:
			case OR_SPLIT:
				{
				setState(237);
				condition_diverge();
				}
				break;
			case EVENT_SPLIT:
				{
				setState(238);
				event_diverge();
				}
				break;
			case JOIN:
				{
				setState(239);
				and_converge();
				}
				break;
			case OR_JOIN:
			case XOR_JOIN:
				{
				setState(240);
				or_converge();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
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
		enterRule(_localctx, 34, RULE_fork_diverge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(FORK);
			setState(246);
			id();
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(247);
				match(VERT_LINE);
				setState(248);
				attr_list();
				}
				break;
			}
			setState(251);
			match(VERT_LINE);
			setState(252);
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
		enterRule(_localctx, 36, RULE_event_diverge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(EVENT_SPLIT);
			setState(255);
			match(VERT_LINE);
			setState(256);
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
		enterRule(_localctx, 38, RULE_condition_diverge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==XOR_SPLIT || _la==OR_SPLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(259);
			id();
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(260);
				match(VERT_LINE);
				setState(261);
				attr_list();
				}
				break;
			}
			setState(264);
			match(VERT_LINE);
			setState(265);
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
		enterRule(_localctx, 40, RULE_and_converge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(JOIN);
			setState(268);
			id();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(269);
				match(VERT_LINE);
				setState(270);
				attr_list();
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(273);
				match(VERT_LINE);
				setState(274);
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
		enterRule(_localctx, 42, RULE_or_converge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==OR_JOIN || _la==XOR_JOIN) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(279);
				match(VERT_LINE);
				setState(280);
				attr_list();
				}
				break;
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERT_LINE) {
				{
				setState(283);
				match(VERT_LINE);
				setState(284);
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
		enterRule(_localctx, 44, RULE_inflows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IN);
			setState(288);
			match(T__0);
			setState(289);
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
		enterRule(_localctx, 46, RULE_outflows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(OUT);
			setState(292);
			match(T__0);
			setState(293);
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
		enterRule(_localctx, 48, RULE_cond_outflows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(OUT);
			setState(296);
			match(T__0);
			setState(297);
			cond_outflow();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(298);
				match(T__1);
				setState(299);
				cond_outflow();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(305);
				match(DEFAULT);
				setState(306);
				match(T__0);
				setState(307);
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
		enterRule(_localctx, 50, RULE_cond_outflow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			expression();
			setState(311);
			match(T__0);
			setState(312);
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
		enterRule(_localctx, 52, RULE_association);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REF:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(314);
				link();
				setState(315);
				assoc_flow();
				setState(316);
				artifact();
				}
				}
				break;
			case DVERT_LINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(318);
				artifact();
				setState(319);
				assoc_flow();
				setState(320);
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
		enterRule(_localctx, 54, RULE_artifact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DVERT_LINE);
			setState(325);
			id();
			setState(326);
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
		enterRule(_localctx, 56, RULE_assoc_flow);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				dir_assoc();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
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
		enterRule(_localctx, 58, RULE_dir_assoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		enterRule(_localctx, 60, RULE_undir_assoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 62, RULE_sequence_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		enterRule(_localctx, 64, RULE_message_flow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		enterRule(_localctx, 66, RULE_input_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(IN);
			setState(341);
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
		enterRule(_localctx, 68, RULE_output_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(OUT);
			setState(344);
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
		enterRule(_localctx, 70, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			attribute();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(347);
				match(T__1);
				setState(348);
				attribute();
				}
				}
				setState(353);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
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
		enterRule(_localctx, 72, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			id();
			setState(355);
			match(T__6);
			setState(356);
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
		enterRule(_localctx, 74, RULE_attr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (STRING - 63)) | (1L << (NUMBER - 63)) | (1L << (BOOLEAN - 63)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			param();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(361);
				match(T__1);
				setState(362);
				param();
				}
				}
				setState(367);
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
		enterRule(_localctx, 78, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			id();
			setState(369);
			match(T__0);
			setState(370);
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
		enterRule(_localctx, 80, RULE_param_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		enterRule(_localctx, 82, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		enterRule(_localctx, 84, RULE_link_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			link();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(377);
				match(T__1);
				setState(378);
				link();
				}
				}
				setState(383);
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
		enterRule(_localctx, 86, RULE_event_links);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			event_link();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(385);
				match(T__1);
				setState(386);
				event_link();
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
		enterRule(_localctx, 88, RULE_link);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				activity_link();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				event_link();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
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
		enterRule(_localctx, 90, RULE_activity_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(REF);
			setState(398);
			match(SQRE_OPEN);
			setState(399);
			id();
			setState(400);
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
		enterRule(_localctx, 92, RULE_event_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(REF);
			setState(403);
			match(PAREN_OPEN);
			setState(404);
			id();
			setState(405);
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
		enterRule(_localctx, 94, RULE_gateway_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(REF);
			setState(408);
			match(ANGLE_OPEN);
			setState(409);
			id();
			setState(410);
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
		enterRule(_localctx, 96, RULE_pool_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(REF);
			setState(413);
			match(POOL_OPEN);
			setState(414);
			id();
			setState(415);
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

	public static class Process_linkContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DOTBPMParser.REF, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(DOTBPMParser.CURLY_OPEN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(DOTBPMParser.CURLY_CLOSE, 0); }
		public Process_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).enterProcess_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTBPMListener ) ((DOTBPMListener)listener).exitProcess_link(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTBPMVisitor ) return ((DOTBPMVisitor<? extends T>)visitor).visitProcess_link(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_linkContext process_link() throws RecognitionException {
		Process_linkContext _localctx = new Process_linkContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_process_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(REF);
			setState(418);
			match(CURLY_OPEN);
			setState(419);
			id();
			setState(420);
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
		enterRule(_localctx, 100, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__13);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(423);
					matchWildcard();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(429);
			match(T__13);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\5\2n\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3y\n\3\f\3\16\3|\13\3\3\3\3\3\3\4\6\4\u0081\n\4\r\4\16\4\u0082\3\5\3"+
		"\5\3\5\3\5\5\5\u0089\n\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\3\5\3\6\6\6\u0093"+
		"\n\6\r\6\16\6\u0094\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\5\b\u00a3\n\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\t\3\t\3\t\5\t\u00ad"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\13\3"+
		"\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00c9\n\r\3\r\5\r\u00cc\n\r\5\r\u00ce\n\r\3\r\3\r\5\r\u00d2\n\r"+
		"\3\r\3\r\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00e4\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f4\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u00fc\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\5\25\u0109\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0112\n"+
		"\26\3\26\3\26\5\26\u0116\n\26\3\27\3\27\3\27\3\27\5\27\u011c\n\27\3\27"+
		"\3\27\5\27\u0120\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u012f\n\32\f\32\16\32\u0132\13\32\3\32\3\32\3\32"+
		"\5\32\u0137\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0145\n\34\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u014d\n\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\7%\u0160\n%\f"+
		"%\16%\u0163\13%\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\7(\u016e\n(\f(\16(\u0171"+
		"\13(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\7,\u017e\n,\f,\16,\u0181\13,\3-"+
		"\3-\3-\7-\u0186\n-\f-\16-\u0189\13-\3.\3.\3.\5.\u018e\n.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u01ab\n\64\f\64\16\64\u01ae"+
		"\13\64\3\64\3\64\3\64\3\u01ac\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\b\3\2\64\66\6\2\34"+
		"\34!!%(*\61\3\2;<\3\2?@\3\2AC\3\2\n\17\2\u01a9\2h\3\2\2\2\4r\3\2\2\2\6"+
		"\u0080\3\2\2\2\b\u0084\3\2\2\2\n\u0092\3\2\2\2\f\u0096\3\2\2\2\16\u00a6"+
		"\3\2\2\2\20\u00ac\3\2\2\2\22\u00ae\3\2\2\2\24\u00bd\3\2\2\2\26\u00c1\3"+
		"\2\2\2\30\u00c3\3\2\2\2\32\u00dc\3\2\2\2\34\u00de\3\2\2\2\36\u00e7\3\2"+
		"\2\2 \u00e9\3\2\2\2\"\u00ed\3\2\2\2$\u00f7\3\2\2\2&\u0100\3\2\2\2(\u0104"+
		"\3\2\2\2*\u010d\3\2\2\2,\u0117\3\2\2\2.\u0121\3\2\2\2\60\u0125\3\2\2\2"+
		"\62\u0129\3\2\2\2\64\u0138\3\2\2\2\66\u0144\3\2\2\28\u0146\3\2\2\2:\u014c"+
		"\3\2\2\2<\u014e\3\2\2\2>\u0150\3\2\2\2@\u0152\3\2\2\2B\u0154\3\2\2\2D"+
		"\u0156\3\2\2\2F\u0159\3\2\2\2H\u015c\3\2\2\2J\u0164\3\2\2\2L\u0168\3\2"+
		"\2\2N\u016a\3\2\2\2P\u0172\3\2\2\2R\u0176\3\2\2\2T\u0178\3\2\2\2V\u017a"+
		"\3\2\2\2X\u0182\3\2\2\2Z\u018d\3\2\2\2\\\u018f\3\2\2\2^\u0194\3\2\2\2"+
		"`\u0199\3\2\2\2b\u019e\3\2\2\2d\u01a3\3\2\2\2f\u01a8\3\2\2\2hi\7\62\2"+
		"\2ij\5T+\2jm\7\25\2\2kn\5\16\b\2ln\5\6\4\2mk\3\2\2\2ml\3\2\2\2no\3\2\2"+
		"\2op\7\26\2\2pq\7\2\2\3q\3\3\2\2\2rs\7\63\2\2st\5T+\2tu\7\25\2\2uz\5\16"+
		"\b\2vw\7\36\2\2wy\5 \21\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3"+
		"\2\2\2|z\3\2\2\2}~\7\26\2\2~\5\3\2\2\2\177\u0081\5\b\5\2\u0080\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\7\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0088\5T+\2\u0086\u0087\7\35\2\2"+
		"\u0087\u0089\5H%\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008d\7\36\2\2\u008b\u008e\5\16\b\2\u008c\u008e\5\n\6\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\7\22\2\2\u0090\t\3\2\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\13\3\2\2"+
		"\2\u0096\u0097\7\23\2\2\u0097\u009a\5T+\2\u0098\u0099\7\35\2\2\u0099\u009b"+
		"\5H%\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\36\2\2\u009d\u009e\5\16\b\2\u009e\u009f\7\24\2\2\u009f\r\3\2"+
		"\2\2\u00a0\u00a2\5\20\t\2\u00a1\u00a3\7\35\2\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00ad\5\24\13\2\u00aa\u00ad\5\22\n\2\u00ab\u00ad\5\66\34"+
		"\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\21"+
		"\3\2\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\5@!\2\u00b0\u00b6\5\24\13\2"+
		"\u00b1\u00b2\5@!\2\u00b2\u00b3\5\24\13\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\23\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00be\5\26\f\2\u00ba\u00be\5\"\22"+
		"\2\u00bb\u00be\5\34\17\2\u00bc\u00be\5Z.\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\25\3\2\2\2\u00bf"+
		"\u00c2\5\30\r\2\u00c0\u00c2\5\4\3\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\5\32\16\2\u00c5"+
		"\u00cd\5T+\2\u00c6\u00c8\7\36\2\2\u00c7\u00c9\5D#\2\u00c8\u00c7\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5F$\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d2\5"+
		"H%\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3"+
		"\u00d4\7\36\2\2\u00d4\u00d6\5 \21\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7\30\2\2\u00db\31\3\2\2\2\u00dc\u00dd\t\2\2"+
		"\2\u00dd\33\3\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e3"+
		"\5T+\2\u00e1\u00e2\7\36\2\2\u00e2\u00e4\5H%\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\32\2\2\u00e6\35\3\2\2"+
		"\2\u00e7\u00e8\t\3\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\5\34\17\2\u00ea\u00eb"+
		"\5@!\2\u00eb\u00ec\5Z.\2\u00ec!\3\2\2\2\u00ed\u00f3\7\33\2\2\u00ee\u00f4"+
		"\5$\23\2\u00ef\u00f4\5(\25\2\u00f0\u00f4\5&\24\2\u00f1\u00f4\5*\26\2\u00f2"+
		"\u00f4\5,\27\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\7\34\2\2\u00f6#\3\2\2\2\u00f7\u00f8\7:\2\2\u00f8\u00fb\5T+\2\u00f9"+
		"\u00fa\7\36\2\2\u00fa\u00fc\5H%\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\36\2\2\u00fe\u00ff\5\60\31\2\u00ff"+
		"%\3\2\2\2\u0100\u0101\7=\2\2\u0101\u0102\7\36\2\2\u0102\u0103\5X-\2\u0103"+
		"\'\3\2\2\2\u0104\u0105\t\4\2\2\u0105\u0108\5T+\2\u0106\u0107\7\36\2\2"+
		"\u0107\u0109\5H%\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\7\36\2\2\u010b\u010c\5\62\32\2\u010c)\3\2\2\2\u010d"+
		"\u010e\7>\2\2\u010e\u0111\5T+\2\u010f\u0110\7\36\2\2\u0110\u0112\5H%\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114"+
		"\7\36\2\2\u0114\u0116\5.\30\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116+\3\2\2\2\u0117\u0118\t\5\2\2\u0118\u011b\5T+\2\u0119\u011a\7\36"+
		"\2\2\u011a\u011c\5H%\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011e\7\36\2\2\u011e\u0120\5.\30\2\u011f\u011d\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120-\3\2\2\2\u0121\u0122\7\67\2\2\u0122\u0123\7"+
		"\3\2\2\u0123\u0124\5V,\2\u0124/\3\2\2\2\u0125\u0126\78\2\2\u0126\u0127"+
		"\7\3\2\2\u0127\u0128\5V,\2\u0128\61\3\2\2\2\u0129\u012a\78\2\2\u012a\u012b"+
		"\7\3\2\2\u012b\u0130\5\64\33\2\u012c\u012d\7\4\2\2\u012d\u012f\5\64\33"+
		"\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\79\2\2\u0134"+
		"\u0135\7\3\2\2\u0135\u0137\5Z.\2\u0136\u0133\3\2\2\2\u0136\u0137\3\2\2"+
		"\2\u0137\63\3\2\2\2\u0138\u0139\5f\64\2\u0139\u013a\7\3\2\2\u013a\u013b"+
		"\5Z.\2\u013b\65\3\2\2\2\u013c\u013d\5Z.\2\u013d\u013e\5:\36\2\u013e\u013f"+
		"\58\35\2\u013f\u0145\3\2\2\2\u0140\u0141\58\35\2\u0141\u0142\5:\36\2\u0142"+
		"\u0143\5Z.\2\u0143\u0145\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u0140\3\2\2"+
		"\2\u0145\67\3\2\2\2\u0146\u0147\7\37\2\2\u0147\u0148\5T+\2\u0148\u0149"+
		"\7\37\2\2\u01499\3\2\2\2\u014a\u014d\5<\37\2\u014b\u014d\5> \2\u014c\u014a"+
		"\3\2\2\2\u014c\u014b\3\2\2\2\u014d;\3\2\2\2\u014e\u014f\7\5\2\2\u014f"+
		"=\3\2\2\2\u0150\u0151\7\6\2\2\u0151?\3\2\2\2\u0152\u0153\7\7\2\2\u0153"+
		"A\3\2\2\2\u0154\u0155\7\b\2\2\u0155C\3\2\2\2\u0156\u0157\7\67\2\2\u0157"+
		"\u0158\5N(\2\u0158E\3\2\2\2\u0159\u015a\78\2\2\u015a\u015b\5N(\2\u015b"+
		"G\3\2\2\2\u015c\u0161\5J&\2\u015d\u015e\7\4\2\2\u015e\u0160\5J&\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162I\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5T+\2\u0165\u0166"+
		"\7\t\2\2\u0166\u0167\5L\'\2\u0167K\3\2\2\2\u0168\u0169\t\6\2\2\u0169M"+
		"\3\2\2\2\u016a\u016f\5P)\2\u016b\u016c\7\4\2\2\u016c\u016e\5P)\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170O\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\5T+\2\u0173\u0174"+
		"\7\3\2\2\u0174\u0175\5R*\2\u0175Q\3\2\2\2\u0176\u0177\t\7\2\2\u0177S\3"+
		"\2\2\2\u0178\u0179\7D\2\2\u0179U\3\2\2\2\u017a\u017f\5Z.\2\u017b\u017c"+
		"\7\4\2\2\u017c\u017e\5Z.\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180W\3\2\2\2\u0181\u017f\3\2\2\2"+
		"\u0182\u0187\5^\60\2\u0183\u0184\7\4\2\2\u0184\u0186\5^\60\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"Y\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018e\5\\/\2\u018b\u018e\5^\60\2\u018c"+
		"\u018e\5`\61\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2"+
		"\2\2\u018e[\3\2\2\2\u018f\u0190\7 \2\2\u0190\u0191\7\27\2\2\u0191\u0192"+
		"\5T+\2\u0192\u0193\7\30\2\2\u0193]\3\2\2\2\u0194\u0195\7 \2\2\u0195\u0196"+
		"\7\31\2\2\u0196\u0197\5T+\2\u0197\u0198\7\32\2\2\u0198_\3\2\2\2\u0199"+
		"\u019a\7 \2\2\u019a\u019b\7\33\2\2\u019b\u019c\5T+\2\u019c\u019d\7\34"+
		"\2\2\u019da\3\2\2\2\u019e\u019f\7 \2\2\u019f\u01a0\7\21\2\2\u01a0\u01a1"+
		"\5T+\2\u01a1\u01a2\7\22\2\2\u01a2c\3\2\2\2\u01a3\u01a4\7 \2\2\u01a4\u01a5"+
		"\7\25\2\2\u01a5\u01a6\5T+\2\u01a6\u01a7\7\26\2\2\u01a7e\3\2\2\2\u01a8"+
		"\u01ac\7\20\2\2\u01a9\u01ab\13\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b0\7\20\2\2\u01b0g\3\2\2\2&mz\u0082\u0088\u008d"+
		"\u0094\u009a\u00a2\u00a6\u00ac\u00b6\u00bd\u00c1\u00c8\u00cb\u00cd\u00d1"+
		"\u00d7\u00e3\u00f3\u00fb\u0108\u0111\u0115\u011b\u011f\u0130\u0136\u0144"+
		"\u014c\u0161\u016f\u017f\u0187\u018d\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}